package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rf8 implements u8s {
    public final t6f a;

    public rf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final of8 a(t7k t7kVar, sf8 sf8Var, JSONObject jSONObject) {
        c9c c9cVar = sf8Var.a;
        ox8 ox8Var = vct.c;
        szb F = h4a.F(t7kVar, c9cVar, jSONObject, PListParser.TAG_KEY, ox8Var);
        c9c c9cVar2 = sf8Var.b;
        t6f t6fVar = this.a;
        return new of8(F, (wx9) h4a.K(t7kVar, c9cVar2, jSONObject, Constants.KEY_VALUE, t6fVar.H9, t6fVar.F9), h4a.F(t7kVar, sf8Var.c, jSONObject, "variable_name", ox8Var));
    }
}
