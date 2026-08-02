package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class i7o {
    public final String a;
    public final ArrayList b;

    public i7o(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7o)) {
            return false;
        }
        i7o i7oVar = (i7o) obj;
        return this.a.equals(i7oVar.a) && this.b.equals(i7oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Restriction(name=" + this.a + ", possibleValues=" + this.b + ")";
    }
}
