package defpackage;

/* loaded from: classes.dex */
public final class wk3 implements azs {
    public final int a;
    public final dsc b;
    public final z48 c = new z48();
    public dsc d;
    public azs e;
    public long f;

    public wk3(int i, int i2, dsc dscVar) {
        this.a = i2;
        this.b = dscVar;
    }

    @Override // defpackage.azs
    public final void a(long j, int i, int i2, int i3, zys zysVar) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        azs azsVar = this.e;
        int i4 = dvt.a;
        azsVar.a(j, i, i2, i3, zysVar);
    }

    @Override // defpackage.azs
    public final void b(d7k d7kVar, int i, int i2) {
        azs azsVar = this.e;
        int i3 = dvt.a;
        azsVar.b(d7kVar, i, 0);
    }

    @Override // defpackage.azs
    public final int c(ma7 ma7Var, int i, boolean z) {
        azs azsVar = this.e;
        int i2 = dvt.a;
        return azsVar.c(ma7Var, i, z);
    }

    @Override // defpackage.azs
    public final void d(dsc dscVar) {
        dsc dscVar2 = this.b;
        if (dscVar2 != null) {
            dscVar = dscVar.d(dscVar2);
        }
        this.d = dscVar;
        azs azsVar = this.e;
        int i = dvt.a;
        azsVar.d(dscVar);
    }
}
