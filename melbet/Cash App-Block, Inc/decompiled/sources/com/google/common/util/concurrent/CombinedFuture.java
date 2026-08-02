package com.google.common.util.concurrent;

import androidx.tracing.Trace;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.measurement.zzz;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;

/* loaded from: classes4.dex */
public final class CombinedFuture extends AggregateFutureState {
    public static final LazyLogger logger = new LazyLogger(CombinedFuture.class);
    public final boolean allMustSucceed;
    public ImmutableCollection futures;
    public CallableInterruptibleTask task;

    public CombinedFuture(ImmutableCollection immutableCollection, boolean z) {
        int size = immutableCollection.size();
        this.seenExceptionsField = null;
        this.remainingField = size;
        this.futures = immutableCollection;
        this.allMustSucceed = z;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        ImmutableCollection immutableCollection = this.futures;
        this.futures = null;
        this.task = null;
        if ((this.valueField instanceof AbstractFuture.Cancellation) && (immutableCollection != null)) {
            boolean wasInterrupted = wasInterrupted();
            UnmodifiableIterator it = immutableCollection.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(wasInterrupted);
            }
        }
    }

    public final void decrementCountAndMaybeComplete(ImmutableCollection immutableCollection) {
        int decrementAndGetRemainingCount = AggregateFutureState.ATOMIC_HELPER.decrementAndGetRemainingCount(this);
        Trace.checkState("Less than 0 remaining futures", decrementAndGetRemainingCount >= 0);
        if (decrementAndGetRemainingCount == 0) {
            if (immutableCollection != null) {
                UnmodifiableIterator it = immutableCollection.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            KotlinGenericDeclarationKt.getUninterruptibly(future);
                        } catch (ExecutionException e) {
                            handleException(e.getCause());
                        } catch (Throwable th) {
                            handleException(th);
                        }
                    }
                }
            }
            this.seenExceptionsField = null;
            CallableInterruptibleTask callableInterruptibleTask = this.task;
            if (callableInterruptibleTask != null) {
                try {
                    callableInterruptibleTask.listenerExecutor.execute(callableInterruptibleTask);
                } catch (RejectedExecutionException e2) {
                    CombinedFuture.this.setException(e2);
                }
            }
            this.futures = null;
        }
    }

    public final void handleException(Throwable th) {
        th.getClass();
        if (this.allMustSucceed && !setException(th)) {
            Set set = this.seenExceptionsField;
            if (set == null) {
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                newSetFromMap.getClass();
                if (!(this.valueField instanceof AbstractFuture.Cancellation)) {
                    Throwable tryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
                    Objects.requireNonNull(tryInternalFastPathGetFailure);
                    while (tryInternalFastPathGetFailure != null && newSetFromMap.add(tryInternalFastPathGetFailure)) {
                        tryInternalFastPathGetFailure = tryInternalFastPathGetFailure.getCause();
                    }
                }
                AggregateFutureState.ATOMIC_HELPER.compareAndSetSeenExceptions(this, newSetFromMap);
                Set set2 = this.seenExceptionsField;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                if (set.add(th2)) {
                }
            }
            logger.get().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
            return;
        }
        if (th instanceof Error) {
            logger.get().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void init() {
        Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            CallableInterruptibleTask callableInterruptibleTask = this.task;
            if (callableInterruptibleTask != null) {
                try {
                    callableInterruptibleTask.listenerExecutor.execute(callableInterruptibleTask);
                    return;
                } catch (RejectedExecutionException e) {
                    CombinedFuture.this.setException(e);
                    return;
                }
            }
            return;
        }
        ImmutableCollection immutableCollection = this.futures;
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        if (!this.allMustSucceed) {
            q4$$ExternalSyntheticLambda0 q4__externalsyntheticlambda0 = new q4$$ExternalSyntheticLambda0(29, this, (Object) null);
            UnmodifiableIterator it = immutableCollection.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    decrementCountAndMaybeComplete(null);
                } else {
                    listenableFuture.addListener(q4__externalsyntheticlambda0, directExecutor);
                }
            }
            return;
        }
        UnmodifiableIterator it2 = immutableCollection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                processAllMustSucceedDoneFuture(listenableFuture2);
            } else {
                listenableFuture2.addListener(new q4$$ExternalSyntheticLambda0(this, i, listenableFuture2), directExecutor);
            }
            i = i2;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void interruptTask() {
        CallableInterruptibleTask callableInterruptibleTask = this.task;
        if (callableInterruptibleTask != null) {
            callableInterruptibleTask.interruptTask();
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        ImmutableCollection immutableCollection = this.futures;
        if (immutableCollection == null) {
            return super.pendingToString();
        }
        return "futures=" + immutableCollection;
    }

    public final void processAllMustSucceedDoneFuture(ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                try {
                    KotlinGenericDeclarationKt.getUninterruptibly(listenableFuture);
                } catch (ExecutionException e) {
                    handleException(e.getCause());
                } catch (Throwable th) {
                    handleException(th);
                }
            }
        } finally {
            decrementCountAndMaybeComplete(null);
        }
    }

    public final class CallableInterruptibleTask extends InterruptibleTask {
        public final /* synthetic */ int $r8$classId;
        public final Object callable;
        public final Executor listenerExecutor;
        public final /* synthetic */ CombinedFuture this$0;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CallableInterruptibleTask(CombinedFuture combinedFuture, Callable callable) {
            this(DirectExecutor.INSTANCE);
            this.$r8$classId = 0;
            this.this$0 = combinedFuture;
            this.callable = callable;
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblyFailure(Throwable th) {
            CombinedFuture combinedFuture = CombinedFuture.this;
            combinedFuture.task = null;
            if (th instanceof ExecutionException) {
                combinedFuture.setException(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                combinedFuture.cancel(false);
            } else {
                combinedFuture.setException(th);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final void afterRanInterruptiblySuccess(Object obj) {
            CombinedFuture.this.task = null;
            int i = this.$r8$classId;
            CombinedFuture combinedFuture = this.this$0;
            switch (i) {
                case 0:
                    combinedFuture.set(obj);
                    break;
                default:
                    combinedFuture.setFuture((ListenableFuture) obj);
                    break;
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return CombinedFuture.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final Object runInterruptibly() {
            int i = this.$r8$classId;
            Object obj = this.callable;
            switch (i) {
                case 0:
                    return ((Callable) obj).call();
                default:
                    return ((zzz) obj).call();
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final String toPendingString() {
            int i = this.$r8$classId;
            Object obj = this.callable;
            switch (i) {
                case 0:
                    return ((Callable) obj).toString();
                default:
                    return ((zzz) obj).toString();
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CallableInterruptibleTask(CombinedFuture combinedFuture, zzz zzzVar, Executor executor) {
            this(executor);
            this.$r8$classId = 1;
            this.this$0 = combinedFuture;
            this.callable = zzzVar;
        }

        public CallableInterruptibleTask(Executor executor) {
            executor.getClass();
            this.listenerExecutor = executor;
        }
    }
}
