package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xa {
    public final int GWasM1elztuh;
    public final Method Yi7zF1RB1;

    public xa(int i, Method method) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return this.GWasM1elztuh == xaVar.GWasM1elztuh && this.Yi7zF1RB1.getName().equals(xaVar.Yi7zF1RB1.getName());
    }

    public final int hashCode() {
        return this.Yi7zF1RB1.getName().hashCode() + (this.GWasM1elztuh * 31);
    }
}
