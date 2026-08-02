package defpackage;

import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.internal.parser.b;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.f2;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class val implements zsq0, yey0 {
    public final JsonParserComponent a;

    public val(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    @Override // defpackage.yey0, defpackage.nyi
    public final hex a(yf90 yf90Var, JSONObject jSONObject) {
        boolean i = yf90Var.i();
        d290 Q = udq0.Q(yf90Var);
        ums umsVar = wm11.c;
        abl0 abl0Var = q5z.c;
        kbs kbsVar = q5z.b;
        exq j = wcx.j(Q, jSONObject, "font_family", umsVar, i, null, abl0Var, kbsVar);
        tms tmsVar = wm11.b;
        tls tlsVar = b.h;
        return new sal(j, wcx.j(Q, jSONObject, "font_size", tmsVar, i, null, tlsVar, f2.g), wcx.j(Q, jSONObject, "font_size_unit", f2.e, i, null, DivSizeUnit.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, wm11.h, i, null, abl0Var, kbsVar), wcx.j(Q, jSONObject, FontsContractCompat$Columns.WEIGHT, f2.f, i, null, DivFontWeight.FROM_STRING, kbsVar), wcx.j(Q, jSONObject, "font_weight_value", tmsVar, i, null, tlsVar, f2.h), wcx.j(Q, jSONObject, "letter_spacing", wm11.d, i, null, b.g, kbsVar), wcx.i(Q, jSONObject, "offset", i, null, this.a.k6), wcx.j(Q, jSONObject, "text_color", wm11.f, i, null, b.b, kbsVar));
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, sal salVar) {
        JSONObject jSONObject = new JSONObject();
        wcx.q(yf90Var, jSONObject, "font_family", salVar.a);
        wcx.q(yf90Var, jSONObject, "font_size", salVar.b);
        wcx.p(salVar.c, DivSizeUnit.TO_STRING, yf90Var, "font_size_unit", jSONObject);
        wcx.q(yf90Var, jSONObject, FontsContractCompat$Columns.VARIATION_SETTINGS, salVar.d);
        wcx.p(salVar.e, DivFontWeight.TO_STRING, yf90Var, FontsContractCompat$Columns.WEIGHT, jSONObject);
        wcx.q(yf90Var, jSONObject, "font_weight_value", salVar.f);
        wcx.q(yf90Var, jSONObject, "letter_spacing", salVar.g);
        wcx.u(yf90Var, jSONObject, "offset", salVar.h, this.a.k6);
        wcx.p(salVar.i, b.a, yf90Var, "text_color", jSONObject);
        return jSONObject;
    }
}
