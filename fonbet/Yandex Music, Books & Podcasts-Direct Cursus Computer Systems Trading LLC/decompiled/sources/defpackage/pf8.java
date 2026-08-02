package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pf8 implements gip, py7 {
    public final t6f a;

    public pf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final of8 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.c;
        return new of8(e5f.a(t7kVar, jSONObject, PListParser.TAG_KEY, ox8Var), (wx9) etn.U(t7kVar, jSONObject, Constants.KEY_VALUE, this.a.F9), e5f.b(t7kVar, jSONObject, "variable_name", ox8Var, bcx.i, bcx.h));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, of8 of8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, PListParser.TAG_KEY, of8Var.a);
        etn.l0(t7kVar, jSONObject, "type", "dict_set_value");
        etn.m0(t7kVar, jSONObject, Constants.KEY_VALUE, of8Var.b, this.a.F9);
        e5f.g(t7kVar, jSONObject, "variable_name", of8Var.c);
        return jSONObject;
    }
}
