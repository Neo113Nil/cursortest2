package defpackage;

/* loaded from: classes.dex */
public final class ro7 implements r2c {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ro7(int i) {
        if ((i & 1) != 0) {
            this.b = new olq(65496, 2, "image/jpeg");
        } else {
            this.b = new p3f();
        }
    }

    @Override // defpackage.r2c
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((r2c) this.b).a();
                break;
        }
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((r2c) this.b).b(j, j2);
                break;
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((r2c) this.b).d(s2cVar);
        }
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        switch (this.a) {
            case 0:
                return s2cVar.v(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((r2c) this.b).h(s2cVar, ci0Var);
        }
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        switch (this.a) {
            case 0:
                azs M = t2cVar.M(0, 3);
                t2cVar.E(new zg2(-9223372036854775807L));
                t2cVar.K();
                dsc dscVar = (dsc) this.b;
                bsc a = dscVar.a();
                a.m = l5i.p("text/x-unknown");
                a.j = dscVar.n;
                eta.o(a, M);
                break;
            default:
                ((r2c) this.b).l(t2cVar);
                break;
        }
    }

    private final void c() {
    }

    public ro7(dsc dscVar) {
        this.b = dscVar;
    }

    private final void e(long j, long j2) {
    }
}
