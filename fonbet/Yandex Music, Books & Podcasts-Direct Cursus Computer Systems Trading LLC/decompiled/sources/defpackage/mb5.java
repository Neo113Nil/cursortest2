package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mb5 {
    public final qu2 a;
    public final qu2 b;
    public final qu2 c;
    public final ofg d;
    public final ofg e;

    public mb5(qu2 qu2Var, qu2 qu2Var2, qu2 qu2Var3, ofg ofgVar, ofg ofgVar2) {
        qu2Var.getClass();
        qu2Var2.getClass();
        qu2Var3.getClass();
        ofgVar.getClass();
        this.a = qu2Var;
        this.b = qu2Var2;
        this.c = qu2Var3;
        this.d = ofgVar;
        this.e = ofgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mb5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mb5 mb5Var = (mb5) obj;
        return Intrinsics.d(this.a, mb5Var.a) && Intrinsics.d(this.b, mb5Var.b) && Intrinsics.d(this.c, mb5Var.c) && Intrinsics.d(this.d, mb5Var.d) && Intrinsics.d(this.e, mb5Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        ofg ofgVar = this.e;
        return hashCode + (ofgVar != null ? ofgVar.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
