package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wb9 implements gip, py7 {
    public final t6f a;

    public wb9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [c9c] */
    /* JADX WARN: Type inference failed for: r8v1, types: [c9c] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        bc9 bc9Var = d7fVar instanceof bc9 ? (bc9) d7fVar : null;
        if (bc9Var != null) {
            if (bc9Var instanceof ac9) {
                b0 = "percentage";
            } else if (bc9Var instanceof yb9) {
                b0 = "fixed";
            } else {
                if (!(bc9Var instanceof zb9)) {
                    b6e.s();
                    return null;
                }
                b0 = "wrap_content";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && b0.equals("wrap_content")) {
                    z99 z99Var = (z99) t6fVar.u5.getValue();
                    z99Var.getClass();
                    return new zb9(new ba9());
                }
            } else if (b0.equals("fixed")) {
                i99 i99Var = (i99) t6fVar.l5.getValue();
                k99 k99Var = (k99) (bc9Var != null ? bc9Var.a() : null);
                i99Var.getClass();
                return new yb9(new k99(y2x.H(y1g.Y(t7kVar), jSONObject, "neighbour_page_width", t7kVar.d(), k99Var != null ? k99Var.a : null, i99Var.a.G3)));
            }
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = jSONObject;
            if (b0.equals("percentage")) {
                ea9 ea9Var = (ea9) t6fVar.x5.getValue();
                ga9 ga9Var = (ga9) (bc9Var != null ? bc9Var.a() : null);
                ea9Var.getClass();
                return new ac9(new ga9(y2x.H(y1g.Y(t7kVar), jSONObject2, "page_width", t7kVar.d(), ga9Var != null ? ga9Var.a : null, ea9Var.a.U5)));
            }
        }
        throw a8k.l(jSONObject2, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bc9 bc9Var) {
        boolean z = bc9Var instanceof ac9;
        t6f t6fVar = this.a;
        if (z) {
            return ((ea9) t6fVar.x5.getValue()).b(t7kVar, ((ac9) bc9Var).a);
        }
        if (bc9Var instanceof yb9) {
            return ((i99) t6fVar.l5.getValue()).b(t7kVar, ((yb9) bc9Var).a);
        }
        if (!(bc9Var instanceof zb9)) {
            b6e.s();
            return null;
        }
        ((z99) t6fVar.u5.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
