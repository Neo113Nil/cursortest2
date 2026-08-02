package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class qal implements zsq0, yey0 {
    public final JsonParserComponent a;

    public qal(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "end", tmsVar, i, null, tlsVar, kbsVar);
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.h3;
        i3y i3yVar2 = jsonParserComponent.e3;
        return new ral(j, wcx.i(Q, jSONObject, "margins", i, null, i3yVar), wcx.j(Q, jSONObject, "start", tmsVar, i, null, tlsVar, kbsVar), wcx.i(Q, jSONObject, "track_active_style", i, null, i3yVar2), wcx.i(Q, jSONObject, "track_inactive_style", i, null, i3yVar2));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, ral ralVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "end", ralVar.a);
        exq exqVar = ralVar.b;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "margins", exqVar, jsonParserComponent.h3);
        wcx.q(yf90Var, jSONObject, "start", ralVar.c);
        exq exqVar2 = ralVar.d;
        i3y i3yVar = jsonParserComponent.e3;
        wcx.u(yf90Var, jSONObject, "track_active_style", exqVar2, i3yVar);
        wcx.u(yf90Var, jSONObject, "track_inactive_style", ralVar.e, i3yVar);
        return jSONObject;
    }
}
