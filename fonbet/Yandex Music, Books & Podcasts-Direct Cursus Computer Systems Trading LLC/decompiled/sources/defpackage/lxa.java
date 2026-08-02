package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lxa {
    public final String a;
    public final String b;
    public final String c;
    public final jxa d;

    public lxa(String str, String str2, String str3, jxa jxaVar) {
        kxa kxaVar = kxa.a;
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = jxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxa)) {
            return false;
        }
        lxa lxaVar = (lxa) obj;
        kxa kxaVar = kxa.a;
        return Intrinsics.d(this.a, lxaVar.a) && Intrinsics.d(this.b, lxaVar.b) && Intrinsics.d(this.c, lxaVar.c) && Intrinsics.d(this.d, lxaVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(kxa.a.hashCode() * 31, 31, this.a);
        String str = this.b;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jxa jxaVar = this.d;
        return hashCode2 + (jxaVar != null ? jxaVar.hashCode() : 0);
    }

    public final String toString() {
        kxa kxaVar = kxa.a;
        StringBuilder sb = new StringBuilder("DynamicToastData(type=");
        sb.append(kxaVar);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        su4.v(sb, this.b, ", imageUrl=", this.c, ", action=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
