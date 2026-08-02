package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PA extends OA {

    /* renamed from: n, reason: collision with root package name */
    public final char f27527n;

    public PA(char c9) {
        this.f27527n = c9;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final boolean b(char c9) {
        return c9 == this.f27527n;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f27527n;
        for (int i4 = 0; i4 < 4; i4++) {
            cArr[5 - i4] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return D.x.p(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
