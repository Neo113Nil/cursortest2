package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.Objects;
import q2.AbstractBinderC4913w;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.to, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3960to extends AbstractBinderC4913w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3657o7 f34399n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4014uo f34400u;

    public BinderC3960to(C4014uo c4014uo, C3657o7 c3657o7) {
        this.f34399n = c3657o7;
        Objects.requireNonNull(c4014uo);
        this.f34400u = c4014uo;
    }

    @Override // q2.InterfaceC4915x
    public final void G(C4920z0 c4920z0) {
        long j6 = this.f34400u.f34589a;
        int i = c4920z0.f40213n;
        C3657o7 c3657o7 = this.f34399n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "onAdFailedToLoad";
        t82.f27698w = Integer.valueOf(i);
        c3657o7.p(t82);
    }

    @Override // q2.InterfaceC4915x
    public final void d() {
        long j6 = this.f34400u.f34589a;
        C3657o7 c3657o7 = this.f34399n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "onAdLoaded";
        c3657o7.p(t82);
    }

    @Override // q2.InterfaceC4915x
    public final void e() {
        long j6 = this.f34400u.f34589a;
        C3657o7 c3657o7 = this.f34399n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "onAdOpened";
        c3657o7.p(t82);
    }

    @Override // q2.InterfaceC4915x
    public final void g() {
    }

    @Override // q2.InterfaceC4915x
    public final void h() {
        long j6 = this.f34400u.f34589a;
        C3657o7 c3657o7 = this.f34399n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "onAdClicked";
        String a9 = t82.a();
        C3894sc c3894sc = (C3894sc) c3657o7.f32862u;
        Parcel H02 = c3894sc.H0();
        H02.writeString(a9);
        c3894sc.f1(H02, 1);
    }

    @Override // q2.InterfaceC4915x
    public final void n() {
    }

    @Override // q2.InterfaceC4915x
    public final void o() {
    }

    @Override // q2.InterfaceC4915x
    public final void t() {
        long j6 = this.f34400u.f34589a;
        C3657o7 c3657o7 = this.f34399n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "onAdClosed";
        c3657o7.p(t82);
    }

    @Override // q2.InterfaceC4915x
    public final void x(int i) {
        long j6 = this.f34400u.f34589a;
        C3657o7 c3657o7 = this.f34399n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19122d);
        t82.f27695n = Long.valueOf(j6);
        t82.f27697v = "onAdFailedToLoad";
        t82.f27698w = Integer.valueOf(i);
        c3657o7.p(t82);
    }
}
