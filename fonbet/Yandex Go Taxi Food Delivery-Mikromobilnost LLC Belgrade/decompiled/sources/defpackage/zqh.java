package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class zqh implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ arh b;

    public /* synthetic */ zqh(arh arhVar, int i) {
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
                vrk0 vrk0Var = (vrk0) npb1.c(arhVar, gsk0.a);
                ac2 ac2Var = arhVar.A;
                if (vrk0Var == null) {
                    if (ac2Var != null) {
                        arhVar.F0(ac2Var);
                    }
                    arhVar.A = null;
                } else if (ac2Var == null) {
                    ikf ikfVar = new ikf(4, arhVar);
                    zqh zqhVar = new zqh(arhVar, 1);
                    h8w h8wVar = arhVar.w;
                    boolean z = arhVar.x;
                    float f = arhVar.y;
                    ck11 ck11Var = dsk0.a;
                    ac2 ac2Var2 = new ac2(h8wVar, z, f, ikfVar, zqhVar);
                    arhVar.E0(ac2Var2);
                    arhVar.A = ac2Var2;
                }
                return zy11.a;
            default:
                vrk0 vrk0Var2 = (vrk0) npb1.c(arhVar, gsk0.a);
                if (vrk0Var2 == null || (rrk0Var = vrk0Var2.b) == null) {
                    return ((lic) npb1.c(arhVar, mic.a)).e() ? ((double) rzo.M(((ldc) npb1.c(arhVar, cfe.a)).a)) > 0.5d ? gsk0.d : gsk0.e : gsk0.f;
                }
                return rrk0Var;
        }
    }
}
