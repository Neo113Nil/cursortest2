package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class yeq0 implements ryj0 {
    public final /* synthetic */ afq0 a;

    public yeq0(afq0 afq0Var) {
        this.a = afq0Var;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        PaymentKitError paymentKitError = (PaymentKitError) obj;
        afq0 afq0Var = this.a;
        if (afq0Var.H) {
            return;
        }
        afq0Var.D.l(new eeq0(paymentKitError));
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        int i;
        ym0 ym0Var = (ym0) obj;
        afq0 afq0Var = this.a;
        if (afq0Var.H) {
            return;
        }
        if (ym0Var instanceof um0) {
            if (xeq0.a[((um0) ym0Var).a.ordinal()] == 1) {
                xry0 xry0Var = yry0.a;
                i = yry0.a.q;
            } else {
                xry0 xry0Var2 = yry0.a;
                i = yry0.a.c;
            }
            this.a.D.l(new jeq0(i));
            return;
        }
        if (ym0Var instanceof vm0) {
            vm0 vm0Var = (vm0) ym0Var;
            afq0Var.F.l(new g4p(vm0Var.a, vm0Var.b));
            return;
        }
        if (ym0Var instanceof tm0) {
            afq0Var.F.l(e4p.a);
            return;
        }
        if (!(ym0Var instanceof wm0)) {
            if (ym0Var.equals(xm0.a)) {
                return;
            }
            w511.b();
        } else {
            PaymentMethod.SbpToken sbpToken = afq0Var.K;
            if (sbpToken != null) {
                afq0Var.C.l(new Pair(((wm0) ym0Var).a, sbpToken));
            }
        }
    }
}
