package defpackage;

import com.yandex.go.payments.api.model.PaymentsScreen;

/* loaded from: classes8.dex */
public final class vba0 {
    public final PaymentsScreen a;
    public final dca0 b;
    public final wma0 c;
    public final tpr d;
    public final uj4 e;
    public final lv90 f;

    public vba0(PaymentsScreen paymentsScreen, dca0 dca0Var, wma0 wma0Var, tpr tprVar, String str, uj4 uj4Var, lv90 lv90Var, int i) {
        tprVar = (i & 8) != 0 ? new g92(2, d4m.a) : tprVar;
        lv90Var = (i & 64) != 0 ? null : lv90Var;
        this.a = paymentsScreen;
        this.b = dca0Var;
        this.c = wma0Var;
        this.d = tprVar;
        this.e = uj4Var;
        this.f = lv90Var;
    }
}
