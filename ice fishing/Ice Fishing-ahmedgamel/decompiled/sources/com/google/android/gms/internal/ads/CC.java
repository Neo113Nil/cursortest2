package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class CC extends EC {
    public CC(AC ac, Character ch) {
        super(ac, ch);
        AbstractC2792Sd.i(ac.f24431b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i4 = 0;
        AbstractC2792Sd.M(0, i, bArr.length);
        for (int i6 = i; i6 >= 3; i6 -= 3) {
            int i9 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16) | (bArr[i4 + 2] & 255);
            AC ac = this.f25319a;
            sb.append(ac.f24431b[i9 >>> 18]);
            char[] cArr = ac.f24431b;
            sb.append(cArr[(i9 >>> 12) & 63]);
            sb.append(cArr[(i9 >>> 6) & 63]);
            sb.append(cArr[i9 & 63]);
            i4 += 3;
        }
        if (i4 < i) {
            d(sb, bArr, i4, i - i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence e9 = e(charSequence);
        int length = e9.length();
        AC ac = this.f25319a;
        if (!ac.f24437h[length % ac.f24434e]) {
            int length2 = e9.length();
            throw new DC(D.x.k(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i4 = 0;
        while (i < e9.length()) {
            int i6 = i4 + 1;
            int a9 = (ac.a(e9.charAt(i + 1)) << 12) | (ac.a(e9.charAt(i)) << 18);
            bArr[i4] = (byte) (a9 >>> 16);
            int i9 = i + 2;
            if (i9 < e9.length()) {
                int i10 = i + 3;
                int a10 = a9 | (ac.a(e9.charAt(i9)) << 6);
                int i11 = i4 + 2;
                bArr[i6] = (byte) ((a10 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
                if (i10 < e9.length()) {
                    i += 4;
                    i4 += 3;
                    bArr[i11] = (byte) ((a10 | ac.a(e9.charAt(i10))) & com.anythink.basead.exoplayer.k.p.f9259b);
                } else {
                    i4 = i11;
                    i = i10;
                }
            } else {
                i = i9;
                i4 = i6;
            }
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final EC c(AC ac, Character ch) {
        return new CC(ac, ch);
    }

    public CC(String str, String str2) {
        this(new AC(str, str2.toCharArray()), (Character) '=');
    }
}
