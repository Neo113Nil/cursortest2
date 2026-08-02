package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class w6t0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6t0 b;

    public /* synthetic */ w6t0(m6t0 m6t0Var, int i) {
        this.a = i;
        this.b = m6t0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m6t0 m6t0Var = this.b;
        switch (i) {
            case 0:
                m6t0Var.R1((String) obj);
                break;
            case 1:
                m6t0Var.E8((m1a0) obj);
                break;
            default:
                m6t0Var.i2((g6t0) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new AdaptedFunctionReference(2, this.b, m6t0.class, "announceForAccessibility", "announceForAccessibility(Ljava/lang/String;)V", 4);
            case 1:
                return new AdaptedFunctionReference(2, this.b, m6t0.class, "renderPaymentInfo", "renderPaymentInfo(Lcom/yandex/go/payments/payment/PaymentInfo;)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, m6t0.class, "renderButton", "renderButton(Lru/yandex/taxi/orderbutton/summary/solid/ui/SolidSummaryButtonModel;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
