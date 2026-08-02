package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class t44 extends c3f.e.d {
    public final long a;
    public final String b;
    public final c3f.e.d.a c;
    public final c3f.e.d.c d;
    public final c3f.e.d.AbstractC0025d e;
    public final c3f.e.d.f f;

    public t44(long j, String str, c3f.e.d.a aVar, c3f.e.d.c cVar, c3f.e.d.AbstractC0025d abstractC0025d, c3f.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0025d;
        this.f = fVar;
    }

    @Override // c3f.e.d
    public final c3f.e.d.a a() {
        return this.c;
    }

    @Override // c3f.e.d
    public final c3f.e.d.c b() {
        return this.d;
    }

    @Override // c3f.e.d
    public final c3f.e.d.AbstractC0025d c() {
        return this.e;
    }

    @Override // c3f.e.d
    public final c3f.e.d.f d() {
        return this.f;
    }

    @Override // c3f.e.d
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f.e.d)) {
            return false;
        }
        c3f.e.d dVar = (c3f.e.d) obj;
        if (this.a != dVar.e() || !this.b.equals(dVar.f()) || !this.c.equals(dVar.a()) || !this.d.equals(dVar.b())) {
            return false;
        }
        c3f.e.d.AbstractC0025d abstractC0025d = this.e;
        if (abstractC0025d == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!abstractC0025d.equals(dVar.c())) {
            return false;
        }
        c3f.e.d.f fVar = this.f;
        return fVar == null ? dVar.d() == null : fVar.equals(dVar.d());
    }

    @Override // c3f.e.d
    public final String f() {
        return this.b;
    }

    @Override // c3f.e.d
    public final s44 g() {
        return new s44(this);
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        c3f.e.d.AbstractC0025d abstractC0025d = this.e;
        int hashCode2 = (hashCode ^ (abstractC0025d == null ? 0 : abstractC0025d.hashCode())) * 1000003;
        c3f.e.d.f fVar = this.f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
