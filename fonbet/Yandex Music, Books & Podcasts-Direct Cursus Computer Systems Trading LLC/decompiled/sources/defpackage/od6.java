package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class od6 implements sd6 {
    public final cu8 a;
    public final String b;

    public od6(cu8 cu8Var, String str) {
        cu8Var.getClass();
        this.a = cu8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od6)) {
            return false;
        }
        od6 od6Var = (od6) obj;
        return Intrinsics.d(this.a, od6Var.a) && Intrinsics.d(this.b, od6Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Success(divContent=" + this.a + ", oneClickDisclaimer=" + this.b + ")";
    }
}
