package defpackage;

import io.flutter.plugins.webviewflutter.MixedContentMode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class xj41 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MixedContentMode.values().length];
        a = iArr;
        try {
            iArr[MixedContentMode.ALWAYS_ALLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[MixedContentMode.COMPATIBILITY_MODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[MixedContentMode.NEVER_ALLOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
