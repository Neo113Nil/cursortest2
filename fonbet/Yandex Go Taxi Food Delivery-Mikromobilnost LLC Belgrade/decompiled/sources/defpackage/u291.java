package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class u291 implements s191 {
    @Override // defpackage.s191
    public final Object a(JSONObject jSONObject) {
        String str = new String[]{"value"}[0];
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        String[] strArr = {"url", "size"};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (!jSONObject2.has(str2) || jSONObject2.isNull(str2)) {
                yx61.e("Native Ad json has not required attributes");
                return null;
            }
        }
        return new cw81(sh81.a("url", jSONObject2), jSONObject2.optInt("size"));
    }
}
