package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes11.dex */
public final class u44 extends c3f.e.d.a.AbstractC0013a {
    public c3f.e.d.a.b a;
    public List b;
    public List c;
    public Boolean d;
    public c3f.e.d.a.c e;
    public List f;
    public int g;
    public byte h;

    public u44(c3f.e.d.a aVar) {
        this.a = aVar.e();
        this.b = aVar.d();
        this.c = aVar.f();
        this.d = aVar.b();
        this.e = aVar.c();
        this.f = aVar.a();
        this.g = aVar.g();
        this.h = (byte) 1;
    }

    public final v44 a() {
        c3f.e.d.a.b bVar;
        if (this.h == 1 && (bVar = this.a) != null) {
            return new v44(bVar, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final u44 b(List list) {
        this.f = list;
        return this;
    }

    public final u44 c(Boolean bool) {
        this.d = bool;
        return this;
    }

    public final u44 d(c3f.e.d.a.c cVar) {
        this.e = cVar;
        return this;
    }

    public final u44 e(List list) {
        this.b = list;
        return this;
    }

    public final u44 f(x44 x44Var) {
        this.a = x44Var;
        return this;
    }

    public final u44 g(List list) {
        this.c = list;
        return this;
    }

    public final u44 h(int i) {
        this.g = i;
        this.h = (byte) (this.h | 1);
        return this;
    }

    public u44() {
    }
}
