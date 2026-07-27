package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p2.C4856a;

/* renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3327hn {

    /* renamed from: a, reason: collision with root package name */
    public final C3226fu f31256a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31257b;

    /* renamed from: c, reason: collision with root package name */
    public final C2628Jn f31258c;

    /* renamed from: d, reason: collision with root package name */
    public final C4242yn f31259d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f31260e;

    /* renamed from: f, reason: collision with root package name */
    public final C3165eo f31261f;

    /* renamed from: g, reason: collision with root package name */
    public final Av f31262g;

    /* renamed from: h, reason: collision with root package name */
    public final C2834Vp f31263h;
    public final C3002bo i;

    /* renamed from: j, reason: collision with root package name */
    public final C3758po f31264j;

    public C3327hn(C3226fu c3226fu, Executor executor, C2628Jn c2628Jn, Context context, C3165eo c3165eo, Av av, C2834Vp c2834Vp, C4242yn c4242yn, C3002bo c3002bo, C3758po c3758po) {
        this.f31256a = c3226fu;
        this.f31257b = executor;
        this.f31258c = c2628Jn;
        this.f31260e = context;
        this.f31261f = c3165eo;
        this.f31262g = av;
        this.f31263h = c2834Vp;
        this.f31259d = c4242yn;
        this.i = c3002bo;
        this.f31264j = c3758po;
    }

    public static final void b(InterfaceC3858rh interfaceC3858rh) {
        interfaceC3858rh.N0("/videoClicked", AbstractC2935ac.f29213d);
        C2588Hh j02 = interfaceC3858rh.j0();
        synchronized (j02.f25409w) {
            j02.f25390K = true;
        }
        interfaceC3858rh.N0("/getNativeAdViewSignals", AbstractC2935ac.f29222n);
        interfaceC3858rh.N0("/getNativeClickMeta", AbstractC2935ac.f29223o);
    }

    public final void a(InterfaceC3858rh interfaceC3858rh, C4856a c4856a, C4072vf c4072vf) {
        C3758po c3758po;
        b(interfaceC3858rh);
        interfaceC3858rh.N0("/video", AbstractC2935ac.f29216g);
        interfaceC3858rh.N0("/videoMeta", AbstractC2935ac.f29217h);
        interfaceC3858rh.N0("/precache", new C2820Vb(26));
        interfaceC3858rh.N0("/delayPageLoaded", AbstractC2935ac.f29219k);
        interfaceC3858rh.N0("/instrument", AbstractC2935ac.i);
        interfaceC3858rh.N0("/log", AbstractC2935ac.f29212c);
        Object obj = null;
        interfaceC3858rh.N0("/click", new C2871Yb(0, obj, obj));
        if (this.f31256a.f30899b != null) {
            C2588Hh j02 = interfaceC3858rh.j0();
            synchronized (j02.f25409w) {
                j02.f25392M = true;
            }
            interfaceC3858rh.N0("/open", new C3370ic(true != ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ff)).booleanValue() ? null : c4856a, null, null, null, null, null));
        } else {
            C2588Hh j03 = interfaceC3858rh.j0();
            synchronized (j03.f25409w) {
                j03.f25392M = false;
            }
        }
        if (p2.j.f39798C.f39824y.a(interfaceC3858rh.getContext())) {
            HashMap hashMap = new HashMap();
            if (interfaceC3858rh.J() != null) {
                hashMap = interfaceC3858rh.J().f28182w0;
            }
            interfaceC3858rh.N0("/logScionEvent", new C2871Yb(1, interfaceC3858rh.getContext(), hashMap));
        }
        C3151ea c3151ea = AbstractC3368ia.ff;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            interfaceC3858rh.j0().f25395P = c4856a;
            interfaceC3858rh.j0().f25397R = c4072vf;
        }
        if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.H8)).booleanValue() || (c3758po = this.f31264j) == null) {
            return;
        }
        interfaceC3858rh.N0("/onDeviceStorageEvent", new C2752Rb(3, c3758po));
    }
}
