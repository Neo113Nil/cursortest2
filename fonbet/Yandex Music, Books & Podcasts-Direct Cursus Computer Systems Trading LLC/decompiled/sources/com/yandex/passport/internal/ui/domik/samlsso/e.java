package com.yandex.passport.internal.ui.domik.samlsso;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.network.client.j;
import com.yandex.passport.internal.network.h;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.domik.s;
import com.yandex.passport.internal.ui.util.q;
import defpackage.b6e;
import defpackage.btf;
import defpackage.d4n;
import defpackage.jyr;
import defpackage.qpj;
import defpackage.ssd;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/samlsso/e;", "Lcom/yandex/passport/internal/ui/domik/base/a;", "Lcom/yandex/passport/internal/ui/domik/samlsso/g;", "Lcom/yandex/passport/internal/ui/domik/d;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class e extends com.yandex.passport.internal.ui.domik.base.a<g, com.yandex.passport.internal.ui.domik.d> {
    public WebView u;
    public ProgressBar v;
    public final jyr t = btf.b(new com.yandex.passport.internal.common.e(25, this));
    public final d4n w = new d4n(3, this);

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final m0 F() {
        return m0.SAML_SSO_AUTH;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        str.getClass();
        return false;
    }

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        g gVar = (g) this.g;
        q qVar = gVar.y;
        l lVar = gVar.r;
        if (i == 1505) {
            if (i2 != -1 || intent == null) {
                qVar.m(a.b);
                return;
            }
            Uri data = intent.getData();
            String queryParameter = data != null ? data.getQueryParameter("track_id") : null;
            if (queryParameter == null) {
                qVar.m(a.d);
                return;
            }
            j b = gVar.s.b(com.yandex.plus.core.network.api.utils.a.L(lVar.d.a));
            Uri build = Uri.parse(((h) b.c).g(b.b, null, null)).buildUpon().appendEncodedPath("auth/session").appendQueryParameter("track_id", queryParameter).build();
            build.getClass();
            Uri build2 = build.buildUpon().appendQueryParameter("keep_track", "1").build();
            gVar.v = build2;
            Parcelable.Creator<com.yandex.passport.internal.ui.domik.d> creator = com.yandex.passport.internal.ui.domik.d.CREATOR;
            gVar.w = s.a(lVar).j(queryParameter);
            build2.getClass();
            qVar.m(new b(build2));
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.passport_fragment_saml_sso_auth, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.progress);
        findViewById.getClass();
        this.v = (ProgressBar) findViewById;
        View findViewById2 = inflate.findViewById(R.id.webview);
        WebView webView = (WebView) findViewById2;
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getUserAgentString());
        sb.append(' ');
        String str = com.yandex.passport.common.web.b.a;
        sb.append(com.yandex.passport.common.web.b.b);
        settings.setUserAgentString(sb.toString());
        settings.setDomStorageEnabled(true);
        findViewById2.getClass();
        this.u = webView;
        CookieManager cookieManager = CookieManager.getInstance();
        WebView webView2 = this.u;
        if (webView2 == null) {
            Intrinsics.j("webview");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView2, true);
        WebView webView3 = this.u;
        if (webView3 == null) {
            Intrinsics.j("webview");
            throw null;
        }
        webView3.setWebViewClient(this.w);
        Context requireContext = requireContext();
        ProgressBar progressBar = this.v;
        if (progressBar != null) {
            com.yandex.passport.legacy.f.a(requireContext, progressBar, R.color.passport_progress_bar);
            return inflate;
        }
        Intrinsics.j("progress");
        throw null;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            g gVar = (g) this.g;
            Context requireContext = requireContext();
            requireContext.getClass();
            String str = (String) this.t.getValue();
            gVar.getClass();
            str.getClass();
            try {
                Uri build = Uri.parse(str).buildUpon().appendQueryParameter("redirect_url", com.yandex.passport.common.browser.c.b(requireContext)).build();
                q qVar = gVar.x;
                build.getClass();
                qVar.m(new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.internal.ui.l(5, requireContext, build), 1505));
            } catch (UnsupportedOperationException e) {
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "can't create auth url", e);
                }
                gVar.y.m(new a(str.concat(" malformed")));
            }
        }
        final int i = 0;
        ((g) this.g).x.n(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.samlsso.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                qpj onBackPressedDispatcher;
                switch (i) {
                    case 0:
                        com.yandex.passport.internal.ui.base.l lVar = (com.yandex.passport.internal.ui.base.l) obj;
                        lVar.getClass();
                        e eVar = this.b;
                        eVar.startActivityForResult(lVar.a(eVar.requireContext()), lVar.b);
                        return;
                    default:
                        c cVar = (c) obj;
                        cVar.getClass();
                        boolean z = cVar instanceof b;
                        e eVar2 = this.b;
                        if (z) {
                            Uri uri = ((b) cVar).a;
                            WebView webView = eVar2.u;
                            if (webView != null) {
                                webView.loadUrl(uri.toString());
                                return;
                            } else {
                                Intrinsics.j("webview");
                                throw null;
                            }
                        }
                        if (!(cVar instanceof a)) {
                            b6e.s();
                            return;
                        }
                        String str2 = ((a) cVar).a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, str2, 8);
                        }
                        t l = eVar2.l();
                        if (l == null || (onBackPressedDispatcher = l.getOnBackPressedDispatcher()) == null) {
                            return;
                        }
                        onBackPressedDispatcher.d();
                        return;
                }
            }
        });
        final int i2 = 1;
        ((g) this.g).y.n(getViewLifecycleOwner(), new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.samlsso.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                qpj onBackPressedDispatcher;
                switch (i2) {
                    case 0:
                        com.yandex.passport.internal.ui.base.l lVar = (com.yandex.passport.internal.ui.base.l) obj;
                        lVar.getClass();
                        e eVar = this.b;
                        eVar.startActivityForResult(lVar.a(eVar.requireContext()), lVar.b);
                        return;
                    default:
                        c cVar = (c) obj;
                        cVar.getClass();
                        boolean z = cVar instanceof b;
                        e eVar2 = this.b;
                        if (z) {
                            Uri uri = ((b) cVar).a;
                            WebView webView = eVar2.u;
                            if (webView != null) {
                                webView.loadUrl(uri.toString());
                                return;
                            } else {
                                Intrinsics.j("webview");
                                throw null;
                            }
                        }
                        if (!(cVar instanceof a)) {
                            b6e.s();
                            return;
                        }
                        String str2 = ((a) cVar).a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, str2, 8);
                        }
                        t l = eVar2.l();
                        if (l == null || (onBackPressedDispatcher = l.getOnBackPressedDispatcher()) == null) {
                            return;
                        }
                        onBackPressedDispatcher.d();
                        return;
                }
            }
        });
    }

    @Override // com.yandex.passport.internal.ui.base.d
    public final com.yandex.passport.internal.ui.base.h x(PassportProcessGlobalComponent passportProcessGlobalComponent) {
        passportProcessGlobalComponent.getClass();
        l lVar = ((com.yandex.passport.internal.ui.domik.d) this.o).a;
        com.yandex.passport.internal.f contextUtils = passportProcessGlobalComponent.getContextUtils();
        com.yandex.passport.internal.network.client.h clientChooser = passportProcessGlobalComponent.getClientChooser();
        com.yandex.passport.internal.usecase.authorize.c authByCookieUseCase = passportProcessGlobalComponent.getAuthByCookieUseCase();
        ssd l = l();
        f fVar = l instanceof f ? (f) l : null;
        if (fVar != null) {
            return new g(lVar, contextUtils, clientChooser, authByCookieUseCase, fVar);
        }
        xq0.q("SamlSsoAuthListener is not presented");
        return null;
    }
}
