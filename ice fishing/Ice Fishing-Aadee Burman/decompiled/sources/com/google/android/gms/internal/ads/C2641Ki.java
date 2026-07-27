package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ki, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2641Ki implements InterfaceC2541Ek {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25962n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f25963u;

    public /* synthetic */ C2641Ki(int i, Object obj) {
        this.f25962n = i;
        this.f25963u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void a(Context context) {
        Object obj = this.f25963u;
        switch (this.f25962n) {
            case 0:
                try {
                    try {
                        ((C3535lu) obj).f31864a.n();
                        return;
                    } catch (Throwable th) {
                        throw new C3267gu(th);
                    }
                } catch (C3267gu e9) {
                    int i = u2.z.f41319b;
                    v2.i.g("Cannot invoke onDestroy for the mediation adapter.", e9);
                    return;
                }
            default:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void n(Context context) {
        Object obj = this.f25963u;
        switch (this.f25962n) {
            case 0:
                try {
                    try {
                        ((C3535lu) obj).f31864a.l();
                        return;
                    } catch (Throwable th) {
                        throw new C3267gu(th);
                    }
                } catch (C3267gu e9) {
                    int i = u2.z.f41319b;
                    v2.i.g("Cannot invoke onPause for the mediation adapter.", e9);
                    return;
                }
            default:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2541Ek
    public final void s(Context context) {
        C3267gu c3267gu;
        Object obj = this.f25963u;
        switch (this.f25962n) {
            case 0:
                try {
                    InterfaceC3680od interfaceC3680od = ((C3535lu) obj).f31864a;
                    try {
                        interfaceC3680od.W2();
                        if (context != null) {
                            try {
                                interfaceC3680od.h0(new W2.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (C3267gu e9) {
                    int i = u2.z.f41319b;
                    v2.i.g("Cannot invoke onResume for the mediation adapter.", e9);
                    return;
                }
            default:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                if (interfaceC4061vh != null) {
                    interfaceC4061vh.onResume();
                    return;
                }
                return;
        }
    }
}
