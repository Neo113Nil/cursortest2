package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s91 {
    public final u51 a;
    public final t91 b;
    public final h21 c;
    public final int d;
    public final fk1 e;
    public final boolean f;
    public final List g;
    public final String h;
    public final r51 i;

    public s91(u51 u51Var, t91 t91Var, h21 h21Var, int i, fk1 fk1Var, boolean z, List list, String str, r51 r51Var) {
        list.getClass();
        this.a = u51Var;
        this.b = t91Var;
        this.c = h21Var;
        this.d = i;
        this.e = fk1Var;
        this.f = z;
        this.g = list;
        this.h = str;
        this.i = r51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s91)) {
            return false;
        }
        s91 s91Var = (s91) obj;
        return this.a.equals(s91Var.a) && Intrinsics.d(this.b, s91Var.b) && Intrinsics.d(this.c, s91Var.c) && this.d == s91Var.d && Intrinsics.d(this.e, s91Var.e) && this.f == s91Var.f && Intrinsics.d(this.g, s91Var.g) && Intrinsics.d(this.h, s91Var.h) && Intrinsics.d(this.i, s91Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t91 t91Var = this.b;
        int hashCode2 = (hashCode + (t91Var == null ? 0 : t91Var.a.hashCode())) * 31;
        h21 h21Var = this.c;
        int a = f1d.a(this.d, (hashCode2 + (h21Var == null ? 0 : h21Var.hashCode())) * 31, 31);
        fk1 fk1Var = this.e;
        int d = k5r.d(k5r.e((a + (fk1Var == null ? 0 : fk1Var.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode3 = (d + (str == null ? 0 : str.hashCode())) * 31;
        r51 r51Var = this.i;
        return hashCode3 + (r51Var != null ? r51Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ArtistHeaderData(artist=" + this.a + ", donation=" + this.b + ", brandedButton=" + this.c + ", likesCount=" + this.d + ", stats=" + this.e + ", hasTrailer=" + this.f + ", covers=" + this.g + ", description=" + this.h + ", deprecation=" + this.i + ")";
    }
}
