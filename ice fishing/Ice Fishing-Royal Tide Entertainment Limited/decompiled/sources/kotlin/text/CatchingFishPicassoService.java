package kotlin.text;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class CatchingFishPicassoService {
    public static final int CatchingFishCoroutine;
    public static final long CatchingFishDaggerWebsocket;
    public static final String CatchingFishParcelableFAB;
    public static final int CatchingFishReduxKtor;
    public static final long CatchingFishSnackbar;
    public static final CatchingFishMoshiFluxMoshi CatchingFishWorkManager;

    static {
        String str;
        int i = CatchingFishWidgetWidget.CatchingFishParcelableFAB;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        CatchingFishParcelableFAB = str;
        CatchingFishSnackbar = CatchingFishHiltMVPToast.CatchingFishCameraXIntent("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = CatchingFishWidgetWidget.CatchingFishParcelableFAB;
        if (i2 < 2) {
            i2 = 2;
        }
        CatchingFishCoroutine = CatchingFishHiltMVPToast.CatchingFishHandler("kotlinx.coroutines.scheduler.core.pool.size", i2, 8);
        CatchingFishReduxKtor = CatchingFishHiltMVPToast.CatchingFishHandler("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        CatchingFishDaggerWebsocket = TimeUnit.SECONDS.toNanos(CatchingFishHiltMVPToast.CatchingFishCameraXIntent("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        CatchingFishWorkManager = CatchingFishMoshiFluxMoshi.CatchingFishCloudMessaging;
    }
}
