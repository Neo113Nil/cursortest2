package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e71 extends me0 {
    public final Object GWasM1elztuh;
    public final PointerInputEventHandler X1lG3V04pd;
    public final Object Yi7zF1RB1;

    public e71(Object obj, z50 z50Var, PointerInputEventHandler pointerInputEventHandler, int i) {
        z50Var = (i & 2) != 0 ? null : z50Var;
        this.GWasM1elztuh = obj;
        this.Yi7zF1RB1 = z50Var;
        this.X1lG3V04pd = pointerInputEventHandler;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        h71 h71Var = (h71) he0Var;
        Object obj = h71Var.mE4lRynR;
        Object obj2 = this.GWasM1elztuh;
        boolean z = !o30.rQPn8YBR(obj, obj2);
        h71Var.mE4lRynR = obj2;
        Object obj3 = h71Var.jivtDDk9H;
        Object obj4 = this.Yi7zF1RB1;
        if (!o30.rQPn8YBR(obj3, obj4)) {
            z = true;
        }
        h71Var.jivtDDk9H = obj4;
        Class<?> cls = h71Var.Y6hRI1cF8.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.X1lG3V04pd;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            h71Var.sb9fmtV8A();
        }
        h71Var.Y6hRI1cF8 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e71)) {
            return false;
        }
        e71 e71Var = (e71) obj;
        return this.GWasM1elztuh.equals(e71Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, e71Var.Yi7zF1RB1) && this.X1lG3V04pd == e71Var.X1lG3V04pd;
    }

    public final int hashCode() {
        int hashCode = this.GWasM1elztuh.hashCode() * 31;
        Object obj = this.Yi7zF1RB1;
        return this.X1lG3V04pd.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        return new h71(this.GWasM1elztuh, this.Yi7zF1RB1, this.X1lG3V04pd);
    }
}
