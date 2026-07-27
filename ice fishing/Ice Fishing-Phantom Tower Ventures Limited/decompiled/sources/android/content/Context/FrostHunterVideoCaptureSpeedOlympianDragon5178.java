package android.content.Context;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterVideoCaptureSpeedOlympianDragon5178 {
    public static final FrostHunterCountDownTimerCyberVisionTitanium9970 FrostHunterAlphaAnimationNeoCosmos5761;

    static {
        String str;
        int i = FrostHunterCanvasPhantomEclipse9142.FrostHunterAlphaAnimationNeoCosmos5761;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new FrostHunterAlertDialogDeltaEclipse4807()).iterator();
            it.getClass();
            Iterator it2 = FrostHunterTextWatcherDeltaStormNebula3644.FrostHunterLightSensorForceFusion4241(new FrostHunterCameraXNovaCelestialCelestial7906(new FrostHunterServiceConnectionHyperThunderFusion2305(1, it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((FrostHunterAlertDialogDeltaEclipse4807) obj).getClass();
                    do {
                        ((FrostHunterAlertDialogDeltaEclipse4807) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((FrostHunterAlertDialogDeltaEclipse4807) obj) == null) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterCountDownTimerCyberVisionTitanium9970(FrostHunterRunnableSpeedHyperion6925.FrostHunterAlphaAnimationNeoCosmos5761(mainLooper));
            } else {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterServiceConnectionTurboPhoenixOmega6719("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
