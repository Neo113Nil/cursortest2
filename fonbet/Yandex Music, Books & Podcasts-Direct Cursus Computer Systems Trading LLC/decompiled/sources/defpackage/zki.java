package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zki implements bli {
    public final anx a;
    public final w70 b;

    public zki(anx anxVar, w70 w70Var) {
        w70Var.getClass();
        this.a = anxVar;
        this.b = w70Var;
    }

    @Override // defpackage.bli
    public final anx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zki)) {
            return false;
        }
        zki zkiVar = (zki) obj;
        return this.a.equals(zkiVar.a) && Intrinsics.d(this.b, zkiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(trackData=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
