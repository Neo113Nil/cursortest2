package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class un6 {
    public final qo6 a;
    public final String b;
    public final Integer c;

    public un6(qo6 qo6Var, String str, Integer num) {
        this.a = qo6Var;
        this.b = str;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un6)) {
            return false;
        }
        un6 un6Var = (un6) obj;
        return this.a == un6Var.a && Intrinsics.d(this.b, un6Var.b) && Intrinsics.d(this.c, un6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CoverInfoUiData(coverType=" + this.a + ", coverUrl=" + this.b + ", coverColor=" + this.c + ")";
    }
}
