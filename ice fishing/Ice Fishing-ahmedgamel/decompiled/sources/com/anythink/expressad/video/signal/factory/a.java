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
    protected com.anythink.expressad.video.signal.a f22164a;

    /* renamed from: b, reason: collision with root package name */
    protected c f22165b;

    /* renamed from: c, reason: collision with root package name */
    protected j f22166c;

    /* renamed from: d, reason: collision with root package name */
    protected g f22167d;

    /* renamed from: e, reason: collision with root package name */
    protected e f22168e;

    /* renamed from: f, reason: collision with root package name */
    protected i f22169f;

    /* renamed from: g, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.b f22170g;

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        if (this.f22164a == null) {
            this.f22164a = new com.anythink.expressad.video.signal.a.a();
        }
        return this.f22164a;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f22169f == null) {
            this.f22169f = new f();
        }
        return this.f22169f;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f22170g == null) {
            this.f22170g = new com.anythink.expressad.video.signal.a.b();
        }
        return this.f22170g;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        if (this.f22165b == null) {
            this.f22165b = new com.anythink.expressad.video.signal.a.c();
        }
        return this.f22165b;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        if (this.f22168e == null) {
            this.f22168e = new d();
        }
        return this.f22168e;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f22167d == null) {
            this.f22167d = new com.anythink.expressad.video.signal.a.e();
        }
        return this.f22167d;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f22166c == null) {
            this.f22166c = new com.anythink.expressad.video.signal.a.g();
        }
        return this.f22166c;
    }
}
