package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class t3l implements zsq0, nyi {
    public static JSONObject c(yf90 yf90Var, s3l s3lVar) {
        JSONObject jSONObject = new JSONObject();
        wwg.Z(yf90Var, jSONObject, "raw_text_variable", s3lVar.a);
        wwg.Z(yf90Var, jSONObject, "type", "phone");
        return jSONObject;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        return new s3l((String) wwg.F("raw_text_variable", jSONObject));
    }

    @Override // defpackage.zsq0
    public final /* bridge */ /* synthetic */ JSONObject b(yf90 yf90Var, Object obj) {
        return c(yf90Var, (s3l) obj);
    }
}
