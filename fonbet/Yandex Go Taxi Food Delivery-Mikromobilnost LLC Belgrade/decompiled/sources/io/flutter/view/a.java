package io.flutter.view;

import io.flutter.view.AccessibilityBridge;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[AccessibilityBridge.StringAttributeType.values().length];
        a = iArr;
        try {
            iArr[AccessibilityBridge.StringAttributeType.SPELLOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[AccessibilityBridge.StringAttributeType.LOCALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[AccessibilityBridge.StringAttributeType.URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
