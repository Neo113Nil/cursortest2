package io.flutter.embedding.android;

import io.flutter.embedding.android.KeyData;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[KeyData.Type.values().length];
        a = iArr;
        try {
            iArr[KeyData.Type.kDown.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[KeyData.Type.kUp.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[KeyData.Type.kRepeat.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
