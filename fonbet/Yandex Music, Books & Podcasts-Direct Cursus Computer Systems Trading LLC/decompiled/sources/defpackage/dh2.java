package defpackage;

/* loaded from: classes.dex */
public final class dh2 implements r2c {
    public final /* synthetic */ int a;
    public final d7k b;
    public final olq c;

    public dh2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new d7k(4);
                this.c = new olq(-1, -1, "image/heif");
                break;
            case 2:
                this.b = new d7k(4);
                this.c = new olq(-1, -1, "image/webp");
                break;
            default:
                this.b = new d7k(4);
                this.c = new olq(-1, -1, "image/avif");
                break;
        }
    }

    @Override // defpackage.r2c
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.b(j, j2);
                break;
            case 1:
                this.c.b(j, j2);
                break;
            default:
                this.c.b(j, j2);
                break;
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        switch (this.a) {
            case 0:
                gm7 gm7Var = (gm7) s2cVar;
                gm7Var.c(4, false);
                d7k d7kVar = this.b;
                d7kVar.E(4);
                gm7Var.l(d7kVar.a, 0, 4, false);
                if (d7kVar.x() == 1718909296) {
                    d7kVar.E(4);
                    gm7Var.l(d7kVar.a, 0, 4, false);
                    if (d7kVar.x() == 1635150182) {
                    }
                }
                break;
            case 1:
                gm7 gm7Var2 = (gm7) s2cVar;
                gm7Var2.c(4, false);
                d7k d7kVar2 = this.b;
                d7kVar2.E(4);
                gm7Var2.l(d7kVar2.a, 0, 4, false);
                if (d7kVar2.x() == 1718909296) {
                    d7kVar2.E(4);
                    gm7Var2.l(d7kVar2.a, 0, 4, false);
                    if (d7kVar2.x() == 1751476579) {
                    }
                }
                break;
            default:
                d7k d7kVar3 = this.b;
                d7kVar3.E(4);
                gm7 gm7Var3 = (gm7) s2cVar;
                gm7Var3.l(d7kVar3.a, 0, 4, false);
                if (d7kVar3.x() == 1380533830) {
                    gm7Var3.c(4, false);
                    d7kVar3.E(4);
                    gm7Var3.l(d7kVar3.a, 0, 4, false);
                    if (d7kVar3.x() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        switch (this.a) {
        }
        return this.c.h(s2cVar, ci0Var);
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        switch (this.a) {
            case 0:
                this.c.l(t2cVar);
                break;
            case 1:
                this.c.l(t2cVar);
                break;
            default:
                this.c.l(t2cVar);
                break;
        }
    }

    private final void c() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
