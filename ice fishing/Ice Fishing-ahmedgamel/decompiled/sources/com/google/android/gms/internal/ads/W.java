package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class W implements InterfaceC4212y0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f29088b;

    public W(Z z6) {
        Objects.requireNonNull(z6);
        this.f29088b = z6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4212y0
    public final void c() {
        QN qn = this.f29088b.f28250j0;
        if (qn != null) {
            qn.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4212y0
    public final void f() {
        Z z6 = this.f29088b;
        Surface surface = z6.f29592x1;
        if (surface != null) {
            S0.e eVar = z6.f29578h1;
            Handler handler = (Handler) eVar.f2908u;
            if (handler != null) {
                handler.post(new RunnableC4050v0(eVar, surface, SystemClock.elapsedRealtime()));
            }
            z6.f29558A1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4212y0
    public final void i() {
        Z z6 = this.f29088b;
        if (z6.f29592x1 != null) {
            z6.w0(0, 1);
        }
    }
}
