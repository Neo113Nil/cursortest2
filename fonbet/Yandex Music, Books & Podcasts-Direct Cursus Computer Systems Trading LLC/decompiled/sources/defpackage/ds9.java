package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ds9 implements gip, py7 {
    public final t6f a;

    public ds9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("solid");
        t6f t6fVar = this.a;
        if (equals) {
            ((yl9) t6fVar.F7.getValue()).getClass();
            return new bs9(yl9.c(t7kVar, jSONObject));
        }
        if (b0.equals("cloud")) {
            return new as9(((gr8) t6fVar.j2.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        is9 is9Var = t instanceof is9 ? (is9) t : null;
        if (is9Var != null) {
            return ((fs9) t6fVar.x8.getValue()).a(t7kVar, is9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, cs9 cs9Var) {
        boolean z = cs9Var instanceof bs9;
        t6f t6fVar = this.a;
        if (z) {
            yl9 yl9Var = (yl9) t6fVar.F7.getValue();
            xl9 xl9Var = ((bs9) cs9Var).b;
            yl9Var.getClass();
            return yl9.d(t7kVar, xl9Var);
        }
        if (cs9Var instanceof as9) {
            return ((gr8) t6fVar.j2.getValue()).b(t7kVar, ((as9) cs9Var).b);
        }
        b6e.s();
        return null;
    }
}
