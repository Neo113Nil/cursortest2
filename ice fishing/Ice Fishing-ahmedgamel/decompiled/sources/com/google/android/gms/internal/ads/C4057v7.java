package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4057v7 implements InterfaceC3078cx {

    /* renamed from: a, reason: collision with root package name */
    public final Ew f35428a;

    /* renamed from: b, reason: collision with root package name */
    public final C2590Gf f35429b;

    /* renamed from: c, reason: collision with root package name */
    public final C7 f35430c;

    /* renamed from: d, reason: collision with root package name */
    public final C3949t7 f35431d;

    /* renamed from: e, reason: collision with root package name */
    public final C3680o7 f35432e;

    /* renamed from: f, reason: collision with root package name */
    public final E7 f35433f;

    /* renamed from: g, reason: collision with root package name */
    public final F0 f35434g;

    /* renamed from: h, reason: collision with root package name */
    public final Qx f35435h;

    public C4057v7(Ew ew, C2590Gf c2590Gf, C7 c72, C3949t7 c3949t7, C3680o7 c3680o7, E7 e72, F0 f02, Qx qx) {
        this.f35428a = ew;
        this.f35429b = c2590Gf;
        this.f35430c = c72;
        this.f35431d = c3949t7;
        this.f35432e = c3680o7;
        this.f35433f = e72;
        this.f35434g = f02;
        this.f35435h = qx;
    }

    public final HashMap a() {
        long j6;
        HashMap hashMap = new HashMap();
        Ew ew = this.f35428a;
        l3.m mVar = (l3.m) this.f35429b.f25833x;
        H6 h62 = Hw.f26155a;
        if (mVar.i()) {
            h62 = (H6) mVar.g();
        }
        hashMap.put("v", ew.f25438a);
        hashMap.put("gms", Boolean.valueOf(ew.f25440c));
        hashMap.put("gv", Long.valueOf(h62.x0()));
        hashMap.put("int", h62.v0());
        hashMap.put("attts", Long.valueOf(h62.A0().B()));
        hashMap.put("att", h62.A0().D());
        hashMap.put("attkid", h62.A0().C());
        hashMap.put("up", Boolean.valueOf(this.f35431d.f35006a));
        hashMap.put("t", new Throwable());
        F0 f02 = this.f35434g;
        hashMap.put("tcq", Long.valueOf(f02.f25457a));
        hashMap.put("tpq", Long.valueOf(f02.f25458b));
        hashMap.put("tcv", Long.valueOf(f02.f25459c));
        hashMap.put("tpv", Long.valueOf(f02.f25460d));
        hashMap.put("tchv", Long.valueOf(f02.f25461e));
        hashMap.put("tphv", Long.valueOf(f02.f25462f));
        hashMap.put("tcc", Long.valueOf(f02.f25463g));
        hashMap.put("tpc", Long.valueOf(f02.f25464h));
        C3680o7 c3680o7 = this.f35432e;
        if (c3680o7 != null) {
            synchronized (C3680o7.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) c3680o7.f33649u;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j6 = 2;
                        } else if (((NetworkCapabilities) c3680o7.f33649u).hasTransport(1)) {
                            j6 = 1;
                        } else if (((NetworkCapabilities) c3680o7.f33649u).hasTransport(0)) {
                            j6 = 0;
                        }
                    }
                    j6 = -1;
                } finally {
                }
            }
            hashMap.put(com.anythink.expressad.foundation.g.a.f19862W, Long.valueOf(j6));
        }
        E7 e72 = this.f35433f;
        hashMap.put("vs", Long.valueOf(e72.f25306d ? e72.f25304b - e72.f25303a : -1L));
        long j9 = e72.f25305c;
        e72.f25305c = -1L;
        hashMap.put("vf", Long.valueOf(j9));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap d() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap f() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap i() {
        HashMap a9 = a();
        Qx qx = this.f35435h;
        List list = (List) qx.f27895u;
        qx.f27895u = Collections.EMPTY_LIST;
        a9.put(com.anythink.expressad.foundation.d.d.f19344E, list);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap o() {
        HashMap a9 = a();
        C7 c72 = this.f35430c;
        if (c72.f24810E <= -2) {
            WeakReference weakReference = c72.f24806A;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                c72.f24810E = -3L;
            }
        }
        a9.put("lts", Long.valueOf(c72.f24810E));
        return a9;
    }
}
