package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class y7k implements qfy0 {
    public final JsonParserComponent a;

    public y7k(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.qfy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v7k a(yf90 yf90Var, e8k e8kVar, JSONObject jSONObject) {
        boolean z = e8kVar instanceof c8k;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            av60 av60Var = (av60) jsonParserComponent.xa.getValue();
            bv60 bv60Var = ((c8k) e8kVar).a;
            av60Var.getClass();
            return new t7k(new xu60(xcx.e(yf90Var, bv60Var.a, jSONObject, "value", wm11.b, b.h, rm91.a)));
        }
        if (e8kVar instanceof a8k) {
            crv crvVar = (crv) jsonParserComponent.fa.getValue();
            drv drvVar = ((a8k) e8kVar).a;
            crvVar.getClass();
            return new r7k(new zqv(xcx.e(yf90Var, drvVar.a, jSONObject, "value", wm11.b, b.h, cj91.a)));
        }
        if (e8kVar instanceof d8k) {
            ((v0u0) jsonParserComponent.Da.getValue()).getClass();
            return new u7k(new s0u0());
        }
        if (e8kVar instanceof z7k) {
            ((c0o) jsonParserComponent.ca.getValue()).getClass();
            return new q7k(new zzn());
        }
        if (!(e8kVar instanceof b8k)) {
            w511.b();
            return null;
        }
        h2x h2xVar = (h2x) jsonParserComponent.oa.getValue();
        i2x i2xVar = ((b8k) e8kVar).a;
        h2xVar.getClass();
        return new s7k(new e2x(xcx.c(yf90Var, i2xVar.a, jSONObject, "value", wm11.c)));
    }
}
