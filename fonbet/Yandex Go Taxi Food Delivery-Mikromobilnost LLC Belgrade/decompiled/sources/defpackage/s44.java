package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class s44 extends c3f.e.d.b {
    public long a;
    public String b;
    public c3f.e.d.a c;
    public c3f.e.d.c d;
    public c3f.e.d.AbstractC0025d e;
    public c3f.e.d.f f;
    public byte g;

    public s44(c3f.e.d dVar) {
        this.a = dVar.e();
        this.b = dVar.f();
        this.c = dVar.a();
        this.d = dVar.b();
        this.e = dVar.c();
        this.f = dVar.d();
        this.g = (byte) 1;
    }

    public final t44 a() {
        String str;
        c3f.e.d.a aVar;
        c3f.e.d.c cVar;
        if (this.g == 1 && (str = this.b) != null && (aVar = this.c) != null && (cVar = this.d) != null) {
            return new t44(this.a, str, aVar, cVar, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.g) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final s44 b(c3f.e.d.a aVar) {
        if (aVar != null) {
            this.c = aVar;
            return this;
        }
        ny61.t("Null app");
        return null;
    }

    public final s44 c(c3f.e.d.c cVar) {
        if (cVar != null) {
            this.d = cVar;
            return this;
        }
        ny61.t("Null device");
        return null;
    }

    public final s44 d(c3f.e.d.AbstractC0025d abstractC0025d) {
        this.e = abstractC0025d;
        return this;
    }

    public final s44 e(c3f.e.d.f fVar) {
        this.f = fVar;
        return this;
    }

    public final s44 f(long j) {
        this.a = j;
        this.g = (byte) (this.g | 1);
        return this;
    }

    public final s44 g(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null type");
        return null;
    }

    public s44() {
    }
}
