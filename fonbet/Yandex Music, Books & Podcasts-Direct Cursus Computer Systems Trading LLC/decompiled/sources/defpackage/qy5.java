package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qy5 implements ry5 {
    public final oy5 a;
    public final thj b;

    public qy5(oy5 oy5Var, thj thjVar) {
        thjVar.getClass();
        this.a = oy5Var;
        this.b = thjVar;
    }

    @Override // defpackage.ry5
    public final thj a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy5)) {
            return false;
        }
        qy5 qy5Var = (qy5) obj;
        return this.a.equals(qy5Var.a) && Intrinsics.d(this.b, qy5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(uiData=" + this.a + ", info=" + this.b + ")";
    }
}
