package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.AllowNewTabType;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow$PaymentMethodBindResponseSignal$$serializer;
import com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow$PaymentMethodBindResponseSignalParam$$serializer;
import com.yandex.go.payments.addmethod.data.model.o0;
import com.yandex.go.payments.addmethod.data.model.p0;
import com.yandex.go.payments.addmethod.data.model.q0;
import com.yandex.go.payments.addmethod.data.model.t0;
import com.yandex.plus.home.common.utils.c;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes13.dex */
public final /* synthetic */ class tn41 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tn41(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return c.a();
            case 1:
                return new oke(qoi0.a(hlk.class), qke.n(dlk.a), new KSerializer[0]);
            case 2:
                return AllowNewTabType.Companion.serializer();
            case 3:
                return new p53(new oke(qoi0.a(lwy.class), hwy.a, new KSerializer[0]), 0);
            case 4:
                return new p53(iwy.a, 0);
            case 5:
                return new p53(new oke(qoi0.a(kxy.class), ixy.a, new KSerializer[0]), 0);
            case 6:
                return new p53(kee0.a, 0);
            case 7:
                return new p53(auu0.a, 0);
            case 8:
                return bvf0.c(Boolean.FALSE);
            case 9:
                o0 o0Var = WebviewBindingFlow.Companion;
                return new p53(WebviewBindingFlow$PaymentMethodBindResponseSignal$$serializer.INSTANCE, 0);
            case 10:
                p0 p0Var = WebviewBindingFlow.PaymentMethodBindResponseSignal.Companion;
                return new p53(WebviewBindingFlow$PaymentMethodBindResponseSignalParam$$serializer.INSTANCE, 0);
            case 11:
                q0 q0Var = WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Companion;
                return WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.Companion.serializer();
            case 12:
                return vez0.g("com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type", WebviewBindingFlow.PaymentMethodBindResponseSignalAction.Type.values(), new String[]{"open_external_url", "open_otp", "otp_success", "otp_failed", "binding_success", "binding_failed", "webview_loaded", "show_error_message", "phone_already_bound_error", null}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
            case 13:
                t0 t0Var = WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Companion;
                return WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.go.payments.addmethod.data.model.WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action", WebviewBindingFlow.PaymentMethodBindResponseSignalParam.Action.values(), new String[]{"url", "payment_method_id", ACSPConstants.STATUS, null}, new Annotation[][]{null, null, null, null});
            case 15:
                zy11Var = zy11.a;
                return zy11Var;
            case 16:
                return new com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.c(false, 0);
            case 17:
                return wv.Companion.serializer();
            case 18:
                return new p53(auu0.a, 0);
            case 19:
                return wv.Companion.serializer();
            case 20:
                return new p53(a2x.Companion.serializer(), 0);
            case 21:
                return new p53(a2x.Companion.serializer(), 0);
            case 22:
                return new p53(a2x.Companion.serializer(), 0);
            case 23:
                return new p53(auu0.a, 0);
            case 24:
                return wv.Companion.serializer();
            case 25:
                return new p53(a2x.Companion.serializer(), 0);
            case 26:
                return new p53(auu0.a, 0);
            case 27:
                return wv.Companion.serializer();
            case 28:
                return wv.Companion.serializer();
            default:
                return new p53(a2x.Companion.serializer(), 0);
        }
    }
}
