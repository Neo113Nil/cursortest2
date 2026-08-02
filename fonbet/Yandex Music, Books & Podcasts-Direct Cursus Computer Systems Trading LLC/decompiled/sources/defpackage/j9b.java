package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class j9b implements m9b {
    public final Unit a;

    public j9b() {
        Unit unit = Unit.a;
        unit.getClass();
        this.a = unit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9b) && this.a.equals(((j9b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotFound(unused=" + this.a + ")";
    }
}
