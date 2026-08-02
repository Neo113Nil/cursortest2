package com.instagram.common.viewpoint.core;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Q0 {
    public static final C1192Pz A00 = new C1937hy() { // from class: com.facebook.ads.redexgen.X.7S
        @Override // com.instagram.common.viewpoint.core.C1192Pz
        public final int A00(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override // com.instagram.common.viewpoint.core.C1192Pz
        public final void A01(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    };

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i) {
        A00.A01(accessibilityEvent, i);
    }
}
