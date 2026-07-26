package android.content.Context;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRunnableMaxNovaDragon2334 implements ServiceConnection {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterRunnableMaxNovaDragon2334(com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754, int i) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterTransitionManagerOmegaNeoMaster3754;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        if (iBinder == null) {
            synchronized (frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLevelListDrawableFusionDragonHero2232) {
                i = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterServiceConnectionTurboPhoenixOmega6719;
            }
            if (i == 3) {
                frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterTextViewDragonStormMega4297 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            FrostHunterAnimatedVectorDrawableOlympianPixelPixel3326 frostHunterAnimatedVectorDrawableOlympianPixelPixel3326 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLifecycleBlazeGammaElite2889;
            frostHunterAnimatedVectorDrawableOlympianPixelPixel3326.sendMessage(frostHunterAnimatedVectorDrawableOlympianPixelPixel3326.obtainMessage(i2, frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterMotionSceneAuroraMega2271.get(), 16));
            return;
        }
        synchronized (frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterRemoteConfigSpeedSpeed8566) {
            try {
                com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37542 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                frostHunterTransitionManagerOmegaNeoMaster37542.FrostHunterCameraXPixelTurboCosmos9814 = (queryLocalInterface == null || !(queryLocalInterface instanceof FrostHunterAlphaAnimationInfernoElite6382)) ? new FrostHunterAlphaAnimationInfernoElite6382(iBinder) : (FrostHunterAlphaAnimationInfernoElite6382) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster37543 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i3 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterCountDownTimerHyperionOlympianHyperion2718 frostHunterCountDownTimerHyperionOlympianHyperion2718 = new FrostHunterCountDownTimerHyperionOlympianHyperion2718(frostHunterTransitionManagerOmegaNeoMaster37543, 0);
        FrostHunterAnimatedVectorDrawableOlympianPixelPixel3326 frostHunterAnimatedVectorDrawableOlympianPixelPixel33262 = frostHunterTransitionManagerOmegaNeoMaster37543.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterAnimatedVectorDrawableOlympianPixelPixel33262.sendMessage(frostHunterAnimatedVectorDrawableOlympianPixelPixel33262.obtainMessage(7, i3, -1, frostHunterCountDownTimerHyperionOlympianHyperion2718));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 frostHunterTransitionManagerOmegaNeoMaster3754;
        synchronized (this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterRemoteConfigSpeedSpeed8566) {
            frostHunterTransitionManagerOmegaNeoMaster3754 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterCameraXPixelTurboCosmos9814 = null;
        }
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterAnimatedVectorDrawableOlympianPixelPixel3326 frostHunterAnimatedVectorDrawableOlympianPixelPixel3326 = frostHunterTransitionManagerOmegaNeoMaster3754.FrostHunterLifecycleBlazeGammaElite2889;
        frostHunterAnimatedVectorDrawableOlympianPixelPixel3326.sendMessage(frostHunterAnimatedVectorDrawableOlympianPixelPixel3326.obtainMessage(6, i, 1));
    }
}
