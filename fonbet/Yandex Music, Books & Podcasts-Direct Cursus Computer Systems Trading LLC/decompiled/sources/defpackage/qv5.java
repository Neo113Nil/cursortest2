package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qv5 {
    public final String a;
    public final String b;
    public final String c;

    public qv5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv5)) {
            return false;
        }
        qv5 qv5Var = (qv5) obj;
        return this.a.equals(qv5Var.a) && Intrinsics.d(this.b, qv5Var.b) && Intrinsics.d(this.c, qv5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return su4.o(f1d.m("ConcertHeaderDescription(description=", this.a, ", source=", this.b, ", genre="), this.c, ")");
    }
}
