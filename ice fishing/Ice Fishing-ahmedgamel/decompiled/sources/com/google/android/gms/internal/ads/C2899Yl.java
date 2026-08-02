package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Yl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2899Yl implements InterfaceC2663Kk, v2.l, InterfaceC2544Dk {

    /* renamed from: n, reason: collision with root package name */
    public final Context f29506n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4084vh f29507u;

    /* renamed from: v, reason: collision with root package name */
    public final St f29508v;

    /* renamed from: w, reason: collision with root package name */
    public final C5189a f29509w;

    /* renamed from: x, reason: collision with root package name */
    public final C3178eq f29510x;

    /* renamed from: y, reason: collision with root package name */
    public C3232fq f29511y;

    public C2899Yl(Context context, InterfaceC4084vh interfaceC4084vh, St st, C5189a c5189a, C3178eq c3178eq) {
        this.f29506n = context;
        this.f29507u = interfaceC4084vh;
        this.f29508v = st;
        this.f29509w = c5189a;
        this.f29510x = c3178eq;
    }

    @Override // v2.l
    public final void C3(int i) {
        this.f29511y = null;
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // v2.l
    public final void N2() {
    }

    @Override // v2.l
    public final void Q1() {
    }

    @Override // v2.l
    public final void S1() {
    }

    public final boolean a() {
        Zv zv;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33072k6)).booleanValue()) {
            return false;
        }
        C3178eq c3178eq = this.f29510x;
        synchronized (c3178eq) {
            zv = c3178eq.f30774f;
        }
        return zv != null;
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // v2.l
    public final void g() {
        InterfaceC4084vh interfaceC4084vh;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33101n6)).booleanValue() || (interfaceC4084vh = this.f29507u) == null) {
            return;
        }
        if (this.f29511y != null || a()) {
            if (this.f29511y != null) {
                interfaceC4084vh.d("onSdkImpression", new s.b());
            } else {
                this.f29510x.c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    public final void h() {
        InterfaceC4084vh interfaceC4084vh;
        St st = this.f29508v;
        if (!st.f28383T || (interfaceC4084vh = this.f29507u) == null) {
            return;
        }
        C4906k c4906k = C4906k.f40186C;
        C3495kl c3495kl = c4906k.f40211x;
        Context context = this.f29506n;
        c3495kl.getClass();
        if (C3495kl.e(context)) {
            if (a()) {
                this.f29510x.b();
                return;
            }
            C5189a c5189a = this.f29509w;
            int i = c5189a.f41846u;
            int length = String.valueOf(i).length();
            int i4 = c5189a.f41847v;
            int i6 = 1;
            StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i4).length());
            sb.append(i);
            sb.append(com.anythink.core.common.d.j.f13164z);
            sb.append(i4);
            String sb2 = sb.toString();
            C3128du c3128du = st.f28385V;
            String str = c3128du.g() + (-1) != 1 ? "javascript" : null;
            int i9 = 2;
            if (c3128du.g() == 1) {
                i6 = 3;
            } else {
                i9 = st.Y == 2 ? 4 : 1;
            }
            int i10 = i9;
            int i11 = i6;
            WebView q8 = interfaceC4084vh.q();
            C3495kl c3495kl2 = c4906k.f40211x;
            c3495kl2.getClass();
            C3232fq g9 = C3495kl.g(i10, i11, q8, sb2, str, st.f28411l0);
            this.f29511y = g9;
            if (g9 != null) {
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.j6)).booleanValue();
                Uv uv = g9.f31219a;
                if (booleanValue) {
                    WebView q9 = interfaceC4084vh.q();
                    c3495kl2.getClass();
                    C3495kl.i(uv, q9);
                    Iterator it = interfaceC4084vh.P().iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        C4906k.f40186C.f40211x.getClass();
                        C3495kl.p(new RunnableC3018bq(uv, view, 0));
                    }
                } else {
                    View V8 = interfaceC4084vh.V();
                    c3495kl2.getClass();
                    C3495kl.i(uv, V8);
                }
                interfaceC4084vh.P0(this.f29511y);
                C4906k.f40186C.f40211x.getClass();
                C3495kl.h(uv);
                interfaceC4084vh.d("onSdkLoaded", new s.b());
            }
        }
    }

    @Override // v2.l
    public final void h1() {
    }

    @Override // v2.l
    public final void r1() {
    }

    @Override // v2.l
    public final void t0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        InterfaceC4084vh interfaceC4084vh;
        if (a()) {
            this.f29510x.c();
        } else {
            if (this.f29511y == null || (interfaceC4084vh = this.f29507u) == null) {
                return;
            }
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33101n6)).booleanValue()) {
                interfaceC4084vh.d("onSdkImpression", new s.b());
            }
        }
    }
}
