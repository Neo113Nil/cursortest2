package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j11 extends defpackage.v70 {
    public final long JhCgjQRTAOCT;
    public final java.lang.Object fWTAfUmVKrZq;

    public j11(long j, java.lang.Object obj) {
        this.fWTAfUmVKrZq = obj;
        this.JhCgjQRTAOCT = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.j11)) {
            return false;
        }
        defpackage.j11 j11Var = (defpackage.j11) obj;
        return this.fWTAfUmVKrZq.equals(j11Var.fWTAfUmVKrZq) && this.JhCgjQRTAOCT == j11Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.JhCgjQRTAOCT) + (this.fWTAfUmVKrZq.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.fWTAfUmVKrZq + ", compositeKey=" + this.JhCgjQRTAOCT + ')';
    }
}
