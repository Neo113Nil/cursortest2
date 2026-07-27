package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FC extends HC {
    public FC(DC dc, Character ch) {
        super(dc, ch);
        PA.n(dc.f24358b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i4 = 0;
        PA.c0(0, i, bArr.length);
        for (int i9 = i; i9 >= 3; i9 -= 3) {
            int i10 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16) | (bArr[i4 + 2] & 255);
            DC dc = this.f25323a;
            sb.append(dc.f24358b[i10 >>> 18]);
            char[] cArr = dc.f24358b;
            sb.append(cArr[(i10 >>> 12) & 63]);
            sb.append(cArr[(i10 >>> 6) & 63]);
            sb.append(cArr[i10 & 63]);
            i4 += 3;
        }
        if (i4 < i) {
            d(sb, bArr, i4, i - i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e6 = e(charSequence);
        int length = e6.length();
        DC dc = this.f25323a;
        if (!dc.f24364h[length % dc.f24361e]) {
            int length2 = e6.length();
            throw new GC(D.y.j(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i4 = 0;
        while (i < e6.length()) {
            int i9 = i4 + 1;
            int a9 = (dc.a(e6.charAt(i + 1)) << 12) | (dc.a(e6.charAt(i)) << 18);
            bArr[i4] = (byte) (a9 >>> 16);
            int i10 = i + 2;
            if (i10 < e6.length()) {
                int i11 = i + 3;
                int a10 = a9 | (dc.a(e6.charAt(i10)) << 6);
                int i12 = i4 + 2;
                bArr[i9] = (byte) ((a10 >>> 8) & com.anythink.basead.exoplayer.k.p.f8630b);
                if (i11 < e6.length()) {
                    i += 4;
                    i4 += 3;
                    bArr[i12] = (byte) ((a10 | dc.a(e6.charAt(i11))) & com.anythink.basead.exoplayer.k.p.f8630b);
                } else {
                    i4 = i12;
                    i = i11;
                }
            } else {
                i = i10;
                i4 = i9;
            }
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.HC
    public final HC c(DC dc, Character ch) {
        return new FC(dc, ch);
    }

    public FC(String str, String str2) {
        this(new DC(str, str2.toCharArray()), (Character) '=');
    }
}
