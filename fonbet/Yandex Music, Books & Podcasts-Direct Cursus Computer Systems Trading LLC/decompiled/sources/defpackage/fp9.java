package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fp9 implements gip, py7 {
    public final t6f a;

    public fp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        return new ro9((jc8) etn.O(t7kVar, jSONObject, "div", t6fVar.aa), e5f.b(t7kVar, jSONObject, "title", vct.c, bcx.i, bcx.h), (bd8) etn.U(t7kVar, jSONObject, "title_click_action", t6fVar.t1));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ro9 ro9Var) {
        JSONObject jSONObject = new JSONObject();
        jc8 jc8Var = ro9Var.a;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "div", jc8Var, t6fVar.aa);
        e5f.g(t7kVar, jSONObject, "title", ro9Var.b);
        etn.m0(t7kVar, jSONObject, "title_click_action", ro9Var.c, t6fVar.t1);
        return jSONObject;
    }
}
