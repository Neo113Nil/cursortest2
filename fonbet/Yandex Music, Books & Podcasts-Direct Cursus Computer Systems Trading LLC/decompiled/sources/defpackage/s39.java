package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s39 implements u8s {
    public final t6f a;

    public s39(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p39 a(t7k t7kVar, v39 v39Var, JSONObject jSONObject) {
        boolean z = v39Var instanceof t39;
        t6f t6fVar = this.a;
        if (!z) {
            if (v39Var instanceof u39) {
                return new o39(((in9) t6fVar.Q7.getValue()).a(t7kVar, ((u39) v39Var).a, jSONObject));
            }
            b6e.s();
            return null;
        }
        lw8 lw8Var = (lw8) t6fVar.U2.getValue();
        nw8 nw8Var = ((t39) v39Var).a;
        lw8Var.getClass();
        c9c c9cVar = nw8Var.a;
        t6f t6fVar2 = lw8Var.a;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar, jSONObject, "space_between_centers", t6fVar2.H3, t6fVar2.F3);
        if (jz8Var == null) {
            jz8Var = mw8.a;
        }
        return new n39(new iw8(jz8Var));
    }
}
