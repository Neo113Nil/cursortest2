package defpackage;

import androidx.compose.foundation.text.g;

/* loaded from: classes10.dex */
public final /* synthetic */ class qe5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ qe5(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        cry0 cry0Var;
        int i = this.a;
        int i2 = 2;
        g gVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(gVar != null ? ((Boolean) new qe5(gVar, i2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(gVar != null ? ((Boolean) new qe5(gVar, i2).invoke()).booleanValue() : false);
            default:
                kk2 kk2Var = gVar.b;
                dry0 dry0Var = (dry0) gVar.a.getValue();
                return Boolean.valueOf(jl40.l(kk2Var, (dry0Var == null || (cry0Var = dry0Var.a) == null) ? null : cry0Var.a));
        }
    }
}
