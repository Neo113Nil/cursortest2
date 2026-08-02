package com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout;

import android.view.View;
import com.yandex.plus.pay.ui.core.mobile.view.payment.methods.PlusPayPaymentMethodsView;
import defpackage.ern;
import defpackage.k32;
import defpackage.opn;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class m extends opn {
    public static final /* synthetic */ s9f[] v;
    public final com.yandex.plus.pay.ui.core.mobile.view.payment.methods.d u;

    static {
        yxm yxmVar = new yxm(m.class, "paymentMethodsView", "getPaymentMethodsView()Lcom/yandex/plus/pay/ui/core/mobile/view/payment/methods/PlusPayPaymentMethodsView;", 0);
        ern.a.getClass();
        v = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(View view, com.yandex.plus.ui.core.theme.a aVar, com.yandex.plus.core.imageloader.b bVar, Function1 function1, Function1 function12) {
        super(view);
        aVar.getClass();
        bVar.getClass();
        function1.getClass();
        function12.getClass();
        s9f s9fVar = v[0];
        s9fVar.getClass();
        try {
            View findViewById = view.findViewById(R.id.payment_methods_view);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.payment.methods.PlusPayPaymentMethodsView");
            }
            this.u = new com.yandex.plus.pay.ui.core.mobile.view.payment.methods.d(aVar, (PlusPayPaymentMethodsView) findViewById, bVar, new k32(14, function1), new k32(15, function12));
        } catch (ClassCastException e) {
            com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
            throw null;
        }
    }
}
