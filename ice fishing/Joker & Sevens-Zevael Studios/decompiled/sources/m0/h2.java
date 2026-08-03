package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h2 implements yc.y, e2 {

    /* renamed from: j, reason: collision with root package name */
    public static final g f4605j = new g();

    /* renamed from: g, reason: collision with root package name */
    public final fc.i f4606g;

    /* renamed from: h, reason: collision with root package name */
    public final h2 f4607h = this;

    /* renamed from: i, reason: collision with root package name */
    public volatile fc.i f4608i;

    public h2(fc.i iVar) {
        this.f4606g = iVar;
    }

    public final void a() {
        synchronized (this.f4607h) {
            try {
                fc.i iVar = this.f4608i;
                if (iVar == null) {
                    this.f4608i = f4605j;
                } else {
                    yc.a0.c(iVar, new n0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m0.e2
    public final void e() {
        a();
    }

    @Override // yc.y
    public final fc.i f() {
        fc.i iVar;
        fc.i iVar2 = this.f4608i;
        if (iVar2 == null || iVar2 == f4605j) {
            x0.b bVar = (x0.b) this.f4606g.v(x0.b.f7962h);
            fc.i g2Var = bVar != null ? new g2(bVar, this) : fc.j.f2348g;
            synchronized (this.f4607h) {
                try {
                    fc.i iVar3 = this.f4608i;
                    if (iVar3 == null) {
                        fc.i iVar4 = this.f4606g;
                        iVar = iVar4.d(new yc.e1((yc.b1) iVar4.v(yc.v.f8910h))).d(fc.j.f2348g).d(g2Var);
                    } else if (iVar3 == f4605j) {
                        fc.i iVar5 = this.f4606g;
                        yc.e1 e1Var = new yc.e1((yc.b1) iVar5.v(yc.v.f8910h));
                        e1Var.A(new n0(0));
                        iVar = iVar5.d(e1Var).d(fc.j.f2348g).d(g2Var);
                    } else {
                        iVar = iVar3;
                    }
                    this.f4608i = iVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            iVar2 = iVar;
        }
        pc.j.b(iVar2);
        return iVar2;
    }

    @Override // m0.e2
    public final void h() {
        a();
    }

    @Override // m0.e2
    public final void c() {
    }
}
