package android.content.Context;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterImageCaptureThunderHyperion6964 {
    public static Icon FrostHunterAlphaAnimationNeoCosmos5761(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static CharSequence FrostHunterBundlePulseFusionHero2475(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void FrostHunterCameraXPixelTurboCosmos9814(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void FrostHunterConstraintSetCloneMasterUltraRogue2633(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static void FrostHunterLevelListDrawableFusionDragonHero2232(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void FrostHunterLifecycleBlazeGammaElite2889(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void FrostHunterRemoteConfigSpeedSpeed8566(View view) {
        view.setImportantForContentCapture(1);
    }

    public static Insets FrostHunterServiceEliteCelestialThunder1757(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
}
