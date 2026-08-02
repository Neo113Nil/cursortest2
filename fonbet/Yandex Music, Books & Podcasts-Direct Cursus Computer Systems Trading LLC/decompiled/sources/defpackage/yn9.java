package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yn9 implements gip, py7 {
    public final t6f a;

    public yn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object fo9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        ho9 ho9Var = d7fVar instanceof ho9 ? (ho9) d7fVar : null;
        if (ho9Var != null) {
            if (ho9Var instanceof go9) {
                b0 = "solid";
            } else {
                if (!(ho9Var instanceof fo9)) {
                    b6e.s();
                    return null;
                }
                b0 = "dashed";
            }
        }
        boolean equals = b0.equals("solid");
        t6f t6fVar = this.a;
        if (equals) {
            co9 co9Var = (co9) t6fVar.V7.getValue();
            if (ho9Var != null) {
                if (ho9Var instanceof go9) {
                    obj2 = ((go9) ho9Var).a;
                } else {
                    if (!(ho9Var instanceof fo9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((fo9) ho9Var).a;
                }
                obj3 = obj2;
            }
            co9Var.getClass();
            fo9Var = new go9(new eo9());
            return fo9Var;
        }
        if (!b0.equals("dashed")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        un9 un9Var = (un9) t6fVar.S7.getValue();
        if (ho9Var != null) {
            if (ho9Var instanceof go9) {
                obj = ((go9) ho9Var).a;
            } else {
                if (!(ho9Var instanceof fo9)) {
                    b6e.s();
                    return null;
                }
                obj = ((fo9) ho9Var).a;
            }
            obj3 = obj;
        }
        un9Var.getClass();
        fo9Var = new fo9(new wn9());
        return fo9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ho9 ho9Var) {
        boolean z = ho9Var instanceof go9;
        t6f t6fVar = this.a;
        if (z) {
            ((co9) t6fVar.V7.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "solid");
            return jSONObject;
        }
        if (!(ho9Var instanceof fo9)) {
            b6e.s();
            return null;
        }
        ((un9) t6fVar.S7.getValue()).getClass();
        JSONObject jSONObject2 = new JSONObject();
        etn.l0(t7kVar, jSONObject2, "type", "dashed");
        return jSONObject2;
    }
}
