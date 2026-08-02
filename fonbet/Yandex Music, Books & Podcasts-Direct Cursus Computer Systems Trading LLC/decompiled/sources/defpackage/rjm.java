package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rjm implements sjm {
    public final String a;
    public final String b;
    public final jzb c;
    public final String d;
    public final List e;
    public final List f;

    public rjm(String str, String str2, jzb jzbVar, String str3, List list, List list2) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = jzbVar;
        this.d = str3;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjm)) {
            return false;
        }
        rjm rjmVar = (rjm) obj;
        return Intrinsics.d(this.a, rjmVar.a) && Intrinsics.d(this.b, rjmVar.b) && this.c == rjmVar.c && Intrinsics.d(this.d, rjmVar.d) && Intrinsics.d(this.e, rjmVar.e) && Intrinsics.d(this.f, rjmVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        jzb jzbVar = this.c;
        int c = k5r.c((hashCode2 + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31, this.d);
        List list = this.e;
        int hashCode3 = (c + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Loaded(coverUrl=", this.a, ", title=", this.b, ", explicitType=");
        m.append(this.c);
        m.append(", date=");
        m.append(this.d);
        m.append(", artists=");
        m.append(this.e);
        m.append(", disclaimers=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
