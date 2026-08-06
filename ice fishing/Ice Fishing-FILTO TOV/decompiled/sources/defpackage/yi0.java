package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class yi0 {
    public final List GWasM1elztuh;
    public final int Yi7zF1RB1;

    public yi0(int i, List list) {
        this.GWasM1elztuh = list;
        this.Yi7zF1RB1 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder rQPn8YBR = mr0.rQPn8YBR("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        rQPn8YBR.append(fb1.k8h8IjolWQ(list));
        rQPn8YBR.append("'.");
        throw new IllegalArgumentException(rQPn8YBR.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yi0.class != obj.getClass()) {
            return false;
        }
        yi0 yi0Var = (yi0) obj;
        return this.Yi7zF1RB1 == yi0Var.Yi7zF1RB1 && o30.rQPn8YBR(this.GWasM1elztuh, yi0Var.GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() + (this.Yi7zF1RB1 * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.Yi7zF1RB1 + ", mergedHistory=" + this.GWasM1elztuh + ')';
    }

    public yi0() {
        this(-1, xp.OOA6hdeuvCS);
    }
}
