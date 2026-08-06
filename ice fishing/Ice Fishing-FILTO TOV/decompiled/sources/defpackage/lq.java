package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lq {
    public static final lq Yi7zF1RB1 = new lq(new ra1((dr) null, (l60) (0 == true ? 1 : 0), (LinkedHashMap) (0 == true ? 1 : 0), 127));
    public final ra1 GWasM1elztuh;

    public lq(ra1 ra1Var) {
        this.GWasM1elztuh = ra1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lq) && ((lq) obj).GWasM1elztuh.equals(this.GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        if (equals(Yi7zF1RB1)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        dr drVar = this.GWasM1elztuh.GWasM1elztuh;
        sb.append(drVar != null ? drVar.toString() : null);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        sb.append((String) null);
        return sb.toString();
    }
}
