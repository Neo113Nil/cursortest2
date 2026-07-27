package android.content.Context;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTabLayoutPhantomPixelCyber7040 extends com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754 {
    public final Integer FrostHunterEditTextPulseHyperion1262;
    public final boolean FrostHunterLooperHyperionForce4133;
    public final FrostHunterCoroutineScopeSpeedSparkAlpha3670 FrostHunterMeteringPointBetaCyber9571;
    public final Bundle FrostHunterServiceInfoHyperionSparkMax9966;

    public FrostHunterTabLayoutPhantomPixelCyber7040(Context context, Looper looper, FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670, Bundle bundle, FrostHunterAdapterSpeedNebula8626 frostHunterAdapterSpeedNebula8626, FrostHunterBitmapPixelMegaOlympian1139 frostHunterBitmapPixelMegaOlympian1139) {
        super(context, looper, 44, frostHunterCoroutineScopeSpeedSparkAlpha3670, frostHunterAdapterSpeedNebula8626, frostHunterBitmapPixelMegaOlympian1139);
        this.FrostHunterLooperHyperionForce4133 = true;
        this.FrostHunterMeteringPointBetaCyber9571 = frostHunterCoroutineScopeSpeedSparkAlpha3670;
        this.FrostHunterServiceInfoHyperionSparkMax9966 = bundle;
        this.FrostHunterEditTextPulseHyperion1262 = (Integer) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterLevelListDrawableFusionDragonHero2232;
    }

    @Override // com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754
    public final String FrostHunterCameraXTurboCelestialHero5430() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754
    public final Bundle FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223() {
        FrostHunterCoroutineScopeSpeedSparkAlpha3670 frostHunterCoroutineScopeSpeedSparkAlpha3670 = this.FrostHunterMeteringPointBetaCyber9571;
        boolean equals = this.FrostHunterBundlePulseFusionHero2475.getPackageName().equals((String) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlphaAnimationNeoCosmos5761);
        Bundle bundle = this.FrostHunterServiceInfoHyperionSparkMax9966;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) frostHunterCoroutineScopeSpeedSparkAlpha3670.FrostHunterAlphaAnimationNeoCosmos5761);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754, android.content.Context.FrostHunterAdapterHeroEclipseHyper5814
    public final boolean FrostHunterFragmentBetaMegaVortex6025() {
        return this.FrostHunterLooperHyperionForce4133;
    }

    @Override // android.content.Context.FrostHunterAdapterHeroEclipseHyper5814
    public final int FrostHunterRemoteConfigSpeedSpeed8566() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754
    public final String FrostHunterResourcesTitanHyperVision5823() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.FrostHunterTransitionManagerOmegaNeoMaster3754
    public final IInterface FrostHunterServiceConnectionTurboPhoenixOmega6719(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof FrostHunterBroadcastHyperionUltra6473 ? (FrostHunterBroadcastHyperionUltra6473) queryLocalInterface : new FrostHunterBroadcastHyperionUltra6473(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }
}
