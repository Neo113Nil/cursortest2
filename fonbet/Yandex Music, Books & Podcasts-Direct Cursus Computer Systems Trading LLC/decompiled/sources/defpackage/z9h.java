package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class z9h extends q1f {
    public final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9h() {
        super(r1f.f);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
    }

    public final List d(String str) {
        q1f q1fVar = (q1f) this.b.get(str);
        if (q1fVar == null || q1fVar.a != r1f.g) {
            return null;
        }
        return ((my0) q1fVar).b;
    }

    public final Boolean e(String str) {
        q1f q1fVar = (q1f) this.b.get(str);
        if (q1fVar == null || q1fVar.a != r1f.d) {
            return null;
        }
        return Boolean.valueOf(((mc3) q1fVar).b);
    }

    public final Integer f(String str) {
        q1f q1fVar = (q1f) this.b.get(str);
        if (q1fVar == null) {
            return null;
        }
        int ordinal = q1fVar.a.ordinal();
        if (ordinal == 0) {
            return Integer.valueOf((int) ((oqe) q1fVar).b);
        }
        if (ordinal == 1) {
            return Integer.valueOf((int) ((d9a) q1fVar).b);
        }
        if (ordinal != 2) {
            return null;
        }
        return up6.Q(((jkr) q1fVar).b);
    }

    public final String g(String str) {
        q1f q1fVar = (q1f) this.b.get(str);
        if (q1fVar == null || q1fVar.a != r1f.c) {
            return null;
        }
        return ((jkr) q1fVar).b;
    }

    public final void h(String str, boolean z) {
        w1g.B(this.b, str, new mc3(z));
    }

    public final void i(int i, String str) {
        w1g.B(this.b, str, new oqe(i, false));
    }

    public final void j(String str, String str2) {
        str2.getClass();
        w1g.B(this.b, str, new jkr(str2));
    }

    public final q1f k(String str) {
        q1f q1fVar = (q1f) this.b.get(str);
        mac macVar = new mac(hrg.s("Failed to query MapJSONItem for key \"", str, "\", json: \"", bkp.S(this), "\""), (Throwable) null);
        if (q1fVar != null) {
            return q1fVar;
        }
        throw macVar;
    }

    public final List l(String str) {
        List d = d(str);
        String U = bkp.U(r1f.g);
        mac macVar = new mac(su4.o(f1d.m("Failed to query MapJSONItem for key \"", str, "\" of kind \"", U, "\", json: \""), bkp.S(this), "\""), (Throwable) null);
        if (d != null) {
            return d;
        }
        throw macVar;
    }

    public final boolean m(String str) {
        Boolean e = e(str);
        String U = bkp.U(r1f.d);
        mac macVar = new mac(su4.o(f1d.m("Failed to query MapJSONItem for key \"", str, "\" of kind \"", U, "\", json: \""), bkp.S(this), "\""), (Throwable) null);
        if (e != null) {
            return e.booleanValue();
        }
        throw macVar;
    }

    public final int n(String str) {
        Integer f = f(str);
        String U = bkp.U(r1f.a);
        mac macVar = new mac(su4.o(f1d.m("Failed to query MapJSONItem for key \"", str, "\" of kind \"", U, "\", json: \""), bkp.S(this), "\""), (Throwable) null);
        if (f != null) {
            return f.intValue();
        }
        throw macVar;
    }

    public final String o(String str) {
        String g = g(str);
        String U = bkp.U(r1f.c);
        mac macVar = new mac(su4.o(f1d.m("Failed to query MapJSONItem for key \"", str, "\" of kind \"", U, "\", json: \""), bkp.S(this), "\""), (Throwable) null);
        if (g != null) {
            return g;
        }
        throw macVar;
    }
}
