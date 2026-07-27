package u1;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41122n;

    /* renamed from: u, reason: collision with root package name */
    public final J1.f f41123u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f41124v;

    public /* synthetic */ m(p pVar, J1.f fVar, int i) {
        this.f41122n = i;
        this.f41124v = pVar;
        this.f41123u = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5063b c5063b;
        switch (this.f41122n) {
            case 0:
                J1.f fVar = this.f41123u;
                fVar.f1438b.a();
                synchronized (fVar.f1439c) {
                    synchronized (this.f41124v) {
                        try {
                            o oVar = this.f41124v.f41143n;
                            J1.f fVar2 = this.f41123u;
                            oVar.getClass();
                            if (oVar.f41127n.contains(new n(fVar2, N1.g.f1917b))) {
                                p pVar = this.f41124v;
                                J1.f fVar3 = this.f41123u;
                                pVar.getClass();
                                try {
                                    fVar3.e(pVar.J, 5);
                                } finally {
                                }
                            }
                            this.f41124v.d();
                        } finally {
                        }
                    }
                }
                return;
            default:
                J1.f fVar4 = this.f41123u;
                fVar4.f1438b.a();
                synchronized (fVar4.f1439c) {
                    synchronized (this.f41124v) {
                        try {
                            o oVar2 = this.f41124v.f41143n;
                            J1.f fVar5 = this.f41123u;
                            oVar2.getClass();
                            if (oVar2.f41127n.contains(new n(fVar5, N1.g.f1917b))) {
                                this.f41124v.f41139L.b();
                                p pVar2 = this.f41124v;
                                J1.f fVar6 = this.f41123u;
                                pVar2.getClass();
                                try {
                                    fVar6.g(pVar2.f41139L, pVar2.f41136H, pVar2.f41142O);
                                    this.f41124v.h(this.f41123u);
                                } finally {
                                }
                            }
                            this.f41124v.d();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
