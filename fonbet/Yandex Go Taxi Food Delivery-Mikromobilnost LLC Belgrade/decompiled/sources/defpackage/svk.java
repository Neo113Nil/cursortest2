package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class svk implements zsq0, nyi {
    public final JsonParserComponent a;

    public svk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object wvkVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        xvk xvkVar = hexVar instanceof xvk ? (xvk) hexVar : null;
        if (xvkVar != null) {
            if (xvkVar instanceof vvk) {
                R = "fixed_length";
            } else if (xvkVar instanceof uvk) {
                R = "currency";
            } else {
                if (!(xvkVar instanceof wvk)) {
                    w511.b();
                    return null;
                }
                R = "phone";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        if (hashCode == 106642798) {
            if (R.equals("phone")) {
                u3l u3lVar = (u3l) jsonParserComponent.Y5.getValue();
                w3l w3lVar = (w3l) (xvkVar != null ? xvkVar.a() : null);
                u3lVar.getClass();
                wvkVar = new wvk(new w3l(wcx.a(udq0.Q(yf90Var), jSONObject, "raw_text_variable", yf90Var.i(), w3lVar != null ? w3lVar.a : null)));
                return wvkVar;
            }
            throw fg90.m(jSONObject, "type", R);
        }
        if (hashCode == 393594385) {
            if (R.equals("fixed_length")) {
                wvkVar = new vvk(((kqk) jsonParserComponent.z3.getValue()).c(yf90Var, (rqk) (xvkVar != null ? xvkVar.a() : null), jSONObject));
                return wvkVar;
            }
            throw fg90.m(jSONObject, "type", R);
        }
        if (hashCode == 575402001 && R.equals("currency")) {
            zkk zkkVar = (zkk) jsonParserComponent.I2.getValue();
            Object a = xvkVar != null ? xvkVar.a() : null;
            zkkVar.getClass();
            wvkVar = new uvk(zkk.c(yf90Var, (blk) a, jSONObject));
            return wvkVar;
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, xvk xvkVar) {
        boolean z = xvkVar instanceof vvk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((kqk) jsonParserComponent.z3.getValue()).b(yf90Var, ((vvk) xvkVar).a);
        }
        if (xvkVar instanceof uvk) {
            zkk zkkVar = (zkk) jsonParserComponent.I2.getValue();
            blk blkVar = ((uvk) xvkVar).a;
            zkkVar.getClass();
            return zkk.d(yf90Var, blkVar);
        }
        if (!(xvkVar instanceof wvk)) {
            w511.b();
            return null;
        }
        u3l u3lVar = (u3l) jsonParserComponent.Y5.getValue();
        w3l w3lVar = ((wvk) xvkVar).a;
        u3lVar.getClass();
        return u3l.c(yf90Var, w3lVar);
    }
}
