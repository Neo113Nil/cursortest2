package com.anythink.expressad.video.signal.factory;

import com.anythink.expressad.video.signal.a.d;
import com.anythink.expressad.video.signal.a.f;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.video.signal.j;

/* loaded from: classes.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.a f22951a;

    /* renamed from: b, reason: collision with root package name */
    protected c f22952b;

    /* renamed from: c, reason: collision with root package name */
    protected j f22953c;

    /* renamed from: d, reason: collision with root package name */
    protected g f22954d;

    /* renamed from: e, reason: collision with root package name */
    protected e f22955e;

    /* renamed from: f, reason: collision with root package name */
    protected i f22956f;

    /* renamed from: g, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.b f22957g;

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        if (this.f22951a == null) {
            this.f22951a = new com.anythink.expressad.video.signal.a.a();
        }
        return this.f22951a;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f22956f == null) {
            this.f22956f = new f();
        }
        return this.f22956f;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f22957g == null) {
            this.f22957g = new com.anythink.expressad.video.signal.a.b();
        }
        return this.f22957g;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        if (this.f22952b == null) {
            this.f22952b = new com.anythink.expressad.video.signal.a.c();
        }
        return this.f22952b;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        if (this.f22955e == null) {
            this.f22955e = new d();
        }
        return this.f22955e;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f22954d == null) {
            this.f22954d = new com.anythink.expressad.video.signal.a.e();
        }
        return this.f22954d;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f22953c == null) {
            this.f22953c = new com.anythink.expressad.video.signal.a.g();
        }
        return this.f22953c;
    }
}
