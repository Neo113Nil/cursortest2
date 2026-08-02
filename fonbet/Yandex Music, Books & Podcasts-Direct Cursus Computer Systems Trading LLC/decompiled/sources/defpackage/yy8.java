package defpackage;

import com.connectsdk.service.airplay.PListParser;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yy8 implements u1f {
    public final szb a;
    public final szb b;
    public final szb c;
    public Integer d;

    public yy8(szb szbVar, szb szbVar2, szb szbVar3) {
        this.a = szbVar;
        this.b = szbVar2;
        this.c = szbVar3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        ez8 ez8Var = (ez8) rj3.b.C3.getValue();
        pt0 pt0Var = rj3.a;
        ez8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        e5f.g(pt0Var, jSONObject, PListParser.TAG_KEY, this.a);
        e5f.g(pt0Var, jSONObject, "placeholder", this.b);
        e5f.g(pt0Var, jSONObject, "regex", this.c);
        return jSONObject;
    }
}
