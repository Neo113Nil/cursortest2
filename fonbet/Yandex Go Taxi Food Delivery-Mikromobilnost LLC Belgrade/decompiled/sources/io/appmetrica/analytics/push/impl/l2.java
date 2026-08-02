package io.appmetrica.analytics.push.impl;

/* loaded from: classes4.dex */
public final class l2 implements Runnable {
    public final /* synthetic */ n2 a;

    public l2(n2 n2Var) {
        this.a = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n2 n2Var = this.a;
        n2Var.a.a(n2Var.c);
    }
}
