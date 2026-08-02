package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ahn {
    public final Map a;
    public final Map b;

    public ahn(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahn)) {
            return false;
        }
        ahn ahnVar = (ahn) obj;
        return this.a.equals(ahnVar.a) && this.b.equals(ahnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadioRestrictionsWithSelection(restrictions=" + this.a + ", selection=" + this.b + ")";
    }
}
