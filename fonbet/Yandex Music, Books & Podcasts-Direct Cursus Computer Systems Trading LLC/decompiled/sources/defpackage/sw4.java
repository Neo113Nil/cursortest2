package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sw4 {
    public final rw4 a;
    public final Set b;

    public sw4(rw4 rw4Var, Set set) {
        set.getClass();
        this.a = rw4Var;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw4)) {
            return false;
        }
        sw4 sw4Var = (sw4) obj;
        return this.a.equals(sw4Var.a) && Intrinsics.d(this.b, sw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistTracksId(id=" + this.a + ", trackIds=" + this.b + ")";
    }
}
