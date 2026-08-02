package defpackage;

import com.yandex.payment.divkit.select.h;
import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final class wuf implements jc8 {
    public final /* synthetic */ h a;

    public wuf(h hVar) {
        this.a = hVar;
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
