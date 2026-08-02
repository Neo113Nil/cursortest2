package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p9q implements s9q {
    public final c01 a;
    public final List b;
    public final iow c;
    public final u9q d;
    public final String e;

    public p9q(c01 c01Var, List list, iow iowVar) {
        c01Var.getClass();
        list.getClass();
        iowVar.getClass();
        this.a = c01Var;
        this.b = list;
        this.c = iowVar;
        this.d = new u9q(c01Var.a);
        this.e = c01Var.b;
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9q)) {
            return false;
        }
        p9q p9qVar = (p9q) obj;
        return Intrinsics.d(this.a, p9qVar.a) && Intrinsics.d(this.b, p9qVar.b) && this.c == p9qVar.c;
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return this.e;
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        c01 c01Var = this.a;
        StringBuilder m = f1d.m("ArtistEntity(id=", c01Var.a, ", title=", c01Var.b, ", subtype=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.d;
    }
}
