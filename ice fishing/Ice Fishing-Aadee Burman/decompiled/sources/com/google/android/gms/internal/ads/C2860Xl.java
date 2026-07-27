package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Xl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2860Xl implements InterfaceC2643Kk, t2.l, InterfaceC2524Dk {

    /* renamed from: n, reason: collision with root package name */
    public final Context f28561n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4061vh f28562u;

    /* renamed from: v, reason: collision with root package name */
    public final St f28563v;

    /* renamed from: w, reason: collision with root package name */
    public final C5110a f28564w;

    /* renamed from: x, reason: collision with root package name */
    public final C3155eq f28565x;

    /* renamed from: y, reason: collision with root package name */
    public C3209fq f28566y;

    public C2860Xl(Context context, InterfaceC4061vh interfaceC4061vh, St st, C5110a c5110a, C3155eq c3155eq) {
        this.f28561n = context;
        this.f28562u = interfaceC4061vh;
        this.f28563v = st;
        this.f28564w = c5110a;
        this.f28565x = c3155eq;
    }

    @Override // t2.l
    public final void H3(int i) {
        this.f28566y = null;
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // t2.l
    public final void Q2() {
    }

    @Override // t2.l
    public final void R1() {
    }

    @Override // t2.l
    public final void S1() {
    }

    public final boolean a() {
        Yv yv;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32293k6)).booleanValue()) {
            return false;
        }
        C3155eq c3155eq = this.f28565x;
        synchronized (c3155eq) {
            yv = c3155eq.f29985f;
        }
        return yv != null;
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final void g() {
        InterfaceC4061vh interfaceC4061vh;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32320n6)).booleanValue() || (interfaceC4061vh = this.f28562u) == null) {
            return;
        }
        if (this.f28566y != null || a()) {
            if (this.f28566y != null) {
                interfaceC4061vh.d("onSdkImpression", new s.b());
            } else {
                this.f28565x.c();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    public final void h() {
        InterfaceC4061vh interfaceC4061vh;
        St st = this.f28563v;
        if (!st.f27600T || (interfaceC4061vh = this.f28562u) == null) {
            return;
        }
        C4835j c4835j = C4835j.f39730C;
        C3472kl c3472kl = c4835j.f39755x;
        Context context = this.f28561n;
        c3472kl.getClass();
        if (C3472kl.e(context)) {
            if (a()) {
                this.f28565x.b();
                return;
            }
            C5110a c5110a = this.f28564w;
            int i = c5110a.f41389u;
            int length = String.valueOf(i).length();
            int i6 = c5110a.f41390v;
            int i9 = 1;
            StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i6).length());
            sb.append(i);
            sb.append(com.anythink.core.common.d.j.f12378z);
            sb.append(i6);
            String sb2 = sb.toString();
            C3105du c3105du = st.f27602V;
            String str = c3105du.g() + (-1) != 1 ? "javascript" : null;
            int i10 = 2;
            if (c3105du.g() == 1) {
                i9 = 3;
            } else {
                i10 = st.Y == 2 ? 4 : 1;
            }
            int i11 = i10;
            int i12 = i9;
            WebView q8 = interfaceC4061vh.q();
            C3472kl c3472kl2 = c4835j.f39755x;
            c3472kl2.getClass();
            C3209fq g4 = C3472kl.g(i11, i12, q8, sb2, str, st.f27628l0);
            this.f28566y = g4;
            if (g4 != null) {
                boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.j6)).booleanValue();
                Uv uv = g4.f30456a;
                if (booleanValue) {
                    WebView q9 = interfaceC4061vh.q();
                    c3472kl2.getClass();
                    C3472kl.i(uv, q9);
                    Iterator it = interfaceC4061vh.P().iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        C4835j.f39730C.f39755x.getClass();
                        C3472kl.p(new RunnableC2995bq(uv, view, 0));
                    }
                } else {
                    View V8 = interfaceC4061vh.V();
                    c3472kl2.getClass();
                    C3472kl.i(uv, V8);
                }
                interfaceC4061vh.Q0(this.f28566y);
                C4835j.f39730C.f39755x.getClass();
                C3472kl.h(uv);
                interfaceC4061vh.d("onSdkLoaded", new s.b());
            }
        }
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        InterfaceC4061vh interfaceC4061vh;
        if (a()) {
            this.f28565x.c();
        } else {
            if (this.f28566y == null || (interfaceC4061vh = this.f28562u) == null) {
                return;
            }
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32320n6)).booleanValue()) {
                interfaceC4061vh.d("onSdkImpression", new s.b());
            }
        }
    }

    @Override // t2.l
    public final void w0() {
    }
}
