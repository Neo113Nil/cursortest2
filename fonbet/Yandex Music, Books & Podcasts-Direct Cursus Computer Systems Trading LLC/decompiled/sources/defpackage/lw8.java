package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lw8 implements u8s {
    public final t6f a;

    public lw8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        c9c c9cVar = ((nw8) d7fVar).a;
        t6f t6fVar = this.a;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar, jSONObject, "space_between_centers", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = mw8.a;
        }
        return new iw8(jz8Var);
    }
}
