package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class su0 implements Serializable {
    public final Throwable OOA6hdeuvCS;

    public su0(Throwable th) {
        th.getClass();
        this.OOA6hdeuvCS = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof su0) {
            return o30.rQPn8YBR(this.OOA6hdeuvCS, ((su0) obj).OOA6hdeuvCS);
        }
        return false;
    }

    public final int hashCode() {
        return this.OOA6hdeuvCS.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.OOA6hdeuvCS + ')';
    }
}
