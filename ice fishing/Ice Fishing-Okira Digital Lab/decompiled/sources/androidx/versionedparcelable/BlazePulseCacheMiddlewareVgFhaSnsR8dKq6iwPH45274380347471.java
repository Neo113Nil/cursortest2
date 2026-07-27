package androidx.versionedparcelable;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class BlazePulseCacheMiddlewareVgFhaSnsR8dKq6iwPH45274380347471 {
    public static Insets ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static CharSequence AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static Icon ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(Window window) {
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    public static void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(View view) {
        view.setImportantForContentCapture(1);
    }
}
