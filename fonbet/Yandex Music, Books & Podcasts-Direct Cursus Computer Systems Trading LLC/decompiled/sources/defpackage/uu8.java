package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uu8 implements gip, py7 {
    public static tu8 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        szb c = e5f.c(t7kVar, jSONObject, CommonUrlParts.LOCALE);
        Object opt = jSONObject.opt("raw_text_variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new tu8(c, (String) opt);
        }
        throw a8k.g("raw_text_variable", jSONObject);
    }

    public static JSONObject d(t7k t7kVar, tu8 tu8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, CommonUrlParts.LOCALE, tu8Var.a);
        etn.l0(t7kVar, jSONObject, "raw_text_variable", tu8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "currency");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (tu8) obj);
    }
}
