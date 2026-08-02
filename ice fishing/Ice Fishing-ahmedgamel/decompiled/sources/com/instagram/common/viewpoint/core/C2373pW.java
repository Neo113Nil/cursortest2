package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.pW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2373pW implements AnonymousClass24 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public static String[] A04 = {"W5WZRfo3traFBsuJqUeacov", "AOz8vYfc0kUMyRrWtsrS4pOQsYE8BP6P", "ocEUeDJ9UZl7Q6o8h21wMsDJowBHj84j", "pkgO1YjXdbsvKDgws3J49uWJB6yyqkG7", "vCvp8tg1JPxrxhdMnot9YI84PFBkssaD", "Dazl9IXOnyCH5QLsvPseWpscLh5D5M0t", "ZYJ1zYUUdaXBOvkE2t6KLICz8MhT9p2M", "ySOVjFSAiUWhoASiDo2jZct"};
    public static final C2373pW A06 = new C2373pW(0, 0);
    public static final String A0A = C5C.A0h(0);
    public static final String A07 = C5C.A0h(1);
    public static final String A09 = C5C.A0h(2);
    public static final String A08 = C5C.A0h(3);
    public static final AnonymousClass23<C2373pW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pX
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2373pW.A00(bundle);
        }
    };

    public C2373pW(int i, int i4) {
        this(i, i4, 0, 1.0f);
    }

    public C2373pW(int i, int i4, int i6, float f2) {
        this.A03 = i;
        this.A01 = i4;
        this.A02 = i6;
        this.A00 = f2;
    }

    public static /* synthetic */ C2373pW A00(Bundle bundle) {
        int i = bundle.getInt(A0A, 0);
        int i4 = bundle.getInt(A07, 0);
        int height = bundle.getInt(A09, 0);
        return new C2373pW(i, i4, height, bundle.getFloat(A08, 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z6 = obj instanceof C2373pW;
        String[] strArr = A04;
        if (strArr[4].charAt(6) == strArr[2].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "xwJKUsQcskzDCgeEWIG9ozPdTsTzWcW9";
        strArr2[2] = "cRblKPLDWf1oyG1RJoVr7n5QNKGN7idl";
        if (!z6) {
            return false;
        }
        C2373pW c2373pW = (C2373pW) obj;
        return this.A03 == c2373pW.A03 && this.A01 == c2373pW.A01 && this.A02 == c2373pW.A02 && this.A00 == c2373pW.A00;
    }

    public final int hashCode() {
        int result = this.A03;
        int result2 = ((((7 * 31) + result) * 31) + this.A01) * 31;
        int result3 = this.A02;
        return ((result2 + result3) * 31) + Float.floatToRawIntBits(this.A00);
    }
}
