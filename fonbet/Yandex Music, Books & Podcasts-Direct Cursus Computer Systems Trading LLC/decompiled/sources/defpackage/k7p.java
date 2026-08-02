package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k7p extends y7p {
    public final g06 a;
    public final s26 b;
    public final e4p c;

    public k7p(g06 g06Var, s26 s26Var, e4p e4pVar) {
        s26Var.getClass();
        this.a = g06Var;
        this.b = s26Var;
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
        if (!(obj instanceof k7p)) {
            return false;
        }
        k7p k7pVar = (k7p) obj;
        return this.a.equals(k7pVar.a) && Intrinsics.d(this.b, k7pVar.b) && this.c == k7pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Concert(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
