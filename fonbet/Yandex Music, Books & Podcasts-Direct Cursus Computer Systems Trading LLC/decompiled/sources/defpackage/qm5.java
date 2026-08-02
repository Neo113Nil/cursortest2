package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qm5 {
    public final Object a;
    public final pt3 b;
    public final pyc c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ qm5(Object obj, pt3 pt3Var, pyc pycVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : pt3Var, (i & 4) != 0 ? null : pycVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static qm5 a(qm5 qm5Var, pt3 pt3Var, Throwable th, int i) {
        Object obj = qm5Var.a;
        if ((i & 2) != 0) {
            pt3Var = qm5Var.b;
        }
        pt3 pt3Var2 = pt3Var;
        pyc pycVar = qm5Var.c;
        Object obj2 = qm5Var.d;
        if ((i & 16) != 0) {
            th = qm5Var.e;
        }
        return new qm5(obj, pt3Var2, pycVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm5)) {
            return false;
        }
        qm5 qm5Var = (qm5) obj;
        return Intrinsics.d(this.a, qm5Var.a) && Intrinsics.d(this.b, qm5Var.b) && Intrinsics.d(this.c, qm5Var.c) && Intrinsics.d(this.d, qm5Var.d) && Intrinsics.d(this.e, qm5Var.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        pt3 pt3Var = this.b;
        int hashCode2 = (hashCode + (pt3Var == null ? 0 : pt3Var.hashCode())) * 31;
        pyc pycVar = this.c;
        int hashCode3 = (hashCode2 + (pycVar == null ? 0 : pycVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append(this.b);
        sb.append(", onCancellation=");
        sb.append(this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        return f1d.k(sb, this.e, ')');
    }

    public qm5(Object obj, pt3 pt3Var, pyc pycVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = pt3Var;
        this.c = pycVar;
        this.d = obj2;
        this.e = th;
    }
}
