package defpackage;

/* loaded from: classes.dex */
public final class de1 extends defpackage.qj0 {
    public final java.lang.Object IHQe1A4L2xu;
    public final java.lang.Object oh6vYeIP;
    public final androidx.compose.ui.input.pointer.PointerInputEventHandler r1MBDhnF;

    public de1(java.lang.Object obj, defpackage.c80 c80Var, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler, int i) {
        c80Var = (i & 2) != 0 ? null : c80Var;
        this.IHQe1A4L2xu = obj;
        this.oh6vYeIP = c80Var;
        this.r1MBDhnF = pointerInputEventHandler;
    }

    @Override // defpackage.qj0
    public final defpackage.lj0 F7NU4MC0GW() {
        return new defpackage.ge1(this.IHQe1A4L2xu, this.oh6vYeIP, this.r1MBDhnF);
    }

    @Override // defpackage.qj0
    public final void adDC3e2L(defpackage.lj0 lj0Var) {
        defpackage.ge1 ge1Var = (defpackage.ge1) lj0Var;
        java.lang.Object obj = ge1Var.EgCjBq0SZwJ;
        java.lang.Object obj2 = this.IHQe1A4L2xu;
        boolean z = !defpackage.x70.QoRHpC4k(obj, obj2);
        ge1Var.EgCjBq0SZwJ = obj2;
        java.lang.Object obj3 = ge1Var.fnWB2E7cs;
        java.lang.Object obj4 = this.oh6vYeIP;
        if (!defpackage.x70.QoRHpC4k(obj3, obj4)) {
            z = true;
        }
        ge1Var.fnWB2E7cs = obj4;
        java.lang.Class<?> cls = ge1Var.kNAkVymC.getClass();
        androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = this.r1MBDhnF;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            ge1Var.H6IrRhrpWoH();
        }
        ge1Var.kNAkVymC = pointerInputEventHandler;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.de1)) {
            return false;
        }
        defpackage.de1 de1Var = (defpackage.de1) obj;
        return this.IHQe1A4L2xu.equals(de1Var.IHQe1A4L2xu) && defpackage.x70.QoRHpC4k(this.oh6vYeIP, de1Var.oh6vYeIP) && this.r1MBDhnF == de1Var.r1MBDhnF;
    }

    public final int hashCode() {
        int hashCode = this.IHQe1A4L2xu.hashCode() * 31;
        java.lang.Object obj = this.oh6vYeIP;
        return this.r1MBDhnF.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
