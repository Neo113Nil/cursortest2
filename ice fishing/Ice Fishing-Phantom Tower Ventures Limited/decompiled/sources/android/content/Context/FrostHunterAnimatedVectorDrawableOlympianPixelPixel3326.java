package android.content.Context;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterAnimatedVectorDrawableOlympianPixelPixel3326 extends FrostHunterValueAnimatorHyperNebulaUltra9912 {
    public final /* synthetic */ com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterAlphaAnimationNeoCosmos5761;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrostHunterAnimatedVectorDrawableOlympianPixelPixel3326(com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754, Looper looper) {
        super(looper);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterTransitionManagerOmegaNeoMaster3754;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMotionSceneAuroraMega2271.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                FrostHunterFlatMapOlympianCelestialStorm8248 frostHunterFlatMapOlympianCelestialStorm8248 = (FrostHunterFlatMapOlympianCelestialStorm8248) message.obj;
                frostHunterFlatMapOlympianCelestialStorm8248.getClass();
                frostHunterFlatMapOlympianCelestialStorm8248.FrostHunterBundlePulseFusionHero2475();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterCameraXPixelTurboCosmos9814()) {
            FrostHunterFlatMapOlympianCelestialStorm8248 frostHunterFlatMapOlympianCelestialStorm82482 = (FrostHunterFlatMapOlympianCelestialStorm8248) message.obj;
            frostHunterFlatMapOlympianCelestialStorm82482.getClass();
            frostHunterFlatMapOlympianCelestialStorm82482.FrostHunterBundlePulseFusionHero2475();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterResourcesTitanHyperVision5823 = new ConnectionResult(message.arg2);
            if (!frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterTextViewDragonStormMega4297 && !TextUtils.isEmpty(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXTurboCelestialHero5430()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXTurboCelestialHero5430());
                    com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37542 = this.FrostHunterAlphaAnimationNeoCosmos5761;
                    if (!frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterTextViewDragonStormMega4297) {
                        frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterMotionSceneAuroraMega2271(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37543 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            ConnectionResult connectionResult = frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterResourcesTitanHyperVision5823;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37544 = this.FrostHunterAlphaAnimationNeoCosmos5761;
            ConnectionResult connectionResult2 = frostHunterTransitionManagerOmegaNeoMaster37544.FrostHunterResourcesTitanHyperVision5823;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            frostHunterTransitionManagerOmegaNeoMaster37544.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterMotionSceneAuroraMega2271(5, null);
            FrostHunterPlaceholderHeroDragonCyber3593 frostHunterPlaceholderHeroDragonCyber3593 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLightSensorForceFusion4241;
            if (frostHunterPlaceholderHeroDragonCyber3593 != null) {
                ((FrostHunterAdapterSpeedNebula8626) frostHunterPlaceholderHeroDragonCyber3593.FrostHunterAlphaAnimationNeoCosmos5761).FrostHunterAlphaAnimationNeoCosmos5761(message.arg2);
            }
            System.currentTimeMillis();
            com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLooperThreadBetaHyperionMax1000(this.FrostHunterAlphaAnimationNeoCosmos5761, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761()) {
            FrostHunterFlatMapOlympianCelestialStorm8248 frostHunterFlatMapOlympianCelestialStorm82483 = (FrostHunterFlatMapOlympianCelestialStorm8248) message.obj;
            frostHunterFlatMapOlympianCelestialStorm82483.getClass();
            frostHunterFlatMapOlympianCelestialStorm82483.FrostHunterBundlePulseFusionHero2475();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            new Exception();
            return;
        }
        FrostHunterFlatMapOlympianCelestialStorm8248 frostHunterFlatMapOlympianCelestialStorm82484 = (FrostHunterFlatMapOlympianCelestialStorm8248) message.obj;
        synchronized (frostHunterFlatMapOlympianCelestialStorm82484) {
            try {
                bool = frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterAlphaAnimationNeoCosmos5761;
                if (frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterConstraintSetCloneMasterUltraRogue2633) {
                    frostHunterFlatMapOlympianCelestialStorm82484.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37545 = frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterLevelListDrawableFusionDragonHero2232;
            int i6 = frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterServiceEliteCelestialThunder1757;
            if (i6 != 0) {
                frostHunterTransitionManagerOmegaNeoMaster37545.FrostHunterMotionSceneAuroraMega2271(1, null);
                Bundle bundle = frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterLifecycleBlazeGammaElite2889;
                frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterAlphaAnimationNeoCosmos5761(new ConnectionResult(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterConstraintSetCloneMasterUltraRogue2633()) {
                frostHunterTransitionManagerOmegaNeoMaster37545.FrostHunterMotionSceneAuroraMega2271(1, null);
                frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterAlphaAnimationNeoCosmos5761(new ConnectionResult(8, null));
            }
        }
        synchronized (frostHunterFlatMapOlympianCelestialStorm82484) {
            frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterConstraintSetCloneMasterUltraRogue2633 = true;
        }
        frostHunterFlatMapOlympianCelestialStorm82484.FrostHunterBundlePulseFusionHero2475();
    }
}
