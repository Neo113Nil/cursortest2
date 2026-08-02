package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fuu {
    public final r3q a;
    public final List b;

    public fuu(r3q r3qVar, List list) {
        list.getClass();
        this.a = r3qVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuu)) {
            return false;
        }
        fuu fuuVar = (fuu) obj;
        return this.a.equals(fuuVar.a) && Intrinsics.d(this.b, fuuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EntityWithTracks(entity=" + this.a + ", tracks=" + this.b + ")";
    }
}
