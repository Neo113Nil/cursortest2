package defpackage;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a8k {
    public static final z7k a = new z7k(b8k.c, "", null, null, null, 28);

    public static final z7k a(JSONArray jSONArray, String str, int i, Exception exc) {
        return new z7k(b8k.f, "Value at " + i + " position of '" + str + "' is failed to create", exc, new d4f(0, jSONArray), wct.G(jSONArray));
    }

    public static final z7k b(JSONObject jSONObject, String str, Exception exc) {
        return new z7k(b8k.f, hrg.q("Value for key '", str, "' is failed to create"), exc, new d4f(1, jSONObject), wct.H(jSONObject));
    }

    public static final z7k c(Object obj, String str) {
        return new z7k(b8k.e, "Value '" + i(obj) + "' at path '" + str + "' is not valid", null, null, null, 28);
    }

    public static final z7k d(JSONArray jSONArray, String str, int i, Object obj, Exception exc) {
        StringBuilder sb = new StringBuilder("Value '");
        sb.append(i(obj));
        sb.append("' at ");
        sb.append(i);
        sb.append(" position of '");
        return new z7k(b8k.e, su4.o(sb, str, "' is not valid"), exc, new d4f(0, jSONArray), null, 16);
    }

    public static final z7k e(JSONObject jSONObject, String str, Object obj) {
        return new z7k(b8k.e, "Value '" + i(obj) + "' for key '" + str + "' is not valid", null, new d4f(1, jSONObject), wct.H(jSONObject), 4);
    }

    public static final z7k f(JSONObject jSONObject, String str, Object obj, Exception exc) {
        return new z7k(b8k.e, "Value '" + i(obj) + "' for key '" + str + "' is not valid", exc, new d4f(1, jSONObject), null, 16);
    }

    public static final z7k g(String str, JSONObject jSONObject) {
        return new z7k(b8k.b, hrg.q("Value for key '", str, "' is missing"), null, new d4f(1, jSONObject), wct.H(jSONObject), 4);
    }

    public static final z7k h(String str, Object obj, Exception exc) {
        return new z7k(b8k.e, "Value '" + i(obj) + "' for key '" + str + "' could not be resolved", exc, null, null, 24);
    }

    public static final String i(Object obj) {
        String valueOf = String.valueOf(obj);
        return valueOf.length() > 100 ? mlr.K(97, valueOf).concat("...") : valueOf;
    }

    public static final z7k j(String str, String str2, Object obj, ClassCastException classCastException) {
        return new z7k(b8k.d, f1d.j(f1d.m("Expression '", str, "': '", str2, "' received value of wrong type: '"), obj, '\''), classCastException, null, null, 24);
    }

    public static final z7k k(JSONArray jSONArray, String str, int i, Object obj) {
        StringBuilder r = k5r.r(i, "Value at ", " position of '", str, "' has wrong type ");
        r.append(obj.getClass().getName());
        return new z7k(b8k.d, r.toString(), null, new d4f(0, jSONArray), wct.G(jSONArray), 4);
    }

    public static final z7k l(JSONObject jSONObject, String str, Object obj) {
        StringBuilder u = ouj.u("Value for key '", str, "' has wrong type ");
        u.append(obj.getClass().getName());
        return new z7k(b8k.d, u.toString(), null, new d4f(1, jSONObject), wct.H(jSONObject), 4);
    }
}
