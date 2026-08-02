package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes6.dex */
public final class hgo extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionItemInfo(null);
    }
}
