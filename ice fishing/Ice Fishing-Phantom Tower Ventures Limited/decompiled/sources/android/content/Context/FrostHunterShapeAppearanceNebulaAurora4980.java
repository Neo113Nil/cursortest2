package android.content.Context;

import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterShapeAppearanceNebulaAurora4980 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final int FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterIntentBetaElite8730 FrostHunterConstraintSetCloneMasterUltraRogue2633 = new FrostHunterIntentBetaElite8730();
    public final /* synthetic */ int FrostHunterLifecycleBlazeGammaElite2889;
    public final Bundle FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterShapeAppearanceNebulaAurora4980(int i, int i2, Bundle bundle, int i3) {
        this.FrostHunterLifecycleBlazeGammaElite2889 = i3;
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterBundlePulseFusionHero2475 = i2;
        this.FrostHunterServiceEliteCelestialThunder1757 = bundle;
    }

    public final boolean FrostHunterAlphaAnimationNeoCosmos5761() {
        switch (this.FrostHunterLifecycleBlazeGammaElite2889) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    public final void FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterRotateAnimationSpectraPhoenixPhantom3899 frostHunterRotateAnimationSpectraPhoenixPhantom3899) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            frostHunterRotateAnimationSpectraPhoenixPhantom3899.toString();
        }
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200(frostHunterRotateAnimationSpectraPhoenixPhantom3899);
    }

    public final String toString() {
        return "Request { what=" + this.FrostHunterBundlePulseFusionHero2475 + " id=" + this.FrostHunterAlphaAnimationNeoCosmos5761 + " oneWay=" + FrostHunterAlphaAnimationNeoCosmos5761() + "}";
    }
}
