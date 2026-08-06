package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class f00 implements defpackage.iu {
    public final java.lang.Object JhCgjQRTAOCT = new java.lang.Object();
    public defpackage.ma0 P05cfTpS5W5L;
    public java.util.concurrent.ThreadPoolExecutor QiMR8OkAhezm;
    public android.os.Handler WDYagTQQm9ns;
    public final android.content.Context ZpBGe2uQfcn8;
    public final defpackage.hu fWTAfUmVKrZq;
    public final defpackage.e00 giKS3J6vZuNy;
    public java.util.concurrent.ThreadPoolExecutor oh71FJcDz6S2;

    public f00(android.content.Context context, defpackage.e00 e00Var) {
        defpackage.w60.GE9mJIPrb8gP(context, "Context cannot be null");
        this.ZpBGe2uQfcn8 = context.getApplicationContext();
        this.giKS3J6vZuNy = e00Var;
        this.fWTAfUmVKrZq = defpackage.g00.JhCgjQRTAOCT;
    }

    @Override // defpackage.iu
    public final void ZpBGe2uQfcn8(defpackage.ma0 ma0Var) {
        synchronized (this.JhCgjQRTAOCT) {
            this.P05cfTpS5W5L = ma0Var;
        }
        synchronized (this.JhCgjQRTAOCT) {
            try {
                if (this.P05cfTpS5W5L == null) {
                    return;
                }
                if (this.oh71FJcDz6S2 == null) {
                    java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new defpackage.uj("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.QiMR8OkAhezm = threadPoolExecutor;
                    this.oh71FJcDz6S2 = threadPoolExecutor;
                }
                this.oh71FJcDz6S2.execute(new defpackage.gUjdnLbkVAaA(7, this));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final defpackage.y00 fWTAfUmVKrZq() {
        try {
            defpackage.hu huVar = this.fWTAfUmVKrZq;
            android.content.Context context = this.ZpBGe2uQfcn8;
            defpackage.e00 e00Var = this.giKS3J6vZuNy;
            huVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            java.lang.Object obj = new java.lang.Object[]{e00Var}[0];
            java.util.Objects.requireNonNull(obj);
            arrayList.add(obj);
            defpackage.wg ZpBGe2uQfcn8 = defpackage.d00.ZpBGe2uQfcn8(context, java.util.Collections.unmodifiableList(arrayList));
            int i = ZpBGe2uQfcn8.ZpBGe2uQfcn8;
            if (i != 0) {
                throw new java.lang.RuntimeException("fetchFonts failed (" + i + ")");
            }
            defpackage.y00[] y00VarArr = (defpackage.y00[]) ((java.util.List) ZpBGe2uQfcn8.giKS3J6vZuNy).get(0);
            if (y00VarArr == null || y00VarArr.length == 0) {
                throw new java.lang.RuntimeException("fetchFonts failed (empty result)");
            }
            return y00VarArr[0];
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.RuntimeException("provider not found", e);
        }
    }

    public final void giKS3J6vZuNy() {
        synchronized (this.JhCgjQRTAOCT) {
            try {
                this.P05cfTpS5W5L = null;
                android.os.Handler handler = this.WDYagTQQm9ns;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.WDYagTQQm9ns = null;
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = this.QiMR8OkAhezm;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.oh71FJcDz6S2 = null;
                this.QiMR8OkAhezm = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
