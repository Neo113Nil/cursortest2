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
    private Activity f22171h;
    private WebView i;

    /* renamed from: j, reason: collision with root package name */
    private AnythinkVideoView f22172j;

    /* renamed from: k, reason: collision with root package name */
    private AnythinkContainerView f22173k;

    /* renamed from: l, reason: collision with root package name */
    private d f22174l;

    /* renamed from: m, reason: collision with root package name */
    private AnythinkBTContainer f22175m;

    /* renamed from: n, reason: collision with root package name */
    private List<d> f22176n;

    /* renamed from: o, reason: collision with root package name */
    private c.a f22177o;

    /* renamed from: p, reason: collision with root package name */
    private String f22178p;

    public b(Activity activity) {
        this.f22171h = activity;
    }

    public final void a(j jVar) {
        this.f22165b = jVar;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f22164a == null) {
            this.f22164a = new h(webView);
        }
        return this.f22164a;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        Activity activity;
        AnythinkContainerView anythinkContainerView = this.f22173k;
        if (anythinkContainerView == null || (activity = this.f22171h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f22169f == null) {
            this.f22169f = new m(activity, anythinkContainerView);
        }
        return this.f22169f;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f22171h == null || this.f22175m == null) {
            return super.getJSBTModule();
        }
        if (this.f22170g == null) {
            this.f22170g = new com.anythink.expressad.video.signal.a.i(this.f22171h, this.f22175m);
        }
        return this.f22170g;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        d dVar;
        List<d> list;
        Activity activity = this.f22171h;
        if (activity == null || (dVar = this.f22174l) == null) {
            return super.getJSCommon();
        }
        if (this.f22165b == null) {
            this.f22165b = new j(activity, dVar);
        }
        if (this.f22174l.k() == 5 && (list = this.f22176n) != null) {
            c cVar = this.f22165b;
            if (cVar instanceof j) {
                ((j) cVar).a(list);
            }
        }
        this.f22165b.a(this.f22171h);
        this.f22165b.a(this.f22178p);
        this.f22165b.a(this.f22177o);
        return this.f22165b;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        AnythinkContainerView anythinkContainerView = this.f22173k;
        if (anythinkContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f22168e == null) {
            this.f22168e = new k(anythinkContainerView);
        }
        return this.f22168e;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f22167d == null) {
            this.f22167d = new l(webView);
        }
        return this.f22167d;
    }

    @Override // com.anythink.expressad.video.signal.factory.a, com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        AnythinkVideoView anythinkVideoView = this.f22172j;
        if (anythinkVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f22166c == null) {
            this.f22166c = new n(anythinkVideoView);
        }
        return this.f22166c;
    }

    public final void a(List<d> list) {
        this.f22176n = list;
    }

    public b(Activity activity, AnythinkBTContainer anythinkBTContainer, WebView webView) {
        this.f22171h = activity;
        this.f22175m = anythinkBTContainer;
        this.i = webView;
    }

    private b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar) {
        this.f22171h = activity;
        this.i = webView;
        this.f22172j = anythinkVideoView;
        this.f22173k = anythinkContainerView;
        this.f22174l = dVar;
    }

    public b(Activity activity, WebView webView, AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, d dVar, c.a aVar) {
        this.f22171h = activity;
        this.i = webView;
        this.f22172j = anythinkVideoView;
        this.f22173k = anythinkContainerView;
        this.f22174l = dVar;
        this.f22177o = aVar;
        this.f22178p = anythinkVideoView.getUnitId();
    }
}
