package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gh8 implements u8s {
    public final t6f a;

    public gh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dh8 a(t7k t7kVar, mh8 mh8Var, JSONObject jSONObject) {
        kzj kzjVar = kzj.F;
        boolean z = mh8Var instanceof kh8;
        t6f t6fVar = this.a;
        if (z) {
            jnj jnjVar = (jnj) t6fVar.Aa.getValue();
            knj knjVar = ((kh8) mh8Var).a;
            jnjVar.getClass();
            return new bh8(new gnj(h4a.H(t7kVar, knjVar.a, jSONObject, Constants.KEY_VALUE, vct.b, kzjVar, x97.k)));
        }
        if (mh8Var instanceof ih8) {
            uie uieVar = (uie) t6fVar.ia.getValue();
            vie vieVar = ((ih8) mh8Var).a;
            uieVar.getClass();
            return new zg8(new rie(h4a.H(t7kVar, vieVar.a, jSONObject, Constants.KEY_VALUE, vct.b, kzjVar, n7w.g)));
        }
        if (mh8Var instanceof lh8) {
            ((sbr) t6fVar.Ga.getValue()).getClass();
            return new ch8(new pbr());
        }
        if (mh8Var instanceof hh8) {
            ((e7b) t6fVar.fa.getValue()).getClass();
            return new yg8(new b7b());
        }
        if (!(mh8Var instanceof jh8)) {
            b6e.s();
            return null;
        }
        fze fzeVar = (fze) t6fVar.ra.getValue();
        gze gzeVar = ((jh8) mh8Var).a;
        fzeVar.getClass();
        return new ah8(new cze(h4a.F(t7kVar, gzeVar.a, jSONObject, Constants.KEY_VALUE, vct.c)));
    }
}
