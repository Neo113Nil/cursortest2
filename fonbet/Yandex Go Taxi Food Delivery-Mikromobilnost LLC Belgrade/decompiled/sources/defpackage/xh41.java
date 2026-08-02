package defpackage;

import ru.yandex.taxi.eatskit.internal.nativeapi.WebNativeApi;

/* loaded from: classes5.dex */
public final class xh41 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebNativeApi b;

    public /* synthetic */ xh41(WebNativeApi webNativeApi, int i) {
        this.a = i;
        this.b = webNativeApi;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        WebNativeApi webNativeApi = this.b;
        switch (i) {
            case 0:
                webNativeApi.handleEnableSwipe();
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
            case 1:
                webNativeApi.handleOnWebViewReady();
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
            case 2:
                webNativeApi.handleOnWebViewLoadError((f8o) obj);
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
            case 3:
                webNativeApi.handleRequestReload((iti0) obj);
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
            case 4:
                webNativeApi.handleRequestHideWebView();
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
            default:
                webNativeApi.handleDisableSwipe();
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
        }
        return zy11Var;
    }
}
