package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class iic implements lpd {
    public final float a;
    public final jpd b;

    public iic(float f) {
        this.a = f;
        this.b = new jpd(f);
    }

    @Override // defpackage.lpd
    public final ArrayList a(jx7 jx7Var, int i, int i2) {
        jx7Var.getClass();
        ArrayList a = this.b.a(jx7Var, i, i2);
        int size = a.size();
        if (size < 2) {
            size = 2;
        }
        if (size == a.size()) {
            return a;
        }
        if (size <= 0) {
            vme.a("Provided count should be larger than zero");
        }
        return wdp.V(i, size, i2);
    }

    public final boolean equals(Object obj) {
        Object obj2 = 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof iic) {
            return obj2.equals(obj2) && cma.a(this.a, ((iic) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = 2;
        return Float.hashCode(this.a) + (num.hashCode() * 961);
    }

    public final String toString() {
        return "FlexibleGridCells(minItems=" + ((Object) 2) + ", maxItems=null, minSize=" + cma.b(this.a) + ")";
    }
}
