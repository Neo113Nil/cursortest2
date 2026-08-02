package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import r2.C4902g;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3877rq implements InterfaceC2883Xl {

    /* renamed from: A, reason: collision with root package name */
    public final BinderC2903Yp f34520A;

    /* renamed from: B, reason: collision with root package name */
    public final C3230fo f34521B;

    /* renamed from: n, reason: collision with root package name */
    public final C5189a f34522n;

    /* renamed from: u, reason: collision with root package name */
    public final C3490kg f34523u;

    /* renamed from: v, reason: collision with root package name */
    public final St f34524v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4084vh f34525w;

    /* renamed from: x, reason: collision with root package name */
    public final C3075cu f34526x;

    /* renamed from: y, reason: collision with root package name */
    public final C3380ic f34527y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f34528z;

    public C3877rq(C5189a c5189a, C3490kg c3490kg, St st, InterfaceC4084vh interfaceC4084vh, C3075cu c3075cu, boolean z6, C3380ic c3380ic, BinderC2903Yp binderC2903Yp, C3230fo c3230fo) {
        this.f34522n = c5189a;
        this.f34523u = c3490kg;
        this.f34524v = st;
        this.f34525w = interfaceC4084vh;
        this.f34526x = c3075cu;
        this.f34528z = z6;
        this.f34527y = c3380ic;
        this.f34520A = binderC2903Yp;
        this.f34521B = c3230fo;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z6, Context context, C2493Ak c2493Ak) {
        boolean z9;
        float f2;
        int i;
        boolean z10;
        C3385ii c3385ii = (C3385ii) QC.w(this.f34523u);
        InterfaceC4084vh interfaceC4084vh = this.f34525w;
        interfaceC4084vh.g1(true);
        C3380ic c3380ic = this.f34527y;
        boolean z11 = this.f34528z;
        boolean a9 = z11 ? c3380ic.a(true) : true;
        boolean z12 = false;
        if (z11) {
            synchronized (c3380ic) {
                z10 = c3380ic.f31825b;
            }
            if (!z10) {
                z9 = false;
                z12 = true;
                if (z12) {
                    f2 = 0.0f;
                } else {
                    synchronized (c3380ic) {
                        f2 = c3380ic.f31826c;
                    }
                }
                float f9 = f2;
                St st = this.f34524v;
                C4902g c4902g = new C4902g(a9, true, z9, f9, z6, st.f28378O, false);
                if (c2493Ak != null) {
                    c2493Ak.R1();
                }
                c4.e eVar = C4906k.f40186C.f40190b;
                C2834Ul c2834Ul = (C2834Ul) c3385ii.f31861Q0.f();
                C3075cu c3075cu = this.f34526x;
                i = st.f28380Q;
                if (i == -1) {
                    s2.i1 i1Var = c3075cu.f30399k;
                    if (i1Var != null) {
                        int i4 = i1Var.f40476n;
                        if (i4 == 1) {
                            i = 7;
                        } else if (i4 == 2) {
                            i = 6;
                        }
                    }
                    int i6 = w2.z.f41712b;
                    x2.i.a("Error setting app open orientation; no targeting orientation available.");
                }
                Wt wt = st.f28423s;
                c4.e.q(context, new AdOverlayInfoParcel(c2834Ul, interfaceC4084vh, i, this.f34522n, st.f28359B, c4902g, wt.f29209b, wt.f29208a, c3075cu.f30396g, c2493Ak, !st.b() ? this.f34520A : null, interfaceC4084vh.p()), true, this.f34521B);
            }
            z12 = true;
        }
        z9 = z12;
        if (z12) {
        }
        float f92 = f2;
        St st2 = this.f34524v;
        C4902g c4902g2 = new C4902g(a9, true, z9, f92, z6, st2.f28378O, false);
        if (c2493Ak != null) {
        }
        c4.e eVar2 = C4906k.f40186C.f40190b;
        C2834Ul c2834Ul2 = (C2834Ul) c3385ii.f31861Q0.f();
        C3075cu c3075cu2 = this.f34526x;
        i = st2.f28380Q;
        if (i == -1) {
        }
        Wt wt2 = st2.f28423s;
        c4.e.q(context, new AdOverlayInfoParcel(c2834Ul2, interfaceC4084vh, i, this.f34522n, st2.f28359B, c4902g2, wt2.f29209b, wt2.f29208a, c3075cu2.f30396g, c2493Ak, !st2.b() ? this.f34520A : null, interfaceC4084vh.p()), true, this.f34521B);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2883Xl
    public final St f() {
        return this.f34524v;
    }
}
