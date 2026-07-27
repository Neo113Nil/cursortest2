package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p2.C4831f;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3854rq implements InterfaceC2844Wl {

    /* renamed from: A, reason: collision with root package name */
    public final BinderC2880Yp f33752A;

    /* renamed from: B, reason: collision with root package name */
    public final C3153eo f33753B;

    /* renamed from: n, reason: collision with root package name */
    public final C5110a f33754n;

    /* renamed from: u, reason: collision with root package name */
    public final C3467kg f33755u;

    /* renamed from: v, reason: collision with root package name */
    public final St f33756v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4061vh f33757w;

    /* renamed from: x, reason: collision with root package name */
    public final C3052cu f33758x;

    /* renamed from: y, reason: collision with root package name */
    public final C3357ic f33759y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f33760z;

    public C3854rq(C5110a c5110a, C3467kg c3467kg, St st, InterfaceC4061vh interfaceC4061vh, C3052cu c3052cu, boolean z3, C3357ic c3357ic, BinderC2880Yp binderC2880Yp, C3153eo c3153eo) {
        this.f33754n = c5110a;
        this.f33755u = c3467kg;
        this.f33756v = st;
        this.f33757w = interfaceC4061vh;
        this.f33758x = c3052cu;
        this.f33760z = z3;
        this.f33759y = c3357ic;
        this.f33752A = binderC2880Yp;
        this.f33753B = c3153eo;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z3, Context context, C2473Ak c2473Ak) {
        boolean z6;
        float f3;
        int i;
        boolean z9;
        C3362ii c3362ii = (C3362ii) QC.w(this.f33755u);
        InterfaceC4061vh interfaceC4061vh = this.f33757w;
        interfaceC4061vh.i1(true);
        C3357ic c3357ic = this.f33759y;
        boolean z10 = this.f33760z;
        boolean a9 = z10 ? c3357ic.a(true) : true;
        boolean z11 = false;
        if (z10) {
            synchronized (c3357ic) {
                z9 = c3357ic.f31054b;
            }
            if (!z9) {
                z6 = false;
                z11 = true;
                if (z11) {
                    f3 = 0.0f;
                } else {
                    synchronized (c3357ic) {
                        f3 = c3357ic.f31055c;
                    }
                }
                float f9 = f3;
                St st = this.f33756v;
                C4831f c4831f = new C4831f(a9, true, z6, f9, z3, st.f27595O, false);
                if (c2473Ak != null) {
                    c2473Ak.Q1();
                }
                a4.e eVar = C4835j.f39730C.f39734b;
                C2796Tl c2796Tl = (C2796Tl) c3362ii.f31097V0.f();
                C3052cu c3052cu = this.f33758x;
                i = st.f27597Q;
                if (i == -1) {
                    q2.i1 i1Var = c3052cu.f29629k;
                    if (i1Var != null) {
                        int i6 = i1Var.f40174n;
                        if (i6 == 1) {
                            i = 7;
                        } else if (i6 == 2) {
                            i = 6;
                        }
                    }
                    int i9 = u2.z.f41319b;
                    v2.i.a("Error setting app open orientation; no targeting orientation available.");
                }
                Wt wt = st.f27640s;
                a4.e.n(context, new AdOverlayInfoParcel(c2796Tl, interfaceC4061vh, i, this.f33754n, st.f27576B, c4831f, wt.f28427b, wt.f28426a, c3052cu.f29626g, c2473Ak, !st.b() ? this.f33752A : null, interfaceC4061vh.p()), true, this.f33753B);
            }
            z11 = true;
        }
        z6 = z11;
        if (z11) {
        }
        float f92 = f3;
        St st2 = this.f33756v;
        C4831f c4831f2 = new C4831f(a9, true, z6, f92, z3, st2.f27595O, false);
        if (c2473Ak != null) {
        }
        a4.e eVar2 = C4835j.f39730C.f39734b;
        C2796Tl c2796Tl2 = (C2796Tl) c3362ii.f31097V0.f();
        C3052cu c3052cu2 = this.f33758x;
        i = st2.f27597Q;
        if (i == -1) {
        }
        Wt wt2 = st2.f27640s;
        a4.e.n(context, new AdOverlayInfoParcel(c2796Tl2, interfaceC4061vh, i, this.f33754n, st2.f27576B, c4831f2, wt2.f28427b, wt2.f28426a, c3052cu2.f29626g, c2473Ak, !st2.b() ? this.f33752A : null, interfaceC4061vh.p()), true, this.f33753B);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public final St f() {
        return this.f33756v;
    }
}
