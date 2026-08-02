package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;

/* renamed from: com.facebook.ads.redexgen.X.2m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06082m {
    public static String[] A02 = {"GJxubYlXsZiu90nLIAtZt0ZPoHJfDn5s", "BS8EJfUuntSU9isaC3nv1ANhy", "Gs0aOb6gQMfpDwhZyZjPrCKqfhvLXKwh", "iN3iHRJ6T765oBofKZIxuh5bzIdVCLFB", "wNf5fiO3vn7igkhJYRlF92Iu10jGyY95", "PRW1z97xqqsLulYYbCVWRoDib", "FY0aCr3Onb0", "4J82hMkwk7B8La5ZKR1JgNOMoJvqL0p2"};
    public boolean A00;
    public final SparseBooleanArray A01 = new SparseBooleanArray();

    public final C06082m A00(int i) {
        AbstractC06443y.A08(!this.A00);
        this.A01.append(i, true);
        return this;
    }

    public final C06082m A01(int i, boolean z6) {
        if (z6) {
            C06082m A00 = A00(i);
            if (A02[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "oVNjkypXGUiIrzEYrZV4GsKas1KVyN3y";
            strArr[3] = "tIVTdGxG4MXYUs0uHZXzBbuDNAp7p6hg";
            return A00;
        }
        return this;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C06082m A02(C06092n c06092n) {
        for (int i = 0; i < i; i++) {
            int i4 = c06092n.A01(i);
            A00(i4);
        }
        return this;
    }

    public final C06082m A03(int... iArr) {
        for (int i : iArr) {
            A00(i);
        }
        return this;
    }

    public final C06092n A04() {
        AbstractC06443y.A08(!this.A00);
        this.A00 = true;
        return new C06092n(this.A01);
    }
}
