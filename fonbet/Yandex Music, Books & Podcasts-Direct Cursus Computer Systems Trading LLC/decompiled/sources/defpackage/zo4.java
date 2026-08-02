package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zo4 {
    public final String a;
    public final String b;
    public final u9b c;
    public final Long d;
    public final Boolean e;
    public final gd6 f;
    public final jzb g;

    public zo4(String str, String str2, u9b u9bVar, Long l, Boolean bool, gd6 gd6Var) {
        this.a = str;
        this.b = str2;
        this.c = u9bVar;
        this.d = l;
        this.e = bool;
        this.f = gd6Var;
        this.g = gd6Var != null ? saf.o0(gd6Var) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo4)) {
            return false;
        }
        zo4 zo4Var = (zo4) obj;
        return this.a.equals(zo4Var.a) && this.b.equals(zo4Var.b) && Intrinsics.d(this.c, zo4Var.c) && Intrinsics.d(this.d, zo4Var.d) && Intrinsics.d(this.e, zo4Var.e) && Intrinsics.d(this.f, zo4Var.f);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        u9b u9bVar = this.c;
        int hashCode = (c + (u9bVar == null ? 0 : u9bVar.hashCode())) * 31;
        Long l = this.d;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        gd6 gd6Var = this.f;
        return hashCode3 + (gd6Var != null ? gd6Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("ClipDomainItem(id=", this.a, ", name=", this.b, ", cover=");
        m.append(this.c);
        m.append(", duration=");
        m.append(this.d);
        m.append(", explicit=");
        m.append(this.e);
        m.append(", contentRestrictions=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
