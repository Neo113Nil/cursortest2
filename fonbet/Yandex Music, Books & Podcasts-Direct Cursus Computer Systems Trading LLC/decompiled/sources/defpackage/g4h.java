package defpackage;

/* loaded from: classes3.dex */
public final class g4h implements ikp {
    public final /* synthetic */ i4h a;

    public g4h(i4h i4hVar) {
        this.a = i4hVar;
    }

    @Override // defpackage.ikp
    public final void serviceAdded(ckp ckpVar) {
        if (this.a.a) {
            jjo.a(new pv7(22, this, ckpVar));
        }
    }

    @Override // defpackage.ikp
    public final void serviceRemoved(ckp ckpVar) {
        i4h i4hVar = this.a;
        vjp b = i4hVar.b(((dkp) ckpVar).b);
        if (b == null) {
            return;
        }
        synchronized (i4hVar.b) {
            i4hVar.b.remove(b);
        }
        pwe pweVar = i4hVar.c;
        if (pweVar != null) {
            pweVar.onLost(b);
        }
    }

    @Override // defpackage.ikp
    public final void serviceResolved(ckp ckpVar) {
    }
}
