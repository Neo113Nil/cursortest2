package android.content.Context;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterGroupPrimeTitaniumGamma4469 extends AccessibilityNodeProvider {
    public final FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterGroupPrimeTitaniumGamma4469(FrostHunterLayoutInflaterTurboHyperion3832 frostHunterLayoutInflaterTurboHyperion3832) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterLayoutInflaterTurboHyperion3832;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        FrostHunterMenuUltraHyperion3040 FrostHunterServiceEliteCelestialThunder1757 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterServiceEliteCelestialThunder1757(i);
        if (FrostHunterServiceEliteCelestialThunder1757 == null) {
            return null;
        }
        return FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        FrostHunterMenuUltraHyperion3040 FrostHunterLevelListDrawableFusionDragonHero2232 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterLevelListDrawableFusionDragonHero2232(i);
        if (FrostHunterLevelListDrawableFusionDragonHero2232 == null) {
            return null;
        }
        return FrostHunterLevelListDrawableFusionDragonHero2232.FrostHunterAlphaAnimationNeoCosmos5761;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197(i, i2, bundle);
    }
}
