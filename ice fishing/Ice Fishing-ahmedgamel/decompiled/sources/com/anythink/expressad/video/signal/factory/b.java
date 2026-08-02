package com.anythink.expressad.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.a.h;
import com.anythink.expressad.video.signal.a.j;
import com.anythink.expressad.video.signal.a.k;
import com.anythink.expressad.video.signal.a.l;
import com.anythink.expressad.video.signal.a.m;
import com.anythink.expressad.video.signal.a.n;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import java.util.List;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: h, reason: collision with root package name */
    private Activity f22958h;
    private WebView i;

    /* renamed from: j, reason: collision with root package name */
    private AnythinkVideoView f22959j;

    /* renamed from: k, reason: collision with root package name */
    private AnythinkContainerView f22960k;

    /* renamed from: l, reason: collision with root package name */
    private d f22961l;

    /* renamed from: m, reason: collision with root package name */
    private AnythinkBTContainer f22962m;

    /* renamed from: n, reason: collision with root package name */
    private List<d> f22963n;

    /* renamed from: o, reason: collision with root package name */
    private c.a f22964o;

    /* renamed from: p, reason: collision with root package name */
    private String f22965p;

    public b(Activity activity) {
        this.f22958h = activity;
    }

    public final void a(j jVar) {
        this.f22952b = jVar;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f22951a == null) {
            this.f22951a = new h(webView);
        }
        return this.f22951a;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.f22960k;
        if (anythinkContainerView == null || (activity = this.f22958h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f22956f == null) {
            this.f22956f = new m(activity, anythinkContainerView);
        }
        return this.f22956f;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f22958h == null || this.f22962m == null) {
            return super.getJSBTModule();
        }
        if (this.f22957g == null) {
            this.f22957g = new com.anythink.expressad.video.signal.a.i(this.f22958h, this.f22962m);
        }
        return this.f22957g;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        d dVar;
        List<d> list;
        Activity activity = this.f22958h;
        if (activity == null || (dVar = this.f22961l) == null) {
            return super.getJSCommon();
        }
        if (this.f22952b == null) {
            this.f22952b = new j(activity, dVar);
        }
        if (this.f22961l.k() == 5 && (list = this.f22963n) != null) {
            c cVar = this.f22952b;
            if (cVar instanceof j) {
                ((j) cVar).a(list);
            }
        }
        this.f22952b.a(this.f22958h);
        this.f22952b.a(this.f22965p);
        this.f22952b.a(this.f22964o);
        return this.f22952b;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.f22960k;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f22955e == null) {
            this.f22955e = new k(anythinkContainerView);
        }
        return this.f22955e;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f22954d == null) {
            this.f22954d = new l(webView);
        }
        return this.f22954d;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.f22959j;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f22953c == null) {
            this.f22953c = new n(anythinkVideoView);
        }
        return this.f22953c;
    }

    public final void a(List<d> list) {
        this.f22963n = list;
    }

    public b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.f22958h = activity;
        this.f22962m = anythinkBTContainer;
        this.i = webView;
    }

    private b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar) {
        this.f22958h = activity;
        this.i = webView;
        this.f22959j = anythinkVideoView;
        this.f22960k = anythinkContainerView;
        this.f22961l = dVar;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar, c.a aVar) {
        this.f22958h = activity;
        this.i = webView;
        this.f22959j = anythinkVideoView;
        this.f22960k = anythinkContainerView;
        this.f22961l = dVar;
        this.f22964o = aVar;
        this.f22965p = anythinkVideoView.getUnitId();
    }
}
