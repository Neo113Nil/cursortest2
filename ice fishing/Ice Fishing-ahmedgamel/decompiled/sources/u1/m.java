package u1;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41125n;

    /* renamed from: u, reason: collision with root package name */
    public final J1.f f41126u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f41127v;

    public /* synthetic */ m(p pVar, J1.f fVar, int i) {
        this.f41125n = i;
        this.f41127v = pVar;
        this.f41126u = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5063b c5063b;
        switch (this.f41125n) {
            case 0:
                J1.f fVar = this.f41126u;
                fVar.f1438b.a();
                synchronized (fVar.f1439c) {
                    synchronized (this.f41127v) {
                        try {
                            o oVar = this.f41127v.f41146n;
                            J1.f fVar2 = this.f41126u;
                            oVar.getClass();
                            if (oVar.f41130n.contains(new n(fVar2, N1.g.f1917b))) {
                                p pVar = this.f41127v;
                                J1.f fVar3 = this.f41126u;
                                pVar.getClass();
                                try {
                                    fVar3.e(pVar.J, 5);
                                } finally {
                                }
                            }
                            this.f41127v.d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                J1.f fVar4 = this.f41126u;
                fVar4.f1438b.a();
                synchronized (fVar4.f1439c) {
                    synchronized (this.f41127v) {
                        try {
                            o oVar2 = this.f41127v.f41146n;
                            J1.f fVar5 = this.f41126u;
                            oVar2.getClass();
                            if (oVar2.f41130n.contains(new n(fVar5, N1.g.f1917b))) {
                                this.f41127v.f41142L.b();
                                p pVar2 = this.f41127v;
                                J1.f fVar6 = this.f41126u;
                                pVar2.getClass();
                                try {
                                    fVar6.g(pVar2.f41142L, pVar2.f41139H, pVar2.f41145O);
                                    this.f41127v.h(this.f41126u);
                                } finally {
                                }
                            }
                            this.f41127v.d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
