package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wec {
    public final qqi a;
    public dp6 b = null;

    public wec(qqi qqiVar) {
        this.a = qqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wec)) {
            return false;
        }
        wec wecVar = (wec) obj;
        return this.a.equals(wecVar.a) && Intrinsics.d(this.b, wecVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dp6 dp6Var = this.b;
        return hashCode + (dp6Var == null ? 0 : dp6Var.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.b + ')';
    }
}
