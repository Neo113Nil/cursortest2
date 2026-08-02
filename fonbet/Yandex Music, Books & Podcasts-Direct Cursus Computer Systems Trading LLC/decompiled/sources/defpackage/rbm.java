package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class rbm implements bcj {
    public final /* synthetic */ ce5 a;
    public final gcm b;
    public final qbj c;
    public final mt d;
    public final tmb e;
    public final xdr f;

    public rbm(gcm gcmVar, qbj qbjVar, rbj rbjVar, mt mtVar, tmb tmbVar, rmb rmbVar, mxs mxsVar) {
        gcmVar.getClass();
        qbjVar.getClass();
        tmbVar.getClass();
        this.a = new ce5(gcmVar, qbjVar, rbjVar, mtVar.a, mtVar.c, tmbVar, rmbVar);
        this.b = gcmVar;
        this.c = qbjVar;
        this.d = mtVar;
        this.e = tmbVar;
        this.f = ydr.a(mxsVar);
    }

    public static void b(rbm rbmVar, String str, boolean z, nab nabVar, thj thjVar, u0s u0sVar) {
        rbmVar.getClass();
        str.getClass();
        nabVar.getClass();
        thjVar.getClass();
        rmb a = rbmVar.e.a(nabVar, u0sVar);
        if (z) {
            a.l(null, thjVar, str);
        } else {
            a.f(thjVar, null);
        }
    }

    @Override // defpackage.bcj
    public final ydj a(mqs mqsVar, int i, u0s u0sVar, jab jabVar, thj thjVar, Context context, mm6 mm6Var, boolean z) {
        mqsVar.getClass();
        context.getClass();
        mm6Var.getClass();
        return this.a.a(mqsVar, i, u0sVar, jabVar, thjVar, context, mm6Var, z);
    }
}
