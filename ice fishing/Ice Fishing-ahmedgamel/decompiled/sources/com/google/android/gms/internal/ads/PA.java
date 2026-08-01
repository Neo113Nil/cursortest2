package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PA extends OA {

    /* renamed from: n, reason: collision with root package name */
    public final char f26744n;

    public PA(char c9) {
        this.f26744n = c9;
    }

    @Override // com.google.android.gms.internal.ads.OA
    public final boolean b(char c9) {
        return c9 == this.f26744n;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f26744n;
        for (int i6 = 0; i6 < 4; i6++) {
            cArr[5 - i6] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return D.y.s(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }
}
