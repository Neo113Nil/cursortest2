package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import p2.C4831f;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Hq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2598Hq implements InterfaceC2844Wl {

    /* renamed from: A, reason: collision with root package name */
    public final Object f25386A;

    /* renamed from: B, reason: collision with root package name */
    public Object f25387B;

    /* renamed from: C, reason: collision with root package name */
    public Object f25388C;

    /* renamed from: n, reason: collision with root package name */
    public boolean f25389n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25390u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f25391v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f25392w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f25393x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f25394y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f25395z;

    public C2598Hq(Context context, C5110a c5110a, C3467kg c3467kg, St st, InterfaceC4061vh interfaceC4061vh, C3052cu c3052cu, boolean z3, C3357ic c3357ic, BinderC2880Yp binderC2880Yp, C3153eo c3153eo) {
        this.f25390u = context;
        this.f25391v = c5110a;
        this.f25392w = c3467kg;
        this.f25393x = st;
        this.f25394y = interfaceC4061vh;
        this.f25395z = c3052cu;
        this.f25386A = c3357ic;
        this.f25389n = z3;
        this.f25387B = binderC2880Yp;
        this.f25388C = c3153eo;
    }

    public void a(Runnable runnable) {
        ((Handler) ((InterfaceC3231gB) this.f25391v).mo15c()).post(new IA(this, runnable, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void e(boolean z3, Context context, C2473Ak c2473Ak) {
        boolean z6;
        boolean z9;
        boolean z10;
        float f3;
        boolean z11;
        C3739pi c3739pi = (C3739pi) QC.w((C3467kg) this.f25392w);
        InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) this.f25394y;
        interfaceC4061vh.i1(true);
        C3357ic c3357ic = (C3357ic) this.f25386A;
        boolean z12 = this.f25389n;
        boolean z13 = false;
        boolean a9 = z12 ? c3357ic.a(false) : false;
        u2.D d2 = C4835j.f39733C.f39738c;
        boolean i = u2.D.i((Context) this.f25390u);
        if (z12) {
            synchronized (c3357ic) {
                z11 = c3357ic.f31054b;
            }
            if (!z11) {
                z6 = a9;
                z9 = i;
                z10 = false;
                z13 = true;
                if (z13) {
                    f3 = 0.0f;
                } else {
                    synchronized (c3357ic) {
                        f3 = c3357ic.f31055c;
                    }
                }
                float f9 = f3;
                St st = (St) this.f25393x;
                C4831f c4831f = new C4831f(z6, z9, z10, f9, z3, st.f27595O, false);
                if (c2473Ak != null) {
                    c2473Ak.Q1();
                }
                C2796Tl c2796Tl = (C2796Tl) c3739pi.f33100V0.f();
                Wt wt = st.f27640s;
                a4.e.n(context, new AdOverlayInfoParcel(c2796Tl, interfaceC4061vh, st.f27597Q, (C5110a) this.f25391v, st.f27576B, c4831f, wt.f28427b, wt.f28426a, ((C3052cu) this.f25395z).f29626g, c2473Ak, !st.b() ? (BinderC2880Yp) this.f25387B : null, interfaceC4061vh.p()), true, (C3153eo) this.f25388C);
            }
            z13 = true;
        }
        z6 = a9;
        z9 = i;
        z10 = z13;
        if (z13) {
        }
        float f92 = f3;
        St st2 = (St) this.f25393x;
        C4831f c4831f2 = new C4831f(z6, z9, z10, f92, z3, st2.f27595O, false);
        if (c2473Ak != null) {
        }
        C2796Tl c2796Tl2 = (C2796Tl) c3739pi.f33100V0.f();
        Wt wt2 = st2.f27640s;
        a4.e.n(context, new AdOverlayInfoParcel(c2796Tl2, interfaceC4061vh, st2.f27597Q, (C5110a) this.f25391v, st2.f27576B, c4831f2, wt2.f28427b, wt2.f28426a, ((C3052cu) this.f25395z).f29626g, c2473Ak, !st2.b() ? (BinderC2880Yp) this.f25387B : null, interfaceC4061vh.p()), true, (C3153eo) this.f25388C);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2844Wl
    public St f() {
        return (St) this.f25393x;
    }

    public C2598Hq() {
        this.f25390u = new HashMap();
        this.f25391v = new HashMap();
        this.f25392w = new HashMap();
        this.f25393x = new HashSet();
        this.f25394y = new HashSet();
        this.f25395z = new HashSet();
        this.f25386A = new HashMap();
        this.f25387B = new HashSet();
        this.f25388C = new WeakHashMap();
    }

    public C2598Hq(Context context, C3933tE c3933tE, Intent intent) {
        this.f25394y = new ArrayList();
        this.f25390u = context;
        this.f25392w = c3933tE;
        this.f25393x = "OverlayDisplayService";
        this.f25395z = intent;
        this.f25391v = AbstractC3043cl.e(new C3586mr((byte) 0, 18));
        this.f25386A = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.HA
            @Override // android.os.IBinder.DeathRecipient
            public final /* synthetic */ void binderDied() {
                C2598Hq c2598Hq = C2598Hq.this;
                ((C3933tE) c2598Hq.f25392w).a("%s : Binder has died.", (String) c2598Hq.f25393x);
                ArrayList arrayList = (ArrayList) c2598Hq.f25394y;
                synchronized (arrayList) {
                    arrayList.clear();
                }
            }
        };
    }
}
