package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class W implements InterfaceC4189y0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f28290b;

    public W(Z z3) {
        Objects.requireNonNull(z3);
        this.f28290b = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4189y0
    public final void c() {
        QN qn = this.f28290b.f27266o0;
        if (qn != null) {
            qn.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4189y0
    public final void f() {
        Z z3 = this.f28290b;
        Surface surface = z3.f28780C1;
        if (surface != null) {
            S0.e eVar = z3.f28803m1;
            Handler handler = (Handler) eVar.f2781u;
            if (handler != null) {
                handler.post(new RunnableC4027v0(eVar, surface, SystemClock.elapsedRealtime()));
            }
            z3.f28782F1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4189y0
    public final void i() {
        Z z3 = this.f28290b;
        if (z3.f28780C1 != null) {
            z3.w0(0, 1);
        }
    }
}
