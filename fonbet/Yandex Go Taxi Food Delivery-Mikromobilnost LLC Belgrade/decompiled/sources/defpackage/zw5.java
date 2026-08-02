package defpackage;

import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;

/* loaded from: classes2.dex */
public final /* synthetic */ class zw5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ zw5(bx5 bx5Var, String str, int i) {
        this.a = i;
        this.b = bx5Var;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        String str = this.c;
        bx5 bx5Var = this.b;
        switch (i) {
            case 0:
                nhj nhjVar = bx5Var.g;
                return hg91.a("check_binding_payment", nhjVar.b, new khj(nhjVar, new wgb(str), i2));
            case 1:
                nhj nhjVar2 = bx5Var.g;
                return hg91.a("check_binding_payment", nhjVar2.b, new khj(nhjVar2, new wgb(str), i2));
            default:
                qs20 qs20Var = bx5Var.f;
                return qs20Var.a.f(new tv5(str, 3), new rv10(23), NetworkServiceRetryingStrategy.noRetry);
        }
    }
}
