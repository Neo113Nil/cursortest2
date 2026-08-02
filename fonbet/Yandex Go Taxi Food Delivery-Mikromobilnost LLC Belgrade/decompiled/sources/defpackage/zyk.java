package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zyk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public zyk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final dzk c(yf90 yf90Var, dzk dzkVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, "angle", wm11.b, i, dzkVar != null ? dzkVar.a : null, b.h, bzk.b);
        exq m = wcx.m(Q, jSONObject, i, dzkVar != null ? dzkVar.b : null, this.a.e5, bzk.d);
        rms rmsVar = wm11.f;
        exq exqVar = dzkVar != null ? dzkVar.c : null;
        tls tlsVar = b.a;
        return new dzk(j, m, wcx.g(Q, jSONObject, rmsVar, i, exqVar, bzk.c));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, dzk dzkVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "angle", dzkVar.a);
        wcx.w(yf90Var, jSONObject, "color_map", dzkVar.b, this.a.e5);
        exq exqVar = dzkVar.c;
        tls tlsVar = b.a;
        wcx.r(yf90Var, jSONObject, exqVar);
        wwg.Z(yf90Var, jSONObject, "type", "gradient");
        return jSONObject;
    }
}
