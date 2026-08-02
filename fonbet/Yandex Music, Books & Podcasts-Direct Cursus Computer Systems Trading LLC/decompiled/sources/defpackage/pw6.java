package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class pw6 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pu0 b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ sai d;

    public /* synthetic */ pw6(pu0 pu0Var, wn5 wn5Var, sai saiVar, int i) {
        this.a = i;
        this.b = pu0Var;
        this.c = wn5Var;
        this.d = saiVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        bci bciVar = (bci) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                bciVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                jf0.a(new qzm[0], this.b, false, ild.C(482585934, new qw6(this.c, this.d, bciVar), hq5Var), hq5Var, 0, 4);
            default:
                bciVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= (intValue & 8) == 0 ? ((oq5) hq5Var).f(bciVar) : ((oq5) hq5Var).h(bciVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                jf0.a(new qzm[0], this.b, false, ild.C(-499632311, new qw6(bciVar, this.c, this.d), hq5Var), hq5Var, 0, 4);
        }
        return Unit.a;
    }
}
