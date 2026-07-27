package kotlin.text;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CatchingFishAsyncTask implements Future {
    public static final Object CatchingFishFragmentHandler;
    public static final CatchingFishAdMobFAB CatchingFishLayout;
    public volatile CatchingFishMoshi CatchingFishDaggerWebsocket;
    public volatile Object CatchingFishReduxKtor;
    public volatile CatchingFishExoPlayerWidget CatchingFishWorkManager;
    public static final boolean CatchingFishViewModelScope = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger CatchingFishViewModelFAB = Logger.getLogger(CatchingFishAsyncTask.class.getName());

    static {
        CatchingFishAdMobFAB catchingFishDynamicFeature;
        try {
            catchingFishDynamicFeature = new CatchingFishCoroutine(AtomicReferenceFieldUpdater.newUpdater(CatchingFishExoPlayerWidget.class, Thread.class, "CatchingFishParcelableFAB"), AtomicReferenceFieldUpdater.newUpdater(CatchingFishExoPlayerWidget.class, CatchingFishExoPlayerWidget.class, "CatchingFishSnackbar"), AtomicReferenceFieldUpdater.newUpdater(CatchingFishAsyncTask.class, CatchingFishExoPlayerWidget.class, "CatchingFishWorkManager"), AtomicReferenceFieldUpdater.newUpdater(CatchingFishAsyncTask.class, CatchingFishMoshi.class, "CatchingFishDaggerWebsocket"), AtomicReferenceFieldUpdater.newUpdater(CatchingFishAsyncTask.class, Object.class, "CatchingFishReduxKtor"));
            th = null;
        } catch (Throwable th) {
            th = th;
            catchingFishDynamicFeature = new CatchingFishDynamicFeature();
        }
        CatchingFishLayout = catchingFishDynamicFeature;
        if (th != null) {
            CatchingFishViewModelFAB.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        CatchingFishFragmentHandler = new Object();
    }

    public static void CatchingFishCoroutine(CatchingFishAsyncTask catchingFishAsyncTask) {
        CatchingFishExoPlayerWidget catchingFishExoPlayerWidget;
        CatchingFishMoshi catchingFishMoshi;
        do {
            catchingFishExoPlayerWidget = catchingFishAsyncTask.CatchingFishWorkManager;
        } while (!CatchingFishLayout.CatchingFishOkHttp(catchingFishAsyncTask, catchingFishExoPlayerWidget, CatchingFishExoPlayerWidget.CatchingFishCoroutine));
        while (catchingFishExoPlayerWidget != null) {
            Thread thread = catchingFishExoPlayerWidget.CatchingFishParcelableFAB;
            if (thread != null) {
                catchingFishExoPlayerWidget.CatchingFishParcelableFAB = null;
                LockSupport.unpark(thread);
            }
            catchingFishExoPlayerWidget = catchingFishExoPlayerWidget.CatchingFishSnackbar;
        }
        catchingFishAsyncTask.CatchingFishSnackbar();
        do {
            catchingFishMoshi = catchingFishAsyncTask.CatchingFishDaggerWebsocket;
        } while (!CatchingFishLayout.CatchingFishCloudMessaging(catchingFishAsyncTask, catchingFishMoshi));
        CatchingFishMoshi catchingFishMoshi2 = null;
        while (catchingFishMoshi != null) {
            CatchingFishMoshi catchingFishMoshi3 = catchingFishMoshi.CatchingFishParcelableFAB;
            catchingFishMoshi.CatchingFishParcelableFAB = catchingFishMoshi2;
            catchingFishMoshi2 = catchingFishMoshi;
            catchingFishMoshi = catchingFishMoshi3;
        }
        while (catchingFishMoshi2 != null) {
            catchingFishMoshi2 = catchingFishMoshi2.CatchingFishParcelableFAB;
            try {
                throw null;
            } catch (RuntimeException e) {
                CatchingFishViewModelFAB.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object CatchingFishDaggerWebsocket(CatchingFishAsyncTask catchingFishAsyncTask) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = catchingFishAsyncTask.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object CatchingFishReduxKtor(Object obj) {
        if (obj instanceof CatchingFishHandler) {
            Throwable th = ((CatchingFishHandler) obj).CatchingFishSnackbar;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof CatchingFishGson) {
            throw new ExecutionException(((CatchingFishGson) obj).CatchingFishParcelableFAB);
        }
        if (obj == CatchingFishFragmentHandler) {
            return null;
        }
        return obj;
    }

    public final void CatchingFishParcelableFAB(StringBuilder sb) {
        try {
            Object CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(this);
            sb.append("SUCCESS, result=[");
            sb.append(CatchingFishDaggerWebsocket == this ? "this future" : String.valueOf(CatchingFishDaggerWebsocket));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public final void CatchingFishWorkManager(CatchingFishExoPlayerWidget catchingFishExoPlayerWidget) {
        catchingFishExoPlayerWidget.CatchingFishParcelableFAB = null;
        while (true) {
            CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2 = this.CatchingFishWorkManager;
            if (catchingFishExoPlayerWidget2 == CatchingFishExoPlayerWidget.CatchingFishCoroutine) {
                return;
            }
            CatchingFishExoPlayerWidget catchingFishExoPlayerWidget3 = null;
            while (catchingFishExoPlayerWidget2 != null) {
                CatchingFishExoPlayerWidget catchingFishExoPlayerWidget4 = catchingFishExoPlayerWidget2.CatchingFishSnackbar;
                if (catchingFishExoPlayerWidget2.CatchingFishParcelableFAB != null) {
                    catchingFishExoPlayerWidget3 = catchingFishExoPlayerWidget2;
                } else if (catchingFishExoPlayerWidget3 != null) {
                    catchingFishExoPlayerWidget3.CatchingFishSnackbar = catchingFishExoPlayerWidget4;
                    if (catchingFishExoPlayerWidget3.CatchingFishParcelableFAB == null) {
                        break;
                    }
                } else if (!CatchingFishLayout.CatchingFishOkHttp(this, catchingFishExoPlayerWidget2, catchingFishExoPlayerWidget4)) {
                    break;
                }
                catchingFishExoPlayerWidget2 = catchingFishExoPlayerWidget4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.CatchingFishReduxKtor;
        if (obj == null) {
            if (CatchingFishLayout.CatchingFishEspressoTesting(this, obj, CatchingFishViewModelScope ? new CatchingFishHandler(new CancellationException("Future.cancel() was called."), z) : z ? CatchingFishHandler.CatchingFishCoroutine : CatchingFishHandler.CatchingFishReduxKtor)) {
                CatchingFishCoroutine(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        CatchingFishExoPlayerWidget catchingFishExoPlayerWidget = CatchingFishExoPlayerWidget.CatchingFishCoroutine;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.CatchingFishReduxKtor;
        if (obj != null) {
            return CatchingFishReduxKtor(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2 = this.CatchingFishWorkManager;
            if (catchingFishExoPlayerWidget2 != catchingFishExoPlayerWidget) {
                CatchingFishExoPlayerWidget catchingFishExoPlayerWidget3 = new CatchingFishExoPlayerWidget();
                do {
                    CatchingFishAdMobFAB catchingFishAdMobFAB = CatchingFishLayout;
                    catchingFishAdMobFAB.CatchingFishJobScheduler(catchingFishExoPlayerWidget3, catchingFishExoPlayerWidget2);
                    if (catchingFishAdMobFAB.CatchingFishOkHttp(this, catchingFishExoPlayerWidget2, catchingFishExoPlayerWidget3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                CatchingFishWorkManager(catchingFishExoPlayerWidget3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.CatchingFishReduxKtor;
                            if (obj2 != null) {
                                return CatchingFishReduxKtor(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        CatchingFishWorkManager(catchingFishExoPlayerWidget3);
                    } else {
                        catchingFishExoPlayerWidget2 = this.CatchingFishWorkManager;
                    }
                } while (catchingFishExoPlayerWidget2 != catchingFishExoPlayerWidget);
            }
            return CatchingFishReduxKtor(this.CatchingFishReduxKtor);
        }
        while (nanos > 0) {
            Object obj3 = this.CatchingFishReduxKtor;
            if (obj3 != null) {
                return CatchingFishReduxKtor(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String catchingFishAsyncTask = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " (plus ");
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = CatchingFishEspressoTesting + convert + " " + lowerCase;
                if (z) {
                    str2 = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str2, ",");
                }
                CatchingFishEspressoTesting = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str2, " ");
            }
            if (z) {
                CatchingFishEspressoTesting = CatchingFishEspressoTesting + nanos2 + " nanoseconds ";
            }
            str = CatchingFishMVPLiveData.CatchingFishEspressoTesting(CatchingFishEspressoTesting, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(str + " for " + catchingFishAsyncTask);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.CatchingFishReduxKtor instanceof CatchingFishHandler;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.CatchingFishReduxKtor != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.CatchingFishReduxKtor instanceof CatchingFishHandler) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            CatchingFishParcelableFAB(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                CatchingFishParcelableFAB(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void CatchingFishSnackbar() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        CatchingFishExoPlayerWidget catchingFishExoPlayerWidget = CatchingFishExoPlayerWidget.CatchingFishCoroutine;
        if (!Thread.interrupted()) {
            Object obj2 = this.CatchingFishReduxKtor;
            if (obj2 != null) {
                return CatchingFishReduxKtor(obj2);
            }
            CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2 = this.CatchingFishWorkManager;
            if (catchingFishExoPlayerWidget2 != catchingFishExoPlayerWidget) {
                CatchingFishExoPlayerWidget catchingFishExoPlayerWidget3 = new CatchingFishExoPlayerWidget();
                do {
                    CatchingFishAdMobFAB catchingFishAdMobFAB = CatchingFishLayout;
                    catchingFishAdMobFAB.CatchingFishJobScheduler(catchingFishExoPlayerWidget3, catchingFishExoPlayerWidget2);
                    if (catchingFishAdMobFAB.CatchingFishOkHttp(this, catchingFishExoPlayerWidget2, catchingFishExoPlayerWidget3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.CatchingFishReduxKtor;
                            } else {
                                CatchingFishWorkManager(catchingFishExoPlayerWidget3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return CatchingFishReduxKtor(obj);
                    }
                    catchingFishExoPlayerWidget2 = this.CatchingFishWorkManager;
                } while (catchingFishExoPlayerWidget2 != catchingFishExoPlayerWidget);
            }
            return CatchingFishReduxKtor(this.CatchingFishReduxKtor);
        }
        throw new InterruptedException();
    }
}
