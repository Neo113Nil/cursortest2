package defpackage;

/* loaded from: classes.dex */
public final class n3 implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ defpackage.bb adDC3e2L;
    public final /* synthetic */ defpackage.g00 xiZrDbcSW0;

    public n3(defpackage.bb bbVar, defpackage.o3 o3Var, defpackage.g00 g00Var) {
        this.adDC3e2L = bbVar;
        this.xiZrDbcSW0 = g00Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        java.lang.Object p11Var;
        try {
            p11Var = this.xiZrDbcSW0.AARZUJiTa(java.lang.Long.valueOf(j));
        } catch (java.lang.Throwable th) {
            p11Var = new defpackage.p11(th);
        }
        this.adDC3e2L.SH1y5HwkJhh(p11Var);
    }
}
