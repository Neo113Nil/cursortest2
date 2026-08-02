package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qf8 implements gip, r8s {
    public final t6f a;

    public qf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final sf8 c(t7k t7kVar, sf8 sf8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        return new sf8(y2x.J(Y, jSONObject, PListParser.TAG_KEY, ox8Var, d, sf8Var != null ? sf8Var.a : null), y2x.N(Y, jSONObject, Constants.KEY_VALUE, d, sf8Var != null ? sf8Var.b : null, this.a.G9), y2x.J(Y, jSONObject, "variable_name", ox8Var, d, sf8Var != null ? sf8Var.c : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sf8 sf8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, PListParser.TAG_KEY, sf8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "dict_set_value");
        y2x.i0(t7kVar, jSONObject, Constants.KEY_VALUE, sf8Var.b, this.a.G9);
        y2x.f0(t7kVar, jSONObject, "variable_name", sf8Var.c);
        return jSONObject;
    }
}
