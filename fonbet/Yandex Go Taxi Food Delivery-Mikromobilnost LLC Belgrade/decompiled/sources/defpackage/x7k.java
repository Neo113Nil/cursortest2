package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class x7k implements zsq0, nyi {
    public final JsonParserComponent a;

    public x7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [exq] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        Object c8kVar;
        Object a;
        Object z7kVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        e8k e8kVar = hexVar instanceof e8k ? (e8k) hexVar : null;
        if (e8kVar != null) {
            if (e8kVar instanceof c8k) {
                R = "offset";
            } else if (e8kVar instanceof a8k) {
                R = "index";
            } else if (e8kVar instanceof d8k) {
                R = "start";
            } else if (e8kVar instanceof z7k) {
                R = "end";
            } else {
                if (!(e8kVar instanceof b8k)) {
                    w511.b();
                    return null;
                }
                R = "item_id";
            }
        }
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1019779949:
                if (R.equals("offset")) {
                    zu60 zu60Var = (zu60) jsonParserComponent.wa.getValue();
                    a = e8kVar != null ? e8kVar.a() : null;
                    zu60Var.getClass();
                    c8kVar = new c8k(zu60.c(yf90Var, (bv60) a, jSONObject));
                    return c8kVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 100571:
                if (R.equals("end")) {
                    b0o b0oVar = (b0o) jsonParserComponent.ba.getValue();
                    b0oVar.getClass();
                    z7kVar = new z7k(new d0o());
                    return z7kVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 100346066:
                if (R.equals("index")) {
                    brv brvVar = (brv) jsonParserComponent.ea.getValue();
                    a = e8kVar != null ? e8kVar.a() : null;
                    brvVar.getClass();
                    c8kVar = new a8k(brv.c(yf90Var, (drv) a, jSONObject));
                    return c8kVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 109757538:
                if (R.equals("start")) {
                    u0u0 u0u0Var = (u0u0) jsonParserComponent.Ca.getValue();
                    u0u0Var.getClass();
                    z7kVar = new d8k(new w0u0());
                    return z7kVar;
                }
                throw fg90.m(jSONObject, "type", R);
            case 2116204999:
                if (R.equals("item_id")) {
                    g2x g2xVar = (g2x) jsonParserComponent.na.getValue();
                    i2x i2xVar = (i2x) (e8kVar != null ? e8kVar.a() : null);
                    g2xVar.getClass();
                    c8kVar = new b8k(new i2x(wcx.d(udq0.Q(yf90Var), jSONObject, "value", wm11.c, yf90Var.i(), i2xVar != null ? i2xVar.a : null)));
                    return c8kVar;
                }
                throw fg90.m(jSONObject, "type", R);
            default:
                throw fg90.m(jSONObject, "type", R);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, e8k e8kVar) {
        boolean z = e8kVar instanceof c8k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            zu60 zu60Var = (zu60) jsonParserComponent.wa.getValue();
            bv60 bv60Var = ((c8k) e8kVar).a;
            zu60Var.getClass();
            return zu60.d(yf90Var, bv60Var);
        }
        if (e8kVar instanceof a8k) {
            brv brvVar = (brv) jsonParserComponent.ea.getValue();
            drv drvVar = ((a8k) e8kVar).a;
            brvVar.getClass();
            return brv.d(yf90Var, drvVar);
        }
        if (e8kVar instanceof d8k) {
            ((u0u0) jsonParserComponent.Ca.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "start");
            return jSONObject;
        }
        if (e8kVar instanceof z7k) {
            ((b0o) jsonParserComponent.ba.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            wwg.Z(yf90Var, jSONObject2, "type", "end");
            return jSONObject2;
        }
        if (!(e8kVar instanceof b8k)) {
            w511.b();
            return null;
        }
        g2x g2xVar = (g2x) jsonParserComponent.na.getValue();
        i2x i2xVar = ((b8k) e8kVar).a;
        g2xVar.getClass();
        return g2x.c(yf90Var, i2xVar);
    }
}
