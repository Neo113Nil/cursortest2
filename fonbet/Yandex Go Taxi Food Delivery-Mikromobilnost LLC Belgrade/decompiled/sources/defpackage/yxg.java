package defpackage;

import coil3.size.Scale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class yxg {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Scale.values().length];
        try {
            iArr[Scale.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Scale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
