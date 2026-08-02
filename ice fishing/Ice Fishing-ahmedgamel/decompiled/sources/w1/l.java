package w1;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41508n;

    /* renamed from: u, reason: collision with root package name */
    public final L1.f f41509u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f41510v;

    public /* synthetic */ l(o oVar, L1.f fVar, int i) {
        this.f41508n = i;
        this.f41510v = oVar;
        this.f41509u = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5134b c5134b;
        switch (this.f41508n) {
            case 0:
                L1.f fVar = this.f41509u;
                fVar.f1754b.a();
                synchronized (fVar.f1755c) {
                    synchronized (this.f41510v) {
                        try {
                            n nVar = this.f41510v.f41529n;
                            L1.f fVar2 = this.f41509u;
                            nVar.getClass();
                            if (nVar.f41513n.contains(new m(fVar2, P1.g.f2361b))) {
                                o oVar = this.f41510v;
                                L1.f fVar3 = this.f41509u;
                                oVar.getClass();
                                try {
                                    fVar3.e(oVar.J, 5);
                                } finally {
                                }
                            }
                            this.f41510v.c();
                        } finally {
                        }
                    }
                }
                return;
            default:
                L1.f fVar4 = this.f41509u;
                fVar4.f1754b.a();
                synchronized (fVar4.f1755c) {
                    synchronized (this.f41510v) {
                        try {
                            n nVar2 = this.f41510v.f41529n;
                            L1.f fVar5 = this.f41509u;
                            nVar2.getClass();
                            if (nVar2.f41513n.contains(new m(fVar5, P1.g.f2361b))) {
                                this.f41510v.f41525L.d();
                                o oVar2 = this.f41510v;
                                L1.f fVar6 = this.f41509u;
                                oVar2.getClass();
                                try {
                                    fVar6.g(oVar2.f41525L, oVar2.f41522H, oVar2.f41528O);
                                    this.f41510v.h(this.f41509u);
                                } finally {
                                }
                            }
                            this.f41510v.c();
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
