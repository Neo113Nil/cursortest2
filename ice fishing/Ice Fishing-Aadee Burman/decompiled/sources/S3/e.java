package S3;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2873n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f2874u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f2875v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ F1.a f2876w;

    public /* synthetic */ e(f fVar, Runnable runnable, F1.a aVar, int i) {
        this.f2873n = i;
        this.f2874u = fVar;
        this.f2875v = runnable;
        this.f2876w = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2873n) {
            case 0:
                f fVar = this.f2874u;
                final F1.a aVar = this.f2876w;
                final Runnable runnable = this.f2875v;
                final int i = 0;
                fVar.f2877n.execute(new Runnable() { // from class: S3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) aVar.f903u).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) aVar.f903u).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) aVar.f903u;
                                try {
                                    runnable2.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                f fVar2 = this.f2874u;
                final F1.a aVar2 = this.f2876w;
                final Runnable runnable2 = this.f2875v;
                final int i6 = 2;
                fVar2.f2877n.execute(new Runnable() { // from class: S3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) aVar2.f903u).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) aVar2.f903u).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) aVar2.f903u;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                f fVar3 = this.f2874u;
                final F1.a aVar3 = this.f2876w;
                final Runnable runnable3 = this.f2875v;
                final int i9 = 1;
                fVar3.f2877n.execute(new Runnable() { // from class: S3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) aVar3.f903u).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) aVar3.f903u).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) aVar3.f903u;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
