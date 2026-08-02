package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vu8 implements gip, r8s {
    public static xu8 c(t7k t7kVar, xu8 xu8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.a;
        return new xu8(y2x.Q(Y, jSONObject, CommonUrlParts.LOCALE, d, xu8Var != null ? xu8Var.a : null), y2x.G(Y, jSONObject, "raw_text_variable", d, xu8Var != null ? xu8Var.b : null));
    }

    public static JSONObject d(t7k t7kVar, xu8 xu8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, CommonUrlParts.LOCALE, xu8Var.a);
        y2x.h0(t7kVar, jSONObject, "raw_text_variable", xu8Var.b);
        etn.l0(t7kVar, jSONObject, "type", "currency");
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (xu8) obj);
    }
}
