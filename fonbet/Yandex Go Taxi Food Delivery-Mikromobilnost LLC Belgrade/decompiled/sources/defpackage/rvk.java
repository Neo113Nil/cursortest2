package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class rvk implements zsq0, nyi {
    public final JsonParserComponent a;

    public rvk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        if (hashCode != 106642798) {
            if (hashCode != 393594385) {
                if (hashCode == 575402001 && R.equals("currency")) {
                    ((ykk) jsonParserComponent.H2.getValue()).getClass();
                    return new mvk(ykk.c(yf90Var, jSONObject));
                }
            } else if (R.equals("fixed_length")) {
                return new nvk(((jqk) jsonParserComponent.y3.getValue()).a(yf90Var, jSONObject));
            }
        } else if (R.equals("phone")) {
            ((t3l) jsonParserComponent.X5.getValue()).getClass();
            return new ovk(new s3l((String) wwg.F("raw_text_variable", jSONObject)));
        }
        hex b = yf90Var.b().b(R, jSONObject);
        xvk xvkVar = b instanceof xvk ? (xvk) b : null;
        if (xvkVar != null) {
            return ((tvk) jsonParserComponent.F4.getValue()).a(yf90Var, xvkVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pvk pvkVar) {
        boolean z = pvkVar instanceof nvk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((jqk) jsonParserComponent.y3.getValue()).b(yf90Var, ((nvk) pvkVar).b);
        }
        if (pvkVar instanceof mvk) {
            ykk ykkVar = (ykk) jsonParserComponent.H2.getValue();
            xkk xkkVar = ((mvk) pvkVar).b;
            ykkVar.getClass();
            return ykk.d(yf90Var, xkkVar);
        }
        if (!(pvkVar instanceof ovk)) {
            w511.b();
            return null;
        }
        t3l t3lVar = (t3l) jsonParserComponent.X5.getValue();
        s3l s3lVar = ((ovk) pvkVar).b;
        t3lVar.getClass();
        return t3l.c(yf90Var, s3lVar);
    }
}
