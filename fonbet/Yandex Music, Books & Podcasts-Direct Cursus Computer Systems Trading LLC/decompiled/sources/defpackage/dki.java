package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dki implements fki {
    public final q7n a;
    public final n7n b;
    public final w70 c;

    public dki(q7n q7nVar, n7n n7nVar, w70 w70Var) {
        w70Var.getClass();
        this.a = q7nVar;
        this.b = n7nVar;
        this.c = w70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dki)) {
            return false;
        }
        dki dkiVar = (dki) obj;
        return this.a.equals(dkiVar.a) && this.b.equals(dkiVar.b) && Intrinsics.d(this.c, dkiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QueryToVibe(uiData=" + this.a + ", queryToVibeWaveItem=" + this.b + ", analyticsEntityPosition=" + this.c + ")";
    }
}
