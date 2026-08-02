package defpackage;

import android.net.Uri;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.scooters.domain.model.ScootersAuthorizationException;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class x8p0 {
    public final fn21 a;
    public final a b;

    public x8p0(fn21 fn21Var, a aVar) {
        this.a = fn21Var;
        this.b = aVar;
    }

    public final UiWebViewConfig a(s8p0 s8p0Var, Boolean bool) {
        if (s8p0Var instanceof r8p0) {
            CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
            aVar.e = false;
            return new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        }
        if (!(s8p0Var instanceof q8p0)) {
            w511.b();
            return null;
        }
        q8p0 q8p0Var = (q8p0) s8p0Var;
        String builder = Uri.parse(q8p0Var.a).buildUpon().toString();
        CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
        aVar2.b = builder;
        aVar2.e = true;
        if (q8p0Var.b) {
            String Hg = ((h) this.a).Hg();
            if (Hg == null) {
                throw new ScootersAuthorizationException();
            }
            String c = this.b.c();
            aVar2.c = c;
            aVar2.b("X-YaTaxi-Authorization", kp50.h(c));
            aVar2.b("X-YaTaxi-UserId", Hg);
            aVar2.g = true;
        }
        if (bool != null) {
            aVar2.h = bool.booleanValue();
        }
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setTitleHorizontalAlignment(0);
        uiWebViewConfig.setShouldUseCached(false);
        return uiWebViewConfig;
    }
}
