package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.model.data.AdditionalSettings;
import com.yandex.payment.sdk.model.data.ResultScreenClosing;
import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;
import com.ybsdk.feature.paymentsdk.api.PaymentSdkEnvironment;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class uia0 implements ria0 {
    @Override // defpackage.ria0
    public final bja0 a(Context context, PaymentSdkEnvironment paymentSdkEnvironment, boolean z, String str, String str2, u290 u290Var, String str3, String str4, String str5, int i) {
        ksi0 a;
        a0a0 a0a0Var = new a0a0();
        a0a0Var.c(context);
        a0a0Var.d(hg91.b(paymentSdkEnvironment));
        a0a0Var.b(z ? ConsoleLoggingMode.ENABLED : ConsoleLoggingMode.DISABLED);
        c0a0 a2 = a0a0Var.a();
        PaymentMethodsFilter paymentMethodsFilter = new PaymentMethodsFilter(true, false, false, false);
        tia0 tia0Var = new tia0(u290Var);
        Payer payer = new Payer(str, null, str2, null, null, null);
        Merchant merchant = new Merchant(str3);
        AdditionalSettings.a aVar = new AdditionalSettings.a();
        aVar.g(paymentMethodsFilter);
        aVar.e();
        aVar.j(new ResultScreenClosing(false, 0L, 1, null));
        aVar.d(str4);
        if (str5 != null) {
            aVar.i(str5);
        }
        a = a2.a(payer, merchant, aVar.a(), tia0Var, null);
        wry0 wry0Var = new wry0();
        wry0Var.b(i);
        a.j(wry0Var.a());
        return new cja0(a);
    }

    @Override // defpackage.ria0
    public final Pair b(Context context, boolean z) {
        CvnInputViewImpl B = s2a1.b(z ? k1i0.YbSdk_PsdkTheme_Dark : k1i0.YbSdk_PsdkTheme_Light).B(context);
        return new Pair(B, new sia0(B));
    }

    @Override // defpackage.ria0
    public final String c(Intent intent) {
        BoundCard boundCard;
        if (intent == null || (boundCard = (BoundCard) intent.getParcelableExtra("DATA")) == null) {
            return null;
        }
        return boundCard.getCardId();
    }
}
