package androidx.versionedparcelable;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class TitanCloudPayloadAPIGAMkFH1GovS2uJ3ky154804989142470 {
    public static CharSequence ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static boolean LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static AccessibilityNodeInfo.AccessibilityAction ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }
}
