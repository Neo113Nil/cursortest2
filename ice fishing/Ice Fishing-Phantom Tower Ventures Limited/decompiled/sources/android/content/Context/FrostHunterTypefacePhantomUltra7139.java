package android.content.Context;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterTypefacePhantomUltra7139 {
    public static PackageInfo FrostHunterAlphaAnimationNeoCosmos5761(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static String FrostHunterBundlePulseFusionHero2475(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static Object FrostHunterConstraintSetCloneMasterUltraRogue2633(Bundle bundle, String str) {
        return bundle.getParcelable(str, FrostHunterRealtimeDatabasePulseStormOlympian4721.class);
    }

    public static boolean FrostHunterServiceEliteCelestialThunder1757(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
