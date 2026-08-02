package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivText$Image$IndexingDirection;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.v2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ufl implements zsq0, yey0 {
    public final JsonParserComponent a;

    public ufl(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        JsonParserComponent jsonParserComponent = this.a;
        i3y i3yVar = jsonParserComponent.U8;
        i3y i3yVar2 = jsonParserComponent.F3;
        exq i2 = wcx.i(Q, jSONObject, "accessibility", i, null, i3yVar);
        qkj qkjVar = v2.g;
        tls tlsVar = DivTextAlignmentVertical.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new shl(i2, wcx.j(Q, jSONObject, "alignment_vertical", qkjVar, i, null, tlsVar, kbsVar), wcx.i(Q, jSONObject, "height", i, null, i3yVar2), wcx.j(Q, jSONObject, "indexing_direction", v2.h, i, null, DivText$Image$IndexingDirection.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, "preload_required", wm11.a, i, null, b.f, kbsVar), wcx.e(Q, jSONObject, "start", wm11.b, i, null, b.h, v2.j), wcx.j(Q, jSONObject, "tint_color", wm11.f, i, null, b.b, kbsVar), wcx.j(Q, jSONObject, "tint_mode", v2.i, i, null, DivBlendMode.FROM_STRING, kbsVar), wcx.e(Q, jSONObject, "url", wm11.e, i, null, b.e, kbsVar), wcx.i(Q, jSONObject, "width", i, null, i3yVar2));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, shl shlVar) {
        JSONObject jSONObject = new JSONObject();
        exq exqVar = shlVar.a;
        JsonParserComponent jsonParserComponent = this.a;
        wcx.u(yf90Var, jSONObject, "accessibility", exqVar, jsonParserComponent.U8);
        wcx.p(shlVar.b, DivTextAlignmentVertical.TO_STRING, yf90Var, "alignment_vertical", jSONObject);
        exq exqVar2 = shlVar.c;
        i3y i3yVar = jsonParserComponent.F3;
        wcx.u(yf90Var, jSONObject, "height", exqVar2, i3yVar);
        wcx.p(shlVar.d, DivText$Image$IndexingDirection.TO_STRING, yf90Var, "indexing_direction", jSONObject);
        wcx.q(yf90Var, jSONObject, "preload_required", shlVar.e);
        wcx.q(yf90Var, jSONObject, "start", shlVar.f);
        wcx.p(shlVar.g, b.a, yf90Var, "tint_color", jSONObject);
        wcx.p(shlVar.h, DivBlendMode.TO_STRING, yf90Var, "tint_mode", jSONObject);
        wcx.p(shlVar.i, b.c, yf90Var, "url", jSONObject);
        wcx.u(yf90Var, jSONObject, "width", shlVar.j, i3yVar);
        return jSONObject;
    }
}
