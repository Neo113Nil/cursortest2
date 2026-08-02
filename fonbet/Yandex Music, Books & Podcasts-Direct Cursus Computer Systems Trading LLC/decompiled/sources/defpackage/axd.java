package defpackage;

import androidx.compose.foundation.layout.d;

/* loaded from: classes.dex */
public final class axd extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ ges t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axd(ges gesVar, int i, int i2) {
        super(3);
        this.r = i;
        this.s = i2;
        this.t = gesVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        oq5 oq5Var = (oq5) ((hq5) obj2);
        oq5Var.Z(408240218);
        int i = this.r;
        int i2 = this.s;
        fgq.J(i, i2);
        vci vciVar = vci.a;
        if (i == 1 && i2 == Integer.MAX_VALUE) {
            oq5Var.p(false);
            return vciVar;
        }
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        ppc ppcVar = (ppc) oq5Var.j(es5.k);
        xof xofVar = (xof) oq5Var.j(es5.n);
        ges gesVar = this.t;
        boolean f = oq5Var.f(gesVar) | oq5Var.f(xofVar);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (f || K == kjnVar) {
            K = u7g.T(gesVar, xofVar);
            oq5Var.k0(K);
        }
        ges gesVar2 = (ges) K;
        boolean f2 = oq5Var.f(ppcVar) | oq5Var.f(gesVar2);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            c4r c4rVar = gesVar2.a;
            qpc qpcVar = c4rVar.f;
            tqc tqcVar = c4rVar.c;
            if (tqcVar == null) {
                tqcVar = tqc.m;
            }
            oqc oqcVar = c4rVar.d;
            int i3 = oqcVar != null ? oqcVar.a : 0;
            pqc pqcVar = c4rVar.e;
            K2 = ((rpc) ppcVar).b(qpcVar, tqcVar, i3, pqcVar != null ? pqcVar.a : 65535);
            oq5Var.k0(K2);
        }
        sdr sdrVar = (sdr) K2;
        boolean f3 = oq5Var.f(sdrVar.getValue()) | oq5Var.f(jx7Var) | oq5Var.f(ppcVar) | oq5Var.f(gesVar) | oq5Var.f(xofVar);
        Object K3 = oq5Var.K();
        if (f3 || K3 == kjnVar) {
            K3 = Integer.valueOf((int) (vas.a(gesVar2, jx7Var, ppcVar, vas.a, 1) & 4294967295L));
            oq5Var.k0(K3);
        }
        int intValue = ((Number) K3).intValue();
        boolean f4 = oq5Var.f(sdrVar.getValue()) | oq5Var.f(jx7Var) | oq5Var.f(ppcVar) | oq5Var.f(gesVar) | oq5Var.f(xofVar);
        Object K4 = oq5Var.K();
        if (f4 || K4 == kjnVar) {
            StringBuilder sb = new StringBuilder();
            String str = vas.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            K4 = Integer.valueOf((int) (vas.a(gesVar2, jx7Var, ppcVar, sb.toString(), 2) & 4294967295L));
            oq5Var.k0(K4);
        }
        int intValue2 = ((Number) K4).intValue() - intValue;
        Integer valueOf = i == 1 ? null : Integer.valueOf(((i - 1) * intValue2) + intValue);
        Integer valueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(((i2 - 1) * intValue2) + intValue) : null;
        yci f5 = d.f(vciVar, valueOf != null ? jx7Var.c0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? jx7Var.c0(valueOf2.intValue()) : Float.NaN);
        oq5Var.p(false);
        return f5;
    }
}
