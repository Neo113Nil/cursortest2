package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.kw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3483kw implements InterfaceC3215fw {

    /* renamed from: d, reason: collision with root package name */
    public static C3483kw f31666d;

    /* renamed from: a, reason: collision with root package name */
    public float f31667a;

    /* renamed from: b, reason: collision with root package name */
    public C3001bw f31668b;

    /* renamed from: c, reason: collision with root package name */
    public C3161ew f31669c;

    public static C3483kw b() {
        if (f31666d == null) {
            C3483kw c3483kw = new C3483kw();
            c3483kw.f31667a = 0.0f;
            f31666d = c3483kw;
        }
        return f31666d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3215fw
    public final void a(boolean z3) {
        if (z3) {
            C4076vw.f34760g.getClass();
            C4076vw.b();
            return;
        }
        C4076vw.f34760g.getClass();
        Handler handler = C4076vw.i;
        if (handler != null) {
            handler.removeCallbacks(C4076vw.f34763k);
            C4076vw.i = null;
        }
    }
}
