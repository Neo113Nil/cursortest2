package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class f41 extends defpackage.v70 {
    public final int JhCgjQRTAOCT;
    public final defpackage.v70 fWTAfUmVKrZq;

    public f41(defpackage.v70 v70Var, int i) {
        this.fWTAfUmVKrZq = v70Var;
        this.JhCgjQRTAOCT = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.f41)) {
            return false;
        }
        defpackage.f41 f41Var = (defpackage.f41) obj;
        return f41Var.fWTAfUmVKrZq.equals(this.fWTAfUmVKrZq) && f41Var.JhCgjQRTAOCT == this.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode() + (this.JhCgjQRTAOCT * 31);
    }
}
