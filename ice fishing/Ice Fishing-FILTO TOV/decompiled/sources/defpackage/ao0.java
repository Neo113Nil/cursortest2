package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class ao0 {
    public final List GWasM1elztuh;
    public int Yi7zF1RB1;

    public ao0(int i, ArrayList arrayList) {
        this.GWasM1elztuh = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    public Object GWasM1elztuh(va vaVar) {
        Object obj;
        vaVar.getClass();
        List list = this.GWasM1elztuh;
        if (list.isEmpty()) {
            return null;
        }
        Object obj2 = list.get(this.Yi7zF1RB1);
        if (!vaVar.X1lG3V04pd(obj2)) {
            obj2 = null;
        }
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null && this.Yi7zF1RB1 < fb1.EXrPz3p7hFb(list)) {
            this.Yi7zF1RB1++;
        }
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (vaVar.X1lG3V04pd(obj)) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ao0) {
            return o30.rQPn8YBR(this.GWasM1elztuh, ((ao0) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + rb.gqMuANyCes(this.GWasM1elztuh);
    }
}
