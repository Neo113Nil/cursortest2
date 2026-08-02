package defpackage;

import com.yandex.payment.sdk.core.data.GooglePayAllowedCardNetworks;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.OrderDetails;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;

/* loaded from: classes2.dex */
public final class xvt implements kvt {
    public final GooglePayData a;
    public final tw4 b;
    public final pcy c;
    public final GooglePayAllowedCardNetworks d;
    public zvt e;

    public xvt(GooglePayData googlePayData, tw4 tw4Var, pcy pcyVar, GooglePayAllowedCardNetworks googlePayAllowedCardNetworks) {
        this.a = googlePayData;
        this.b = tw4Var;
        this.c = pcyVar;
        this.d = googlePayAllowedCardNetworks;
    }

    public final m9 a(OrderDetails orderDetails) {
        if (this.b == null) {
            return zmx.c(new ExternalConvertibleError(ExternalErrorKind.internal_error, ExternalErrorTrigger.internal_sdk, null, null, "No GooglePay handler"));
        }
        BaseActivity baseActivity = (BaseActivity) tw4.b.get();
        if (baseActivity == null) {
            ny61.r("GooglePay called after activity finish");
            return null;
        }
        tw4.c = this;
        zvt zvtVar = new zvt(baseActivity, this.a, this.c, this.d);
        this.e = zvtVar;
        return zmx.b(new nfj(8, zvtVar, orderDetails));
    }
}
