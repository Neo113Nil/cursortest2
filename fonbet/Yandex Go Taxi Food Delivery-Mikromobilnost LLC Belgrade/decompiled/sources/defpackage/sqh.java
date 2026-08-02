package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class sqh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tqh b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ zgf w;

    public /* synthetic */ sqh(tqh tqhVar, Runnable runnable, zgf zgfVar, int i) {
        this.a = i;
        this.b = tqhVar;
        this.c = runnable;
        this.w = zgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final zgf zgfVar = this.w;
        final Runnable runnable = this.c;
        tqh tqhVar = this.b;
        switch (i) {
            case 0:
                final int i2 = 0;
                tqhVar.a.execute(new Runnable() { // from class: qqh
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        zgf zgfVar2 = zgfVar;
                        Runnable runnable2 = runnable;
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    zgfVar2.l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    zgfVar2.l(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    zgfVar2.k(null);
                                    return;
                                } catch (Exception e3) {
                                    zgfVar2.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i3 = 2;
                tqhVar.a.execute(new Runnable() { // from class: qqh
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        zgf zgfVar2 = zgfVar;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    zgfVar2.l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    zgfVar2.l(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    zgfVar2.k(null);
                                    return;
                                } catch (Exception e3) {
                                    zgfVar2.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i4 = 1;
                tqhVar.a.execute(new Runnable() { // from class: qqh
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i4;
                        zgf zgfVar2 = zgfVar;
                        Runnable runnable2 = runnable;
                        switch (i32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    zgfVar2.l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    zgfVar2.l(e2);
                                    return;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    zgfVar2.k(null);
                                    return;
                                } catch (Exception e3) {
                                    zgfVar2.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
