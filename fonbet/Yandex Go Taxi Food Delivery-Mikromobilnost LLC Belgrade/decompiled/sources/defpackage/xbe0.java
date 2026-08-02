package defpackage;

import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class xbe0 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ PorttechJsNativeApi b;

    public /* synthetic */ xbe0(PorttechJsNativeApi porttechJsNativeApi, int i) {
        this.a = i;
        this.b = porttechJsNativeApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        PorttechJsNativeApi porttechJsNativeApi = this.b;
        switch (i) {
            case 0:
                porttechJsNativeApi.handleWebViewReady(str, strArr);
                break;
            case 1:
                porttechJsNativeApi.handleHideWebView(str, strArr);
                break;
            case 2:
                porttechJsNativeApi.handleSelectPaymentMethod(str, strArr);
                break;
            case 3:
                porttechJsNativeApi.handleGetSelectedPaymentMethod(str, strArr);
                break;
            default:
                porttechJsNativeApi.handleSendAnalyticsEvent(str, strArr);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof hyw) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(2, this.b, PorttechJsNativeApi.class, "handleWebViewReady", "handleWebViewReady(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, PorttechJsNativeApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, PorttechJsNativeApi.class, "handleSelectPaymentMethod", "handleSelectPaymentMethod(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, PorttechJsNativeApi.class, "handleGetSelectedPaymentMethod", "handleGetSelectedPaymentMethod(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, PorttechJsNativeApi.class, "handleSendAnalyticsEvent", "handleSendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
