package defpackage;

import java.util.Set;

/* loaded from: classes10.dex */
public final class xd4 {
    public final Set a;

    public xd4(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xd4) && this.a.equals(((xd4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.s(new StringBuilder("BPossibleTypes(possibleTypes="), this.a, ')');
    }
}
