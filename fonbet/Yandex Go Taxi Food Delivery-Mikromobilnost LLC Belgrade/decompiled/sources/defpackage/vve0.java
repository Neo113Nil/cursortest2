package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final class vve0 implements ryj0 {
    public final /* synthetic */ wve0 a;

    public vve0(wve0 wve0Var) {
        this.a = wve0Var;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        this.a.B.l(new lve0(true, (PaymentKitError) obj));
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        ((wga0) ((uv90) obj)).f(PaymentMethod.NewCard.INSTANCE, null, new sue0(1, this.a));
    }
}
