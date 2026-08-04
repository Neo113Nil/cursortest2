package com.gamericefishpro.space.n9;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static volatile com.gamericefishpro.space.f9.e d;
    public final a2 a;
    public final com.gamericefishpro.space.va.a b;
    public volatile long c;

    public n(a2 a2Var) {
        com.gamericefishpro.space.v8.c0.g(a2Var);
        this.a = a2Var;
        this.b = new com.gamericefishpro.space.va.a(8, this, a2Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            a2 a2Var = this.a;
            a2Var.e().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            a2Var.a().y.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        com.gamericefishpro.space.f9.e eVar;
        if (d != null) {
            return d;
        }
        synchronized (n.class) {
            try {
                if (d == null) {
                    d = new com.gamericefishpro.space.f9.e(this.a.d().getMainLooper(), 3);
                }
                eVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
