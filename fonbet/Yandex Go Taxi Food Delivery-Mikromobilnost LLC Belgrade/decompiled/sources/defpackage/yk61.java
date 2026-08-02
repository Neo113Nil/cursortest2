package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class yk61 implements s191 {
    public final w081 a = new w081();

    @Override // defpackage.s191
    public final Object a(JSONObject jSONObject) {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        return this.a.a(jSONObject.getJSONObject("value"));
    }
}
