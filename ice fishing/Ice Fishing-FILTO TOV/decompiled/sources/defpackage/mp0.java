package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mp0 extends rezfBrjOrqK implements Set, Collection, q40 {
    public static final mp0 encWxUiV2;
    public final dp0 AvO7iQsrTN;
    public final Object EljAMC1QTz;
    public final Object OOA6hdeuvCS;

    static {
        b9xEq24R1 b9xeq24r1 = b9xEq24R1.A1EKNP6CxJ;
        encWxUiV2 = new mp0(b9xeq24r1, b9xeq24r1, dp0.AvO7iQsrTN);
    }

    public mp0(Object obj, Object obj2, dp0 dp0Var) {
        this.OOA6hdeuvCS = obj;
        this.EljAMC1QTz = obj2;
        this.AvO7iQsrTN = dp0Var;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.AvO7iQsrTN.EljAMC1QTz;
    }

    @Override // defpackage.XnEVoBF0td1l, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.AvO7iQsrTN.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new cy(this.OOA6hdeuvCS, this.AvO7iQsrTN);
    }
}
