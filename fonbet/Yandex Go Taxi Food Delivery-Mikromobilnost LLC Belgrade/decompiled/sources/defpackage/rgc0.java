package defpackage;

import com.yandex.go.places.webview.impl.navigation.PlacesWebJsApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class rgc0 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlacesWebJsApi b;

    public /* synthetic */ rgc0(PlacesWebJsApi placesWebJsApi, int i) {
        this.a = i;
        this.b = placesWebJsApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        PlacesWebJsApi placesWebJsApi = this.b;
        switch (i) {
            case 0:
                placesWebJsApi.handleWebViewReady(str, strArr);
                break;
            case 1:
                placesWebJsApi.handleWebViewLoadError(str, strArr);
                break;
            case 2:
                placesWebJsApi.handleHideWebView(str, strArr);
                break;
            case 3:
                placesWebJsApi.handleFeedbackSent(str, strArr);
                break;
            case 4:
                placesWebJsApi.handleCardUpdated(str, strArr);
                break;
            default:
                placesWebJsApi.handleHideWebView(str, strArr);
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
            case 4:
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
                return new FunctionReferenceImpl(2, this.b, PlacesWebJsApi.class, "handleWebViewReady", "handleWebViewReady(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, PlacesWebJsApi.class, "handleWebViewLoadError", "handleWebViewLoadError(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, PlacesWebJsApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, PlacesWebJsApi.class, "handleFeedbackSent", "handleFeedbackSent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, PlacesWebJsApi.class, "handleCardUpdated", "handleCardUpdated(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, PlacesWebJsApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
