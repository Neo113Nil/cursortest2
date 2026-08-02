package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ki, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2661Ki implements InterfaceC2561Ek {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26740n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f26741u;

    public /* synthetic */ C2661Ki(int i, Object obj) {
        this.f26740n = i;
        this.f26741u = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void a(Context context) {
        Object obj = this.f26741u;
        switch (this.f26740n) {
            case 0:
                try {
                    try {
                        ((C3558lu) obj).f32644a.n();
                        return;
                    } catch (Throwable th) {
                        throw new C3290gu(th);
                    }
                } catch (C3290gu e9) {
                    int i = w2.z.f41712b;
                    x2.i.g("Cannot invoke onDestroy for the mediation adapter.", e9);
                    return;
                }
            default:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void n(Context context) {
        Object obj = this.f26741u;
        switch (this.f26740n) {
            case 0:
                try {
                    try {
                        ((C3558lu) obj).f32644a.l();
                        return;
                    } catch (Throwable th) {
                        throw new C3290gu(th);
                    }
                } catch (C3290gu e9) {
                    int i = w2.z.f41712b;
                    x2.i.g("Cannot invoke onPause for the mediation adapter.", e9);
                    return;
                }
            default:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2561Ek
    public final void s(Context context) {
        C3290gu c3290gu;
        Object obj = this.f26741u;
        switch (this.f26740n) {
            case 0:
                try {
                    InterfaceC3703od interfaceC3703od = ((C3558lu) obj).f32644a;
                    try {
                        interfaceC3703od.S2();
                        if (context != null) {
                            try {
                                interfaceC3703od.Y(new Y2.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (C3290gu e9) {
                    int i = w2.z.f41712b;
                    x2.i.g("Cannot invoke onResume for the mediation adapter.", e9);
                    return;
                }
            default:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                if (interfaceC4084vh != null) {
                    interfaceC4084vh.onResume();
                    return;
                }
                return;
        }
    }
}
