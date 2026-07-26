package android.content.Context;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDebugHyperionMega2950 {
    public static final Uri FrostHunterServiceEliteCelestialThunder1757 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final boolean FrostHunterBundlePulseFusionHero2475;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterDebugHyperionMega2950(String str, boolean z) {
        FrostHunterCardViewHyperionAurora3829.FrostHunterFragmentBetaMegaVortex6025(str);
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        FrostHunterCardViewHyperionAurora3829.FrostHunterFragmentBetaMegaVortex6025("com.google.android.gms");
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = "com.google.android.gms";
        this.FrostHunterBundlePulseFusionHero2475 = z;
    }

    public final Intent FrostHunterAlphaAnimationNeoCosmos5761(Context context) {
        Bundle bundle;
        String str = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.FrostHunterBundlePulseFusionHero2475) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(FrostHunterServiceEliteCelestialThunder1757, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundle = null;
            }
            r0 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r0 == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
            }
        }
        return r0 == null ? new Intent(str).setPackage(this.FrostHunterConstraintSetCloneMasterUltraRogue2633) : r0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrostHunterDebugHyperionMega2950)) {
            return false;
        }
        FrostHunterDebugHyperionMega2950 frostHunterDebugHyperionMega2950 = (FrostHunterDebugHyperionMega2950) obj;
        return FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterAlphaAnimationNeoCosmos5761, frostHunterDebugHyperionMega2950.FrostHunterAlphaAnimationNeoCosmos5761) && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(this.FrostHunterConstraintSetCloneMasterUltraRogue2633, frostHunterDebugHyperionMega2950.FrostHunterConstraintSetCloneMasterUltraRogue2633) && FrostHunterExecutorSolarPhoenix3849.FrostHunterLooperHyperionForce4133(null, null) && this.FrostHunterBundlePulseFusionHero2475 == frostHunterDebugHyperionMega2950.FrostHunterBundlePulseFusionHero2475;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.FrostHunterAlphaAnimationNeoCosmos5761, this.FrostHunterConstraintSetCloneMasterUltraRogue2633, null, 4225, Boolean.valueOf(this.FrostHunterBundlePulseFusionHero2475)});
    }

    public final String toString() {
        String str = this.FrostHunterAlphaAnimationNeoCosmos5761;
        if (str != null) {
            return str;
        }
        FrostHunterCardViewHyperionAurora3829.FrostHunterScaleAnimationStrikeSpark5059(null);
        throw null;
    }
}
