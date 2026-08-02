package defpackage;

import com.yandex.go.business.impl.web.YangoBusinessJsNativeApi;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class xn51 {
    public final a a;
    public final fn21 b;

    public xn51(fn21 fn21Var, a aVar) {
        this.a = aVar;
        this.b = fn21Var;
    }

    public final UiWebViewConfig a(YangoBusinessJsNativeApi yangoBusinessJsNativeApi, String str) {
        String c = this.a.c();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str;
        aVar.c = c;
        aVar.h = true;
        aVar.k = yangoBusinessJsNativeApi;
        aVar.b("Authorization", kp50.h(c));
        String Hg = ((h) this.b).Hg();
        if (Hg == null) {
            Hg = "";
        }
        aVar.b("X-YaTaxi-UserId", Hg);
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setShouldShowToolbar(false);
        uiWebViewConfig.setBackStackAware(true);
        uiWebViewConfig.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.External.INSTANCE);
        uiWebViewConfig.setModalViewMode(UiWebViewConfig.Fullscreen.INSTANCE);
        uiWebViewConfig.setCanDrag(false);
        return uiWebViewConfig;
    }
}
