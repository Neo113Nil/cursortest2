package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ki8 implements gip, py7 {
    public final t6f a;

    public ki8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ji8 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        return new ji8(e5f.b(t7kVar, jSONObject, "lifetime", ox8Var, kzjVar, ns9Var), e5f.b(t7kVar, jSONObject, "name", vct.c, bcx.i, ns9Var), e5f.e(t7kVar, jSONObject, "scope", ni8.a, va8.F, ns9Var, null), (wx9) etn.O(t7kVar, jSONObject, Constants.KEY_VALUE, this.a.F9));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ji8 ji8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "lifetime", ji8Var.a);
        e5f.g(t7kVar, jSONObject, "name", ji8Var.b);
        szb szbVar = ji8Var.c;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("scope", b);
                } else {
                    jSONObject.put("scope", ((ii8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "set_stored_value");
        etn.m0(t7kVar, jSONObject, Constants.KEY_VALUE, ji8Var.d, this.a.F9);
        return jSONObject;
    }
}
