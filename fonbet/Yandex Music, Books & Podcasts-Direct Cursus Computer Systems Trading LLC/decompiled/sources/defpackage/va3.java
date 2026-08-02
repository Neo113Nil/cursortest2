package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class va3 implements bcj {
    public final /* synthetic */ ce5 a;
    public final ob3 b;
    public final qbj c;
    public final rbj d;
    public final mt e;
    public final tmb f;
    public final rmb g;
    public final thj h;
    public final fkn i;
    public final boolean j;

    public va3(ob3 ob3Var, qbj qbjVar, rbj rbjVar, mt mtVar, tmb tmbVar, rmb rmbVar) {
        boolean M;
        ob3Var.getClass();
        qbjVar.getClass();
        tmbVar.getClass();
        this.a = new ce5(ob3Var, qbjVar, rbjVar, mtVar.a, mtVar.c, tmbVar, rmbVar);
        this.b = ob3Var;
        this.c = qbjVar;
        this.d = rbjVar;
        this.e = mtVar;
        this.f = tmbVar;
        this.g = rmbVar;
        oq oqVar = mtVar.a;
        oqVar.getClass();
        this.h = c3x.w(lxe.B(oqVar), 0, 0);
        this.i = ob3Var.L;
        oq oqVar2 = mtVar.a;
        oqVar2.getClass();
        Boolean bool = ob3Var.X;
        if (bool != null) {
            M = bool.booleanValue();
        } else {
            l18 l18Var = l18.b;
            bdt I = hag.I(xbj.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            M = u2x.M(oqVar2.j);
            ob3Var.X = Boolean.valueOf(M);
        }
        this.j = M;
    }

    @Override // defpackage.bcj
    public final ydj a(mqs mqsVar, int i, u0s u0sVar, jab jabVar, thj thjVar, Context context, mm6 mm6Var, boolean z) {
        mqsVar.getClass();
        context.getClass();
        mm6Var.getClass();
        return this.a.a(mqsVar, i, u0sVar, jabVar, thjVar, context, mm6Var, z);
    }

    public final void b(nab nabVar, thj thjVar, u0s u0sVar, String str, boolean z) {
        str.getClass();
        nabVar.getClass();
        rmb a = this.f.a(nabVar, u0sVar);
        if (z) {
            a.l(null, thjVar, str);
        } else {
            a.f(thjVar, null);
        }
    }
}
