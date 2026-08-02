package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lfd {
    public final kfd a;
    public final String b;
    public final String c;
    public final ygd d;
    public final Double e;
    public final String f;
    public final String g;

    public lfd(kfd kfdVar, String str, String str2, ygd ygdVar, Double d, String str3) {
        str2.getClass();
        this.a = kfdVar;
        this.b = str;
        this.c = str2;
        this.d = ygdVar;
        this.e = d;
        this.f = str3;
        this.g = kfdVar != null ? kfdVar.a : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfd)) {
            return false;
        }
        lfd lfdVar = (lfd) obj;
        return this.a == lfdVar.a && Intrinsics.d(this.b, lfdVar.b) && Intrinsics.d(this.c, lfdVar.c) && Intrinsics.d(this.d, lfdVar.d) && Intrinsics.d(this.e, lfdVar.e) && Intrinsics.d(this.f, lfdVar.f);
    }

    public final int hashCode() {
        kfd kfdVar = this.a;
        int hashCode = (kfdVar == null ? 0 : kfdVar.hashCode()) * 31;
        String str = this.b;
        int c = k5r.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        ygd ygdVar = this.d;
        int hashCode2 = (c + (ygdVar == null ? 0 : ygdVar.hashCode())) * 31;
        Double d = this.e;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        ygd ygdVar = this.d;
        if (ygdVar != null) {
            str = "{id=" + ygdVar.a + ", at=" + ygdVar.c + ", offset=" + this.e + "}";
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append("(id=");
        sb.append(this.c);
        sb.append(", track=");
        sb.append(str);
        return vz1.s(sb, ", from=", this.f, ")");
    }

    public lfd(kfd kfdVar, String str, ygd ygdVar, Double d, String str2) {
        this(kfdVar, kfdVar != null ? kfdVar.a : null, str, ygdVar, d, str2);
    }
}
