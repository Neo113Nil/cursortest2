package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class cam implements pyc {
    public final /* synthetic */ rbm a;
    public final /* synthetic */ jab b;
    public final /* synthetic */ u0s c;
    public final /* synthetic */ mxs d;

    public cam(rbm rbmVar, jab jabVar, u0s u0sVar, mxs mxsVar) {
        this.a = rbmVar;
        this.b = jabVar;
        this.c = u0sVar;
        this.d = mxsVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        thj thjVar = (thj) obj3;
        str.getClass();
        thjVar.getClass();
        fcc fccVar = this.d.b;
        rbm rbmVar = this.a;
        rbmVar.getClass();
        rmb a = rbmVar.e.a(this.b, this.c);
        if (booleanValue) {
            a.l(fccVar, thjVar, str);
        } else {
            a.f(thjVar, fccVar);
        }
        return Unit.a;
    }
}
