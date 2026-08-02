package defpackage;

import androidx.compose.ui.semantics.f;

/* loaded from: classes14.dex */
public final /* synthetic */ class zc31 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vzu c;

    public /* synthetic */ zc31(int i, vzu vzuVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = vzuVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        vzu vzuVar = this.c;
        int i2 = this.b;
        mnq0 mnq0Var = (mnq0) obj;
        switch (i) {
            case 0:
                f.j(mnq0Var, new hcc(i2, vzuVar.a));
                break;
            default:
                int i3 = vzuVar.a;
                f.k(mnq0Var, new icc(i2 / i3, i2 % i3));
                break;
        }
        return zy11Var;
    }
}
