package defpackage;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fca implements hca {
    public final oq a;
    public final Collection b;

    public fca(oq oqVar) {
        LinkedList linkedList = oqVar.F;
        oqVar.getClass();
        linkedList.getClass();
        this.a = oqVar;
        this.b = linkedList;
    }

    @Override // defpackage.hca
    public final Collection a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fca)) {
            return false;
        }
        fca fcaVar = (fca) obj;
        return Intrinsics.d(this.a, fcaVar.a) && this.b.equals(fcaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(album=" + this.a + ", tracks=" + this.b + ")";
    }
}
