package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final /* synthetic */ class iw7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kw7 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ qxp d;

    public /* synthetic */ iw7(kw7 kw7Var, Runnable runnable, qxp qxpVar, int i) {
        this.a = i;
        this.b = kw7Var;
        this.c = runnable;
        this.d = qxpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ExecutorService executorService = this.b.a;
                final int i = 0;
                final Runnable runnable = this.c;
                final qxp qxpVar = this.d;
                executorService.execute(new Runnable() { // from class: gw7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((mw7) qxpVar.a).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((mw7) qxpVar.a).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                mw7 mw7Var = (mw7) qxpVar.a;
                                try {
                                    runnable2.run();
                                    mw7Var.l(null);
                                    return;
                                } catch (Exception e3) {
                                    mw7Var.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.b.a;
                final int i2 = 2;
                final Runnable runnable2 = this.c;
                final qxp qxpVar2 = this.d;
                executorService2.execute(new Runnable() { // from class: gw7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((mw7) qxpVar2.a).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((mw7) qxpVar2.a).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                mw7 mw7Var = (mw7) qxpVar2.a;
                                try {
                                    runnable22.run();
                                    mw7Var.l(null);
                                    return;
                                } catch (Exception e3) {
                                    mw7Var.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.b.a;
                final int i3 = 1;
                final Runnable runnable3 = this.c;
                final qxp qxpVar3 = this.d;
                executorService3.execute(new Runnable() { // from class: gw7
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((mw7) qxpVar3.a).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((mw7) qxpVar3.a).m(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                mw7 mw7Var = (mw7) qxpVar3.a;
                                try {
                                    runnable22.run();
                                    mw7Var.l(null);
                                    return;
                                } catch (Exception e3) {
                                    mw7Var.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
