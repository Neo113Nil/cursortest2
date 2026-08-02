package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
import r2.C4896a;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.in, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3390in {

    /* renamed from: a, reason: collision with root package name */
    public final C3075cu f31887a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31888b;

    /* renamed from: c, reason: collision with root package name */
    public final C2649Jn f31889c;

    /* renamed from: d, reason: collision with root package name */
    public final C4252yn f31890d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f31891e;

    /* renamed from: f, reason: collision with root package name */
    public final C3230fo f31892f;

    /* renamed from: g, reason: collision with root package name */
    public final C4260yv f31893g;

    /* renamed from: h, reason: collision with root package name */
    public final C2821Tp f31894h;
    public final C3334hk i;

    /* renamed from: j, reason: collision with root package name */
    public final C3069co f31895j;

    /* renamed from: k, reason: collision with root package name */
    public final C3768po f31896k;

    public C3390in(C3075cu c3075cu, Executor executor, C2649Jn c2649Jn, Context context, C3230fo c3230fo, C4260yv c4260yv, C2821Tp c2821Tp, C4252yn c4252yn, C3069co c3069co, C3768po c3768po, C3334hk c3334hk) {
        this.f31887a = c3075cu;
        this.f31888b = executor;
        this.f31889c = c2649Jn;
        this.f31891e = context;
        this.f31892f = c3230fo;
        this.f31893g = c4260yv;
        this.f31894h = c2821Tp;
        this.f31890d = c4252yn;
        this.f31895j = c3069co;
        this.f31896k = c3768po;
        this.i = c3334hk;
    }

    public static final void b(InterfaceC4084vh interfaceC4084vh) {
        interfaceC4084vh.Z0("/videoClicked", AbstractC3218fc.f31043d);
        C2677Lh h02 = interfaceC4084vh.h0();
        synchronized (h02.f26953w) {
            h02.f26934K = true;
        }
        interfaceC4084vh.Z0("/getNativeAdViewSignals", AbstractC3218fc.f31052n);
        interfaceC4084vh.Z0("/getNativeClickMeta", AbstractC3218fc.f31053o);
    }

    public final void a(InterfaceC4084vh interfaceC4084vh, C4896a c4896a, C4244yf c4244yf) {
        C3768po c3768po;
        b(interfaceC4084vh);
        interfaceC4084vh.Z0("/video", AbstractC3218fc.f31046g);
        interfaceC4084vh.Z0("/videoMeta", AbstractC3218fc.f31047h);
        interfaceC4084vh.Z0("/precache", new C2950ac(26));
        interfaceC4084vh.Z0("/delayPageLoaded", AbstractC3218fc.f31049k);
        interfaceC4084vh.Z0("/instrument", AbstractC3218fc.i);
        interfaceC4084vh.Z0("/log", AbstractC3218fc.f31042c);
        Object obj = null;
        interfaceC4084vh.Z0("/click", new C3111dc(0, obj, obj));
        if (this.f31887a.f30391b != null) {
            C2677Lh h02 = interfaceC4084vh.h0();
            synchronized (h02.f26953w) {
                h02.f26936M = true;
            }
            interfaceC4084vh.Z0("/open", new C3648nc(true != ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.lf)).booleanValue() ? null : c4896a, null, null, null, null, null, this.i));
        } else {
            C2677Lh h03 = interfaceC4084vh.h0();
            synchronized (h03.f26953w) {
                h03.f26936M = false;
            }
        }
        if (C4906k.f40186C.f40212y.a(interfaceC4084vh.getContext())) {
            HashMap hashMap = new HashMap();
            if (interfaceC4084vh.J() != null) {
                hashMap = interfaceC4084vh.J().f28432w0;
            }
            interfaceC4084vh.Z0("/logScionEvent", new C3111dc(1, interfaceC4084vh.getContext(), hashMap));
        }
        C3324ha c3324ha = AbstractC3592ma.lf;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            interfaceC4084vh.h0().f26939P = c4896a;
            interfaceC4084vh.h0().f26941R = c4244yf;
        }
        if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.H8)).booleanValue() || (c3768po = this.f31896k) == null) {
            return;
        }
        interfaceC4084vh.Z0("/onDeviceStorageEvent", new C2841Vb(3, c3768po));
    }
}
