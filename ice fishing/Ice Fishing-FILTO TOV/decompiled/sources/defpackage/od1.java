package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class od1 extends qd1 implements Iterable, q40 {
    public final ArrayList EljAMC1QTz;
    public final List OOA6hdeuvCS;

    public od1(List list, ArrayList arrayList) {
        this.OOA6hdeuvCS = list;
        this.EljAMC1QTz = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof od1)) {
            return false;
        }
        od1 od1Var = (od1) obj;
        return o30.rQPn8YBR(this.OOA6hdeuvCS, od1Var.OOA6hdeuvCS) && this.EljAMC1QTz.equals(od1Var.EljAMC1QTz);
    }

    public final int hashCode() {
        return this.EljAMC1QTz.hashCode() + ((this.OOA6hdeuvCS.hashCode() + mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(1.0f, mr0.GWasM1elztuh(1.0f, mr0.GWasM1elztuh(0.0f, mr0.GWasM1elztuh(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hp0(this);
    }
}
