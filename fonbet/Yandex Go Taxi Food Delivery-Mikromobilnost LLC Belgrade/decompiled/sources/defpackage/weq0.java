package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final /* synthetic */ class weq0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ afq0 b;

    public /* synthetic */ weq0(afq0 afq0Var, int i) {
        this.a = i;
        this.b = afq0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        afq0 afq0Var = this.b;
        switch (i) {
            case 0:
                vv90 vv90Var = (vv90) obj;
                kcq0 kcq0Var = afq0Var.I;
                if (kcq0Var == null) {
                    kcq0Var = null;
                }
                rnf rnfVar = kcq0Var.w;
                if (rnfVar != null) {
                    rnfVar.setPaymentApi(vv90Var);
                    rnfVar.provideCvn();
                    break;
                }
                break;
            default:
                afq0Var.Y((PaymentMethod) obj, true);
                break;
        }
        return zy11Var;
    }
}
