package u1;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41139n;

    /* renamed from: u, reason: collision with root package name */
    public final J1.f f41140u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f41141v;

    public /* synthetic */ l(o oVar, J1.f fVar, int i) {
        this.f41139n = i;
        this.f41141v = oVar;
        this.f41140u = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5102b c5102b;
        switch (this.f41139n) {
            case 0:
                J1.f fVar = this.f41140u;
                fVar.f1363b.a();
                synchronized (fVar.f1364c) {
                    synchronized (this.f41141v) {
                        try {
                            n nVar = this.f41141v.f41160n;
                            J1.f fVar2 = this.f41140u;
                            nVar.getClass();
                            if (nVar.f41144n.contains(new m(fVar2, N1.g.f1961b))) {
                                o oVar = this.f41141v;
                                J1.f fVar3 = this.f41140u;
                                oVar.getClass();
                                try {
                                    fVar3.e(oVar.J, 5);
                                } finally {
                                }
                            }
                            this.f41141v.d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                J1.f fVar4 = this.f41140u;
                fVar4.f1363b.a();
                synchronized (fVar4.f1364c) {
                    synchronized (this.f41141v) {
                        try {
                            n nVar2 = this.f41141v.f41160n;
                            J1.f fVar5 = this.f41140u;
                            nVar2.getClass();
                            if (nVar2.f41144n.contains(new m(fVar5, N1.g.f1961b))) {
                                this.f41141v.f41156L.b();
                                o oVar2 = this.f41141v;
                                J1.f fVar6 = this.f41140u;
                                oVar2.getClass();
                                try {
                                    fVar6.g(oVar2.f41156L, oVar2.f41153H, oVar2.f41159O);
                                    this.f41141v.h(this.f41140u);
                                } finally {
                                }
                            }
                            this.f41141v.d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
