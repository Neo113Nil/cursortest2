package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y6p extends j7p {
    public final g06 a;
    public final us5 b;
    public final e4p c;
    public final String d;

    public y6p(g06 g06Var, us5 us5Var, e4p e4pVar, String str) {
        us5Var.getClass();
        str.getClass();
        this.a = g06Var;
        this.b = us5Var;
        this.c = e4pVar;
        this.d = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6p)) {
            return false;
        }
        y6p y6pVar = (y6p) obj;
        return this.a.equals(y6pVar.a) && Intrinsics.d(this.b, y6pVar.b) && this.c == y6pVar.c && Intrinsics.d(this.d, y6pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Concert(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
