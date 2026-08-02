package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.Objects;
import s2.AbstractBinderC4962w;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.uo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4037uo extends AbstractBinderC4962w {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C3680o7 f35352n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4091vo f35353u;

    public BinderC4037uo(C4091vo c4091vo, C3680o7 c3680o7) {
        this.f35352n = c3680o7;
        Objects.requireNonNull(c4091vo);
        this.f35353u = c4091vo;
    }

    @Override // s2.InterfaceC4964x
    public final void M(C4969z0 c4969z0) {
        long j6 = this.f35353u.f35510a;
        int i = c4969z0.f40512n;
        C3680o7 c3680o7 = this.f35352n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "onAdFailedToLoad";
        t82.f28481w = Integer.valueOf(i);
        c3680o7.q(t82);
    }

    @Override // s2.InterfaceC4964x
    public final void d() {
        long j6 = this.f35353u.f35510a;
        C3680o7 c3680o7 = this.f35352n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "onAdLoaded";
        c3680o7.q(t82);
    }

    @Override // s2.InterfaceC4964x
    public final void e() {
        long j6 = this.f35353u.f35510a;
        C3680o7 c3680o7 = this.f35352n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "onAdOpened";
        c3680o7.q(t82);
    }

    @Override // s2.InterfaceC4964x
    public final void g() {
    }

    @Override // s2.InterfaceC4964x
    public final void h() {
        long j6 = this.f35353u.f35510a;
        C3680o7 c3680o7 = this.f35352n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "onAdClicked";
        String a9 = t82.a();
        C3917sc c3917sc = (C3917sc) c3680o7.f33649u;
        Parcel F02 = c3917sc.F0();
        F02.writeString(a9);
        c3917sc.d1(F02, 1);
    }

    @Override // s2.InterfaceC4964x
    public final void n() {
    }

    @Override // s2.InterfaceC4964x
    public final void o() {
    }

    @Override // s2.InterfaceC4964x
    public final void t() {
        long j6 = this.f35353u.f35510a;
        C3680o7 c3680o7 = this.f35352n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "onAdClosed";
        c3680o7.q(t82);
    }

    @Override // s2.InterfaceC4964x
    public final void x(int i) {
        long j6 = this.f35353u.f35510a;
        C3680o7 c3680o7 = this.f35352n;
        T8 t82 = new T8(com.anythink.expressad.foundation.g.a.f.f19909d);
        t82.f28478n = Long.valueOf(j6);
        t82.f28480v = "onAdFailedToLoad";
        t82.f28481w = Integer.valueOf(i);
        c3680o7.q(t82);
    }
}
