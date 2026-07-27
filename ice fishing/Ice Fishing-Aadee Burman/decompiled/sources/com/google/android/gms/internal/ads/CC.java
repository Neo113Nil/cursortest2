package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class CC extends EC {
    public CC(AC ac, Character ch) {
        super(ac, ch);
        AbstractC2772Sd.i(ac.f23651b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i6 = 0;
        AbstractC2772Sd.M(0, i, bArr.length);
        for (int i9 = i; i9 >= 3; i9 -= 3) {
            int i10 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | (bArr[i6 + 2] & 255);
            AC ac = this.f24558a;
            sb.append(ac.f23651b[i10 >>> 18]);
            char[] cArr = ac.f23651b;
            sb.append(cArr[(i10 >>> 12) & 63]);
            sb.append(cArr[(i10 >>> 6) & 63]);
            sb.append(cArr[i10 & 63]);
            i6 += 3;
        }
        if (i6 < i) {
            d(sb, bArr, i6, i - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e9 = e(charSequence);
        int length = e9.length();
        AC ac = this.f24558a;
        if (!ac.f23657h[length % ac.f23654e]) {
            int length2 = e9.length();
            throw new DC(D.y.m(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i6 = 0;
        while (i < e9.length()) {
            int i9 = i6 + 1;
            int a9 = (ac.a(e9.charAt(i + 1)) << 12) | (ac.a(e9.charAt(i)) << 18);
            bArr[i6] = (byte) (a9 >>> 16);
            int i10 = i + 2;
            if (i10 < e9.length()) {
                int i11 = i + 3;
                int a10 = a9 | (ac.a(e9.charAt(i10)) << 6);
                int i12 = i6 + 2;
                bArr[i9] = (byte) ((a10 >>> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
                if (i11 < e9.length()) {
                    i += 4;
                    i6 += 3;
                    bArr[i12] = (byte) ((a10 | ac.a(e9.charAt(i11))) & com.anythink.basead.exoplayer.k.p.f8473b);
                } else {
                    i6 = i12;
                    i = i11;
                }
            } else {
                i = i10;
                i6 = i9;
            }
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final EC c(AC ac, Character ch) {
        return new CC(ac, ch);
    }

    public CC(String str, String str2) {
        this(new AC(str, str2.toCharArray()), (Character) '=');
    }
}
