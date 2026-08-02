package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final class zeq0 implements jc8 {
    public final /* synthetic */ afq0 a;

    public zeq0(afq0 afq0Var) {
        this.a = afq0Var;
    }

    @Override // defpackage.jc8
    public final boolean a(PaymentMethod.Card card) {
        uv90 uv90Var = this.a.G;
        if (uv90Var != null) {
            return ((wga0) uv90Var).h(card.getId());
        }
        return false;
    }
}
