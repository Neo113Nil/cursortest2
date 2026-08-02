package ru.yandex.taxi.proxy;

import defpackage.fxf0;
import defpackage.kxf0;
import defpackage.lxf0;
import defpackage.rab1;
import defpackage.tje;
import defpackage.wnt;
import kotlin.Metadata;
import ru.yandex.taxi.web.nativeapi.JsNativeApi;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\b0\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/proxy/ProxyProvisionNativeApi;", "Lru/yandex/taxi/web/nativeapi/JsNativeApi;", "Lfxf0;", "dynamicApiNameProvider", "Lwnt;", "goJson", "<init>", "(Lfxf0;Lwnt;)V", "", "promiseId", "", "Lru/yandex/taxi/web/nativeapi/JsFunctionParams;", "params", "Lzy11;", "handleGetEndpointDescription", "(Ljava/lang/String;[Ljava/lang/String;)V", "Lfxf0;", "Companion", "lxf0", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ProxyProvisionNativeApi extends JsNativeApi {
    private static final lxf0 Companion = new lxf0();

    @Deprecated
    public static final String GET_ENDPOINT_DESCRIPTION = "taxi.app.getEndpointDescription";

    @Deprecated
    public static final String INCORRECT_PARAMS_DESCRIPTION = "Please, add api_name param to get endpointDescription!";

    @Deprecated
    public static final String NOT_FOUND_PROXIES_DESCRIPTION = "MOB is not supported for client or no proxies were found for api_name: ";

    @Deprecated
    public static final String PARAMS = "params";
    private final fxf0 dynamicApiNameProvider;

    public ProxyProvisionNativeApi(fxf0 fxf0Var, wnt wntVar) {
        super(wntVar);
        this.dynamicApiNameProvider = fxf0Var;
        rab1.d(getDocument(), GET_ENDPOINT_DESCRIPTION, new kxf0(0, this), "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleGetEndpointDescription(String promiseId, String[] params) {
        tje.N(getScopeDelegate().c(), null, null, new ProxyProvisionNativeApi$handleGetEndpointDescription$1(params, this, promiseId, null), 3);
    }
}
