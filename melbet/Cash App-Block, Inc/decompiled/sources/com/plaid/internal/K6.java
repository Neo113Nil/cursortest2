package com.plaid.internal;

/* loaded from: classes5.dex */
public final /* synthetic */ class K6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[J6.values().length];
        try {
            iArr[J6.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[J6.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[J6.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[J6.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
