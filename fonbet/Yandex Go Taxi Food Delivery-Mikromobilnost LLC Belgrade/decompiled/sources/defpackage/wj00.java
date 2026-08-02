package defpackage;

import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.JSONParsingError;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class wj00 extends y3x {
    public final Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj00(int i) {
        super(JSONItemKind.map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
    }

    public final y3x d(String str) {
        return (y3x) this.b.get(str);
    }

    public final List e(String str) {
        y3x y3xVar = (y3x) this.b.get(str);
        if (y3xVar == null || y3xVar.a != JSONItemKind.array) {
            return null;
        }
        return ((n53) y3xVar).b;
    }

    public final Boolean f(String str) {
        y3x y3xVar = (y3x) this.b.get(str);
        if (y3xVar == null || y3xVar.a != JSONItemKind.f21boolean) {
            return null;
        }
        return Boolean.valueOf(((u96) y3xVar).b);
    }

    public final Integer g(String str) {
        y3x y3xVar = (y3x) this.b.get(str);
        if (y3xVar == null) {
            return null;
        }
        int i = uex.a[y3xVar.a.ordinal()];
        if (i == 1) {
            return Integer.valueOf((int) ((t6w) y3xVar).b);
        }
        if (i == 2) {
            return Integer.valueOf((int) ((s5m) y3xVar).b);
        }
        if (i != 3) {
            return null;
        }
        return bvu0.l(10, ((ktu0) y3xVar).b);
    }

    public final String h(String str) {
        y3x y3xVar = (y3x) this.b.get(str);
        if (y3xVar == null || y3xVar.a != JSONItemKind.string) {
            return null;
        }
        return ((ktu0) y3xVar).b;
    }

    public final void i(String str, boolean z) {
        this.b.put(str, new u96(z));
    }

    public final void j(int i, String str) {
        this.b.put(str, new t6w(i, false));
    }

    public final void k(String str, String str2) {
        this.b.put(str, new ktu0(str2));
    }

    public final y3x l(String str) {
        y3x d = d(str);
        JSONParsingError jSONParsingError = new JSONParsingError(unr0.p("Failed to query MapJSONItem for key \"", str, "\", json: \"", mbb1.a(this), "\""), null);
        if (d != null) {
            return d;
        }
        throw jSONParsingError;
    }

    public final List m(String str) {
        List e = e(str);
        String c = mbb1.c(JSONItemKind.array);
        JSONParsingError jSONParsingError = new JSONParsingError(oyr.t(b64.v("Failed to query MapJSONItem for key \"", str, "\" of kind \"", c, "\", json: \""), mbb1.a(this), "\""), null);
        if (e != null) {
            return e;
        }
        throw jSONParsingError;
    }

    public final boolean n(String str) {
        Boolean f = f(str);
        String c = mbb1.c(JSONItemKind.f21boolean);
        JSONParsingError jSONParsingError = new JSONParsingError(oyr.t(b64.v("Failed to query MapJSONItem for key \"", str, "\" of kind \"", c, "\", json: \""), mbb1.a(this), "\""), null);
        if (f != null) {
            return f.booleanValue();
        }
        throw jSONParsingError;
    }

    public final int o(String str) {
        Integer g = g(str);
        String c = mbb1.c(JSONItemKind.integer);
        JSONParsingError jSONParsingError = new JSONParsingError(oyr.t(b64.v("Failed to query MapJSONItem for key \"", str, "\" of kind \"", c, "\", json: \""), mbb1.a(this), "\""), null);
        if (g != null) {
            return g.intValue();
        }
        throw jSONParsingError;
    }

    public final String p(String str) {
        String h = h(str);
        String c = mbb1.c(JSONItemKind.string);
        JSONParsingError jSONParsingError = new JSONParsingError(oyr.t(b64.v("Failed to query MapJSONItem for key \"", str, "\" of kind \"", c, "\", json: \""), mbb1.a(this), "\""), null);
        if (h != null) {
            return h;
        }
        throw jSONParsingError;
    }

    public wj00() {
        this(0);
    }
}
