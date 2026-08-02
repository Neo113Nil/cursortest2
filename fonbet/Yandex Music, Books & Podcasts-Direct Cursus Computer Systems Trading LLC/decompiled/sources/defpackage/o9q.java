package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o9q implements s9q {
    public final oq a;
    public final List b;
    public final iow c;
    public final t9q d;
    public final String e;

    public o9q(oq oqVar, List list, iow iowVar) {
        oqVar.getClass();
        list.getClass();
        iowVar.getClass();
        this.a = oqVar;
        this.b = list;
        this.c = iowVar;
        this.d = new t9q(oqVar.a);
        this.e = oqVar.b;
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9q)) {
            return false;
        }
        o9q o9qVar = (o9q) obj;
        return Intrinsics.d(this.a, o9qVar.a) && Intrinsics.d(this.b, o9qVar.b) && this.c == o9qVar.c;
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
        oq oqVar = this.a;
        return hrg.s("AlbumEntity(id=", oqVar.a, ", title=", oqVar.b, ")");
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.d;
    }
}
