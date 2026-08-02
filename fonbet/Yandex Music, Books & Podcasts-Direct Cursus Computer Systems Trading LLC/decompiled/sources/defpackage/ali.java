package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ali implements bli {
    public final anx a;
    public final w70 b;

    public ali(anx anxVar, w70 w70Var) {
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
        if (!(obj instanceof ali)) {
            return false;
        }
        ali aliVar = (ali) obj;
        return this.a.equals(aliVar.a) && Intrinsics.d(this.b, aliVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Cover(trackData=" + this.a + ", analyticsEntityPosition=" + this.b + ")";
    }
}
