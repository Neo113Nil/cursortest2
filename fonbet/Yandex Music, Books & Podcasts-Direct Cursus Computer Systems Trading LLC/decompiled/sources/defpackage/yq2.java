package defpackage;

import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class yq2 extends ar2 {
    public yq2(String str, String str2) {
        this(new wq2(str, str2.toCharArray()), (Character) '=');
    }

    @Override // defpackage.ar2
    public final int b(byte[] bArr, CharSequence charSequence) {
        CharSequence f = f(charSequence);
        int length = f.length();
        wq2 wq2Var = this.a;
        if (!wq2Var.h[length % wq2Var.e]) {
            throw new zq2("Invalid input length " + f.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < f.length()) {
            int i3 = i + 2;
            int a = (wq2Var.a(f.charAt(i + 1)) << 12) | (wq2Var.a(f.charAt(i)) << 18);
            int i4 = i2 + 1;
            bArr[i2] = (byte) (a >>> 16);
            if (i3 < f.length()) {
                int i5 = i + 3;
                int a2 = a | (wq2Var.a(f.charAt(i3)) << 6);
                int i6 = i2 + 2;
                bArr[i4] = (byte) ((a2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                if (i5 < f.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((a2 | wq2Var.a(f.charAt(i5))) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i2 = i4;
                i = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.ar2
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        o2g.Q(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            wq2 wq2Var = this.a;
            char[] cArr = wq2Var.b;
            char[] cArr2 = wq2Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            d(sb, bArr, i2, i - i2);
        }
    }

    public yq2(wq2 wq2Var, Character ch) {
        super(wq2Var, ch);
        o2g.L(wq2Var.b.length == 64);
    }
}
