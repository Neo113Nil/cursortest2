package defpackage;

/* loaded from: classes.dex */
public final class wlx extends cmx {
    public final int d;

    public wlx(byte[] bArr) {
        super(bArr);
        cmx.o(bArr.length);
        this.d = 47;
    }

    @Override // defpackage.cmx
    public final byte a(int i) {
        int i2 = this.d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(k5r.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(f1d.e(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.cmx
    public final byte g(int i) {
        return this.b[i];
    }

    @Override // defpackage.cmx
    public final int n() {
        return this.d;
    }
}
