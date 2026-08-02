package defpackage;

import com.connectsdk.service.airplay.PListParser;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ez8 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.c;
        uw8 uw8Var = gz8.b;
        s3f s3fVar = bcx.i;
        szb b = e5f.b(t7kVar, jSONObject, PListParser.TAG_KEY, ox8Var, s3fVar, uw8Var);
        uw8 uw8Var2 = gz8.c;
        qzb qzbVar = gz8.a;
        szb e = e5f.e(t7kVar, jSONObject, "placeholder", ox8Var, s3fVar, uw8Var2, qzbVar);
        if (e == null) {
            e = qzbVar;
        }
        return new yy8(b, e, e5f.e(t7kVar, jSONObject, "regex", ox8Var, s3fVar, bcx.h, null));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        yy8 yy8Var = (yy8) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, PListParser.TAG_KEY, yy8Var.a);
        e5f.g(t7kVar, jSONObject, "placeholder", yy8Var.b);
        e5f.g(t7kVar, jSONObject, "regex", yy8Var.c);
        return jSONObject;
    }
}
