package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class u4k implements zsq0, nyi {
    public final JsonParserComponent a;

    public u4k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final t4k a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        return new t4k(a.b(yf90Var, jSONObject, "index", tmsVar, tlsVar, kbsVar), (xll) wwg.E(yf90Var, jSONObject, "value", this.a.C9), a.b(yf90Var, jSONObject, "variable_name", wm11.c, q5z.c, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, t4k t4kVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "index", t4kVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "array_set_value");
        wwg.b0(yf90Var, jSONObject, "value", t4kVar.b, this.a.C9);
        a.g(yf90Var, jSONObject, "variable_name", t4kVar.c);
        return jSONObject;
    }
}
