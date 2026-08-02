package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pas {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final dtq f;
    public final String g;
    public final etq h;
    public final String i;

    public pas(Long l, String str, String str2, String str3, String str4, dtq dtqVar, String str5, etq etqVar, String str6) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = dtqVar;
        this.g = str5;
        this.h = etqVar;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pas)) {
            return false;
        }
        pas pasVar = (pas) obj;
        return Intrinsics.d(this.a, pasVar.a) && Intrinsics.d(this.b, pasVar.b) && Intrinsics.d(this.c, pasVar.c) && Intrinsics.d(this.d, pasVar.d) && Intrinsics.d(this.e, pasVar.e) && Intrinsics.d(this.f, pasVar.f) && Intrinsics.d(this.g, pasVar.g) && this.h == pasVar.h && Intrinsics.d(this.i, pasVar.i);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dtq dtqVar = this.f;
        int hashCode6 = (hashCode5 + (dtqVar == null ? 0 : dtqVar.hashCode())) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        etq etqVar = this.h;
        int hashCode8 = (hashCode7 + (etqVar == null ? 0 : etqVar.hashCode())) * 31;
        String str6 = this.i;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFactContentUiData(value=");
        sb.append(this.a);
        sb.append(", valueDescription=");
        sb.append(this.b);
        sb.append(", valueSuffix=");
        su4.v(sb, this.c, ", footer=", this.d, ", description=");
        sb.append(this.e);
        sb.append(", align=");
        sb.append(this.f);
        sb.append(", cover=");
        sb.append(this.g);
        sb.append(", coverType=");
        sb.append(this.h);
        sb.append(", coverTitle=");
        return su4.o(sb, this.i, ")");
    }
}
