package defpackage;

/* loaded from: classes.dex */
public final class wy implements defpackage.vs {
    public java.util.concurrent.ThreadPoolExecutor AARZUJiTa;
    public defpackage.s21 EXtogiMhuM;
    public final java.lang.Object F7NU4MC0GW = new java.lang.Object();
    public final android.content.Context IHQe1A4L2xu;
    public android.os.Handler adDC3e2L;
    public final defpackage.vy oh6vYeIP;
    public final defpackage.ky r1MBDhnF;
    public java.util.concurrent.ThreadPoolExecutor xiZrDbcSW0;

    public wy(android.content.Context context, defpackage.vy vyVar) {
        defpackage.a70.xiZrDbcSW0(context, "Context cannot be null");
        this.IHQe1A4L2xu = context.getApplicationContext();
        this.oh6vYeIP = vyVar;
        this.r1MBDhnF = defpackage.xy.F7NU4MC0GW;
    }

    @Override // defpackage.vs
    public final void IHQe1A4L2xu(defpackage.s21 s21Var) {
        synchronized (this.F7NU4MC0GW) {
            this.EXtogiMhuM = s21Var;
        }
        synchronized (this.F7NU4MC0GW) {
            try {
                if (this.EXtogiMhuM == null) {
                    return;
                }
                if (this.xiZrDbcSW0 == null) {
                    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new defpackage.sh("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.AARZUJiTa = threadPoolExecutor;
                    this.xiZrDbcSW0 = threadPoolExecutor;
                }
                this.xiZrDbcSW0.execute(new defpackage.cnag84Bm(6, this));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void oh6vYeIP() {
        synchronized (this.F7NU4MC0GW) {
            try {
                this.EXtogiMhuM = null;
                android.os.Handler handler = this.adDC3e2L;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.adDC3e2L = null;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.AARZUJiTa;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.xiZrDbcSW0 = null;
                this.AARZUJiTa = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final defpackage.gz r1MBDhnF() {
        try {
            defpackage.ky kyVar = this.r1MBDhnF;
            android.content.Context context = this.IHQe1A4L2xu;
            defpackage.vy vyVar = this.oh6vYeIP;
            kyVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            java.lang.Object obj = new java.lang.Object[]{vyVar}[0];
            java.util.Objects.requireNonNull(obj);
            arrayList.add(obj);
            defpackage.fz IHQe1A4L2xu = defpackage.uy.IHQe1A4L2xu(context, java.util.Collections.unmodifiableList(arrayList));
            int i = IHQe1A4L2xu.IHQe1A4L2xu;
            if (i != 0) {
                throw new java.lang.RuntimeException(defpackage.fx0.riuEU0zW4(i, "fetchFonts failed (", ")"));
            }
            defpackage.gz[] gzVarArr = (defpackage.gz[]) ((java.util.List) IHQe1A4L2xu.oh6vYeIP).get(0);
            if (gzVarArr == null || gzVarArr.length == 0) {
                throw new java.lang.RuntimeException("fetchFonts failed (empty result)");
            }
            return gzVarArr[0];
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.RuntimeException("provider not found", e);
        }
    }
}
