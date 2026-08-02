package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z8v implements a9v {
    public final m6v a;
    public final l6v b;
    public final c8v c;
    public final List d;
    public final o6v e;

    public z8v(m6v m6vVar, l6v l6vVar, c8v c8vVar, List list, o6v o6vVar) {
        m6vVar.getClass();
        list.getClass();
        o6vVar.getClass();
        this.a = m6vVar;
        this.b = l6vVar;
        this.c = c8vVar;
        this.d = list;
        this.e = o6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8v)) {
            return false;
        }
        z8v z8vVar = (z8v) obj;
        return Intrinsics.d(this.a, z8vVar.a) && Intrinsics.d(this.b, z8vVar.b) && this.c.equals(z8vVar.c) && Intrinsics.d(this.d, z8vVar.d) && this.e == z8vVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l6v l6vVar = this.b;
        return this.e.hashCode() + k5r.d((this.c.hashCode() + ((hashCode + (l6vVar == null ? 0 : l6vVar.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "Success(card=" + this.a + ", bigCard=" + this.b + ", redirect=" + this.c + ", sources=" + this.d + ", likeState=" + this.e + ")";
    }
}
