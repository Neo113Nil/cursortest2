package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t6p extends y7p {
    public final jd1 a;
    public final c01 b;
    public final e4p c;

    public t6p(jd1 jd1Var, c01 c01Var, e4p e4pVar) {
        c01Var.getClass();
        this.a = jd1Var;
        this.b = c01Var;
        this.c = e4pVar;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6p)) {
            return false;
        }
        t6p t6pVar = (t6p) obj;
        return this.a.equals(t6pVar.a) && Intrinsics.d(this.b, t6pVar.b) && this.c == t6pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Artist(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
