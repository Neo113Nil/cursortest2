package defpackage;

import com.connectsdk.service.airplay.PListParser;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fz8 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.c;
        uw8 uw8Var = gz8.b;
        s3f s3fVar = bcx.i;
        return new hz8(y2x.K(Y, jSONObject, PListParser.TAG_KEY, ox8Var, d, null, s3fVar, uw8Var), y2x.P(Y, jSONObject, "placeholder", ox8Var, d, null, s3fVar, gz8.c), y2x.P(Y, jSONObject, "regex", ox8Var, d, null, s3fVar, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        hz8 hz8Var = (hz8) obj;
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, PListParser.TAG_KEY, hz8Var.a);
        y2x.f0(t7kVar, jSONObject, "placeholder", hz8Var.b);
        y2x.f0(t7kVar, jSONObject, "regex", hz8Var.c);
        return jSONObject;
    }
}
