package ru.yandex.taxi.communications;

import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import defpackage.bux0;
import defpackage.cey;
import defpackage.dt41;
import defpackage.ft41;
import defpackage.h3y;
import defpackage.ji3;
import defpackage.kux0;
import defpackage.plf;
import defpackage.pzt0;
import defpackage.ruc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import java.util.LinkedHashMap;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes9.dex */
public final class n implements ruc {
    public final tse a;
    public final Lifecycle b;
    public final tt2 c;
    public final ru.yandex.taxi.am.g d;
    public final bux0 e;
    public final ru.yandex.taxi.am.o f;
    public final ji3 g;
    public final h3y h;
    public pzt0 i;

    public n(tse tseVar, Lifecycle lifecycle, tt2 tt2Var, ru.yandex.taxi.am.g gVar, bux0 bux0Var, ru.yandex.taxi.am.o oVar, ji3 ji3Var, h3y h3yVar) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = tt2Var;
        this.d = gVar;
        this.e = bux0Var;
        this.f = oVar;
        this.g = ji3Var;
        this.h = h3yVar;
    }

    public static final void a(n nVar, String str) {
        nVar.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.h();
        aVar.k();
        aVar.d();
        aVar.i(nVar.d.b());
        aVar.e(new LinkedHashMap(nVar.e.a()));
        aVar.j(str);
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        ((ft41) ((dt41) nVar.g.get())).P(uiWebViewConfig);
    }

    public final void b(String str, boolean z) {
        if (!z || !this.d.g()) {
            ((plf) this.h.get()).a(Uri.parse(str));
            return;
        }
        pzt0 pzt0Var = this.i;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.i = tje.N(this.a, null, null, new TaxiCommunicationsWebViewStarter$startWebView$1(this, str, null), 3);
        cey.b(this.b, Lifecycle.Event.ON_STOP, new kux0(0, this));
    }
}
