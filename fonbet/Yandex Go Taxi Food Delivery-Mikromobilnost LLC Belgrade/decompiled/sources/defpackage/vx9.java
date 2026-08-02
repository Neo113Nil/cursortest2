package defpackage;

import ru.yandex.taxi.web.nativeapi.JsNativeApi;

/* loaded from: classes12.dex */
public final class vx9 implements bi41 {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsNativeApi b;

    public /* synthetic */ vx9(JsNativeApi jsNativeApi, int i) {
        this.a = i;
        this.b = jsNativeApi;
    }

    @Override // defpackage.bi41
    public final void onPageStarted(String str) {
        int i = this.a;
        JsNativeApi jsNativeApi = this.b;
        switch (i) {
            case 0:
                jsNativeApi.onPageStarted(str);
                break;
            default:
                jsNativeApi.onPageStarted(str);
                break;
        }
    }
}
