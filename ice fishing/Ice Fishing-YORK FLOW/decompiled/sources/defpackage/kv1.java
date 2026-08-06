package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kv1 implements java.lang.Runnable {
    public final /* synthetic */ android.animation.ValueAnimator P05cfTpS5W5L;
    public final /* synthetic */ defpackage.pd1 QiMR8OkAhezm;
    public final /* synthetic */ android.view.View WDYagTQQm9ns;
    public final /* synthetic */ defpackage.qv1 oh71FJcDz6S2;

    public kv1(android.view.View view, defpackage.qv1 qv1Var, defpackage.pd1 pd1Var, android.animation.ValueAnimator valueAnimator) {
        this.WDYagTQQm9ns = view;
        this.oh71FJcDz6S2 = qv1Var;
        this.QiMR8OkAhezm = pd1Var;
        this.P05cfTpS5W5L = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.mv1.e6mdH7fiFuta(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm);
        this.P05cfTpS5W5L.start();
    }
}
