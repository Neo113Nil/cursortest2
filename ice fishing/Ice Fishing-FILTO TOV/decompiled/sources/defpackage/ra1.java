package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ra1 {
    public final dr GWasM1elztuh;
    public final Map X1lG3V04pd;
    public final boolean Yi7zF1RB1;

    public /* synthetic */ ra1(dr drVar, l60 l60Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : drVar, (i & 8) != 0 ? null : l60Var, (i & 32) == 0, (i & 64) != 0 ? yp.OOA6hdeuvCS : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra1)) {
            return false;
        }
        ra1 ra1Var = (ra1) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, ra1Var.GWasM1elztuh) && o30.rQPn8YBR(null, null) && this.Yi7zF1RB1 == ra1Var.Yi7zF1RB1 && o30.rQPn8YBR(this.X1lG3V04pd, ra1Var.X1lG3V04pd);
    }

    public final int hashCode() {
        dr drVar = this.GWasM1elztuh;
        return this.X1lG3V04pd.hashCode() + mr0.xqGvceK5x((((drVar == null ? 0 : drVar.hashCode()) * 29791) + 0) * 961, 31, this.Yi7zF1RB1);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.GWasM1elztuh + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", veil=null, hold=" + this.Yi7zF1RB1 + ", effectsMap=" + this.X1lG3V04pd + ')';
    }

    public ra1(dr drVar, l60 l60Var, boolean z, Map map) {
        this.GWasM1elztuh = drVar;
        this.Yi7zF1RB1 = z;
        this.X1lG3V04pd = map;
    }
}
