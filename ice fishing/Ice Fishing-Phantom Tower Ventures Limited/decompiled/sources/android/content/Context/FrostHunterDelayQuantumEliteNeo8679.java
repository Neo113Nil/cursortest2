package android.content.Context;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterDelayQuantumEliteNeo8679 implements Runnable {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterDataBindingNovaXMax2962 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterDelayQuantumEliteNeo8679(FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax2962, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterDataBindingNovaXMax2962;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.FrostHunterCameraXPixelTurboCosmos9814) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax2962 = this.FrostHunterFlowMaxDragonHero5809;
                synchronized (frostHunterDataBindingNovaXMax2962) {
                    if (frostHunterDataBindingNovaXMax2962.FrostHunterAlphaAnimationNeoCosmos5761 == 1) {
                        frostHunterDataBindingNovaXMax2962.FrostHunterAlphaAnimationNeoCosmos5761("Timed out while binding");
                    }
                }
                return;
            default:
                this.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761("Service disconnected");
                return;
        }
        while (true) {
            FrostHunterDataBindingNovaXMax2962 frostHunterDataBindingNovaXMax29622 = this.FrostHunterFlowMaxDragonHero5809;
            synchronized (frostHunterDataBindingNovaXMax29622) {
                try {
                    if (frostHunterDataBindingNovaXMax29622.FrostHunterAlphaAnimationNeoCosmos5761 != 2) {
                        return;
                    }
                    if (frostHunterDataBindingNovaXMax29622.FrostHunterServiceEliteCelestialThunder1757.isEmpty()) {
                        frostHunterDataBindingNovaXMax29622.FrostHunterBundlePulseFusionHero2475();
                        return;
                    }
                    FrostHunterShapeAppearanceNebulaAurora4980 frostHunterShapeAppearanceNebulaAurora4980 = (FrostHunterShapeAppearanceNebulaAurora4980) frostHunterDataBindingNovaXMax29622.FrostHunterServiceEliteCelestialThunder1757.poll();
                    frostHunterDataBindingNovaXMax29622.FrostHunterLifecycleBlazeGammaElite2889.put(frostHunterShapeAppearanceNebulaAurora4980.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterShapeAppearanceNebulaAurora4980);
                    ((ScheduledExecutorService) frostHunterDataBindingNovaXMax29622.FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterBundlePulseFusionHero2475).schedule(new FrostHunterDrawableSparkSparkSolar5692(3, frostHunterDataBindingNovaXMax29622, frostHunterShapeAppearanceNebulaAurora4980), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(frostHunterShapeAppearanceNebulaAurora4980));
                    }
                    FrostHunterCardViewFusionHeroSpectra3749 frostHunterCardViewFusionHeroSpectra3749 = frostHunterDataBindingNovaXMax29622.FrostHunterLevelListDrawableFusionDragonHero2232;
                    Messenger messenger = frostHunterDataBindingNovaXMax29622.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    int i = frostHunterShapeAppearanceNebulaAurora4980.FrostHunterBundlePulseFusionHero2475;
                    Context context = (Context) frostHunterCardViewFusionHeroSpectra3749.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = frostHunterShapeAppearanceNebulaAurora4980.FrostHunterAlphaAnimationNeoCosmos5761;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", frostHunterShapeAppearanceNebulaAurora4980.FrostHunterAlphaAnimationNeoCosmos5761());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", frostHunterShapeAppearanceNebulaAurora4980.FrostHunterServiceEliteCelestialThunder1757);
                    obtain.setData(bundle);
                    try {
                        FrostHunterProximitySensorEpicSolar3138 frostHunterProximitySensorEpicSolar3138 = frostHunterDataBindingNovaXMax29622.FrostHunterBundlePulseFusionHero2475;
                        Messenger messenger2 = (Messenger) frostHunterProximitySensorEpicSolar3138.FrostHunterFlowMaxDragonHero5809;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            FrostHunterAnalyticsCelestialBeta2989 frostHunterAnalyticsCelestialBeta2989 = (FrostHunterAnalyticsCelestialBeta2989) frostHunterProximitySensorEpicSolar3138.FrostHunterAlertDialogAuroraDelta3200;
                            if (frostHunterAnalyticsCelestialBeta2989 == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = frostHunterAnalyticsCelestialBeta2989.FrostHunterCameraXPixelTurboCosmos9814;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        frostHunterDataBindingNovaXMax29622.FrostHunterAlphaAnimationNeoCosmos5761(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
