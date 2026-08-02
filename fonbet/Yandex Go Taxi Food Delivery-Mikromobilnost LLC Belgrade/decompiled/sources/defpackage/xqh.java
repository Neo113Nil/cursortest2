package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class xqh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ arh b;

    public /* synthetic */ xqh(arh arhVar, int i) {
        this.a = i;
        this.b = arhVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        rrk0 rrk0Var;
        int i = this.a;
        arh arhVar = this.b;
        switch (i) {
            case 0:
                trk0 trk0Var = (trk0) npb1.c(arhVar, esk0.a);
                ac2 ac2Var = arhVar.A;
                if (trk0Var == null) {
                    if (ac2Var != null) {
                        arhVar.F0(ac2Var);
                    }
                    arhVar.A = null;
                } else if (ac2Var == null) {
                    ikf ikfVar = new ikf(2, arhVar);
                    xqh xqhVar = new xqh(arhVar, 1);
                    h8w h8wVar = arhVar.w;
                    boolean z = arhVar.x;
                    float f = arhVar.y;
                    ck11 ck11Var = dsk0.a;
                    ac2 ac2Var2 = new ac2(h8wVar, z, f, ikfVar, xqhVar);
                    arhVar.E0(ac2Var2);
                    arhVar.A = ac2Var2;
                }
                return zy11.a;
            default:
                trk0 trk0Var2 = (trk0) npb1.c(arhVar, esk0.a);
                return (trk0Var2 == null || (rrk0Var = trk0Var2.b) == null) ? mq91.a : rrk0Var;
        }
    }
}
