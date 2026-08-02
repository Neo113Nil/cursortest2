package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAnimation$Name;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class tdk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public tdk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        exq j = wcx.j(Q, jSONObject, "duration", tmsVar, i, null, tlsVar, o.g);
        sms smsVar = wm11.d;
        tls tlsVar2 = b.g;
        kbs kbsVar = q5z.b;
        exq j2 = wcx.j(Q, jSONObject, "end_value", smsVar, i, null, tlsVar2, kbsVar);
        exq j3 = wcx.j(Q, jSONObject, "interpolator", o.e, i, null, DivAnimationInterpolator.FROM_STRING, kbsVar);
        JsonParserComponent jsonParserComponent = this.a;
        return new vdk(j, j2, j3, wcx.k(Q, jSONObject, "items", i, null, jsonParserComponent.A1), wcx.e(Q, jSONObject, "name", o.f, i, null, DivAnimation$Name.FROM_STRING, kbsVar), wcx.i(Q, jSONObject, "repeat", i, null, jsonParserComponent.F2), wcx.j(Q, jSONObject, "start_delay", tmsVar, i, null, tlsVar, o.h), wcx.j(Q, jSONObject, "start_value", smsVar, i, null, tlsVar2, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, vdk vdkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "duration", vdkVar.a);
        wcx.q(yf90Var, jSONObject, "end_value", vdkVar.b);
        wcx.p(vdkVar.c, DivAnimationInterpolator.TO_STRING, yf90Var, "interpolator", jSONObject);
        exq exqVar = vdkVar.d;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.w(yf90Var, jSONObject, "items", exqVar, jsonParserComponent.A1);
        wcx.p(vdkVar.e, DivAnimation$Name.TO_STRING, yf90Var, "name", jSONObject);
        wcx.u(yf90Var, jSONObject, "repeat", vdkVar.f, jsonParserComponent.F2);
        wcx.q(yf90Var, jSONObject, "start_delay", vdkVar.g);
        wcx.q(yf90Var, jSONObject, "start_value", vdkVar.h);
        return jSONObject;
    }
}
