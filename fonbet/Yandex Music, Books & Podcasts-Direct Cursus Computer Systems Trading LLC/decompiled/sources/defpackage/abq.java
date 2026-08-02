package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class abq implements bbq {
    public final gbq a;
    public final o4q b;
    public final zaq c;
    public final yaq d;
    public final p4q e;
    public final asw f;
    public final String g;
    public final gxc h;
    public final c5b i;

    public abq(gbq gbqVar, o4q o4qVar, zaq zaqVar, yaq yaqVar, p4q p4qVar, asw aswVar) {
        o4qVar.getClass();
        p4qVar.getClass();
        this.a = gbqVar;
        this.b = o4qVar;
        this.c = zaqVar;
        this.d = yaqVar;
        this.e = p4qVar;
        this.f = aswVar;
        this.g = zaqVar.a;
        this.h = yaqVar.c;
        this.i = c5b.a;
        iow iowVar = iow.a;
    }

    public static abq a(abq abqVar, o4q o4qVar) {
        gbq gbqVar = abqVar.a;
        zaq zaqVar = abqVar.c;
        yaq yaqVar = abqVar.d;
        p4q p4qVar = abqVar.e;
        asw aswVar = abqVar.f;
        abqVar.getClass();
        p4qVar.getClass();
        return new abq(gbqVar, o4qVar, zaqVar, yaqVar, p4qVar, aswVar);
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.i;
    }

    @Override // defpackage.bbq
    public final gxc d() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abq)) {
            return false;
        }
        abq abqVar = (abq) obj;
        return this.a.equals(abqVar.a) && this.b == abqVar.b && this.c.equals(abqVar.c) && this.d.equals(abqVar.d) && this.e == abqVar.e && this.f.equals(abqVar.f);
    }

    @Override // defpackage.bbq
    public final asw f() {
        return this.f;
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return this.g;
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WithSessionId(id=" + this.a + ", entityMode=" + this.b + ", waveDescription=" + this.c + ", analyticsOptions=" + this.d + ", waveType=" + this.e + ", sourcesContainer=" + this.f + ")";
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.a;
    }

    @Override // defpackage.bbq, defpackage.f5q, defpackage.u3q
    public final hbq getId() {
        return this.a;
    }
}
