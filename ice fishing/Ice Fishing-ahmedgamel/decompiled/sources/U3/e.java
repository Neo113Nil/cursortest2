package U3;

import i1.C4586c;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3312n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f3313u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f3314v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4586c f3315w;

    public /* synthetic */ e(f fVar, Runnable runnable, C4586c c4586c, int i) {
        this.f3312n = i;
        this.f3313u = fVar;
        this.f3314v = runnable;
        this.f3315w = c4586c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3312n) {
            case 0:
                f fVar = this.f3313u;
                final C4586c c4586c = this.f3315w;
                final Runnable runnable = this.f3314v;
                final int i = 0;
                fVar.f3316n.execute(new Runnable() { // from class: U3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c4586c.f38154u).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) c4586c.f38154u).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) c4586c.f38154u;
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
                f fVar2 = this.f3313u;
                final C4586c c4586c2 = this.f3315w;
                final Runnable runnable2 = this.f3314v;
                final int i4 = 2;
                fVar2.f3316n.execute(new Runnable() { // from class: U3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c4586c2.f38154u).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) c4586c2.f38154u).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) c4586c2.f38154u;
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
                f fVar3 = this.f3313u;
                final C4586c c4586c3 = this.f3315w;
                final Runnable runnable3 = this.f3314v;
                final int i6 = 1;
                fVar3.f3316n.execute(new Runnable() { // from class: U3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c4586c3.f38154u).k(e9);
                                    throw e9;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) c4586c3.f38154u).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) c4586c3.f38154u;
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
