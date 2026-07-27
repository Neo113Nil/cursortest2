package kotlin.text;

import android.app.ActivityOptions;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class CatchingFishDataStore {
    public static void CatchingFishCloudMessaging(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void CatchingFishCoroutine(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static int CatchingFishDaggerWebsocket(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static void CatchingFishEspressoTesting(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static void CatchingFishFragmentHandler(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void CatchingFishLayout(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static AccessibilityNodeInfo.AccessibilityAction CatchingFishParcelableFAB() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static CharSequence CatchingFishReduxKtor(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static float CatchingFishSnackbar(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static boolean CatchingFishViewModelFAB(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static boolean CatchingFishViewModelScope(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static int CatchingFishWorkManager(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }
}
