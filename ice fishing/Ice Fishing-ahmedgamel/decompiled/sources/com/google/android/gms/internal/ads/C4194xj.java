package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Iterator;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4194xj implements InterfaceC2663Kk, InterfaceC2544Dk {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35822n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4084vh f35823u;

    /* renamed from: v, reason: collision with root package name */
    public final St f35824v;

    /* renamed from: w, reason: collision with root package name */
    public final C5189a f35825w;

    /* renamed from: x, reason: collision with root package name */
    public C3232fq f35826x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f35827y;

    /* renamed from: z, reason: collision with root package name */
    public final C3178eq f35828z;

    public C4194xj(Context context, InterfaceC4084vh interfaceC4084vh, St st, C5189a c5189a, C3178eq c3178eq) {
        this.f35822n = context;
        this.f35823u = interfaceC4084vh;
        this.f35824v = st;
        this.f35825w = c5189a;
        this.f35828z = c3178eq;
    }

    public final synchronized void a() {
        InterfaceC4084vh interfaceC4084vh;
        int i;
        int i4;
        try {
            St st = this.f35824v;
            if (st.f28383T && (interfaceC4084vh = this.f35823u) != null) {
                Context context = this.f35822n;
                C4906k c4906k = C4906k.f40186C;
                c4906k.f40211x.getClass();
                if (C3495kl.e(context)) {
                    C5189a c5189a = this.f35825w;
                    int i6 = c5189a.f41846u;
                    int i9 = c5189a.f41847v;
                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 1 + String.valueOf(i9).length());
                    sb.append(i6);
                    sb.append(com.anythink.core.common.d.j.f13164z);
                    sb.append(i9);
                    String sb2 = sb.toString();
                    C3128du c3128du = st.f28385V;
                    String str = c3128du.g() + (-1) != 1 ? "javascript" : null;
                    if (c3128du.g() == 1) {
                        i = 2;
                        i4 = 3;
                    } else if (st.f28397e == 1) {
                        i = 3;
                        i4 = 1;
                    } else {
                        i = 1;
                        i4 = 1;
                    }
                    String str2 = st.f28411l0;
                    C3495kl c3495kl = c4906k.f40211x;
                    WebView q8 = interfaceC4084vh.q();
                    c3495kl.getClass();
                    C3232fq g9 = C3495kl.g(i, i4, q8, sb2, str, str2);
                    this.f35826x = g9;
                    if (g9 != null) {
                        Uv uv = g9.f31219a;
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.j6)).booleanValue()) {
                            C3495kl c3495kl2 = c4906k.f40211x;
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
                            c4906k.f40211x.getClass();
                            C3495kl.i(uv, V8);
                        }
                        interfaceC4084vh.P0(this.f35826x);
                        C4906k.f40186C.f40211x.getClass();
                        C3495kl.h(uv);
                        this.f35827y = true;
                        interfaceC4084vh.d("onSdkLoaded", new s.b());
                    }
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:21:0x0034, B:24:0x001d, B:28:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2663Kk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h() {
        boolean z6;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33072k6)).booleanValue()) {
            C3178eq c3178eq = this.f35828z;
            synchronized (c3178eq) {
                if (c3178eq.f30774f != null) {
                    z6 = true;
                }
            }
            if (!z6) {
                this.f35828z.b();
                return;
            } else {
                if (this.f35827y) {
                    return;
                }
                a();
                return;
            }
        }
        z6 = false;
        if (!z6) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:19:0x0032, B:20:0x0035, B:22:0x003b, B:24:0x003f, B:26:0x0043, B:31:0x001d, B:35:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0013, B:6:0x0015, B:10:0x001a, B:13:0x0025, B:17:0x002e, B:19:0x0032, B:20:0x0035, B:22:0x003b, B:24:0x003f, B:26:0x0043, B:31:0x001d, B:35:0x0021, B:8:0x0016), top: B:2:0x0001, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void v() {
        boolean z6;
        InterfaceC4084vh interfaceC4084vh;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33072k6)).booleanValue()) {
            C3178eq c3178eq = this.f35828z;
            synchronized (c3178eq) {
                if (c3178eq.f30774f != null) {
                    z6 = true;
                }
            }
            if (!z6) {
                this.f35828z.c();
                return;
            }
            if (!this.f35827y) {
                a();
            }
            if (!this.f35824v.f28383T || this.f35826x == null || (interfaceC4084vh = this.f35823u) == null) {
                return;
            }
            interfaceC4084vh.d("onSdkImpression", new s.b());
            return;
        }
        z6 = false;
        if (!z6) {
        }
    }
}
