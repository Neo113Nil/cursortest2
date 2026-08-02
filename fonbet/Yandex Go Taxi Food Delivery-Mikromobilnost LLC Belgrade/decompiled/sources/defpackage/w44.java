package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes11.dex */
public final class w44 extends c3f.e.d.a.b.AbstractC0016b {
    public List a;
    public c3f.e.d.a.b.c b;
    public c3f.a c;
    public c3f.e.d.a.b.AbstractC0018d d;
    public List e;

    public final x44 a() {
        List list;
        c3f.e.d.a.b.AbstractC0018d abstractC0018d = this.d;
        if (abstractC0018d != null && (list = this.e) != null) {
            return new x44(this.a, this.b, this.c, abstractC0018d, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" signal");
        }
        if (this.e == null) {
            sb.append(" binaries");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final w44 b(c3f.a aVar) {
        this.c = aVar;
        return this;
    }

    public final w44 c(List list) {
        if (list != null) {
            this.e = list;
            return this;
        }
        ny61.t("Null binaries");
        return null;
    }

    public final w44 d(c3f.e.d.a.b.c cVar) {
        this.b = cVar;
        return this;
    }

    public final w44 e(c3f.e.d.a.b.AbstractC0018d abstractC0018d) {
        if (abstractC0018d != null) {
            this.d = abstractC0018d;
            return this;
        }
        ny61.t("Null signal");
        return null;
    }

    public final w44 f(List list) {
        this.a = list;
        return this;
    }
}
