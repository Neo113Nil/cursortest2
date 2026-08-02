package defpackage;

import androidx.compose.foundation.layout.c;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class wmr extends uif implements pyc {
    public final /* synthetic */ bnq r;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ fs1 t;
    public final /* synthetic */ String u;
    public final /* synthetic */ g40 v;
    public final /* synthetic */ jd6 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ m85 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmr(bnq bnqVar, wn5 wn5Var, fs1 fs1Var, String str, g40 g40Var, jd6 jd6Var, float f, m85 m85Var) {
        super(3);
        this.r = bnqVar;
        this.s = wn5Var;
        this.t = fs1Var;
        this.u = str;
        this.v = g40Var;
        this.w = jd6Var;
        this.x = f;
        this.y = m85Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 14) == 0) {
            intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            oq5 oq5Var = (oq5) hq5Var;
            if (oq5Var.z()) {
                oq5Var.S();
                return Unit.a;
            }
        }
        ka6 ka6Var = (ka6) this.r;
        long j = cVar.b;
        xdr xdrVar = ka6Var.a;
        ga6 ga6Var = new ga6(j);
        xdrVar.getClass();
        xdrVar.m(null, ga6Var);
        this.s.invoke(new zkn(cVar, this.t, this.u, this.v, this.w, this.x, this.y), hq5Var, 0);
        return Unit.a;
    }
}
