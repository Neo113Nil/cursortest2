package ru.yandex.taxi.web.deeplink;

import android.content.Context;
import defpackage.gsq0;
import defpackage.jq41;
import defpackage.kxf0;
import defpackage.q5z;
import defpackage.rab1;
import defpackage.tje;
import defpackage.wnt;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkJsNativeApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Landroid/content/Context;", "context", "Lwnt;", "goJson", "<init>", "(Landroid/content/Context;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "shareText", "(Ljava/lang/String;[Ljava/lang/String;)V", "text", "(Ljava/lang/String;)V", "Landroid/content/Context;", "getContext$annotations", "()V", "Companion", "a", "jq41", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewFromDeeplinkJsNativeApi extends JsNativeApi {
    private static final jq41 Companion = new jq41();

    @Deprecated
    public static final String JS_API_SHARE_TEXT = "taxi.app.requestShareMethod";

    @Deprecated
    public static final String PARAMS = "params";
    private final Context context;

    public WebViewFromDeeplinkJsNativeApi(Context context, wnt wntVar) {
        super(wntVar);
        this.context = context;
        rab1.d(getDocument(), "taxi.app.requestShareMethod", new kxf0(1, this), "params");
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareText(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new WebViewFromDeeplinkJsNativeApi$shareText$1(this, params, null), 3);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/web/deeplink/WebViewFromDeeplinkJsNativeApi$a;", "", "Companion", "ru/yandex/taxi/web/deeplink/j", "ru/yandex/taxi/web/deeplink/k", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final k Companion = new k();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a() {
            this.a = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareText(String text) {
        q5z.b0(this.context, text);
    }
}
