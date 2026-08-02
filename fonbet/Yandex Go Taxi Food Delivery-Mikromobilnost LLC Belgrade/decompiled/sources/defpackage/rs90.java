package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public final class rs90 implements ryj0 {
    public final /* synthetic */ y6f0 a;

    public rs90(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        ((x6f0) this.a).d(new hyj0((PaymentKitError) obj));
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        ((x6f0) this.a).d(new kyj0((sm0) obj));
    }
}
