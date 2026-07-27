package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class BC extends EC {

    /* renamed from: g, reason: collision with root package name */
    public final char[] f23860g;

    public BC(AC ac) {
        super(ac, (Character) null);
        this.f23860g = new char[512];
        AbstractC2772Sd.i(ac.f23651b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f23860g;
            char[] cArr2 = ac.f23651b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        AbstractC2772Sd.M(0, i, bArr.length);
        for (int i6 = 0; i6 < i; i6++) {
            int i9 = bArr[i6] & 255;
            char[] cArr = this.f23860g;
            sb.append(cArr[i9]);
            sb.append(cArr[i9 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new DC(D.y.m(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i6 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            AC ac = this.f24558a;
            bArr[i6] = (byte) ((ac.a(charAt) << 4) | ac.a(charSequence.charAt(i + 1)));
            i += 2;
            i6++;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final EC c(AC ac, Character ch) {
        return new BC(ac);
    }
}
