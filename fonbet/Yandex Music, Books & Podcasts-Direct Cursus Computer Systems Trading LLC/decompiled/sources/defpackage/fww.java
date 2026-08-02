package defpackage;

/* loaded from: classes.dex */
public final class fww extends uyw {
    public final cz0 f;
    public final umd g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fww(vyf vyfVar, umd umdVar) {
        super(vyfVar);
        int i = pmd.c;
        this.f = new cz0(0);
        this.g = umdVar;
        vyfVar.a("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        if (this.f.isEmpty()) {
            return;
        }
        this.g.a(this);
    }

    @Override // defpackage.uyw, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.b = true;
        if (this.f.isEmpty()) {
            return;
        }
        this.g.a(this);
    }

    @Override // defpackage.uyw, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.b = false;
        umd umdVar = this.g;
        umdVar.getClass();
        synchronized (umd.r) {
            try {
                if (umdVar.k == this) {
                    umdVar.k = null;
                    umdVar.l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.uyw
    public final void k(h66 h66Var, int i) {
        this.g.h(h66Var, i);
    }

    @Override // defpackage.uyw
    public final void l() {
        fsn fsnVar = this.g.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(3));
    }
}
