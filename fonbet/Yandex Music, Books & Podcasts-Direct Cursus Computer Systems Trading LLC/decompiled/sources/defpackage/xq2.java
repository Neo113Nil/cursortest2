package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes3.dex */
public final class xq2 extends ar2 {
    public final char[] d;

    public xq2(wq2 wq2Var) {
        super(wq2Var, (Character) null);
        this.d = new char[RemoteCameraConfig.Mic.BUFFER_SIZE];
        char[] cArr = wq2Var.b;
        o2g.L(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.d;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.ar2
    public final int b(byte[] bArr, CharSequence charSequence) {
        if (charSequence.length() % 2 == 1) {
            throw new zq2("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            wq2 wq2Var = this.a;
            bArr[i2] = (byte) ((wq2Var.a(charAt) << 4) | wq2Var.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.ar2
    public final void e(StringBuilder sb, byte[] bArr, int i) {
        o2g.Q(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.d;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
