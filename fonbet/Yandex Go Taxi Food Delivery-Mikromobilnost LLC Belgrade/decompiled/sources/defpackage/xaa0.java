package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import com.yandex.plus.pay.ui.core.mobile.view.payment.methods.PlusPayPaymentMethodsView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class xaa0 extends x0 {
    public static final /* synthetic */ kgx[] O;
    public final led0 N;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("paymentMethodsView", 0, "getPaymentMethodsView()Lcom/yandex/plus/pay/ui/core/mobile/view/payment/methods/PlusPayPaymentMethodsView;", xaa0.class);
        qoi0.a.getClass();
        O = new kgx[]{propertyReference1Impl};
    }

    public xaa0(View view, PlusTheme plusTheme, b5d0 b5d0Var, tls tlsVar, tls tlsVar2) {
        super(view);
        int i = z9h0.payment_methods_view;
        kgx kgxVar = O[0];
        try {
            View findViewById = view.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.mobile.view.payment.methods.PlusPayPaymentMethodsView");
            }
            this.N = new led0(plusTheme, (PlusPayPaymentMethodsView) findViewById, b5d0Var, new gv40(6, tlsVar), new gv40(7, tlsVar2));
        } catch (ClassCastException e) {
            dy31.f(kgxVar, e);
            throw null;
        }
    }
}
