package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class jv0 extends defpackage.j80 {
    public final defpackage.s2 JhCgjQRTAOCT;
    public final defpackage.n61 fWTAfUmVKrZq;

    public jv0(defpackage.n61 n61Var) {
        super(9);
        defpackage.s2 s2Var;
        this.fWTAfUmVKrZq = n61Var;
        if (defpackage.wc1.Jkfc0NcwyPL8(n61Var)) {
            s2Var = null;
        } else {
            s2Var = defpackage.u2.ZpBGe2uQfcn8();
            defpackage.s2.fWTAfUmVKrZq(s2Var, n61Var);
        }
        this.JhCgjQRTAOCT = s2Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jv0) {
            return this.fWTAfUmVKrZq.equals(((defpackage.jv0) obj).fWTAfUmVKrZq);
        }
        return false;
    }

    @Override // defpackage.j80
    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode();
    }

    @Override // defpackage.j80
    public final defpackage.s31 w7APNrr0aGRc() {
        defpackage.n61 n61Var = this.fWTAfUmVKrZq;
        return new defpackage.s31(n61Var.ZpBGe2uQfcn8, n61Var.giKS3J6vZuNy, n61Var.fWTAfUmVKrZq, n61Var.JhCgjQRTAOCT);
    }
}
