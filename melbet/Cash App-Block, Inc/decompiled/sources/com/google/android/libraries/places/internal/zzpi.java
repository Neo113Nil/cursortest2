package com.google.android.libraries.places.internal;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes4.dex */
public final class zzpi extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        view.getClass();
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }
}
