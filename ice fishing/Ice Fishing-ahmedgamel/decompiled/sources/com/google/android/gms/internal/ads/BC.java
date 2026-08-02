package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class BC extends EC {

    /* renamed from: g, reason: collision with root package name */
    public final char[] f24631g;

    public BC(AC ac) {
        super(ac, (Character) null);
        this.f24631g = new char[512];
        AbstractC2792Sd.i(ac.f24431b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f24631g;
            char[] cArr2 = ac.f24431b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        AbstractC2792Sd.M(0, i, bArr.length);
        for (int i4 = 0; i4 < i; i4++) {
            int i6 = bArr[i4] & 255;
            char[] cArr = this.f24631g;
            sb.append(cArr[i6]);
            sb.append(cArr[i6 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new DC(D.x.k(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i4 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            AC ac = this.f25319a;
            bArr[i4] = (byte) ((ac.a(charAt) << 4) | ac.a(charSequence.charAt(i + 1)));
            i += 2;
            i4++;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.EC
    public final EC c(AC ac, Character ch) {
        return new BC(ac);
    }
}
