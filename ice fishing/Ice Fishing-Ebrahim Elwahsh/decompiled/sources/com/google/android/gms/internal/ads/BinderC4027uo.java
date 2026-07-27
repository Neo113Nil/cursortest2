package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.Objects;
import q2.AbstractBinderC4920w;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4027uo extends AbstractBinderC4920w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3562m7 f34662n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4081vo f34663u;

    public BinderC4027uo(C4081vo c4081vo, C3562m7 c3562m7) {
        this.f34662n = c3562m7;
        Objects.requireNonNull(c4081vo);
        this.f34663u = c4081vo;
    }

    @Override // q2.InterfaceC4922x
    public final void D(int i) {
        long j9 = this.f34663u.f34862a;
        C3562m7 c3562m7 = this.f34662n;
        Q8 q82 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "onAdFailedToLoad";
        q82.f27122w = Integer.valueOf(i);
        c3562m7.s(q82);
    }

    @Override // q2.InterfaceC4922x
    public final void c() {
    }

    @Override // q2.InterfaceC4922x
    public final void e() {
        long j9 = this.f34663u.f34862a;
        C3562m7 c3562m7 = this.f34662n;
        Q8 q82 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "onAdOpened";
        c3562m7.s(q82);
    }

    @Override // q2.InterfaceC4922x
    public final void f() {
        long j9 = this.f34663u.f34862a;
        C3562m7 c3562m7 = this.f34662n;
        Q8 q82 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "onAdLoaded";
        c3562m7.s(q82);
    }

    @Override // q2.InterfaceC4922x
    public final void g() {
        long j9 = this.f34663u.f34862a;
        C3562m7 c3562m7 = this.f34662n;
        Q8 q82 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "onAdClicked";
        String a9 = q82.a();
        C3584mc c3584mc = (C3584mc) c3562m7.f32668u;
        Parcel A02 = c3584mc.A0();
        A02.writeString(a9);
        c3584mc.G0(A02, 1);
    }

    @Override // q2.InterfaceC4922x
    public final void h() {
    }

    @Override // q2.InterfaceC4922x
    public final void h0(C4927z0 c4927z0) {
        long j9 = this.f34663u.f34862a;
        int i = c4927z0.f40122n;
        C3562m7 c3562m7 = this.f34662n;
        Q8 q82 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "onAdFailedToLoad";
        q82.f27122w = Integer.valueOf(i);
        c3562m7.s(q82);
    }

    @Override // q2.InterfaceC4922x
    public final void l() {
    }

    @Override // q2.InterfaceC4922x
    public final void z() {
        long j9 = this.f34663u.f34862a;
        C3562m7 c3562m7 = this.f34662n;
        Q8 q82 = new Q8(com.anythink.expressad.foundation.g.a.f.f19280d);
        q82.f27119n = Long.valueOf(j9);
        q82.f27121v = "onAdClosed";
        c3562m7.s(q82);
    }
}
