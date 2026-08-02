package defpackage;

import com.yandex.div.internal.parser.a;
import com.yandex.div.internal.parser.b;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.o;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sdk implements zsq0, nyi {
    public final JsonParserComponent a;

    public sdk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.yandex.div.json.expressions.Expression] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.yandex.div.json.expressions.Expression] */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        dac dacVar = o.g;
        kvo kvoVar = o.a;
        ?? e = a.e(yf90Var, jSONObject, "duration", tmsVar, tlsVar, dacVar, kvoVar);
        kvo kvoVar2 = e == 0 ? kvoVar : e;
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        kbs kbsVar = q5z.b;
        Expression e2 = a.e(yf90Var, jSONObject, "end_value", smsVar, tlsVar2, kbsVar, null);
        qkj qkjVar = o.e;
        tls tlsVar3 = DivAnimationInterpolator.FROM_STRING;
        kvo kvoVar3 = o.b;
        ?? e3 = a.e(yf90Var, jSONObject, "interpolator", qkjVar, tlsVar3, kbsVar, kvoVar3);
        kvo kvoVar4 = e3 == 0 ? kvoVar3 : e3;
        JsonParserComponent jsonParserComponent = this.a;
        List O = wwg.O(yf90Var, jSONObject, "items", jsonParserComponent.z1);
        Expression b = a.b(yf90Var, jSONObject, "name", o.f, DivAnimation$Name.FROM_STRING, kbsVar);
        pkk pkkVar = (pkk) wwg.M(yf90Var, jSONObject, "repeat", jsonParserComponent.E2);
        if (pkkVar == null) {
            pkkVar = o.c;
        }
        pkk pkkVar2 = pkkVar;
        dac dacVar2 = o.h;
        kvo kvoVar5 = o.d;
        ?? e4 = a.e(yf90Var, jSONObject, "start_delay", tmsVar, tlsVar, dacVar2, kvoVar5);
        return new pdk(kvoVar2, e2, kvoVar4, O, b, pkkVar2, e4 == 0 ? kvoVar5 : e4, a.e(yf90Var, jSONObject, "start_value", smsVar, tlsVar2, kbsVar, null));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, pdk pdkVar) {
        JSONObject jSONObject = new JSONObject();
        a.g(yf90Var, jSONObject, "duration", pdkVar.a);
        a.g(yf90Var, jSONObject, "end_value", pdkVar.b);
        a.h(yf90Var, jSONObject, "interpolator", pdkVar.c, DivAnimationInterpolator.TO_STRING);
        List list = pdkVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        wwg.c0(yf90Var, jSONObject, "items", list, jsonParserComponent.z1);
        a.h(yf90Var, jSONObject, "name", pdkVar.e, DivAnimation$Name.TO_STRING);
        wwg.b0(yf90Var, jSONObject, "repeat", pdkVar.f, jsonParserComponent.E2);
        a.g(yf90Var, jSONObject, "start_delay", pdkVar.g);
        a.g(yf90Var, jSONObject, "start_value", pdkVar.h);
        return jSONObject;
    }
}
