package defpackage;

/* loaded from: classes.dex */
public final class opj implements uyf, xt3 {
    public final nyf a;
    public final kpj b;
    public ppj c;
    public final /* synthetic */ qpj d;

    public opj(qpj qpjVar, nyf nyfVar, kpj kpjVar) {
        kpjVar.getClass();
        this.d = qpjVar;
        this.a = nyfVar;
        this.b = kpjVar;
        nyfVar.a(this);
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        if (kyfVar == kyf.ON_START) {
            this.c = this.d.b(this.b);
            return;
        }
        if (kyfVar != kyf.ON_STOP) {
            if (kyfVar == kyf.ON_DESTROY) {
                cancel();
            }
        } else {
            ppj ppjVar = this.c;
            if (ppjVar != null) {
                ppjVar.cancel();
            }
        }
    }

    @Override // defpackage.xt3
    public final void cancel() {
        this.a.d(this);
        this.b.removeCancellable(this);
        ppj ppjVar = this.c;
        if (ppjVar != null) {
            ppjVar.cancel();
        }
        this.c = null;
    }
}
