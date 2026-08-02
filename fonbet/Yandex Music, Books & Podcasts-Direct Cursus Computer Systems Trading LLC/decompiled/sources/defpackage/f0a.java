package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f0a implements gip, r8s {
    public final t6f a;

    public f0a(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        ns9 ns9Var = bcx.h;
        return new j0a(y2x.P(Y, jSONObject, "bitrate", ox8Var, d, null, kzjVar, ns9Var), y2x.J(Y, jSONObject, "mime_type", vct.c, d, null), y2x.N(Y, jSONObject, "resolution", d, null, this.a.P9), y2x.K(Y, jSONObject, "url", vct.e, d, null, kzj.C, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, j0a j0aVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "bitrate", j0aVar.a);
        y2x.f0(t7kVar, jSONObject, "mime_type", j0aVar.b);
        y2x.i0(t7kVar, jSONObject, "resolution", j0aVar.c, this.a.P9);
        etn.l0(t7kVar, jSONObject, "type", "video_source");
        y2x.e0(j0aVar.d, t7kVar, "url", kzj.H, jSONObject);
        return jSONObject;
    }
}
