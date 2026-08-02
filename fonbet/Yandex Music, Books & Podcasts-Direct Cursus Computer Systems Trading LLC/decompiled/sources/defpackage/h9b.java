package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class h9b implements m9b {
    public final Unit a;

    public h9b() {
        Unit unit = Unit.a;
        unit.getClass();
        this.a = unit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9b) && this.a.equals(((h9b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlreadyUpdated(unused=" + this.a + ")";
    }
}
