package defpackage;

/* loaded from: classes.dex */
public final class ebx extends gbx {
    public final int d;

    public ebx(byte[] bArr, int i) {
        super(bArr);
        gbx.o(0, i, bArr.length);
        this.d = i;
    }

    @Override // defpackage.gbx
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

    @Override // defpackage.gbx
    public final byte g(int i) {
        return this.b[i];
    }

    @Override // defpackage.gbx
    public final int n() {
        return this.d;
    }
}
