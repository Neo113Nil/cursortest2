package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes.dex */
public final class v44 extends c3f.e.d.a {
    public final c3f.e.d.a.b a;
    public final List b;
    public final List c;
    public final Boolean d;
    public final c3f.e.d.a.c e;
    public final List f;
    public final int g;

    public v44(c3f.e.d.a.b bVar, List list, List list2, Boolean bool, c3f.e.d.a.c cVar, List list3, int i) {
        this.a = bVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = cVar;
        this.f = list3;
        this.g = i;
    }

    @Override // c3f.e.d.a
    public final List a() {
        return this.f;
    }

    @Override // c3f.e.d.a
    public final Boolean b() {
        return this.d;
    }

    @Override // c3f.e.d.a
    public final c3f.e.d.a.c c() {
        return this.e;
    }

    @Override // c3f.e.d.a
    public final List d() {
        return this.b;
    }

    @Override // c3f.e.d.a
    public final c3f.e.d.a.b e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d.a)) {
            return false;
        }
        c3f.e.d.a aVar = (c3f.e.d.a) obj;
        if (!this.a.equals(aVar.e())) {
            return false;
        }
        List list = this.b;
        if (list == null) {
            if (aVar.d() != null) {
                return false;
            }
        } else if (!list.equals(aVar.d())) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null) {
            if (aVar.f() != null) {
                return false;
            }
        } else if (!list2.equals(aVar.f())) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null) {
            if (aVar.b() != null) {
                return false;
            }
        } else if (!bool.equals(aVar.b())) {
            return false;
        }
        c3f.e.d.a.c cVar = this.e;
        if (cVar == null) {
            if (aVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(aVar.c())) {
            return false;
        }
        List list3 = this.f;
        if (list3 == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!list3.equals(aVar.a())) {
            return false;
        }
        return this.g == aVar.g();
    }

    @Override // c3f.e.d.a
    public final List f() {
        return this.c;
    }

    @Override // c3f.e.d.a
    public final int g() {
        return this.g;
    }

    @Override // c3f.e.d.a
    public final u44 h() {
        return new u44(this);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        List list = this.b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c3f.e.d.a.c cVar = this.e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f;
        return this.g ^ ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", currentProcessDetails=");
        sb.append(this.e);
        sb.append(", appProcessDetails=");
        sb.append(this.f);
        sb.append(", uiOrientation=");
        return oyr.m(this.g, "}", sb);
    }
}
