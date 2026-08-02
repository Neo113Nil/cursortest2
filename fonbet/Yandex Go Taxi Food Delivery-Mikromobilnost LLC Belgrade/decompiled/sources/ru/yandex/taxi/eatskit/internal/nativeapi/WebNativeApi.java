package ru.yandex.taxi.eatskit.internal.nativeapi;

import defpackage.bj7;
import defpackage.cj7;
import defpackage.jg41;
import defpackage.k4o;
import defpackage.wh41;
import defpackage.xh41;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/yandex/taxi/eatskit/internal/nativeapi/WebNativeApi;", "Lru/yandex/taxi/eatskit/internal/nativeapi/NativeApi;", "Lwh41;", "callback", "", "Lcj7;", "methods", "<init>", "(Lwh41;Ljava/util/List;)V", "WebCallMethod", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebNativeApi extends NativeApi {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/eatskit/internal/nativeapi/WebNativeApi$WebCallMethod;", "Lbj7;", "", "", "methodName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ON_WEB_VIEW_READY", "ON_WEB_VIEW_LOAD_ERROR", "REQUEST_RELOAD", "REQUEST_HIDE_WEB_VIEW", "DISABLE_SWIPE", "ENABLE_SWIPE", "REQUEST_SHARE_URL", "SEND_ANALYTICS_EVENT", "REQUEST_GOOGLE_PAY_TOKEN", "IS_GOOGLE_PAY_SUPPORTED", "ON_SUCCESS_ORDER", "IS_NFC_SUPPORTED", "ENDPOINT_DESCRIPTION", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class WebCallMethod implements bj7 {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ WebCallMethod[] $VALUES;
        public static final WebCallMethod DISABLE_SWIPE;
        public static final WebCallMethod ENABLE_SWIPE;
        public static final WebCallMethod ENDPOINT_DESCRIPTION;
        public static final WebCallMethod IS_GOOGLE_PAY_SUPPORTED;
        public static final WebCallMethod IS_NFC_SUPPORTED;
        public static final WebCallMethod ON_SUCCESS_ORDER;
        public static final WebCallMethod ON_WEB_VIEW_LOAD_ERROR;
        public static final WebCallMethod ON_WEB_VIEW_READY;
        public static final WebCallMethod REQUEST_GOOGLE_PAY_TOKEN;
        public static final WebCallMethod REQUEST_HIDE_WEB_VIEW;
        public static final WebCallMethod REQUEST_RELOAD;
        public static final WebCallMethod REQUEST_SHARE_URL;
        public static final WebCallMethod SEND_ANALYTICS_EVENT;
        private final String methodName;

        static {
            WebCallMethod webCallMethod = new WebCallMethod("ON_WEB_VIEW_READY", 0, "onWebViewReady");
            ON_WEB_VIEW_READY = webCallMethod;
            WebCallMethod webCallMethod2 = new WebCallMethod("ON_WEB_VIEW_LOAD_ERROR", 1, "onWebViewLoadError");
            ON_WEB_VIEW_LOAD_ERROR = webCallMethod2;
            WebCallMethod webCallMethod3 = new WebCallMethod("REQUEST_RELOAD", 2, "requestReload");
            REQUEST_RELOAD = webCallMethod3;
            WebCallMethod webCallMethod4 = new WebCallMethod("REQUEST_HIDE_WEB_VIEW", 3, "requestHideWebView");
            REQUEST_HIDE_WEB_VIEW = webCallMethod4;
            WebCallMethod webCallMethod5 = new WebCallMethod("DISABLE_SWIPE", 4, "disableSwipe");
            DISABLE_SWIPE = webCallMethod5;
            WebCallMethod webCallMethod6 = new WebCallMethod("ENABLE_SWIPE", 5, "enableSwipe");
            ENABLE_SWIPE = webCallMethod6;
            WebCallMethod webCallMethod7 = new WebCallMethod("REQUEST_SHARE_URL", 6, "requestShareUrl");
            REQUEST_SHARE_URL = webCallMethod7;
            WebCallMethod webCallMethod8 = new WebCallMethod("SEND_ANALYTICS_EVENT", 7, "sendAnalyticsEvent");
            SEND_ANALYTICS_EVENT = webCallMethod8;
            WebCallMethod webCallMethod9 = new WebCallMethod("REQUEST_GOOGLE_PAY_TOKEN", 8, "requestGooglePayToken");
            REQUEST_GOOGLE_PAY_TOKEN = webCallMethod9;
            WebCallMethod webCallMethod10 = new WebCallMethod("IS_GOOGLE_PAY_SUPPORTED", 9, "isGooglePaySupported");
            IS_GOOGLE_PAY_SUPPORTED = webCallMethod10;
            WebCallMethod webCallMethod11 = new WebCallMethod("ON_SUCCESS_ORDER", 10, "onSuccessOrder");
            ON_SUCCESS_ORDER = webCallMethod11;
            WebCallMethod webCallMethod12 = new WebCallMethod("IS_NFC_SUPPORTED", 11, "isNfcSupported");
            IS_NFC_SUPPORTED = webCallMethod12;
            WebCallMethod webCallMethod13 = new WebCallMethod("ENDPOINT_DESCRIPTION", 12, "getEndpointDescription");
            ENDPOINT_DESCRIPTION = webCallMethod13;
            WebCallMethod[] webCallMethodArr = {webCallMethod, webCallMethod2, webCallMethod3, webCallMethod4, webCallMethod5, webCallMethod6, webCallMethod7, webCallMethod8, webCallMethod9, webCallMethod10, webCallMethod11, webCallMethod12, webCallMethod13};
            $VALUES = webCallMethodArr;
            $ENTRIES = a.a(webCallMethodArr);
        }

        public WebCallMethod(String str, int i, String str2) {
            this.methodName = str2;
        }

        public static WebCallMethod valueOf(String str) {
            return (WebCallMethod) Enum.valueOf(WebCallMethod.class, str);
        }

        public static WebCallMethod[] values() {
            return (WebCallMethod[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }
    }

    public WebNativeApi(wh41 wh41Var, List<cj7> list) {
        super(wh41Var, list);
        addAsyncMethod(WebCallMethod.ON_WEB_VIEW_READY.getMethodName(), new jg41(8, new xh41(this, 1)));
        addAsyncMethod(WebCallMethod.ON_WEB_VIEW_LOAD_ERROR.getMethodName(), new jg41(9, new xh41(this, 2)));
        addAsyncMethod(WebCallMethod.REQUEST_RELOAD.getMethodName(), new jg41(10, new xh41(this, 3)));
        addAsyncMethod(WebCallMethod.REQUEST_HIDE_WEB_VIEW.getMethodName(), new jg41(11, new xh41(this, 4)));
        addAsyncMethod(WebCallMethod.DISABLE_SWIPE.getMethodName(), new jg41(6, new xh41(this, 5)));
        addAsyncMethod(WebCallMethod.ENABLE_SWIPE.getMethodName(), new jg41(7, new xh41(this, 0)));
    }

    public /* synthetic */ WebNativeApi(wh41 wh41Var, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wh41Var, (i & 2) != 0 ? EmptyList.a : list);
    }
}
