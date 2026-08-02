package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e0a implements gip, py7 {
    public final t6f a;

    public e0a(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        szb d = e5f.d(t7kVar, jSONObject, "bitrate", vct.b, kzj.F);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        return new c0a(d, e5f.b(t7kVar, jSONObject, "mime_type", ox8Var, s3fVar, ns9Var), (b0a) etn.U(t7kVar, jSONObject, "resolution", this.a.O9), e5f.b(t7kVar, jSONObject, "url", vct.e, kzj.C, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, c0a c0aVar) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "bitrate", c0aVar.a);
        e5f.g(t7kVar, jSONObject, "mime_type", c0aVar.b);
        etn.m0(t7kVar, jSONObject, "resolution", c0aVar.c, this.a.O9);
        etn.l0(t7kVar, jSONObject, "type", "video_source");
        szb szbVar = c0aVar.d;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put("url", b);
                return jSONObject;
            }
            jSONObject.put("url", ((Uri) b).toString());
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }
}
