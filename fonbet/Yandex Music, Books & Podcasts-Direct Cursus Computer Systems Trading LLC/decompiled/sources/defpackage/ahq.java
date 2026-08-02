package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ahq implements dhq {
    public final rr5 a;
    public final List b;
    public final gjl c;

    public ahq(rr5 rr5Var, List list, gjl gjlVar) {
        list.getClass();
        this.a = rr5Var;
        this.b = list;
        this.c = gjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahq)) {
            return false;
        }
        ahq ahqVar = (ahq) obj;
        return Intrinsics.d(this.a, ahqVar.a) && Intrinsics.d(this.b, ahqVar.b) && Intrinsics.d(this.c, ahqVar.c);
    }

    public final int hashCode() {
        rr5 rr5Var = this.a;
        int d = k5r.d((rr5Var == null ? 0 : rr5Var.hashCode()) * 31, 31, this.b);
        gjl gjlVar = this.c;
        return d + (gjlVar != null ? gjlVar.hashCode() : 0);
    }

    public final String toString() {
        return "Content(compositeTrackId=" + this.a + ", entities=" + this.b + ", analyticsPayload=" + this.c + ")";
    }
}
