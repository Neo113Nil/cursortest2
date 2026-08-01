package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p2.C4835j;
import q2.InterfaceC4899o0;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.So, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2783So implements t2.l, InterfaceC2708Oh {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4899o0 f27555A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f27556B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f27557n;

    /* renamed from: u, reason: collision with root package name */
    public final C5110a f27558u;

    /* renamed from: v, reason: collision with root package name */
    public C2749Qo f27559v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC4061vh f27560w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27561x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27562y;

    /* renamed from: z, reason: collision with root package name */
    public long f27563z;

    public C2783So(Context context, C5110a c5110a) {
        this.f27557n = context;
        this.f27558u = c5110a;
    }

    @Override // t2.l
    public final synchronized void H3(int i) {
        this.f27560w.destroy();
        if (!this.f27556B) {
            u2.z.k("Inspector closed.");
            InterfaceC4899o0 interfaceC4899o0 = this.f27555A;
            if (interfaceC4899o0 != null) {
                try {
                    interfaceC4899o0.o2(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f27562y = false;
        this.f27561x = false;
        this.f27563z = 0L;
        this.f27556B = false;
        this.f27555A = null;
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

    public final synchronized void a(InterfaceC4899o0 interfaceC4899o0, C3303hc c3303hc, C2818Vb c2818Vb, C3303hc c3303hc2) {
        if (c(interfaceC4899o0)) {
            try {
                C4835j c4835j = C4835j.f39733C;
                C2866Yb c2866Yb = c4835j.f39739d;
                InterfaceC4061vh g4 = C2866Yb.g(new X2.b(0, 0, 0), this.f27557n, null, new C3068d9(), null, null, null, null, null, null, null, "", null, this.f27558u, false, false);
                this.f27560w = g4;
                C2657Lh g02 = g4.g0();
                if (g02 == null) {
                    int i = u2.z.f41322b;
                    v2.i.f("Failed to obtain a web view for the ad inspector");
                    try {
                        c4835j.f39743h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        interfaceC4899o0.o2(SK.F(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e9) {
                        C4835j.f39733C.f39743h.d("InspectorUi.openInspector 3", e9);
                        return;
                    }
                }
                this.f27555A = interfaceC4899o0;
                Context context = this.f27557n;
                g02.i(null, null, null, null, null, false, null, null, null, null, null, null, null, c3303hc, null, new C2818Vb(6, context), c2818Vb, c3303hc2, null, null, null, null, null);
                g02.f26159z = this;
                this.f27560w.loadUrl((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.la));
                a4.e.n(context, new AdOverlayInfoParcel(this, this.f27560w, this.f27558u), true, null);
                c4835j.f39745k.getClass();
                this.f27563z = System.currentTimeMillis();
            } catch (C2521Dh e10) {
                int i6 = u2.z.f41322b;
                v2.i.g("Failed to obtain a web view for the ad inspector", e10);
                try {
                    C4835j.f39733C.f39743h.d("InspectorUi.openInspector 0", e10);
                    interfaceC4899o0.o2(SK.F(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e11) {
                    C4835j.f39733C.f39743h.d("InspectorUi.openInspector 1", e11);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.f27561x && this.f27562y) {
            AbstractC3413jg.f31273f.execute(new RunnableC3470kj(10, this));
        }
    }

    public final synchronized boolean c(InterfaceC4899o0 interfaceC4899o0) {
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ka)).booleanValue()) {
            int i = u2.z.f41322b;
            v2.i.f("Ad inspector had an internal error.");
            try {
                interfaceC4899o0.o2(SK.F(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f27559v == null) {
            int i6 = u2.z.f41322b;
            v2.i.f("Ad inspector had an internal error.");
            try {
                C4835j.f39733C.f39743h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                interfaceC4899o0.o2(SK.F(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f27561x && !this.f27562y) {
            C4835j.f39733C.f39745k.getClass();
            if (System.currentTimeMillis() >= this.f27563z + ((Integer) r1.f40210c.a(AbstractC3569ma.na)).intValue()) {
                return true;
            }
        }
        int i9 = u2.z.f41322b;
        v2.i.f("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC4899o0.o2(SK.F(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final synchronized void g() {
        this.f27562y = true;
        b();
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // t2.l
    public final void w0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2708Oh
    public final synchronized void z(String str, int i, String str2, boolean z3) {
        if (z3) {
            u2.z.k("Ad inspector loaded.");
            this.f27561x = true;
            b();
            return;
        }
        int i6 = u2.z.f41322b;
        v2.i.f("Ad inspector failed to load.");
        try {
            C3038cg c3038cg = C4835j.f39733C.f39743h;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            c3038cg.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            InterfaceC4899o0 interfaceC4899o0 = this.f27555A;
            if (interfaceC4899o0 != null) {
                interfaceC4899o0.o2(SK.F(17, null, null));
            }
        } catch (RemoteException e9) {
            C4835j.f39733C.f39743h.d("InspectorUi.onAdWebViewFinishedLoading 1", e9);
        }
        this.f27556B = true;
        this.f27560w.destroy();
    }
}
