package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xrw implements zrw {
    public final bd5 a;
    public final o3q b;

    public xrw(bd5 bd5Var, o3q o3qVar) {
        bd5Var.getClass();
        o3qVar.getClass();
        this.a = bd5Var;
        this.b = o3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrw)) {
            return false;
        }
        xrw xrwVar = (xrw) obj;
        return Intrinsics.d(this.a, xrwVar.a) && this.b == xrwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistContentId(contentId=" + this.a + ", subtype=" + this.b + ")";
    }
}
