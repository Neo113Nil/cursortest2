package com.google.common.util.concurrent;

import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import com.google.common.util.concurrent.AbstractFutureState;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import kotlin.io.ByteStreamsKt;
import kotlin.random.PlatformRandomKt;

/* loaded from: classes.dex */
public abstract class AbstractFuture extends AbstractFutureState {

    /* loaded from: classes4.dex */
    public final class Cancellation {
        public static final Cancellation CAUSELESS_CANCELLED;
        public static final Cancellation CAUSELESS_INTERRUPTED;
        public final Throwable cause;
        public final boolean wasInterrupted;

        static {
            if (AbstractFutureState.GENERATE_CANCELLATION_CAUSES) {
                CAUSELESS_CANCELLED = null;
                CAUSELESS_INTERRUPTED = null;
            } else {
                CAUSELESS_CANCELLED = new Cancellation(null, false);
                CAUSELESS_INTERRUPTED = new Cancellation(null, true);
            }
        }

        public Cancellation(Throwable th, boolean z) {
            this.wasInterrupted = z;
            this.cause = th;
        }
    }

    public final class DelegatingToFuture implements Runnable {
        public final ListenableFuture future;
        public final AbstractFuture owner;

        public DelegatingToFuture(AbstractFuture abstractFuture, ListenableFuture listenableFuture) {
            this.owner = abstractFuture;
            this.future = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.owner.valueField != this) {
                return;
            }
            Object futureValue = AbstractFuture.getFutureValue(this.future);
            if (AbstractFutureState.ATOMIC_HELPER.casValue(this.owner, this, futureValue)) {
                AbstractFuture.complete(this.owner, false);
            }
        }
    }

    /* loaded from: classes4.dex */
    public final class Failure {
        public static final Failure FALLBACK_INSTANCE = new Failure(new AnonymousClass1("Failure occurred while trying to finish a future."));
        public final Throwable exception;

        /* renamed from: com.google.common.util.concurrent.AbstractFuture$Failure$1, reason: invalid class name */
        final class AnonymousClass1 extends Throwable {
            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        }

        public Failure(Throwable th) {
            th.getClass();
            this.exception = th;
        }
    }

    public interface Trusted extends ListenableFuture {
    }

    public static void complete(AbstractFuture abstractFuture, boolean z) {
        Listener listener = null;
        while (true) {
            for (AbstractFutureState.Waiter gasWaiters = AbstractFutureState.ATOMIC_HELPER.gasWaiters(abstractFuture); gasWaiters != null; gasWaiters = gasWaiters.next) {
                Thread thread = gasWaiters.thread;
                if (thread != null) {
                    gasWaiters.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            Listener listener2 = listener;
            Listener gasListeners = AbstractFutureState.ATOMIC_HELPER.gasListeners(abstractFuture);
            Listener listener3 = listener2;
            while (gasListeners != null) {
                Listener listener4 = gasListeners.next;
                gasListeners.next = listener3;
                listener3 = gasListeners;
                gasListeners = listener4;
            }
            while (listener3 != null) {
                listener = listener3.next;
                Runnable runnable = listener3.task;
                Objects.requireNonNull(runnable);
                if (runnable instanceof DelegatingToFuture) {
                    DelegatingToFuture delegatingToFuture = (DelegatingToFuture) runnable;
                    abstractFuture = delegatingToFuture.owner;
                    if (abstractFuture.valueField == delegatingToFuture) {
                        if (AbstractFutureState.ATOMIC_HELPER.casValue(abstractFuture, delegatingToFuture, getFutureValue(delegatingToFuture.future))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = listener3.executor;
                    Objects.requireNonNull(executor);
                    executeListener(runnable, executor);
                }
                listener3 = listener;
            }
            return;
        }
    }

    public static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractFutureState.log.get().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object getDoneValue$1(Object obj) {
        if (obj instanceof Cancellation) {
            Throwable th = ((Cancellation) obj).cause;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).exception);
        }
        if (obj == AbstractFutureState.NULL) {
            return null;
        }
        return obj;
    }

    public static Object getFutureValue(ListenableFuture listenableFuture) {
        Object obj;
        Throwable tryInternalFastPathGetFailure;
        if (listenableFuture instanceof Trusted) {
            Object obj2 = ((AbstractFuture) listenableFuture).valueField;
            if (obj2 instanceof Cancellation) {
                Cancellation cancellation = (Cancellation) obj2;
                if (cancellation.wasInterrupted) {
                    obj2 = cancellation.cause != null ? new Cancellation(cancellation.cause, false) : Cancellation.CAUSELESS_CANCELLED;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((listenableFuture instanceof AbstractFutureState) && (tryInternalFastPathGetFailure = PlatformRandomKt.tryInternalFastPathGetFailure((AbstractFutureState) listenableFuture)) != null) {
            return new Failure(tryInternalFastPathGetFailure);
        }
        boolean isCancelled = listenableFuture.isCancelled();
        boolean z = true;
        if ((!AbstractFutureState.GENERATE_CANCELLATION_CAUSES) && isCancelled) {
            Cancellation cancellation2 = Cancellation.CAUSELESS_CANCELLED;
            Objects.requireNonNull(cancellation2);
            return cancellation2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        ByteStreamsKt.interruptCurrentThread();
                    }
                    throw th;
                }
            } catch (Error | Exception e) {
                return new Failure(e);
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new Cancellation(e2, false);
                }
                return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
            } catch (ExecutionException e3) {
                if (!isCancelled) {
                    return new Failure(e3.getCause());
                }
                return new Cancellation(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e3), false);
            }
        }
        if (z2) {
            ByteStreamsKt.interruptCurrentThread();
        }
        if (!isCancelled) {
            return obj == null ? AbstractFutureState.NULL : obj;
        }
        return new Cancellation(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    public final void addDoneString(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        ByteStreamsKt.interruptCurrentThread();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            ByteStreamsKt.interruptCurrentThread();
        }
        sb.append("SUCCESS, result=[");
        appendResultObject(sb, obj);
        sb.append("]");
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Listener listener;
        Listener listener2 = Listener.TOMBSTONE;
        Trace.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (listener = this.listenersField) != listener2) {
            Listener listener3 = new Listener(runnable, executor);
            do {
                listener3.next = listener;
                if (AbstractFutureState.ATOMIC_HELPER.casListeners(this, listener, listener3)) {
                    return;
                } else {
                    listener = this.listenersField;
                }
            } while (listener != listener2);
        }
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    public final void appendResultObject(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Cancellation cancellation;
        Object obj = this.valueField;
        if (!(obj == null) && !(obj instanceof DelegatingToFuture)) {
            return false;
        }
        if (AbstractFutureState.GENERATE_CANCELLATION_CAUSES) {
            cancellation = new Cancellation(new CancellationException("Future.cancel() was called."), z);
        } else {
            cancellation = z ? Cancellation.CAUSELESS_INTERRUPTED : Cancellation.CAUSELESS_CANCELLED;
            Objects.requireNonNull(cancellation);
        }
        boolean z2 = false;
        while (true) {
            if (AbstractFutureState.ATOMIC_HELPER.casValue(this, obj, cancellation)) {
                complete(this, z);
                if (!(obj instanceof DelegatingToFuture)) {
                    break;
                }
                ListenableFuture listenableFuture = ((DelegatingToFuture) obj).future;
                if (!(listenableFuture instanceof Trusted)) {
                    listenableFuture.cancel(z);
                    break;
                }
                this = (AbstractFuture) listenableFuture;
                obj = this.valueField;
                if (!(obj == null) && !(obj instanceof DelegatingToFuture)) {
                    break;
                }
                z2 = true;
            } else {
                obj = this.valueField;
                if (!(obj instanceof DelegatingToFuture)) {
                    return z2;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return ByteStreamsKt.get(this, j, timeUnit);
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof Cancellation;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof DelegatingToFuture)) & (this.valueField != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = AbstractFutureState.NULL;
        }
        if (!AbstractFutureState.ATOMIC_HELPER.casValue(this, null, obj)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        th.getClass();
        if (!AbstractFutureState.ATOMIC_HELPER.casValue(this, null, new Failure(th))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setFuture(ListenableFuture listenableFuture) {
        Failure failure;
        listenableFuture.getClass();
        Object obj = this.valueField;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (AbstractFutureState.ATOMIC_HELPER.casValue(this, null, getFutureValue(listenableFuture))) {
                    complete(this, false);
                    return true;
                }
                return false;
            }
            DelegatingToFuture delegatingToFuture = new DelegatingToFuture(this, listenableFuture);
            if (AbstractFutureState.ATOMIC_HELPER.casValue(this, null, delegatingToFuture)) {
                try {
                    listenableFuture.addListener(delegatingToFuture, DirectExecutor.INSTANCE);
                    return true;
                } catch (Throwable th) {
                    try {
                        failure = new Failure(th);
                    } catch (Error | Exception unused) {
                        failure = Failure.FALLBACK_INSTANCE;
                    }
                    AbstractFutureState.ATOMIC_HELPER.casValue(this, delegatingToFuture, failure);
                    return true;
                }
            }
            obj = this.valueField;
        }
        if (obj instanceof Cancellation) {
            listenableFuture.cancel(((Cancellation) obj).wasInterrupted);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof DelegatingToFuture) {
                sb.append(", setFuture=[");
                ListenableFuture listenableFuture = ((DelegatingToFuture) obj).future;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Throwable th) {
                    ByteStreamsKt.rethrowIfErrorOtherThanStackOverflow(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    str = pendingToString();
                    if (TransactorKt.stringIsNullOrEmpty(str)) {
                        str = null;
                    }
                } catch (Throwable th2) {
                    ByteStreamsKt.rethrowIfErrorOtherThanStackOverflow(th2);
                    str = "Exception thrown from implementation: " + th2.getClass();
                }
                if (str != null) {
                    sb.append(", info=[");
                    sb.append(str);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                addDoneString(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractFutureState
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public final boolean wasInterrupted() {
        Object obj = this.valueField;
        return (obj instanceof Cancellation) && ((Cancellation) obj).wasInterrupted;
    }

    public abstract class TrustedFuture extends AbstractFuture implements Trusted {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return ByteStreamsKt.get(this, j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.valueField instanceof Cancellation;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final Object get() {
            return ByteStreamsKt.get(this);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return ByteStreamsKt.get(this);
    }

    public final class Listener {
        public static final Listener TOMBSTONE = new Listener();
        public final Executor executor;
        public Listener next;
        public final Runnable task;

        public Listener() {
            this.task = null;
            this.executor = null;
        }

        public Listener(Runnable runnable, Executor executor) {
            this.task = runnable;
            this.executor = executor;
        }
    }
}
