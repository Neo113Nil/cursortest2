package defpackage;

/* loaded from: classes4.dex */
public final class gco extends nco {
    public final int a;
    public int b;

    public gco(int i, zzp zzpVar) {
        this.a = i;
        zzpVar.a();
    }

    @Override // defpackage.nco
    public final Object a(boolean z, Exception exc, cg6 cg6Var) {
        if (z) {
            return Boolean.FALSE;
        }
        int i = this.b + 1;
        this.b = i;
        int i2 = this.a;
        return (i2 < 0 || i <= i2) ? Boolean.TRUE : Boolean.FALSE;
    }
}
