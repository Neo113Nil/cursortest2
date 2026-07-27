package O3;

import g1.C4523c;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2507n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f2508u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f2509v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4523c f2510w;

    public /* synthetic */ e(f fVar, Runnable runnable, C4523c c4523c, int i) {
        this.f2507n = i;
        this.f2508u = fVar;
        this.f2509v = runnable;
        this.f2510w = c4523c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2507n) {
            case 0:
                f fVar = this.f2508u;
                final C4523c c4523c = this.f2510w;
                final Runnable runnable = this.f2509v;
                final int i = 0;
                fVar.f2511n.execute(new Runnable() { // from class: O3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    ((h) c4523c.f37856u).k(e6);
                                    throw e6;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c4523c.f37856u).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) c4523c.f37856u;
                                try {
                                    runnable2.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.k(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                f fVar2 = this.f2508u;
                final C4523c c4523c2 = this.f2510w;
                final Runnable runnable2 = this.f2509v;
                final int i4 = 2;
                fVar2.f2511n.execute(new Runnable() { // from class: O3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    ((h) c4523c2.f37856u).k(e6);
                                    throw e6;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c4523c2.f37856u).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                h hVar = (h) c4523c2.f37856u;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.k(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                f fVar3 = this.f2508u;
                final C4523c c4523c3 = this.f2510w;
                final Runnable runnable3 = this.f2509v;
                final int i9 = 1;
                fVar3.f2511n.execute(new Runnable() { // from class: O3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    ((h) c4523c3.f37856u).k(e6);
                                    throw e6;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((h) c4523c3.f37856u).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                h hVar = (h) c4523c3.f37856u;
                                try {
                                    runnable22.run();
                                    hVar.j(null);
                                    return;
                                } catch (Exception e10) {
                                    hVar.k(e10);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
