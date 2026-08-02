package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import com.yandex.quark.webchat.c;
import com.yandex.quark.webchat.f;
import com.yandex.quark.webchat.g;
import com.yandex.quark.webchat.i;
import com.yandex.quark.webchat.navigation.internal.a;
import com.yandex.quark.webchat.webview.WebChatContainerView;
import defpackage.ar41;
import defpackage.eja1;
import defpackage.ep41;
import defpackage.hg41;
import defpackage.hgp0;
import defpackage.ke41;
import defpackage.ne41;
import defpackage.ny61;
import defpackage.oey;
import defpackage.pey;
import defpackage.pgq0;
import defpackage.scc;
import defpackage.se41;
import defpackage.tje;
import defpackage.vd41;
import defpackage.vng;
import defpackage.we41;
import defpackage.x0j;
import defpackage.xq41;
import defpackage.y3x0;
import defpackage.zq6;
import defpackage.zwf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class se41 {
    public final gci0 A;
    public ne41 B;
    public long C;
    public final i3y D;
    public final w900 E;
    public final Context a;
    public final vnh b;
    public final zwf0 c;
    public final zq6 d;
    public final c e;
    public final g f;
    public final azq g;
    public final j1r h;
    public final i1r i;
    public final mih j;
    public final va90 k;
    public final wj21 l;
    public final ke41 m;
    public final ep41 n;
    public final a o;
    public final yq6 p;
    public final sls q;
    public final tig0 r;
    public final vd41 s;
    public final eci0 t;
    public final pgq0 u;
    public final gd41 v;
    public final i3y w;
    public i x;
    public final f y = new f(this);
    public final r0 z;

    public se41(Context context, vnh vnhVar, zwf0 zwf0Var, zq6 zq6Var, c cVar, g gVar, azq azqVar, j1r j1rVar, i1r i1rVar, qsy0 qsy0Var, mih mihVar, va90 va90Var, wj21 wj21Var, ke41 ke41Var, ep41 ep41Var, a aVar, yq6 yq6Var, sls slsVar, tig0 tig0Var, vd41 vd41Var, be41 be41Var, ce41 ce41Var, eci0 eci0Var, mgp0 mgp0Var, pgq0 pgq0Var, gd41 gd41Var) {
        this.a = context;
        this.b = vnhVar;
        this.c = zwf0Var;
        this.d = zq6Var;
        this.e = cVar;
        this.f = gVar;
        this.g = azqVar;
        this.h = j1rVar;
        this.i = i1rVar;
        this.j = mihVar;
        this.k = va90Var;
        this.l = wj21Var;
        this.m = ke41Var;
        this.n = ep41Var;
        this.o = aVar;
        this.p = yq6Var;
        this.q = slsVar;
        this.r = tig0Var;
        this.s = vd41Var;
        this.t = eci0Var;
        this.u = pgq0Var;
        this.v = gd41Var;
        final int i = 0;
        this.w = kotlin.a.a(new sls(this) { // from class: re41
            public final /* synthetic */ se41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i2 = i;
                se41 se41Var = this.b;
                switch (i2) {
                    case 0:
                        ke41 ke41Var2 = se41Var.m;
                        yq6 yq6Var2 = se41Var.p;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Context context2 = se41Var.a;
                        zq6 zq6Var2 = se41Var.d;
                        se41Var.C = SystemClock.uptimeMillis();
                        f fVar = se41Var.y;
                        fVar.c = false;
                        fVar.d = false;
                        fVar.e = false;
                        fVar.a = 0L;
                        fVar.b = 0L;
                        fVar.f = false;
                        zwf0 zwf0Var2 = se41Var.c;
                        zwf0Var2.e("WebChatViewController", "Make web content view");
                        vnh vnhVar2 = se41Var.b;
                        vnhVar2.getClass();
                        y3x0 y3x0Var = new y3x0(context2, vnhVar2.a, (qgz) vnhVar2.c, (bst) vnhVar2.d, (xa20) vnhVar2.e, vnhVar2.b);
                        r0 r0Var = se41Var.z;
                        r0Var.getClass();
                        r0Var.m(null, xe41.a);
                        y3x0Var.f = fVar;
                        y3x0Var.g = se41Var.f;
                        y3x0Var.h = se41Var.g;
                        i1r i1rVar2 = se41Var.i;
                        ArrayList arrayList = y3x0Var.i;
                        if (!arrayList.contains(i1rVar2)) {
                            arrayList.add(i1rVar2);
                        }
                        zoc zocVar = ((wc41) se41Var.k.a).a;
                        if (zocVar == null) {
                            wc41.a();
                            throw null;
                        }
                        if (zocVar == null || (str = zocVar.b) == null) {
                            wc41.a();
                            throw null;
                        }
                        if (zocVar == null || (str2 = zocVar.c) == null) {
                            wc41.a();
                            throw null;
                        }
                        String l = b64.l("quark/1.160.0 ", str, "/", str2);
                        WebView webView = y3x0Var.e;
                        WebSettings settings = webView.getSettings();
                        settings.setUserAgentString(settings.getUserAgentString() + " " + l);
                        se41Var.l.a(webView.getSettings().getUserAgentString());
                        Bundle bundle = ke41Var2.a;
                        Bundle bundle2 = bundle != null ? bundle : null;
                        if (bundle2 != null) {
                            webView.restoreState(bundle2);
                            zq6Var2.b(e790.d);
                        }
                        se41Var.n.c(new vo41(y3x0Var));
                        se41Var.B = new ne41(y3x0Var, zq6Var2, zwf0Var2, se41Var.e, ke41Var2, se41Var.r);
                        webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(se41Var, webView) { // from class: com.yandex.quark.webchat.WebChatViewControllerImpl$observeLifecycle$1
                            private final com.yandex.quark.webchat.observers.a authInvalidReloadObserver;
                            private final h lifecycleObserver;
                            private pey lifecycleOwner;
                            private final List<x0j> observers;
                            private final hgp0 screenshotObserver;
                            final /* synthetic */ se41 this$0;

                            {
                                ne41 ne41Var;
                                zwf0 zwf0Var3;
                                zq6 zq6Var3;
                                ep41 ep41Var2;
                                WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1;
                                hg41 hg41Var;
                                this.this$0 = se41Var;
                                zwf0 zwf0Var4 = se41Var.c;
                                zq6 zq6Var4 = se41Var.d;
                                ep41 ep41Var3 = se41Var.n;
                                WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$12 = new WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1(1, se41Var, se41.class, "initBackPress", "initBackPress(Landroidx/lifecycle/LifecycleOwner;)V", 0);
                                WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2 webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2 = new WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2(0, se41Var, se41.class, "cancelBackPress", "cancelBackPress()V", 0);
                                vd41 vd41Var2 = se41Var.s;
                                ne41 ne41Var2 = se41Var.B;
                                if (ne41Var2 == null) {
                                    ne41Var = null;
                                    hg41Var = hg41.this;
                                    zwf0Var3 = zwf0Var4;
                                    zq6Var3 = zq6Var4;
                                    ep41Var2 = ep41Var3;
                                    webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 = webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$12;
                                } else {
                                    ne41Var = ne41Var2;
                                    zwf0Var3 = zwf0Var4;
                                    zq6Var3 = zq6Var4;
                                    ep41Var2 = ep41Var3;
                                    webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 = webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$12;
                                    hg41Var = hg41.this;
                                }
                                this.lifecycleObserver = new h(hg41Var, zwf0Var3, zq6Var3, ep41Var2, webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1, webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2, vd41Var2, ne41Var);
                                com.yandex.quark.webchat.observers.a aVar2 = new com.yandex.quark.webchat.observers.a(se41Var.t, new WebChatViewControllerImpl$observeLifecycle$1$authInvalidReloadObserver$1(0, se41Var, se41.class, "reloadPage", "reloadPage()V", 0));
                                this.authInvalidReloadObserver = aVar2;
                                this.screenshotObserver = null;
                                ne41 ne41Var3 = se41Var.B;
                                this.observers = scc.g(ne41Var3 != null ? ne41Var3 : null, aVar2);
                            }

                            public final com.yandex.quark.webchat.observers.a getAuthInvalidReloadObserver() {
                                return this.authInvalidReloadObserver;
                            }

                            public final h getLifecycleObserver() {
                                return this.lifecycleObserver;
                            }

                            public final pey getLifecycleOwner() {
                                return this.lifecycleOwner;
                            }

                            public final List<x0j> getObservers() {
                                return this.observers;
                            }

                            public final hgp0 getScreenshotObserver() {
                                return this.screenshotObserver;
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                                pey peyVar;
                                pey o = vng.o(v);
                                if (o == null) {
                                    ny61.r("Lifecycle owner is null");
                                    return;
                                }
                                Lifecycle lifecycle = o.getLifecycle();
                                lifecycle.a(this.lifecycleObserver);
                                hgp0 hgp0Var = this.screenshotObserver;
                                if (hgp0Var != null) {
                                    lifecycle.a(hgp0Var);
                                }
                                Iterator<T> it = this.observers.iterator();
                                while (it.hasNext()) {
                                    lifecycle.a((oey) it.next());
                                }
                                this.lifecycleOwner = o;
                                tje.N(eja1.s(o), null, null, new WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2(this.this$0, null), 3);
                                se41 se41Var2 = this.this$0;
                                pgq0 pgq0Var2 = se41Var2.u;
                                if (pgq0Var2 != null && (peyVar = this.lifecycleOwner) != null) {
                                    tje.N(eja1.s(peyVar), null, null, new WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$3$1(pgq0Var2, se41Var2, null), 3);
                                }
                                this.this$0.d.b(xq41.d);
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                                Lifecycle lifecycle;
                                this.this$0.c.e("WebChatViewController", "WebView detached from window");
                                if (this.this$0.z.getValue() instanceof we41) {
                                    se41 se41Var2 = this.this$0;
                                    se41Var2.getClass();
                                    ke41 ke41Var3 = se41Var2.m;
                                    y3x0 y3x0Var2 = (y3x0) hg41.this;
                                    y3x0Var2.getClass();
                                    Bundle bundle3 = new Bundle();
                                    y3x0Var2.e.saveState(bundle3);
                                    ke41Var3.a = bundle3;
                                }
                                this.this$0.s.stop();
                                pey peyVar = this.lifecycleOwner;
                                if (peyVar != null && (lifecycle = peyVar.getLifecycle()) != null) {
                                    lifecycle.d(this.lifecycleObserver);
                                    hgp0 hgp0Var = this.screenshotObserver;
                                    if (hgp0Var != null) {
                                        lifecycle.d(hgp0Var);
                                    }
                                    for (x0j x0jVar : this.observers) {
                                        lifecycle.d(x0jVar);
                                        x0jVar.onDetach();
                                    }
                                    this.lifecycleOwner = null;
                                }
                                this.this$0.d.b(ar41.d);
                            }

                            public final void setLifecycleOwner(pey peyVar) {
                                this.lifecycleOwner = peyVar;
                            }
                        });
                        PackageInfo b = rm41.b(context2);
                        if (b == null || (str3 = b.versionName) == null) {
                            str3 = "unknown";
                        }
                        zq6Var2.b(new yq41(str3));
                        yq6Var2.e("WebChat.WebViewInitialized", SystemClock.uptimeMillis() - uptimeMillis, TimeUnit.MILLISECONDS);
                        return y3x0Var;
                    default:
                        WebChatContainerView webChatContainerView = new WebChatContainerView(se41Var.a, se41Var.a(), false);
                        se41Var.x = webChatContainerView.getInsetsController();
                        return webChatContainerView;
                }
            }
        });
        r0 c = bvf0.c(ve41.a);
        this.z = c;
        this.A = e.d(c);
        final int i2 = 1;
        this.D = kotlin.a.a(new sls(this) { // from class: re41
            public final /* synthetic */ se41 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                int i22 = i2;
                se41 se41Var = this.b;
                switch (i22) {
                    case 0:
                        ke41 ke41Var2 = se41Var.m;
                        yq6 yq6Var2 = se41Var.p;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Context context2 = se41Var.a;
                        zq6 zq6Var2 = se41Var.d;
                        se41Var.C = SystemClock.uptimeMillis();
                        f fVar = se41Var.y;
                        fVar.c = false;
                        fVar.d = false;
                        fVar.e = false;
                        fVar.a = 0L;
                        fVar.b = 0L;
                        fVar.f = false;
                        zwf0 zwf0Var2 = se41Var.c;
                        zwf0Var2.e("WebChatViewController", "Make web content view");
                        vnh vnhVar2 = se41Var.b;
                        vnhVar2.getClass();
                        hg41 y3x0Var = new y3x0(context2, vnhVar2.a, (qgz) vnhVar2.c, (bst) vnhVar2.d, (xa20) vnhVar2.e, vnhVar2.b);
                        r0 r0Var = se41Var.z;
                        r0Var.getClass();
                        r0Var.m(null, xe41.a);
                        y3x0Var.f = fVar;
                        y3x0Var.g = se41Var.f;
                        y3x0Var.h = se41Var.g;
                        i1r i1rVar2 = se41Var.i;
                        ArrayList arrayList = y3x0Var.i;
                        if (!arrayList.contains(i1rVar2)) {
                            arrayList.add(i1rVar2);
                        }
                        zoc zocVar = ((wc41) se41Var.k.a).a;
                        if (zocVar == null) {
                            wc41.a();
                            throw null;
                        }
                        if (zocVar == null || (str = zocVar.b) == null) {
                            wc41.a();
                            throw null;
                        }
                        if (zocVar == null || (str2 = zocVar.c) == null) {
                            wc41.a();
                            throw null;
                        }
                        String l = b64.l("quark/1.160.0 ", str, "/", str2);
                        View webView = y3x0Var.e;
                        WebSettings settings = webView.getSettings();
                        settings.setUserAgentString(settings.getUserAgentString() + " " + l);
                        se41Var.l.a(webView.getSettings().getUserAgentString());
                        Bundle bundle = ke41Var2.a;
                        Bundle bundle2 = bundle != null ? bundle : null;
                        if (bundle2 != null) {
                            webView.restoreState(bundle2);
                            zq6Var2.b(e790.d);
                        }
                        se41Var.n.c(new vo41(y3x0Var));
                        se41Var.B = new ne41(y3x0Var, zq6Var2, zwf0Var2, se41Var.e, ke41Var2, se41Var.r);
                        webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(se41Var, webView) { // from class: com.yandex.quark.webchat.WebChatViewControllerImpl$observeLifecycle$1
                            private final com.yandex.quark.webchat.observers.a authInvalidReloadObserver;
                            private final h lifecycleObserver;
                            private pey lifecycleOwner;
                            private final List<x0j> observers;
                            private final hgp0 screenshotObserver;
                            final /* synthetic */ se41 this$0;

                            {
                                ne41 ne41Var;
                                zwf0 zwf0Var3;
                                zq6 zq6Var3;
                                ep41 ep41Var2;
                                WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1;
                                hg41 hg41Var;
                                this.this$0 = se41Var;
                                zwf0 zwf0Var4 = se41Var.c;
                                zq6 zq6Var4 = se41Var.d;
                                ep41 ep41Var3 = se41Var.n;
                                WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$12 = new WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1(1, se41Var, se41.class, "initBackPress", "initBackPress(Landroidx/lifecycle/LifecycleOwner;)V", 0);
                                WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2 webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2 = new WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2(0, se41Var, se41.class, "cancelBackPress", "cancelBackPress()V", 0);
                                vd41 vd41Var2 = se41Var.s;
                                ne41 ne41Var2 = se41Var.B;
                                if (ne41Var2 == null) {
                                    ne41Var = null;
                                    hg41Var = hg41.this;
                                    zwf0Var3 = zwf0Var4;
                                    zq6Var3 = zq6Var4;
                                    ep41Var2 = ep41Var3;
                                    webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 = webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$12;
                                } else {
                                    ne41Var = ne41Var2;
                                    zwf0Var3 = zwf0Var4;
                                    zq6Var3 = zq6Var4;
                                    ep41Var2 = ep41Var3;
                                    webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1 = webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$12;
                                    hg41Var = hg41.this;
                                }
                                this.lifecycleObserver = new h(hg41Var, zwf0Var3, zq6Var3, ep41Var2, webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1, webChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2, vd41Var2, ne41Var);
                                com.yandex.quark.webchat.observers.a aVar2 = new com.yandex.quark.webchat.observers.a(se41Var.t, new WebChatViewControllerImpl$observeLifecycle$1$authInvalidReloadObserver$1(0, se41Var, se41.class, "reloadPage", "reloadPage()V", 0));
                                this.authInvalidReloadObserver = aVar2;
                                this.screenshotObserver = null;
                                ne41 ne41Var3 = se41Var.B;
                                this.observers = scc.g(ne41Var3 != null ? ne41Var3 : null, aVar2);
                            }

                            public final com.yandex.quark.webchat.observers.a getAuthInvalidReloadObserver() {
                                return this.authInvalidReloadObserver;
                            }

                            public final h getLifecycleObserver() {
                                return this.lifecycleObserver;
                            }

                            public final pey getLifecycleOwner() {
                                return this.lifecycleOwner;
                            }

                            public final List<x0j> getObservers() {
                                return this.observers;
                            }

                            public final hgp0 getScreenshotObserver() {
                                return this.screenshotObserver;
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View v) {
                                pey peyVar;
                                pey o = vng.o(v);
                                if (o == null) {
                                    ny61.r("Lifecycle owner is null");
                                    return;
                                }
                                Lifecycle lifecycle = o.getLifecycle();
                                lifecycle.a(this.lifecycleObserver);
                                hgp0 hgp0Var = this.screenshotObserver;
                                if (hgp0Var != null) {
                                    lifecycle.a(hgp0Var);
                                }
                                Iterator<T> it = this.observers.iterator();
                                while (it.hasNext()) {
                                    lifecycle.a((oey) it.next());
                                }
                                this.lifecycleOwner = o;
                                tje.N(eja1.s(o), null, null, new WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$2(this.this$0, null), 3);
                                se41 se41Var2 = this.this$0;
                                pgq0 pgq0Var2 = se41Var2.u;
                                if (pgq0Var2 != null && (peyVar = this.lifecycleOwner) != null) {
                                    tje.N(eja1.s(peyVar), null, null, new WebChatViewControllerImpl$observeLifecycle$1$onViewAttachedToWindow$3$1(pgq0Var2, se41Var2, null), 3);
                                }
                                this.this$0.d.b(xq41.d);
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View v) {
                                Lifecycle lifecycle;
                                this.this$0.c.e("WebChatViewController", "WebView detached from window");
                                if (this.this$0.z.getValue() instanceof we41) {
                                    se41 se41Var2 = this.this$0;
                                    se41Var2.getClass();
                                    ke41 ke41Var3 = se41Var2.m;
                                    y3x0 y3x0Var2 = (y3x0) hg41.this;
                                    y3x0Var2.getClass();
                                    Bundle bundle3 = new Bundle();
                                    y3x0Var2.e.saveState(bundle3);
                                    ke41Var3.a = bundle3;
                                }
                                this.this$0.s.stop();
                                pey peyVar = this.lifecycleOwner;
                                if (peyVar != null && (lifecycle = peyVar.getLifecycle()) != null) {
                                    lifecycle.d(this.lifecycleObserver);
                                    hgp0 hgp0Var = this.screenshotObserver;
                                    if (hgp0Var != null) {
                                        lifecycle.d(hgp0Var);
                                    }
                                    for (x0j x0jVar : this.observers) {
                                        lifecycle.d(x0jVar);
                                        x0jVar.onDetach();
                                    }
                                    this.lifecycleOwner = null;
                                }
                                this.this$0.d.b(ar41.d);
                            }

                            public final void setLifecycleOwner(pey peyVar) {
                                this.lifecycleOwner = peyVar;
                            }
                        });
                        PackageInfo b = rm41.b(context2);
                        if (b == null || (str3 = b.versionName) == null) {
                            str3 = "unknown";
                        }
                        zq6Var2.b(new yq41(str3));
                        yq6Var2.e("WebChat.WebViewInitialized", SystemClock.uptimeMillis() - uptimeMillis, TimeUnit.MILLISECONDS);
                        return y3x0Var;
                    default:
                        WebChatContainerView webChatContainerView = new WebChatContainerView(se41Var.a, se41Var.a(), false);
                        se41Var.x = webChatContainerView.getInsetsController();
                        return webChatContainerView;
                }
            }
        });
        this.E = new w900(2, this);
    }

    public final hg41 a() {
        return (hg41) this.w.getValue();
    }
}
