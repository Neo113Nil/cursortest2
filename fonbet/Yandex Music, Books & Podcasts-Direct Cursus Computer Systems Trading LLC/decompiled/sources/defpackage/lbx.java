package defpackage;

/* loaded from: classes.dex */
public final class lbx extends obx {
    public final int d;
    public final int e;

    public lbx(byte[] bArr, int i, int i2) {
        super(bArr);
        obx.s(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.obx
    public final byte a(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(k5r.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(f1d.e(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.obx
    public final byte g(int i) {
        return this.b[this.d + i];
    }

    @Override // defpackage.obx
    public final int n() {
        return this.d;
    }

    @Override // defpackage.obx
    public final int o() {
        return this.e;
    }

    @Override // defpackage.obx
    public final void q(int i, byte[] bArr) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
