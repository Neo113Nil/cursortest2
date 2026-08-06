package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public /* synthetic */ c4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
        this.P05cfTpS5W5L = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.e4 e4Var = (defpackage.e4) this.oh71FJcDz6S2;
                defpackage.a4 a4Var = (defpackage.a4) this.QiMR8OkAhezm;
                defpackage.b4 b4Var = (defpackage.b4) this.P05cfTpS5W5L;
                android.view.ActionMode startActionMode = e4Var.ZpBGe2uQfcn8.startActionMode(new defpackage.sx(a4Var), 1);
                defpackage.ma0.QiMR8OkAhezm(e4Var.P05cfTpS5W5L, startActionMode);
                if (startActionMode == null) {
                    b4Var.close();
                    return;
                }
                return;
            default:
                defpackage.r1 r1Var = (defpackage.r1) this.oh71FJcDz6S2;
                defpackage.ma0 ma0Var = (defpackage.ma0) this.QiMR8OkAhezm;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = (java.util.concurrent.ThreadPoolExecutor) this.P05cfTpS5W5L;
                try {
                    defpackage.g00 BHfvd2J71qpO = defpackage.h0.BHfvd2J71qpO(r1Var.ZpBGe2uQfcn8);
                    if (BHfvd2J71qpO == null) {
                        throw new java.lang.RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    defpackage.f00 f00Var = (defpackage.f00) ((defpackage.iu) BHfvd2J71qpO.giKS3J6vZuNy);
                    synchronized (f00Var.JhCgjQRTAOCT) {
                        f00Var.oh71FJcDz6S2 = threadPoolExecutor;
                    }
                    ((defpackage.iu) BHfvd2J71qpO.giKS3J6vZuNy).ZpBGe2uQfcn8(new defpackage.lu(ma0Var, threadPoolExecutor));
                    return;
                } catch (java.lang.Throwable th) {
                    ma0Var.OcTWLQzke1i2(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
