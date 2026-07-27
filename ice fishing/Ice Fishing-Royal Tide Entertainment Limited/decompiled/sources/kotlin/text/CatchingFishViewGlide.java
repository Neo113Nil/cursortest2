package kotlin.text;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class CatchingFishViewGlide extends CatchingFishPayPalHilt implements Runnable {
    public static final CatchingFishViewGlide CatchingFishOkHttp;
    public static final long CatchingFishUnitTesting;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        CatchingFishViewGlide catchingFishViewGlide = new CatchingFishViewGlide();
        CatchingFishOkHttp = catchingFishViewGlide;
        catchingFishViewGlide.CatchingFishPayPalService(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        CatchingFishUnitTesting = timeUnit.toNanos(l.longValue());
    }

    @Override // kotlin.text.CatchingFishPayPalHilt
    public final void CatchingFishCameraXIntent(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.CatchingFishCameraXIntent(runnable);
    }

    @Override // kotlin.text.CatchingFishReduxMockkView
    public final void CatchingFishDagger(long j, CatchingFishViewMoshi catchingFishViewMoshi) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlin.text.CatchingFishReduxMockkView
    public final Thread CatchingFishJobScheduler() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(CatchingFishOkHttp.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    public final synchronized void CatchingFishLayoutInflater() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            CatchingFishPayPalHilt.CatchingFishFragmentHandler.set(this, null);
            CatchingFishPayPalHilt.CatchingFishCloudMessaging.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean CatchingFishGradleManifest;
        CatchingFishMVVMOkHttp.CatchingFishParcelableFAB.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (CatchingFishGradleManifest) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long CatchingFishSensorManager = CatchingFishSensorManager();
                    if (CatchingFishSensorManager == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = CatchingFishUnitTesting + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            CatchingFishLayoutInflater();
                            if (CatchingFishGradleManifest()) {
                                return;
                            }
                            CatchingFishJobScheduler();
                            return;
                        }
                        if (CatchingFishSensorManager > j2) {
                            CatchingFishSensorManager = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (CatchingFishSensorManager > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            CatchingFishLayoutInflater();
                            if (CatchingFishGradleManifest()) {
                                return;
                            }
                            CatchingFishJobScheduler();
                            return;
                        }
                        LockSupport.parkNanos(this, CatchingFishSensorManager);
                    }
                }
            }
        } finally {
            _thread = null;
            CatchingFishLayoutInflater();
            if (!CatchingFishGradleManifest()) {
                CatchingFishJobScheduler();
            }
        }
    }

    @Override // kotlin.text.CatchingFishPayPalHilt, kotlin.text.CatchingFishReduxMockkView
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlin.text.CatchingFishToastGradle
    public final String toString() {
        return "DefaultExecutor";
    }
}
