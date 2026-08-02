package defpackage;

import io.flutter.plugins.camerax.LensFacing;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ys7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LensFacing.values().length];
        a = iArr;
        try {
            iArr[LensFacing.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[LensFacing.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[LensFacing.EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[LensFacing.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
