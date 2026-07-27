package kotlin.text;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class CatchingFishFluxFirebase {
    public static CatchingFishFluxFirebase CatchingFishDaggerWebsocket;
    public Object CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public Object CatchingFishReduxKtor;
    public Object CatchingFishSnackbar;

    public static synchronized CatchingFishFluxFirebase CatchingFishViewModelFAB(Context context) {
        CatchingFishFluxFirebase catchingFishFluxFirebase;
        synchronized (CatchingFishFluxFirebase.class) {
            try {
                if (CatchingFishDaggerWebsocket == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new CatchingFishMoshiWidgetMVP("MessengerIpcClient")));
                    CatchingFishFluxFirebase catchingFishFluxFirebase2 = new CatchingFishFluxFirebase();
                    catchingFishFluxFirebase2.CatchingFishReduxKtor = new CatchingFishMVPGsonMockk(catchingFishFluxFirebase2);
                    catchingFishFluxFirebase2.CatchingFishParcelableFAB = 1;
                    catchingFishFluxFirebase2.CatchingFishCoroutine = unconfigurableScheduledExecutorService;
                    catchingFishFluxFirebase2.CatchingFishSnackbar = context.getApplicationContext();
                    CatchingFishDaggerWebsocket = catchingFishFluxFirebase2;
                }
                catchingFishFluxFirebase = CatchingFishDaggerWebsocket;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishFluxFirebase;
    }

    public void CatchingFishCoroutine(float f) {
        ((Paint) this.CatchingFishSnackbar).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void CatchingFishDaggerWebsocket(long j) {
        ((Paint) this.CatchingFishSnackbar).setColor(CatchingFishFirebaseDagger.CatchingFishStateFlow(j));
    }

    public synchronized CatchingFishWorkManagerMVP CatchingFishLayout(CatchingFishFluxKtor catchingFishFluxKtor) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(catchingFishFluxKtor.toString());
            }
            if (!((CatchingFishMVPGsonMockk) this.CatchingFishReduxKtor).CatchingFishReduxKtor(catchingFishFluxKtor)) {
                CatchingFishMVPGsonMockk catchingFishMVPGsonMockk = new CatchingFishMVPGsonMockk(this);
                this.CatchingFishReduxKtor = catchingFishMVPGsonMockk;
                catchingFishMVPGsonMockk.CatchingFishReduxKtor(catchingFishFluxKtor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return catchingFishFluxKtor.CatchingFishSnackbar.CatchingFishParcelableFAB;
    }

    public int CatchingFishParcelableFAB() {
        Paint.Cap strokeCap = ((Paint) this.CatchingFishSnackbar).getStrokeCap();
        int i = strokeCap == null ? -1 : CatchingFishAndroidXGlide.CatchingFishParcelableFAB[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public void CatchingFishReduxKtor(int i) {
        if (this.CatchingFishParcelableFAB == i) {
            return;
        }
        this.CatchingFishParcelableFAB = i;
        Paint paint = (Paint) this.CatchingFishSnackbar;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(CatchingFishAdMobFAB.CatchingFishMotionLayout(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(CatchingFishAdMobFAB.CatchingFishLayoutInflater(i)));
        }
    }

    public int CatchingFishSnackbar() {
        Paint.Join strokeJoin = ((Paint) this.CatchingFishSnackbar).getStrokeJoin();
        int i = strokeJoin == null ? -1 : CatchingFishAndroidXGlide.CatchingFishSnackbar[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void CatchingFishViewModelScope(int i) {
        ((Paint) this.CatchingFishSnackbar).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void CatchingFishWorkManager(CatchingFishFluxIntent catchingFishFluxIntent) {
        this.CatchingFishReduxKtor = catchingFishFluxIntent;
        ((Paint) this.CatchingFishSnackbar).setColorFilter(catchingFishFluxIntent != null ? catchingFishFluxIntent.CatchingFishParcelableFAB : null);
    }
}
