package com.plaid.internal;

/* renamed from: com.plaid.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0212k5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0203j5.values().length];
        try {
            iArr[EnumC0203j5.PRODUCTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0203j5.DEVELOPMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0203j5.SANDBOX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
