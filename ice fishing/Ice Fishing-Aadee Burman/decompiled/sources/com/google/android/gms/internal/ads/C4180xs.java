package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4180xs {

    /* renamed from: a, reason: collision with root package name */
    public final int f35062a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35063b;

    /* renamed from: c, reason: collision with root package name */
    public int f35064c;

    /* renamed from: d, reason: collision with root package name */
    public int f35065d;

    /* renamed from: e, reason: collision with root package name */
    public long f35066e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35067f;

    /* renamed from: g, reason: collision with root package name */
    public long f35068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4300b f35069h;

    public C4180xs(C4300b c4300b, int i) {
        Objects.requireNonNull(c4300b);
        this.f35069h = c4300b;
        this.f35062a = i;
    }

    public final void a() {
        C4300b c4300b = this.f35069h;
        PN pn = (PN) c4300b.f35648a;
        boolean z3 = pn.u1() == 3 && pn.A1() && pn.w1() == 0;
        C3212ft c3212ft = (C3212ft) c4300b.f35652e;
        if (!z3) {
            if (this.f35067f) {
                c3212ft.d(2);
            }
            this.f35067f = false;
            return;
        }
        PN pn2 = (PN) c4300b.f35648a;
        AbstractC3604n8 F12 = pn2.F1();
        Object f3 = F12.g() ? null : F12.f(pn2.k2());
        int p02 = pn2.p0();
        int q22 = pn2.q2();
        long m22 = pn2.m2();
        if (f3 != null && p02 == -1) {
            F12.o(f3, (K7) c4300b.f35651d);
            m22 -= AbstractC3159eu.t(0L);
            p02 = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = this.f35067f;
        int i = this.f35062a;
        if (z6 && Objects.equals(f3, this.f35063b) && p02 == this.f35064c && q22 == this.f35065d && m22 == this.f35066e) {
            if (elapsedRealtime - this.f35068g >= i) {
                Us us = new Us(2, i);
                HN hn = (HN) c4300b.f35650c;
                hn.getClass();
                hn.f25264n.W1(new DN(2, us, 1003));
                return;
            }
            return;
        }
        this.f35067f = true;
        this.f35068g = elapsedRealtime;
        this.f35063b = f3;
        this.f35064c = p02;
        this.f35065d = q22;
        this.f35066e = m22;
        c3212ft.d(2);
        c3212ft.f30468a.sendEmptyMessageDelayed(2, i);
    }
}
