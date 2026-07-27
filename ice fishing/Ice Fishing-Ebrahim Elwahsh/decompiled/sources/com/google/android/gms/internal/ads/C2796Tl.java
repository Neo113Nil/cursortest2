package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Tl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2796Tl implements InterfaceC2608Ik, s2.l, InterfaceC2506Ck {

    /* renamed from: n, reason: collision with root package name */
    public final Context f27818n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC3858rh f27819u;

    /* renamed from: v, reason: collision with root package name */
    public final Ut f27820v;

    /* renamed from: w, reason: collision with root package name */
    public final C5107a f27821w;

    /* renamed from: x, reason: collision with root package name */
    public final C3276gq f27822x;

    /* renamed from: y, reason: collision with root package name */
    public C3330hq f27823y;

    public C2796Tl(Context context, InterfaceC3858rh interfaceC3858rh, Ut ut, C5107a c5107a, C3276gq c3276gq) {
        this.f27818n = context;
        this.f27819u = interfaceC3858rh;
        this.f27820v = ut;
        this.f27821w = c5107a;
        this.f27822x = c3276gq;
    }

    @Override // s2.l
    public final void D0() {
    }

    @Override // s2.l
    public final void G2() {
    }

    @Override // s2.l
    public final void K1() {
    }

    @Override // s2.l
    public final void K2() {
    }

    @Override // s2.l
    public final void R0(int i) {
        this.f27823y = null;
    }

    @Override // s2.l
    public final void Y1() {
    }

    public final boolean a() {
        C2955aw c2955aw;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.k6)).booleanValue()) {
            return false;
        }
        C3276gq c3276gq = this.f27822x;
        synchronized (c3276gq) {
            c2955aw = c3276gq.f31109f;
        }
        return c2955aw != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        InterfaceC3858rh interfaceC3858rh;
        Ut ut = this.f27820v;
        if (!ut.f28133T || (interfaceC3858rh = this.f27819u) == null) {
            return;
        }
        p2.j jVar = p2.j.f39798C;
        C3431jl c3431jl = jVar.f39823x;
        Context context = this.f27818n;
        c3431jl.getClass();
        if (C3431jl.f(context)) {
            if (a()) {
                this.f27822x.b();
                return;
            }
            C5107a c5107a = this.f27821w;
            int i = c5107a.f41218u;
            int length = String.valueOf(i).length();
            int i4 = c5107a.f41219v;
            int i9 = 1;
            StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
            sb.append(i);
            sb.append(com.anythink.core.common.d.j.f12535z);
            sb.append(i4);
            String sb2 = sb.toString();
            C3761pr c3761pr = ut.f28135V;
            String str = c3761pr.H() + (-1) != 1 ? "javascript" : null;
            int i10 = 2;
            if (c3761pr.H() == 1) {
                i9 = 3;
            } else {
                i10 = ut.Y == 2 ? 4 : 1;
            }
            int i11 = i10;
            int i12 = i9;
            WebView s3 = interfaceC3858rh.s();
            C3431jl c3431jl2 = jVar.f39823x;
            c3431jl2.getClass();
            C3330hq h9 = C3431jl.h(i11, i12, s3, sb2, str, ut.f28161l0);
            this.f27823y = h9;
            if (h9 != null) {
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31703j6)).booleanValue();
                Wv wv = h9.f31272a;
                if (booleanValue) {
                    WebView s6 = interfaceC3858rh.s();
                    c3431jl2.getClass();
                    C3431jl.j(wv, s6);
                    Iterator it = interfaceC3858rh.B().iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        p2.j.f39798C.f39823x.getClass();
                        C3431jl.r(new RunnableC3167eq(wv, view, 0));
                    }
                } else {
                    View b02 = interfaceC3858rh.b0();
                    c3431jl2.getClass();
                    C3431jl.j(wv, b02);
                }
                interfaceC3858rh.o0(this.f27823y);
                p2.j.f39798C.f39823x.getClass();
                C3431jl.i(wv);
                interfaceC3858rh.a("onSdkLoaded", new s.b());
            }
        }
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final void g() {
        InterfaceC3858rh interfaceC3858rh;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31739n6)).booleanValue() || (interfaceC3858rh = this.f27819u) == null) {
            return;
        }
        if (this.f27823y != null || a()) {
            if (this.f27823y != null) {
                interfaceC3858rh.a("onSdkImpression", new s.b());
            } else {
                this.f27822x.c();
            }
        }
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        InterfaceC3858rh interfaceC3858rh;
        if (a()) {
            this.f27822x.c();
        } else {
            if (this.f27823y == null || (interfaceC3858rh = this.f27819u) == null) {
                return;
            }
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31739n6)).booleanValue()) {
                interfaceC3858rh.a("onSdkImpression", new s.b());
            }
        }
    }

    @Override // s2.l
    public final void y1() {
    }
}
