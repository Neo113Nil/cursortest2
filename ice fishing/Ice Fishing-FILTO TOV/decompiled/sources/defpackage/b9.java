package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b9 extends c9 {
    public final int JFJ3QoxA;
    public final int mOu10nynGul;

    public b9(byte[] bArr, int i, int i2) {
        super(bArr);
        c9.Yi7zF1RB1(i, i + i2, bArr.length);
        this.mOu10nynGul = i;
        this.JFJ3QoxA = i2;
    }

    @Override // defpackage.c9
    public final byte AvO7iQsrTN(int i) {
        return this.EljAMC1QTz[this.mOu10nynGul + i];
    }

    @Override // defpackage.c9
    public final int EljAMC1QTz() {
        return this.mOu10nynGul;
    }

    @Override // defpackage.c9
    public final byte GWasM1elztuh(int i) {
        int i2 = this.JFJ3QoxA;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.EljAMC1QTz[this.mOu10nynGul + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(mr0.AvO7iQsrTN("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(mr0.mOu10nynGul("Index > length: ", i, ", ", i2));
    }

    @Override // defpackage.c9
    public final void OOA6hdeuvCS(byte[] bArr, int i) {
        System.arraycopy(this.EljAMC1QTz, this.mOu10nynGul, bArr, 0, i);
    }

    @Override // defpackage.c9
    public final int size() {
        return this.JFJ3QoxA;
    }
}
