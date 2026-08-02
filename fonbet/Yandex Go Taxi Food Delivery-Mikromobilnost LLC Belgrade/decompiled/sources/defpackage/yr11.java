package defpackage;

import com.yandex.go.ugc.UgcDeeplinkApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class yr11 implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ UgcDeeplinkApi b;

    public /* synthetic */ yr11(UgcDeeplinkApi ugcDeeplinkApi, int i) {
        this.a = i;
        this.b = ugcDeeplinkApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        UgcDeeplinkApi ugcDeeplinkApi = this.b;
        switch (i) {
            case 0:
                ugcDeeplinkApi.handleWebViewReady(str, strArr);
                break;
            case 1:
                ugcDeeplinkApi.handleWebViewLoadError(str, strArr);
                break;
            case 2:
                ugcDeeplinkApi.handleHideWebView(str, strArr);
                break;
            case 3:
                ugcDeeplinkApi.handleSendAnalyticsEvent(str, strArr);
                break;
            case 4:
                ugcDeeplinkApi.handleGeo(str, strArr);
                break;
            case 5:
                ugcDeeplinkApi.openExternal(str, strArr);
                break;
            default:
                ugcDeeplinkApi.handleSelectTheme(str, strArr);
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
            case 5:
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
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "handleWebViewReady", "handleWebViewReady(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "handleWebViewLoadError", "handleWebViewLoadError(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "handleSendAnalyticsEvent", "handleSendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "handleGeo", "handleGeo(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 5:
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "openExternal", "openExternal(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, UgcDeeplinkApi.class, "handleSelectTheme", "handleSelectTheme(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
