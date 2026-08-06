package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ni1 extends defpackage.zl0 {
    public final java.lang.Object ZpBGe2uQfcn8;
    public final androidx.compose.ui.input.pointer.PointerInputEventHandler fWTAfUmVKrZq;
    public final java.lang.Object giKS3J6vZuNy;

    public ni1(java.lang.Object obj, java.lang.Object obj2, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.ZpBGe2uQfcn8 = obj;
        this.giKS3J6vZuNy = obj2;
        this.fWTAfUmVKrZq = pointerInputEventHandler;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.si1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ni1)) {
            return false;
        }
        defpackage.ni1 ni1Var = (defpackage.ni1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ni1Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, ni1Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == ni1Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        java.lang.Object obj = this.ZpBGe2uQfcn8;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.giKS3J6vZuNy;
        return this.fWTAfUmVKrZq.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.si1 si1Var = (defpackage.si1) ul0Var;
        java.lang.Object obj = si1Var.BHfvd2J71qpO;
        java.lang.Object obj2 = this.ZpBGe2uQfcn8;
        boolean z = !defpackage.ma0.QiMR8OkAhezm(obj, obj2);
        si1Var.BHfvd2J71qpO = obj2;
        java.lang.Object obj3 = si1Var.ZVVdXbWmyCSK;
        java.lang.Object obj4 = this.giKS3J6vZuNy;
        if (!defpackage.ma0.QiMR8OkAhezm(obj3, obj4)) {
            z = true;
        }
        si1Var.ZVVdXbWmyCSK = obj4;
        java.lang.Class<?> cls = si1Var.w7APNrr0aGRc.getClass();
        androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = this.fWTAfUmVKrZq;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            si1Var.I9id0xDxCgYV();
        }
        si1Var.w7APNrr0aGRc = pointerInputEventHandler;
    }
}
