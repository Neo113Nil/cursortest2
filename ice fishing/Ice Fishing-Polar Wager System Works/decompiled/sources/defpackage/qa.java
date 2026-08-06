package defpackage;

/* loaded from: classes.dex */
public final class qa extends defpackage.ra {
    public final int SH1y5HwkJhh;
    public final int riuEU0zW4;

    public qa(byte[] bArr, int i, int i2) {
        super(bArr);
        defpackage.ra.oh6vYeIP(i, i + i2, bArr.length);
        this.riuEU0zW4 = i;
        this.SH1y5HwkJhh = i2;
    }

    @Override // defpackage.ra
    public final byte AARZUJiTa(int i) {
        return this.xiZrDbcSW0[this.riuEU0zW4 + i];
    }

    @Override // defpackage.ra
    public final byte IHQe1A4L2xu(int i) {
        int i2 = this.SH1y5HwkJhh;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.xiZrDbcSW0[this.riuEU0zW4 + i];
        }
        if (i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(defpackage.fx0.SH1y5HwkJhh("Index < 0: ", i));
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(defpackage.fx0.EXtogiMhuM(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.ra
    public final void adDC3e2L(int i, byte[] bArr) {
        java.lang.System.arraycopy(this.xiZrDbcSW0, this.riuEU0zW4, bArr, 0, i);
    }

    @Override // defpackage.ra
    public final int size() {
        return this.SH1y5HwkJhh;
    }

    @Override // defpackage.ra
    public final int xiZrDbcSW0() {
        return this.riuEU0zW4;
    }
}
