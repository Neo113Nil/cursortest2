package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mvs implements ovs {
    public final oq a;
    public final List b;

    public mvs(oq oqVar, List list) {
        oqVar.getClass();
        list.getClass();
        this.a = oqVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvs)) {
            return false;
        }
        mvs mvsVar = (mvs) obj;
        return Intrinsics.d(this.a, mvsVar.a) && Intrinsics.d(this.b, mvsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(album=" + this.a + ", tracks=" + this.b + ")";
    }
}
