package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface t8s {
    d7f get(String str);

    default d7f t(String str, JSONObject jSONObject) {
        d7f d7fVar = get(str);
        if (d7fVar != null) {
            return d7fVar;
        }
        z7k z7kVar = a8k.a;
        throw new z7k(b8k.a, hrg.q("Template '", str, "' is missing!"), null, new d4f(1, jSONObject), wct.H(jSONObject), 4);
    }
}
