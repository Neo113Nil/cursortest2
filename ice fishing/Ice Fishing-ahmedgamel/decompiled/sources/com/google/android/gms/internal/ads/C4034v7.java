package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.v7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4034v7 implements InterfaceC3055cx {

    /* renamed from: a, reason: collision with root package name */
    public final Ew f34665a;

    /* renamed from: b, reason: collision with root package name */
    public final C2570Gf f34666b;

    /* renamed from: c, reason: collision with root package name */
    public final C7 f34667c;

    /* renamed from: d, reason: collision with root package name */
    public final C3926t7 f34668d;

    /* renamed from: e, reason: collision with root package name */
    public final C3657o7 f34669e;

    /* renamed from: f, reason: collision with root package name */
    public final E7 f34670f;

    /* renamed from: g, reason: collision with root package name */
    public final F0 f34671g;

    /* renamed from: h, reason: collision with root package name */
    public final Qx f34672h;

    public C4034v7(Ew ew, C2570Gf c2570Gf, C7 c72, C3926t7 c3926t7, C3657o7 c3657o7, E7 e72, F0 f02, Qx qx) {
        this.f34665a = ew;
        this.f34666b = c2570Gf;
        this.f34667c = c72;
        this.f34668d = c3926t7;
        this.f34669e = c3657o7;
        this.f34670f = e72;
        this.f34671g = f02;
        this.f34672h = qx;
    }

    public final HashMap a() {
        long j6;
        HashMap hashMap = new HashMap();
        Ew ew = this.f34665a;
        j3.m mVar = (j3.m) this.f34666b.f25045x;
        H6 h62 = Hw.f25412a;
        if (mVar.i()) {
            h62 = (H6) mVar.g();
        }
        hashMap.put("v", ew.f24682a);
        hashMap.put("gms", Boolean.valueOf(ew.f24684c));
        hashMap.put("gv", Long.valueOf(h62.x0()));
        hashMap.put("int", h62.v0());
        hashMap.put("attts", Long.valueOf(h62.A0().B()));
        hashMap.put("att", h62.A0().D());
        hashMap.put("attkid", h62.A0().C());
        hashMap.put("up", Boolean.valueOf(this.f34668d.f34220a));
        hashMap.put("t", new Throwable());
        F0 f02 = this.f34671g;
        hashMap.put("tcq", Long.valueOf(f02.f24701a));
        hashMap.put("tpq", Long.valueOf(f02.f24702b));
        hashMap.put("tcv", Long.valueOf(f02.f24703c));
        hashMap.put("tpv", Long.valueOf(f02.f24704d));
        hashMap.put("tchv", Long.valueOf(f02.f24705e));
        hashMap.put("tphv", Long.valueOf(f02.f24706f));
        hashMap.put("tcc", Long.valueOf(f02.f24707g));
        hashMap.put("tpc", Long.valueOf(f02.f24708h));
        C3657o7 c3657o7 = this.f34669e;
        if (c3657o7 != null) {
            synchronized (C3657o7.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) c3657o7.f32862u;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j6 = 2;
                        } else if (((NetworkCapabilities) c3657o7.f32862u).hasTransport(1)) {
                            j6 = 1;
                        } else if (((NetworkCapabilities) c3657o7.f32862u).hasTransport(0)) {
                            j6 = 0;
                        }
                    }
                    j6 = -1;
                } finally {
                }
            }
            hashMap.put(com.anythink.expressad.foundation.g.a.f19075W, Long.valueOf(j6));
        }
        E7 e72 = this.f34670f;
        hashMap.put("vs", Long.valueOf(e72.f24545d ? e72.f24543b - e72.f24542a : -1L));
        long j9 = e72.f24544c;
        e72.f24544c = -1L;
        hashMap.put("vf", Long.valueOf(j9));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap d() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap f() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap i() {
        HashMap a9 = a();
        Qx qx = this.f34672h;
        List list = (List) qx.f27139u;
        qx.f27139u = Collections.EMPTY_LIST;
        a9.put(com.anythink.expressad.foundation.d.d.f18557E, list);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap o() {
        HashMap a9 = a();
        C7 c72 = this.f34667c;
        if (c72.f24047E <= -2) {
            WeakReference weakReference = c72.f24043A;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                c72.f24047E = -3L;
            }
        }
        a9.put("lts", Long.valueOf(c72.f24047E));
        return a9;
    }
}
