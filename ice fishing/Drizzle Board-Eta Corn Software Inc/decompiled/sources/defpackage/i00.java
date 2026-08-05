package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i00 extends jb9XjC4I implements j4, i60 {
    public final z2 VgvYg0wo;

    public i00(l9 l9Var, z2 z2Var) {
        super(l9Var, true);
        this.VgvYg0wo = z2Var;
    }

    @Override // defpackage.vn
    public final void KlHjfFWx(CancellationException cancellationException) {
        this.VgvYg0wo.wxUZMvaN(cancellationException, true);
        amk52bBQ(cancellationException);
    }

    @Override // defpackage.j4
    public final Object NCTxEWno() {
        return this.VgvYg0wo.NCTxEWno();
    }

    @Override // defpackage.jb9XjC4I
    public final void TrssYQ34(Throwable th, boolean z) {
        if (this.VgvYg0wo.wxUZMvaN(th, false) || z) {
            return;
        }
        ej0.gjV1z5T1(this.wxUZMvaN, th);
    }

    @Override // defpackage.vn, defpackage.j4
    public final void b2ZJblxo(CancellationException cancellationException) {
        Object euDDoUNr = euDDoUNr();
        if (euDDoUNr instanceof c7) {
            return;
        }
        if ((euDDoUNr instanceof un) && ((un) euDDoUNr).VgvYg0wo()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new qn(I5GHvsYW(), null, this);
        }
        KlHjfFWx(cancellationException);
    }

    @Override // defpackage.jb9XjC4I
    public final void g2aRJUAd(Object obj) {
        e50.NCTxEWno(this.VgvYg0wo);
    }

    @Override // defpackage.j4
    public final w2 iterator() {
        z2 z2Var = this.VgvYg0wo;
        z2Var.getClass();
        return new w2(z2Var);
    }

    @Override // defpackage.j4
    public final Object ow5vqvCr(k6 k6Var) {
        z2 z2Var = this.VgvYg0wo;
        z2Var.getClass();
        return z2.lwWCatUu(z2Var, k6Var);
    }

    @Override // defpackage.i60
    public final Object qoPGr6Ce(g9 g9Var, Object obj) {
        return this.VgvYg0wo.qoPGr6Ce(g9Var, obj);
    }
}
