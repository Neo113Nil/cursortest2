package defpackage;

import just.adapter.scroll.ScrollDirection;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class v1t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScrollDirection.values().length];
        try {
            iArr[ScrollDirection.IGNORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScrollDirection.INCREASING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScrollDirection.DECREASING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
