package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487ih extends M5 {

    /* renamed from: b, reason: collision with root package name */
    public final X4 f6192b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0462hh f6193c;

    /* renamed from: d, reason: collision with root package name */
    public final C3 f6194d;

    public C0487ih(X4 x4, InterfaceC0462hh interfaceC0462hh) {
        this(x4, interfaceC0462hh, new C3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0539kh load(L5 l5) {
        C0539kh c0539kh = (C0539kh) super.load(l5);
        c0539kh.f6384m = ((C0410fh) l5.componentArguments).f5983a;
        c0539kh.f6389r = this.f6192b.t.a();
        c0539kh.f6393w = this.f6192b.f5362q.a();
        C0410fh c0410fh = (C0410fh) l5.componentArguments;
        c0539kh.f6375d = c0410fh.f5984b;
        c0539kh.f6376e = c0410fh.f5985c;
        c0539kh.f6377f = c0410fh.f5986d;
        c0539kh.f6380i = c0410fh.f5987e;
        c0539kh.f6378g = c0410fh.f5988f;
        c0539kh.f6379h = c0410fh.f5989g;
        Boolean valueOf = Boolean.valueOf(c0410fh.f5990h);
        InterfaceC0462hh interfaceC0462hh = this.f6193c;
        c0539kh.f6381j = valueOf;
        c0539kh.f6382k = interfaceC0462hh;
        C0410fh c0410fh2 = (C0410fh) l5.componentArguments;
        c0539kh.f6392v = c0410fh2.f5992j;
        C0415fm c0415fm = l5.f4671a;
        C0552l4 c0552l4 = c0415fm.f6015n;
        c0539kh.f6385n = c0552l4.f6414a;
        C0873xe c0873xe = c0415fm.f6020s;
        if (c0873xe != null) {
            c0539kh.f6390s = c0873xe.f7198a;
            c0539kh.t = c0873xe.f7199b;
        }
        c0539kh.f6386o = c0552l4.f6415b;
        c0539kh.f6388q = c0415fm.f6006e;
        c0539kh.f6387p = c0415fm.f6012k;
        C3 c3 = this.f6194d;
        Map<String, String> map = c0410fh2.f5991i;
        C0914z3 f2 = C0610na.f6575I.f();
        c3.getClass();
        c0539kh.f6391u = C3.a(map, c0415fm, f2);
        c0539kh.f6394x = this.f6192b.f5366v.f6719e.keySet();
        return c0539kh;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0539kh(this.f6192b);
    }

    public C0487ih(X4 x4, InterfaceC0462hh interfaceC0462hh, C3 c3) {
        super(x4.getContext(), x4.b().c());
        this.f6192b = x4;
        this.f6193c = interfaceC0462hh;
        this.f6194d = c3;
    }

    public final C0539kh a() {
        return new C0539kh(this.f6192b);
    }
}
