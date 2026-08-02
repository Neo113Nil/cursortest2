package defpackage;

import com.yandex.go.flex.common.router.web_view.FlexWebApi;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes12.dex */
public final /* synthetic */ class wmr implements hyw, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ FlexWebApi b;

    public /* synthetic */ wmr(FlexWebApi flexWebApi, int i) {
        this.a = i;
        this.b = flexWebApi;
    }

    @Override // defpackage.hyw
    public final void a(String str, String[] strArr) {
        int i = this.a;
        FlexWebApi flexWebApi = this.b;
        switch (i) {
            case 0:
                flexWebApi.handleHideWebView(str, strArr);
                break;
            case 1:
                flexWebApi.shareText(str, strArr);
                break;
            case 2:
                flexWebApi.handleSendAnalyticsEvent(str, strArr);
                break;
            case 3:
                flexWebApi.handleSendAdjustEvent(str, strArr);
                break;
            case 4:
                flexWebApi.handleOpenWindowEvent(str, strArr);
                break;
            default:
                flexWebApi.handleHideWebView(str, strArr);
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
                return new FunctionReferenceImpl(2, this.b, FlexWebApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 1:
                return new FunctionReferenceImpl(2, this.b, FlexWebApi.class, "shareText", "shareText(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 2:
                return new FunctionReferenceImpl(2, this.b, FlexWebApi.class, "handleSendAnalyticsEvent", "handleSendAnalyticsEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 3:
                return new FunctionReferenceImpl(2, this.b, FlexWebApi.class, "handleSendAdjustEvent", "handleSendAdjustEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            case 4:
                return new FunctionReferenceImpl(2, this.b, FlexWebApi.class, "handleOpenWindowEvent", "handleOpenWindowEvent(Ljava/lang/String;[Ljava/lang/String;)V", 0);
            default:
                return new FunctionReferenceImpl(2, this.b, FlexWebApi.class, "handleHideWebView", "handleHideWebView(Ljava/lang/String;[Ljava/lang/String;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
