package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import r2.C4906k;
import s2.InterfaceC4948o0;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2820To implements v2.l, InterfaceC2728Oh {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4948o0 f28584A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f28585B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f28586n;

    /* renamed from: u, reason: collision with root package name */
    public final C5189a f28587u;

    /* renamed from: v, reason: collision with root package name */
    public C2786Ro f28588v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC4084vh f28589w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28590x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f28591y;

    /* renamed from: z, reason: collision with root package name */
    public long f28592z;

    public C2820To(Context context, C5189a c5189a) {
        this.f28586n = context;
        this.f28587u = c5189a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2728Oh
    public final synchronized void C(String str, int i, String str2, boolean z6) {
        if (z6) {
            w2.z.k("Ad inspector loaded.");
            this.f28590x = true;
            b();
            return;
        }
        int i4 = w2.z.f41712b;
        x2.i.f("Ad inspector failed to load.");
        try {
            C3061cg c3061cg = C4906k.f40186C.f40196h;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            c3061cg.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            InterfaceC4948o0 interfaceC4948o0 = this.f28584A;
            if (interfaceC4948o0 != null) {
                interfaceC4948o0.a3(SK.F(17, null, null));
            }
        } catch (RemoteException e9) {
            C4906k.f40186C.f40196h.d("InspectorUi.onAdWebViewFinishedLoading 1", e9);
        }
        this.f28585B = true;
        this.f28589w.destroy();
    }

    @Override // v2.l
    public final synchronized void C3(int i) {
        this.f28589w.destroy();
        if (!this.f28585B) {
            w2.z.k("Inspector closed.");
            InterfaceC4948o0 interfaceC4948o0 = this.f28584A;
            if (interfaceC4948o0 != null) {
                try {
                    interfaceC4948o0.a3(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f28591y = false;
        this.f28590x = false;
        this.f28592z = 0L;
        this.f28585B = false;
        this.f28584A = null;
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

    public final synchronized void a(InterfaceC4948o0 interfaceC4948o0, C3326hc c3326hc, C2841Vb c2841Vb, C3326hc c3326hc2) {
        if (c(interfaceC4948o0)) {
            try {
                C4906k c4906k = C4906k.f40186C;
                C2889Yb c2889Yb = c4906k.f40192d;
                InterfaceC4084vh g9 = C2889Yb.g(new A3.r(0, 0, 0), this.f28586n, null, new C3091d9(), null, null, null, null, null, null, null, "", null, this.f28587u, false, false);
                this.f28589w = g9;
                C2677Lh h02 = g9.h0();
                if (h02 == null) {
                    int i = w2.z.f41712b;
                    x2.i.f("Failed to obtain a web view for the ad inspector");
                    try {
                        c4906k.f40196h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        interfaceC4948o0.a3(SK.F(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e9) {
                        C4906k.f40186C.f40196h.d("InspectorUi.openInspector 3", e9);
                        return;
                    }
                }
                this.f28584A = interfaceC4948o0;
                Context context = this.f28586n;
                h02.i(null, null, null, null, null, false, null, null, null, null, null, null, null, c3326hc, null, new C2841Vb(6, context), c2841Vb, c3326hc2, null, null, null, null, null);
                h02.f26956z = this;
                this.f28589w.loadUrl((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.la));
                c4.e.q(context, new AdOverlayInfoParcel(this, this.f28589w, this.f28587u), true, null);
                c4906k.f40198k.getClass();
                this.f28592z = System.currentTimeMillis();
            } catch (C2541Dh e10) {
                int i4 = w2.z.f41712b;
                x2.i.g("Failed to obtain a web view for the ad inspector", e10);
                try {
                    C4906k.f40186C.f40196h.d("InspectorUi.openInspector 0", e10);
                    interfaceC4948o0.a3(SK.F(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e11) {
                    C4906k.f40186C.f40196h.d("InspectorUi.openInspector 1", e11);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.f28590x && this.f28591y) {
            AbstractC3436jg.f32060f.execute(new RunnableC3493kj(10, this));
        }
    }

    public final synchronized boolean c(InterfaceC4948o0 interfaceC4948o0) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ka)).booleanValue()) {
            int i = w2.z.f41712b;
            x2.i.f("Ad inspector had an internal error.");
            try {
                interfaceC4948o0.a3(SK.F(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f28588v == null) {
            int i4 = w2.z.f41712b;
            x2.i.f("Ad inspector had an internal error.");
            try {
                C4906k.f40186C.f40196h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                interfaceC4948o0.a3(SK.F(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f28590x && !this.f28591y) {
            C4906k.f40186C.f40198k.getClass();
            if (System.currentTimeMillis() >= this.f28592z + ((Integer) r1.f40509c.a(AbstractC3592ma.na)).intValue()) {
                return true;
            }
        }
        int i6 = w2.z.f41712b;
        x2.i.f("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC4948o0.a3(SK.F(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // v2.l
    public final synchronized void g() {
        this.f28591y = true;
        b();
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
}
