package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class nhu implements q0o {
    public final skn a;
    public final rce b;
    public final lhu c;
    public final nyf d;
    public final r2f e;

    public nhu(skn sknVar, rce rceVar, lhu lhuVar, nyf nyfVar, r2f r2fVar) {
        this.a = sknVar;
        this.b = rceVar;
        this.c = lhuVar;
        this.d = nyfVar;
        this.e = r2fVar;
    }

    @Override // defpackage.q0o
    public final void I() {
        lhu lhuVar = this.c;
        if (lhuVar.getView().isAttachedToWindow()) {
            return;
        }
        ohu c = k.c(lhuVar.getView());
        nhu nhuVar = c.d;
        if (nhuVar != null) {
            nyf nyfVar = nhuVar.d;
            nhuVar.e.g(null);
            lhu lhuVar2 = nhuVar.c;
            if (lhuVar2 instanceof czf) {
                nyfVar.d((czf) lhuVar2);
            }
            nyfVar.d(nhuVar);
        }
        c.d = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
        k.c(this.c.getView()).c();
    }

    @Override // defpackage.q0o
    public final void start() {
        nyf nyfVar = this.d;
        nyfVar.a(this);
        lhu lhuVar = this.c;
        if (lhuVar instanceof czf) {
            czf czfVar = (czf) lhuVar;
            nyfVar.d(czfVar);
            nyfVar.a(czfVar);
        }
        ohu c = k.c(lhuVar.getView());
        nhu nhuVar = c.d;
        if (nhuVar != null) {
            nyf nyfVar2 = nhuVar.d;
            nhuVar.e.g(null);
            lhu lhuVar2 = nhuVar.c;
            if (lhuVar2 instanceof czf) {
                nyfVar2.d((czf) lhuVar2);
            }
            nyfVar2.d(nhuVar);
        }
        c.d = this;
    }
}
