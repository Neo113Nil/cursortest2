package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import q2.InterfaceC4906o0;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.To, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2799To implements s2.l, InterfaceC2639Kh {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC4906o0 f27829A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f27830B;

    /* renamed from: n, reason: collision with root package name */
    public final Context f27831n;

    /* renamed from: u, reason: collision with root package name */
    public final C5107a f27832u;

    /* renamed from: v, reason: collision with root package name */
    public C2748Qo f27833v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC3858rh f27834w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27835x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27836y;

    /* renamed from: z, reason: collision with root package name */
    public long f27837z;

    public C2799To(Context context, C5107a c5107a) {
        this.f27831n = context;
        this.f27832u = c5107a;
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
    public final synchronized void R0(int i) {
        this.f27834w.destroy();
        if (!this.f27830B) {
            t2.C.k("Inspector closed.");
            InterfaceC4906o0 interfaceC4906o0 = this.f27829A;
            if (interfaceC4906o0 != null) {
                try {
                    interfaceC4906o0.c0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f27836y = false;
        this.f27835x = false;
        this.f27837z = 0L;
        this.f27830B = false;
        this.f27829A = null;
    }

    @Override // s2.l
    public final void Y1() {
    }

    public final synchronized void a(InterfaceC4906o0 interfaceC4906o0, C3044cc c3044cc, C2752Rb c2752Rb, C3044cc c3044cc2) {
        if (c(interfaceC4906o0)) {
            try {
                p2.j jVar = p2.j.f39798C;
                C2837Wb c2837Wb = jVar.f39804d;
                InterfaceC3858rh g9 = C2837Wb.g(null, new W2.b(0, 0, 0), this.f27831n, null, new C2914a9(), null, null, null, null, null, null, null, "", this.f27832u, false, false);
                this.f27834w = g9;
                C2588Hh j02 = g9.j0();
                if (j02 == null) {
                    int i = t2.C.f40822b;
                    u2.i.f("Failed to obtain a web view for the ad inspector");
                    try {
                        jVar.f39808h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        interfaceC4906o0.c0(AbstractC3217fl.M(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e6) {
                        p2.j.f39798C.f39808h.d("InspectorUi.openInspector 3", e6);
                        return;
                    }
                }
                this.f27829A = interfaceC4906o0;
                Context context = this.f27831n;
                j02.l(null, null, null, null, null, false, null, null, null, null, null, null, null, c3044cc, null, new C2752Rb(6, context), c2752Rb, c3044cc2, null, null, null, null);
                j02.f25412z = this;
                this.f27834w.loadUrl((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.la));
                L2.i.y(context, new AdOverlayInfoParcel(this, this.f27834w, this.f27832u), true, null);
                jVar.f39810k.getClass();
                this.f27837z = System.currentTimeMillis();
            } catch (C4290zh e9) {
                int i4 = t2.C.f40822b;
                u2.i.g("Failed to obtain a web view for the ad inspector", e9);
                try {
                    p2.j.f39798C.f39808h.d("InspectorUi.openInspector 0", e9);
                    interfaceC4906o0.c0(AbstractC3217fl.M(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    p2.j.f39798C.f39808h.d("InspectorUi.openInspector 1", e10);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.f27835x && this.f27836y) {
            AbstractC3212fg.f30743f.execute(new RunnableC3376ij(10, this));
        }
    }

    public final synchronized boolean c(InterfaceC4906o0 interfaceC4906o0) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ka)).booleanValue()) {
            int i = t2.C.f40822b;
            u2.i.f("Ad inspector had an internal error.");
            try {
                interfaceC4906o0.c0(AbstractC3217fl.M(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f27833v == null) {
            int i4 = t2.C.f40822b;
            u2.i.f("Ad inspector had an internal error.");
            try {
                p2.j.f39798C.f39808h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                interfaceC4906o0.c0(AbstractC3217fl.M(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f27835x && !this.f27836y) {
            p2.j.f39798C.f39810k.getClass();
            if (System.currentTimeMillis() >= this.f27837z + ((Integer) r1.f40119c.a(AbstractC3368ia.na)).intValue()) {
                return true;
            }
        }
        int i9 = t2.C.f40822b;
        u2.i.f("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC4906o0.c0(AbstractC3217fl.M(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // s2.l
    public final void f1() {
    }

    @Override // s2.l
    public final synchronized void g() {
        this.f27836y = true;
        b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2639Kh
    public final synchronized void k(String str, int i, String str2, boolean z8) {
        if (z8) {
            t2.C.k("Ad inspector loaded.");
            this.f27835x = true;
            b();
            return;
        }
        int i4 = t2.C.f40822b;
        u2.i.f("Ad inspector failed to load.");
        try {
            C2892Zf c2892Zf = p2.j.f39798C.f39808h;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            c2892Zf.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb.toString()));
            InterfaceC4906o0 interfaceC4906o0 = this.f27829A;
            if (interfaceC4906o0 != null) {
                interfaceC4906o0.c0(AbstractC3217fl.M(17, null, null));
            }
        } catch (RemoteException e6) {
            p2.j.f39798C.f39808h.d("InspectorUi.onAdWebViewFinishedLoading 1", e6);
        }
        this.f27830B = true;
        this.f27834w.destroy();
    }

    @Override // s2.l
    public final void o1() {
    }

    @Override // s2.l
    public final void u0() {
    }

    @Override // s2.l
    public final void y1() {
    }
}
