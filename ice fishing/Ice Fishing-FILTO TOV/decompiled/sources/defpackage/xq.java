package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xq {
    public final ra1 GWasM1elztuh;
    public static final xq Yi7zF1RB1 = new xq(new ra1((dr) null, (l60) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 127));
    public static final xq X1lG3V04pd = new xq(new ra1((dr) (0 == true ? 1 : 0), (l60) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 95));

    public xq(ra1 ra1Var) {
        this.GWasM1elztuh = ra1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xq) && ((xq) obj).GWasM1elztuh.equals(this.GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        if (equals(Yi7zF1RB1)) {
            return "ExitTransition.None";
        }
        if (equals(X1lG3V04pd)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        ra1 ra1Var = this.GWasM1elztuh;
        dr drVar = ra1Var.GWasM1elztuh;
        sb.append(drVar != null ? drVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(ra1Var.Yi7zF1RB1);
        return sb.toString();
    }
}
