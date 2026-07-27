package android.content.Context;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterPlaceholderPhantomCelestialShadow7837 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final FrostHunterKeyEventEliteCelestialDelta8868 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterPlaceholderPhantomCelestialShadow7837(FrostHunterKeyEventEliteCelestialDelta8868 frostHunterKeyEventEliteCelestialDelta8868) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterKeyEventEliteCelestialDelta8868;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterBundlePulseFusionHero2475(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
