package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4171xj implements InterfaceC2643Kk, InterfaceC2524Dk {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35043n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4061vh f35044u;

    /* renamed from: v, reason: collision with root package name */
    public final St f35045v;

    /* renamed from: w, reason: collision with root package name */
    public final C5110a f35046w;

    /* renamed from: x, reason: collision with root package name */
    public C3209fq f35047x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35048y;

    /* renamed from: z, reason: collision with root package name */
    public final C3155eq f35049z;

    public C4171xj(Context context, InterfaceC4061vh interfaceC4061vh, St st, C5110a c5110a, C3155eq c3155eq) {
        this.f35043n = context;
        this.f35044u = interfaceC4061vh;
        this.f35045v = st;
        this.f35046w = c5110a;
        this.f35049z = c3155eq;
    }

    public final synchronized void a() {
        InterfaceC4061vh interfaceC4061vh;
        int i;
        int i6;
        try {
            St st = this.f35045v;
            if (st.f27600T && (interfaceC4061vh = this.f35044u) != null) {
                Context context = this.f35043n;
                C4835j c4835j = C4835j.f39730C;
                c4835j.f39755x.getClass();
                if (C3472kl.e(context)) {
                    C5110a c5110a = this.f35046w;
                    int i9 = c5110a.f41389u;
                    int i10 = c5110a.f41390v;
                    StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 1 + String.valueOf(i10).length());
                    sb.append(i9);
                    sb.append(com.anythink.core.common.d.j.f12378z);
                    sb.append(i10);
                    String sb2 = sb.toString();
                    C3105du c3105du = st.f27602V;
                    String str = c3105du.g() + (-1) != 1 ? "javascript" : null;
                    if (c3105du.g() == 1) {
                        i = 2;
                        i6 = 3;
                    } else if (st.f27614e == 1) {
                        i = 3;
                        i6 = 1;
                    } else {
                        i = 1;
                        i6 = 1;
                    }
                    String str2 = st.f27628l0;
                    C3472kl c3472kl = c4835j.f39755x;
                    WebView q8 = interfaceC4061vh.q();
                    c3472kl.getClass();
                    C3209fq g4 = C3472kl.g(i, i6, q8, sb2, str, str2);
                    this.f35047x = g4;
                    if (g4 != null) {
                        Uv uv = g4.f30456a;
                        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.j6)).booleanValue()) {
                            C3472kl c3472kl2 = c4835j.f39755x;
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
                            c4835j.f39755x.getClass();
                            C3472kl.i(uv, V8);
                        }
                        interfaceC4061vh.Q0(this.f35047x);
                        C4835j.f39730C.f39755x.getClass();
                        C3472kl.h(uv);
                        this.f35048y = true;
                        interfaceC4061vh.d("onSdkLoaded", new s.b());
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2643Kk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h() {
        boolean z3;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32293k6)).booleanValue()) {
            C3155eq c3155eq = this.f35049z;
            synchronized (c3155eq) {
                if (c3155eq.f29985f != null) {
                    z3 = true;
                }
            }
            if (!z3) {
                this.f35049z.b();
                return;
            } else {
                if (this.f35048y) {
                    return;
                }
                a();
                return;
            }
        }
        z3 = false;
        if (!z3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:19:0x0032, B:20:0x0035, B:22:0x003b, B:24:0x003f, B:26:0x0043, B:31:0x001d, B:35:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:19:0x0032, B:20:0x0035, B:22:0x003b, B:24:0x003f, B:26:0x0043, B:31:0x001d, B:35:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void w() {
        boolean z3;
        InterfaceC4061vh interfaceC4061vh;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32293k6)).booleanValue()) {
            C3155eq c3155eq = this.f35049z;
            synchronized (c3155eq) {
                if (c3155eq.f29985f != null) {
                    z3 = true;
                }
            }
            if (!z3) {
                this.f35049z.c();
                return;
            }
            if (!this.f35048y) {
                a();
            }
            if (!this.f35045v.f27600T || this.f35047x == null || (interfaceC4061vh = this.f35044u) == null) {
                return;
            }
            interfaceC4061vh.d("onSdkImpression", new s.b());
            return;
        }
        z3 = false;
        if (!z3) {
        }
    }
}
