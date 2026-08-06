package z;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1092d {
    public static Object a(int i2, float f2, float f3, float f4) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f2, f3, f4);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
