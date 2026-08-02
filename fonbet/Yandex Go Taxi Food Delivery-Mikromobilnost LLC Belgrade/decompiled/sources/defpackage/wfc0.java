package defpackage;

import com.yandex.go.places.webview.impl.navigation.common.b;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;

/* loaded from: classes13.dex */
public final class wfc0 extends b implements ufc0 {
    public final gf41 G;
    public final a H;
    public final fn21 I;
    public final ngc0 J;
    public final j5z K;
    public final xes0 L;
    public final o M;
    public final w030 N;

    public wfc0(gf41 gf41Var, a aVar, fn21 fn21Var, ngc0 ngc0Var, j5z j5zVar, xes0 xes0Var, o oVar, w030 w030Var) {
        this.G = gf41Var;
        this.H = aVar;
        this.I = fn21Var;
        this.J = ngc0Var;
        this.K = j5zVar;
        this.L = xes0Var;
        this.M = oVar;
        this.N = w030Var;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final a R() {
        return this.H;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final o S() {
        return this.M;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final j5z T() {
        return this.K;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final xes0 U() {
        return this.L;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final fn21 V() {
        return this.I;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final ngc0 W() {
        return this.J;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final gf41 Y() {
        return this.G;
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b, defpackage.h55
    /* renamed from: Z */
    public final void I(ugc0 ugc0Var) {
        super.I(ugc0Var);
        this.N.m(WebContainerModalView.class);
    }

    @Override // com.yandex.go.places.webview.impl.navigation.common.b
    public final void a0(hf41 hf41Var, com.yandex.go.places.webview.impl.navigation.common.a aVar) {
        vf41 c = ((scg) X()).c();
        UiWebViewConfig uiWebViewConfig = hf41Var.d;
        uiWebViewConfig.setSignalForLoaded(UiWebViewConfig.SignalForLoaded.Default.INSTANCE);
        uiWebViewConfig.setModalViewMode(UiWebViewConfig.Fullscreen.INSTANCE);
        uiWebViewConfig.setAnimateOnAppearing(false);
        uiWebViewConfig.setAnimateOnDisappearing(false);
        this.N.s(vf41.a(c, uiWebViewConfig, new vfc0(0, this), aVar, null, 248), true);
    }
}
