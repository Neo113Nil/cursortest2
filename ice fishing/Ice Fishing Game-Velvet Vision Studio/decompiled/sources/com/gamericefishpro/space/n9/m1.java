package com.gamericefishpro.space.n9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final /* synthetic */ p1 b;

    public m1(p1 p1Var, String str) {
        this.b = p1Var;
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        v0 v0Var = ((r1) this.b.d).y;
        r1.l(v0Var);
        v0Var.y.b(th, this.a);
    }
}
