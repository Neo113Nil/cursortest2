package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class yqh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ arh b;

    public /* synthetic */ yqh(arh arhVar, int i) {
        this.a = i;
        this.b = arhVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        arh arhVar = this.b;
        switch (i) {
            case 0:
                urk0 urk0Var = (urk0) npb1.c(arhVar, fsk0.a);
                ac2 ac2Var = arhVar.A;
                if (urk0Var == null) {
                    if (ac2Var != null) {
                        arhVar.F0(ac2Var);
                    }
                    arhVar.A = null;
                } else if (ac2Var == null) {
                    ikf ikfVar = new ikf(3, arhVar);
                    yqh yqhVar = new yqh(arhVar, 1);
                    h8w h8wVar = arhVar.w;
                    boolean z = arhVar.x;
                    float f = arhVar.y;
                    ck11 ck11Var = dsk0.a;
                    ac2 ac2Var2 = new ac2(h8wVar, z, f, ikfVar, yqhVar);
                    arhVar.E0(ac2Var2);
                    arhVar.A = ac2Var2;
                }
                return zy11.a;
            default:
                return hq91.a;
        }
    }
}
