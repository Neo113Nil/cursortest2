package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xb9 implements u8s {
    public final t6f a;

    public xb9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ub9 a(t7k t7kVar, bc9 bc9Var, JSONObject jSONObject) {
        boolean z = bc9Var instanceof ac9;
        t6f t6fVar = this.a;
        if (z) {
            fa9 fa9Var = (fa9) t6fVar.y5.getValue();
            ga9 ga9Var = ((ac9) bc9Var).a;
            fa9Var.getClass();
            c9c c9cVar = ga9Var.a;
            t6f t6fVar2 = fa9Var.a;
            return new tb9(new ca9((hd9) h4a.D(t7kVar, c9cVar, jSONObject, "page_width", t6fVar2.V5, t6fVar2.T5)));
        }
        if (!(bc9Var instanceof yb9)) {
            if (bc9Var instanceof zb9) {
                ((aa9) t6fVar.v5.getValue()).getClass();
                return new sb9(new x99());
            }
            b6e.s();
            return null;
        }
        j99 j99Var = (j99) t6fVar.m5.getValue();
        k99 k99Var = ((yb9) bc9Var).a;
        j99Var.getClass();
        c9c c9cVar2 = k99Var.a;
        t6f t6fVar3 = j99Var.a;
        return new rb9(new g99((jz8) h4a.D(t7kVar, c9cVar2, jSONObject, "neighbour_page_width", t6fVar3.H3, t6fVar3.F3)));
    }
}
