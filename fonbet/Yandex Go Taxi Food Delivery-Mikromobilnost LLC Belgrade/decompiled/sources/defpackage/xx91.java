package defpackage;

/* loaded from: classes11.dex */
public final class xx91 extends jy91 {
    public final char[] e;

    public xx91(qx91 qx91Var) {
        super(qx91Var, (Character) null);
        this.e = new char[512];
        char[] cArr = qx91Var.b;
        if (cArr.length != 16) {
            w511.q();
            throw null;
        }
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.e;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // defpackage.jy91
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        tra1.e(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.e;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }
}
