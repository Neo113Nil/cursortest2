package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vdl {
    public final rr5 a;

    public vdl(rr5 rr5Var) {
        rr5Var.getClass();
        this.a = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdl) && Intrinsics.d(this.a, ((vdl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrackReference(trackId=" + this.a + ")";
    }
}
