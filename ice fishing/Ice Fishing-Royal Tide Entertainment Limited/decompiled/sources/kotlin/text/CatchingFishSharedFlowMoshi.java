package kotlin.text;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishSharedFlowMoshi implements Closeable {
    public static final ThreadPoolExecutor CatchingFishCardViewRealm;
    public long CatchingFish;
    public final ScheduledThreadPoolExecutor CatchingFishCloudMessaging;
    public final CatchingFishWidgetToolbar CatchingFishCoroutineFlow;
    public final Socket CatchingFishDaggerHiltFAB;
    public final CatchingFishFABMockk CatchingFishDaggerWebsocket;
    public final ThreadPoolExecutor CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentHandler;
    public final LinkedHashSet CatchingFishGsonAppCompat;
    public final CatchingFishWidgetToolbar CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public final CatchingFishMoshiFluxMoshi CatchingFishOkHttp;
    public final CatchingFishGradleAndroidX CatchingFishParcelableFlux;
    public final boolean CatchingFishReduxKtor;
    public final CatchingFishKtorRedux CatchingFishSpannableWidget;
    public int CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final LinkedHashMap CatchingFishWorkManager = new LinkedHashMap();
    public long CatchingFishUnitTesting = 0;
    public long CatchingFishAnimationMockk = 0;
    public long CatchingFishStateLiveData = 0;
    public long CatchingFishRoomDatabase = 0;
    public long CatchingFishNavigation = 0;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        CatchingFishCardViewRealm = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new CatchingFishAdMobAsyncTask("OkHttp Http2Connection", true));
    }

    public CatchingFishSharedFlowMoshi(CatchingFishGsonFragment catchingFishGsonFragment) {
        CatchingFishWidgetToolbar catchingFishWidgetToolbar = new CatchingFishWidgetToolbar(2, false);
        this.CatchingFishJetpackCompose = catchingFishWidgetToolbar;
        CatchingFishWidgetToolbar catchingFishWidgetToolbar2 = new CatchingFishWidgetToolbar(2, false);
        this.CatchingFishCoroutineFlow = catchingFishWidgetToolbar2;
        this.CatchingFishGsonAppCompat = new LinkedHashSet();
        this.CatchingFishOkHttp = CatchingFishMoshiFluxMoshi.CatchingFishEspressoTesting;
        boolean z = catchingFishGsonFragment.CatchingFishReduxKtor;
        this.CatchingFishReduxKtor = z;
        this.CatchingFishDaggerWebsocket = (CatchingFishFABMockk) catchingFishGsonFragment.CatchingFishLayout;
        int i = z ? 1 : 2;
        this.CatchingFishLayout = i;
        if (z) {
            this.CatchingFishLayout = i + 2;
        }
        if (z) {
            catchingFishWidgetToolbar.CatchingFishViewModelFAB(7, 16777216);
        }
        String str = (String) catchingFishGsonFragment.CatchingFishWorkManager;
        this.CatchingFishViewModelScope = str;
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        Locale locale = Locale.US;
        this.CatchingFishCloudMessaging = new ScheduledThreadPoolExecutor(1, new CatchingFishAdMobAsyncTask(CatchingFishMVPLiveData.CatchingFishOkHttp("OkHttp ", str, " Writer"), false));
        this.CatchingFishEspressoTesting = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new CatchingFishAdMobAsyncTask(CatchingFishMVPLiveData.CatchingFishOkHttp("OkHttp ", str, " Push Observer"), true));
        catchingFishWidgetToolbar2.CatchingFishViewModelFAB(7, 65535);
        catchingFishWidgetToolbar2.CatchingFishViewModelFAB(5, 16384);
        this.CatchingFish = catchingFishWidgetToolbar2.CatchingFishParcelableFAB();
        this.CatchingFishDaggerHiltFAB = (Socket) catchingFishGsonFragment.CatchingFishDaggerWebsocket;
        this.CatchingFishSpannableWidget = new CatchingFishKtorRedux((CatchingFishLayoutFlux) catchingFishGsonFragment.CatchingFishViewModelFAB, z);
        this.CatchingFishParcelableFlux = new CatchingFishGradleAndroidX(this, new CatchingFishViewModelDagger((CatchingFishAdMobMVVM) catchingFishGsonFragment.CatchingFishViewModelScope, z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.CatchingFishSpannableWidget.CatchingFishViewModelScope);
        r6 = r2;
        r8.CatchingFish -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishAnimationMockk(int i, boolean z, CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.CatchingFishSpannableWidget.CatchingFishCoroutine(z, i, catchingFishWidgetGradle, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.CatchingFish;
                            if (j3 > 0) {
                                break;
                            } else {
                                if (!this.CatchingFishWorkManager.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.CatchingFishSpannableWidget.CatchingFishCoroutine(z && j == 0, i, catchingFishWidgetGradle, min);
        }
    }

    public final synchronized CatchingFishPayPalMVI CatchingFishCoroutine(int i) {
        return (CatchingFishPayPalMVI) this.CatchingFishWorkManager.get(Integer.valueOf(i));
    }

    public final synchronized void CatchingFishDaggerWebsocket(CatchingFishPayPalLifecycle catchingFishPayPalLifecycle) {
        if (!this.CatchingFishFragmentHandler) {
            this.CatchingFishEspressoTesting.execute(catchingFishPayPalLifecycle);
        }
    }

    public final void CatchingFishEspressoTesting(int i) {
        synchronized (this.CatchingFishSpannableWidget) {
            synchronized (this) {
                if (this.CatchingFishFragmentHandler) {
                    return;
                }
                this.CatchingFishFragmentHandler = true;
                this.CatchingFishSpannableWidget.CatchingFishDaggerWebsocket(CatchingFishEspressoDagger.CatchingFishParcelableFAB, this.CatchingFishViewModelFAB, i);
            }
        }
    }

    public final synchronized CatchingFishPayPalMVI CatchingFishLayout(int i) {
        CatchingFishPayPalMVI catchingFishPayPalMVI;
        catchingFishPayPalMVI = (CatchingFishPayPalMVI) this.CatchingFishWorkManager.remove(Integer.valueOf(i));
        notifyAll();
        return catchingFishPayPalMVI;
    }

    public final synchronized void CatchingFishOkHttp(long j) {
        long j2 = this.CatchingFishNavigation + j;
        this.CatchingFishNavigation = j2;
        if (j2 >= this.CatchingFishJetpackCompose.CatchingFishParcelableFAB() / 2) {
            CatchingFishRoomDatabase(0, this.CatchingFishNavigation);
            this.CatchingFishNavigation = 0L;
        }
    }

    public final synchronized int CatchingFishReduxKtor() {
        CatchingFishWidgetToolbar catchingFishWidgetToolbar;
        catchingFishWidgetToolbar = this.CatchingFishCoroutineFlow;
        return (catchingFishWidgetToolbar.CatchingFishSnackbar & 16) != 0 ? catchingFishWidgetToolbar.CatchingFishParcelableFAB[4] : Integer.MAX_VALUE;
    }

    public final void CatchingFishRoomDatabase(int i, long j) {
        try {
            this.CatchingFishCloudMessaging.execute(new CatchingFishBiometricLayout(this, new Object[]{this.CatchingFishViewModelScope, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void CatchingFishSnackbar(int i, int i2, IOException iOException) {
        CatchingFishPayPalMVI[] catchingFishPayPalMVIArr;
        try {
            CatchingFishEspressoTesting(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.CatchingFishWorkManager.isEmpty()) {
                    catchingFishPayPalMVIArr = null;
                } else {
                    catchingFishPayPalMVIArr = (CatchingFishPayPalMVI[]) this.CatchingFishWorkManager.values().toArray(new CatchingFishPayPalMVI[this.CatchingFishWorkManager.size()]);
                    this.CatchingFishWorkManager.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (catchingFishPayPalMVIArr != null) {
            for (CatchingFishPayPalMVI catchingFishPayPalMVI : catchingFishPayPalMVIArr) {
                try {
                    catchingFishPayPalMVI.CatchingFishCoroutine(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.CatchingFishSpannableWidget.close();
        } catch (IOException unused3) {
        }
        try {
            this.CatchingFishDaggerHiltFAB.close();
        } catch (IOException unused4) {
        }
        this.CatchingFishCloudMessaging.shutdown();
        this.CatchingFishEspressoTesting.shutdown();
    }

    public final void CatchingFishStateLiveData(int i, int i2) {
        try {
            this.CatchingFishCloudMessaging.execute(new CatchingFishMVVMMockk(this, new Object[]{this.CatchingFishViewModelScope, Integer.valueOf(i)}, i, i2));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CatchingFishSnackbar(1, 6, null);
    }

    public final void flush() {
        this.CatchingFishSpannableWidget.flush();
    }
}
