package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sg {
    public final java.lang.Object JhCgjQRTAOCT;
    public final java.lang.Throwable WDYagTQQm9ns;
    public final java.lang.Object ZpBGe2uQfcn8;
    public final defpackage.d20 fWTAfUmVKrZq;
    public final defpackage.yc giKS3J6vZuNy;

    public /* synthetic */ sg(java.lang.Object obj, defpackage.yc ycVar, defpackage.d20 d20Var, java.lang.Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : ycVar, (i & 4) != 0 ? null : d20Var, (java.lang.Object) null, (i & 16) != 0 ? null : th);
    }

    public static defpackage.sg ZpBGe2uQfcn8(defpackage.sg sgVar, defpackage.yc ycVar, java.lang.Throwable th, int i) {
        java.lang.Object obj = sgVar.ZpBGe2uQfcn8;
        if ((i & 2) != 0) {
            ycVar = sgVar.giKS3J6vZuNy;
        }
        defpackage.yc ycVar2 = ycVar;
        defpackage.d20 d20Var = sgVar.fWTAfUmVKrZq;
        java.lang.Object obj2 = sgVar.JhCgjQRTAOCT;
        if ((i & 16) != 0) {
            th = sgVar.WDYagTQQm9ns;
        }
        return new defpackage.sg(obj, ycVar2, d20Var, obj2, th);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.sg)) {
            return false;
        }
        defpackage.sg sgVar = (defpackage.sg) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, sgVar.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, sgVar.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, sgVar.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, sgVar.JhCgjQRTAOCT) && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, sgVar.WDYagTQQm9ns);
    }

    public final int hashCode() {
        java.lang.Object obj = this.ZpBGe2uQfcn8;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        defpackage.yc ycVar = this.giKS3J6vZuNy;
        int hashCode2 = (hashCode + (ycVar == null ? 0 : ycVar.hashCode())) * 31;
        defpackage.d20 d20Var = this.fWTAfUmVKrZq;
        int hashCode3 = (hashCode2 + (d20Var == null ? 0 : d20Var.hashCode())) * 31;
        java.lang.Object obj2 = this.JhCgjQRTAOCT;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.WDYagTQQm9ns;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.ZpBGe2uQfcn8 + ", cancelHandler=" + this.giKS3J6vZuNy + ", onCancellation=" + this.fWTAfUmVKrZq + ", idempotentResume=" + this.JhCgjQRTAOCT + ", cancelCause=" + this.WDYagTQQm9ns + ')';
    }

    public sg(java.lang.Object obj, defpackage.yc ycVar, defpackage.d20 d20Var, java.lang.Object obj2, java.lang.Throwable th) {
        this.ZpBGe2uQfcn8 = obj;
        this.giKS3J6vZuNy = ycVar;
        this.fWTAfUmVKrZq = d20Var;
        this.JhCgjQRTAOCT = obj2;
        this.WDYagTQQm9ns = th;
    }
}
