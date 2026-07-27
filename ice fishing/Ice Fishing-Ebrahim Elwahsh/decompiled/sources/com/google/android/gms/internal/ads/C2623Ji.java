package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ji, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2623Ji implements InterfaceC2523Dk {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25788n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25789u;

    public /* synthetic */ C2623Ji(int i, Object obj) {
        this.f25788n = i;
        this.f25789u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void b(Context context) {
        Object obj = this.f25789u;
        switch (this.f25788n) {
            case 0:
                try {
                    try {
                        ((C3656nu) obj).f33064a.l();
                        return;
                    } catch (Throwable th) {
                        throw new C3334hu(th);
                    }
                } catch (C3334hu e6) {
                    int i = t2.C.f40822b;
                    u2.i.g("Cannot invoke onDestroy for the mediation adapter.", e6);
                    return;
                }
            default:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void o(Context context) {
        Object obj = this.f25789u;
        switch (this.f25788n) {
            case 0:
                try {
                    try {
                        ((C3656nu) obj).f33064a.k();
                        return;
                    } catch (Throwable th) {
                        throw new C3334hu(th);
                    }
                } catch (C3334hu e6) {
                    int i = t2.C.f40822b;
                    u2.i.g("Cannot invoke onPause for the mediation adapter.", e6);
                    return;
                }
            default:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2523Dk
    public final void q(Context context) {
        C3334hu c3334hu;
        Object obj = this.f25789u;
        switch (this.f25788n) {
            case 0:
                try {
                    InterfaceC3531ld interfaceC3531ld = ((C3656nu) obj).f33064a;
                    try {
                        interfaceC3531ld.m();
                        if (context != null) {
                            try {
                                interfaceC3531ld.a0(new V2.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (C3334hu e6) {
                    int i = t2.C.f40822b;
                    u2.i.g("Cannot invoke onResume for the mediation adapter.", e6);
                    return;
                }
            default:
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
                if (interfaceC3858rh != null) {
                    interfaceC3858rh.onResume();
                    return;
                }
                return;
        }
    }
}
