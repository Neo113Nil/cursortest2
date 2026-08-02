package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class fyq implements lke {
    public final zxq a;
    public final dyq b;
    public final lm4 c;
    public final List d;

    public fyq(zxq zxqVar, dyq dyqVar) {
        zxqVar.getClass();
        dyqVar.getClass();
        this.a = zxqVar;
        this.b = dyqVar;
        this.c = ern.a(fyq.class);
        this.d = u75.h(vke.a, wke.a);
    }

    @Override // defpackage.lke
    public final void b(int i, hq5 hq5Var) {
        int i2;
        dyq dyqVar = this.b;
        kjn kjnVar = gq5.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1041334113);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kyf kyfVar = kyf.ON_START;
            boolean h = oq5Var.h(this);
            Object K = oq5Var.K();
            if (h || K == kjnVar) {
                K = new eyq(0, this);
                oq5Var.k0(K);
            }
            tyf.b(kyfVar, null, (Function0) K, oq5Var, 6);
            aqi M = gld.M(dyqVar.h, oq5Var);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                pzl pzlVar = this.a.a;
                pzlVar.getClass();
                bdt I = hag.I(dyq.class);
                qdc qdcVar = pzlVar.a;
                qdcVar.getClass();
                K2 = new hyq((dyq) qdcVar.C(I), new euk());
                oq5Var.k0(K2);
            }
            uwf.d((hyq) K2, dyqVar.c && !((Boolean) M.getValue()).booleanValue(), null, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(this, i, 20);
        }
    }

    @Override // defpackage.lke
    public final float c(jx7 jx7Var) {
        jx7Var.getClass();
        return jx7Var.p(v7g.z(34)) + 10 + 4;
    }

    @Override // defpackage.lke
    public final List d() {
        return this.d;
    }

    @Override // defpackage.lke
    public final lm4 g() {
        return this.c;
    }

    @Override // defpackage.lke
    public final String getTag() {
        return "smart_cache_restrictions_informer";
    }

    @Override // defpackage.lke
    public final vdr getVisibility() {
        return (vdr) this.b.l.getValue();
    }

    @Override // defpackage.lke
    public final void e(boolean z) {
    }
}
