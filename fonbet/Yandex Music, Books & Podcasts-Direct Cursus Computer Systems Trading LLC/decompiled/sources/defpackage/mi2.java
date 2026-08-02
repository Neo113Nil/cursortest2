package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mi2 {
    public final Set a;

    public mi2(Set set) {
        set.getClass();
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mi2) && Intrinsics.d(this.a, ((mi2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vz1.v(new StringBuilder("BPossibleTypes(possibleTypes="), this.a, ')');
    }
}
