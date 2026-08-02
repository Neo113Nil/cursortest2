package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class af8 implements gip, py7 {
    public final t6f a;

    public af8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object df8Var;
        d7f d7fVar;
        d7f d7fVar2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar3 = t7kVar.b().get(b0);
        d7f d7fVar4 = null;
        ef8 ef8Var = d7fVar3 instanceof ef8 ? (ef8) d7fVar3 : null;
        if (ef8Var != null) {
            if (ef8Var instanceof cf8) {
                b0 = "text";
            } else {
                if (!(ef8Var instanceof df8)) {
                    b6e.s();
                    return null;
                }
                b0 = "url";
            }
        }
        boolean equals = b0.equals("text");
        t6f t6fVar = this.a;
        if (equals) {
            wd6 wd6Var = (wd6) t6fVar.t.getValue();
            if (ef8Var == null) {
                d7fVar2 = null;
            } else if (ef8Var instanceof cf8) {
                d7fVar2 = ((cf8) ef8Var).a;
            } else {
                if (!(ef8Var instanceof df8)) {
                    b6e.s();
                    return null;
                }
                d7fVar2 = ((df8) ef8Var).a;
            }
            yd6 yd6Var = (yd6) d7fVar2;
            wd6Var.getClass();
            df8Var = new cf8(new yd6(y2x.J(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.c, t7kVar.d(), yd6Var != null ? yd6Var.a : null)));
            return df8Var;
        }
        if (!b0.equals("url")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        ie6 ie6Var = (ie6) t6fVar.w.getValue();
        if (ef8Var != null) {
            if (ef8Var instanceof cf8) {
                d7fVar = ((cf8) ef8Var).a;
            } else {
                if (!(ef8Var instanceof df8)) {
                    b6e.s();
                    return null;
                }
                d7fVar = ((df8) ef8Var).a;
            }
            d7fVar4 = d7fVar;
        }
        ie6Var.getClass();
        df8Var = new df8(ie6.c(t7kVar, (ke6) d7fVar4, jSONObject));
        return df8Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ef8 ef8Var) {
        boolean z = ef8Var instanceof cf8;
        t6f t6fVar = this.a;
        if (z) {
            wd6 wd6Var = (wd6) t6fVar.t.getValue();
            yd6 yd6Var = ((cf8) ef8Var).a;
            wd6Var.getClass();
            return wd6.c(t7kVar, yd6Var);
        }
        if (!(ef8Var instanceof df8)) {
            b6e.s();
            return null;
        }
        ie6 ie6Var = (ie6) t6fVar.w.getValue();
        ke6 ke6Var = ((df8) ef8Var).a;
        ie6Var.getClass();
        return ie6.d(t7kVar, ke6Var);
    }
}
