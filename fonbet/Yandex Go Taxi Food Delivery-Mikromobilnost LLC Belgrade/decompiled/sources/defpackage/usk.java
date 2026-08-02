package defpackage;

import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.v0;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class usk implements zsq0, yey0 {
    public final JsonParserComponent a;

    public usk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final /* bridge */ /* synthetic */ hex a(yf90 yf90Var, JSONObject jSONObject) {
        return c(yf90Var, null, jSONObject);
    }

    public final wsk c(yf90 yf90Var, wsk wskVar, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        exq j = wcx.j(Q, jSONObject, CaretView.ALPHA_PROPERTY, wm11.d, i, wskVar != null ? wskVar.a : null, b.g, v0.i);
        qkj qkjVar = v0.f;
        exq exqVar = wskVar != null ? wskVar.b : null;
        tls tlsVar = DivAlignmentHorizontal.FROM_STRING;
        kbs kbsVar = q5z.b;
        return new wsk(j, wcx.j(Q, jSONObject, "content_alignment_horizontal", qkjVar, i, exqVar, tlsVar, kbsVar), wcx.j(Q, jSONObject, "content_alignment_vertical", v0.g, i, wskVar != null ? wskVar.c : null, DivAlignmentVertical.FROM_STRING, kbsVar), wcx.k(Q, jSONObject, "filters", i, wskVar != null ? wskVar.d : null, this.a.t3), wcx.e(Q, jSONObject, "image_url", wm11.e, i, wskVar != null ? wskVar.e : null, b.e, kbsVar), wcx.j(Q, jSONObject, "preload_required", wm11.a, i, wskVar != null ? wskVar.f : null, b.f, kbsVar), wcx.j(Q, jSONObject, "scale", v0.h, i, wskVar != null ? wskVar.g : null, DivImageScale.FROM_STRING, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, wsk wskVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, CaretView.ALPHA_PROPERTY, wskVar.a);
        wcx.p(wskVar.b, DivAlignmentHorizontal.TO_STRING, yf90Var, "content_alignment_horizontal", jSONObject);
        wcx.p(wskVar.c, DivAlignmentVertical.TO_STRING, yf90Var, "content_alignment_vertical", jSONObject);
        wcx.w(yf90Var, jSONObject, "filters", wskVar.d, this.a.t3);
        wcx.p(wskVar.e, b.c, yf90Var, "image_url", jSONObject);
        wcx.q(yf90Var, jSONObject, "preload_required", wskVar.f);
        wcx.p(wskVar.g, DivImageScale.TO_STRING, yf90Var, "scale", jSONObject);
        wwg.Z(yf90Var, jSONObject, "type", "image");
        return jSONObject;
    }
}
