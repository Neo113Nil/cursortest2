package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n1a implements gip, py7 {
    public final t6f a;

    public n1a(t6f t6fVar) {
        this.a = t6fVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.py7
    public final java.lang.Object a(defpackage.t7k r21, org.json.JSONObject r22) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1a.a(t7k, org.json.JSONObject):java.lang.Object");
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, l1a l1aVar) {
        JSONObject jSONObject = new JSONObject();
        zw8 zw8Var = l1aVar.a;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "download_callbacks", zw8Var, t6fVar.b3);
        e5f.g(t7kVar, jSONObject, "is_enabled", l1aVar.b);
        e5f.g(t7kVar, jSONObject, "log_id", l1aVar.c);
        e5f.g(t7kVar, jSONObject, "log_limit", l1aVar.d);
        etn.l0(t7kVar, jSONObject, "payload", l1aVar.e);
        szb szbVar = l1aVar.f;
        kzj kzjVar = kzj.H;
        e5f.h(t7kVar, jSONObject, "referer", szbVar, kzjVar);
        etn.l0(t7kVar, jSONObject, "scope_id", l1aVar.g);
        etn.m0(t7kVar, jSONObject, "typed", l1aVar.h, t6fVar.k1);
        e5f.h(t7kVar, jSONObject, "url", l1aVar.i, kzjVar);
        e5f.g(t7kVar, jSONObject, "visibility_duration", l1aVar.j);
        e5f.g(t7kVar, jSONObject, "visibility_percentage", l1aVar.k);
        return jSONObject;
    }
}
