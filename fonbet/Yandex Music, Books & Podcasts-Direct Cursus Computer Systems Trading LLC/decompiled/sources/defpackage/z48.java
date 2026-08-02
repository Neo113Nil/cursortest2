package defpackage;

/* loaded from: classes.dex */
public final class z48 implements azs {
    public final byte[] a = new byte[4096];

    @Override // defpackage.azs
    public final void b(d7k d7kVar, int i, int i2) {
        d7kVar.I(i);
    }

    @Override // defpackage.azs
    public final int c(ma7 ma7Var, int i, boolean z) {
        byte[] bArr = this.a;
        int read = ma7Var.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        xq0.v();
        return 0;
    }

    @Override // defpackage.azs
    public final void d(dsc dscVar) {
    }

    @Override // defpackage.azs
    public final void a(long j, int i, int i2, int i3, zys zysVar) {
    }
}
