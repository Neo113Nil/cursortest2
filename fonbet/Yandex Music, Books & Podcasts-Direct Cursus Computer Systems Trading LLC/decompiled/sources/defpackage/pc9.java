package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class pc9 extends xr8 {
    public final ec9 A;
    public final gb9 B;
    public final gb9 C;
    public final e23 z;

    public pc9(e23 e23Var, ec9 ec9Var, hp8 hp8Var, p0a p0aVar, gb9 gb9Var, gb9 gb9Var2) {
        super(ec9Var, e23Var, hp8Var, p0aVar);
        this.z = e23Var;
        this.A = ec9Var;
        this.B = gb9Var;
        this.C = gb9Var2;
        ec9Var.addOnAttachStateChangeListener(new jb(4, this));
    }

    @Override // defpackage.xr8
    public final void t(e23 e23Var, jc8 jc8Var, int i, pm9 pm9Var) {
        Enum r4;
        super.t(e23Var, jc8Var, i, pm9Var);
        ec9 ec9Var = this.A;
        View child = ec9Var.getChild();
        ViewGroup.LayoutParams layoutParams = child != null ? child.getLayoutParams() : null;
        u79 u79Var = layoutParams instanceof u79 ? (u79) layoutParams : null;
        if (u79Var != null) {
            dp8 d = jc8Var.d();
            xzb xzbVar = e23Var.b;
            gb9 gb9Var = this.B;
            szb o = ((Boolean) gb9Var.invoke()).booleanValue() ? d.o() : d.u();
            if (o == null || (r4 = (Enum) o.a(xzbVar)) == null) {
                r4 = this.C.s.s;
            }
            boolean booleanValue = ((Boolean) gb9Var.invoke()).booleanValue();
            Enum r7 = cb9.END;
            Enum r1 = cb9.CENTER;
            int i2 = 17;
            if (booleanValue) {
                if (r4 != r1 && r4 != pm8.CENTER) {
                    i2 = (r4 == r7 || r4 == pm8.BOTTOM) ? 80 : 48;
                }
            } else if (r4 != r1 && r4 != om8.CENTER) {
                i2 = (r4 == r7 || r4 == om8.END) ? 8388613 : r4 == om8.LEFT ? 3 : r4 == om8.RIGHT ? 5 : 8388611;
            }
            u79Var.a = i2;
            ec9Var.requestLayout();
        }
    }

    @Override // defpackage.xr8
    public final void u() {
        int i = i9f.a;
    }
}
