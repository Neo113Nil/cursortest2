package defpackage;

import com.connectsdk.service.airplay.PListParser;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hz8 implements u1f, d7f {
    public final c9c a;
    public final c9c b;
    public final c9c c;

    public hz8(c9c c9cVar, c9c c9cVar2, c9c c9cVar3) {
        this.a = c9cVar;
        this.b = c9cVar2;
        this.c = c9cVar3;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        fz8 fz8Var = (fz8) rj3.b.D3.getValue();
        pt0 pt0Var = rj3.a;
        fz8Var.getClass();
        JSONObject jSONObject = new JSONObject();
        y2x.f0(pt0Var, jSONObject, PListParser.TAG_KEY, this.a);
        y2x.f0(pt0Var, jSONObject, "placeholder", this.b);
        y2x.f0(pt0Var, jSONObject, "regex", this.c);
        return jSONObject;
    }
}
