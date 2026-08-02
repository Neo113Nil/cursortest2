package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wgq implements zgq {
    public final rr5 a;
    public final List b;
    public final mwk c;

    public wgq(rr5 rr5Var, List list, mwk mwkVar) {
        list.getClass();
        this.a = rr5Var;
        this.b = list;
        this.c = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgq)) {
            return false;
        }
        wgq wgqVar = (wgq) obj;
        return Intrinsics.d(this.a, wgqVar.a) && Intrinsics.d(this.b, wgqVar.b) && this.c.equals(wgqVar.c);
    }

    public final int hashCode() {
        rr5 rr5Var = this.a;
        return this.c.hashCode() + k5r.d((rr5Var == null ? 0 : rr5Var.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "Content(compositeTrackId=" + this.a + ", entities=" + this.b + ", playable=" + this.c + ")";
    }
}
