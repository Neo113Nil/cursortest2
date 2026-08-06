package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c9 extends defpackage.v70 {
    public final long JhCgjQRTAOCT;
    public final java.lang.Object fWTAfUmVKrZq;

    public c9(long j, java.lang.Object obj) {
        this.fWTAfUmVKrZq = obj;
        this.JhCgjQRTAOCT = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c9)) {
            return false;
        }
        defpackage.c9 c9Var = (defpackage.c9) obj;
        return this.fWTAfUmVKrZq.equals(c9Var.fWTAfUmVKrZq) && this.JhCgjQRTAOCT == c9Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.JhCgjQRTAOCT) + (this.fWTAfUmVKrZq.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "BackHandlerInfo(owner=" + this.fWTAfUmVKrZq + ", compositeKey=" + this.JhCgjQRTAOCT + ')';
    }
}
