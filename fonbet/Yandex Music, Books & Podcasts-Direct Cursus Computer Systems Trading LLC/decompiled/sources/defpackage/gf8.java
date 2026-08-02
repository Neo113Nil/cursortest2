package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gf8 implements gip, r8s {
    public final t6f a;

    public gf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new if8(y2x.H(y1g.Y(t7kVar), jSONObject, "content", t7kVar.d(), null, this.a.d0));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, if8 if8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.i0(t7kVar, jSONObject, "content", if8Var.a, this.a.d0);
        etn.l0(t7kVar, jSONObject, "type", "copy_to_clipboard");
        return jSONObject;
    }
}
