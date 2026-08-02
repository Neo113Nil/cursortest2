package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bp4 {
    public final u9b a;
    public final Boolean b;
    public final gd6 c;
    public final Long d;
    public final String e;
    public final List f;
    public final String g;
    public final jzb h;

    public bp4(u9b u9bVar, Boolean bool, gd6 gd6Var, Long l, String str, ArrayList arrayList, String str2) {
        this.a = u9bVar;
        this.b = bool;
        this.c = gd6Var;
        this.d = l;
        this.e = str;
        this.f = arrayList;
        this.g = str2;
        this.h = gd6Var != null ? saf.o0(gd6Var) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp4)) {
            return false;
        }
        bp4 bp4Var = (bp4) obj;
        return Intrinsics.d(this.a, bp4Var.a) && Intrinsics.d(this.b, bp4Var.b) && Intrinsics.d(this.c, bp4Var.c) && this.d.equals(bp4Var.d) && Intrinsics.d(this.e, bp4Var.e) && Intrinsics.d(this.f, bp4Var.f) && this.g.equals(bp4Var.g);
    }

    public final int hashCode() {
        u9b u9bVar = this.a;
        int hashCode = (u9bVar == null ? 0 : u9bVar.hashCode()) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        gd6 gd6Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (gd6Var == null ? 0 : gd6Var.hashCode())) * 31)) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f;
        return this.g.hashCode() + ((hashCode4 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipEntity(cover=");
        sb.append(this.a);
        sb.append(", explicit=");
        sb.append(this.b);
        sb.append(", contentRestrictions=");
        sb.append(this.c);
        sb.append(", duration=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", artists=");
        sb.append(this.f);
        sb.append(", clipId=");
        return su4.o(sb, this.g, ")");
    }
}
