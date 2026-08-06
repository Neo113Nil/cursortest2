package defpackage;

/* loaded from: classes.dex */
public final class a6 implements defpackage.vs {
    public final android.content.Context IHQe1A4L2xu;

    public a6(android.content.Context context) {
        this.IHQe1A4L2xu = context.getApplicationContext();
    }

    @Override // defpackage.vs
    public void IHQe1A4L2xu(final defpackage.s21 s21Var) {
        defpackage.sh shVar = new defpackage.sh("EmojiCompatInitializer");
        final java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), shVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new java.lang.Runnable() { // from class: ys
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.a6 a6Var = defpackage.a6.this;
                defpackage.s21 s21Var2 = s21Var;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    defpackage.xy EgCjBq0SZwJ = defpackage.h1.EgCjBq0SZwJ(a6Var.IHQe1A4L2xu);
                    if (EgCjBq0SZwJ == null) {
                        throw new java.lang.RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    defpackage.wy wyVar = (defpackage.wy) ((defpackage.vs) EgCjBq0SZwJ.oh6vYeIP);
                    synchronized (wyVar.F7NU4MC0GW) {
                        wyVar.xiZrDbcSW0 = threadPoolExecutor2;
                    }
                    ((defpackage.vs) EgCjBq0SZwJ.oh6vYeIP).IHQe1A4L2xu(new defpackage.zs(s21Var2, threadPoolExecutor2));
                } catch (java.lang.Throwable th) {
                    s21Var2.wll2JLbTBC2(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    public /* synthetic */ a6(android.content.Context context, boolean z) {
        this.IHQe1A4L2xu = context;
    }
}
