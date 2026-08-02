package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4203xs {

    /* renamed from: a, reason: collision with root package name */
    public final int f35848a;

    /* renamed from: b, reason: collision with root package name */
    public Object f35849b;

    /* renamed from: c, reason: collision with root package name */
    public int f35850c;

    /* renamed from: d, reason: collision with root package name */
    public int f35851d;

    /* renamed from: e, reason: collision with root package name */
    public long f35852e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35853f;

    /* renamed from: g, reason: collision with root package name */
    public long f35854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4323b f35855h;

    public C4203xs(C4323b c4323b, int i) {
        Objects.requireNonNull(c4323b);
        this.f35855h = c4323b;
        this.f35848a = i;
    }

    public final void a() {
        C4323b c4323b = this.f35855h;
        PN pn = (PN) c4323b.f36417a;
        boolean z6 = pn.u1() == 3 && pn.A1() && pn.w1() == 0;
        C3235ft c3235ft = (C3235ft) c4323b.f36421e;
        if (!z6) {
            if (this.f35853f) {
                c3235ft.d(2);
            }
            this.f35853f = false;
            return;
        }
        PN pn2 = (PN) c4323b.f36417a;
        AbstractC3627n8 F12 = pn2.F1();
        Object f2 = F12.g() ? null : F12.f(pn2.k2());
        int o02 = pn2.o0();
        int q22 = pn2.q2();
        long m22 = pn2.m2();
        if (f2 != null && o02 == -1) {
            F12.o(f2, (K7) c4323b.f36420d);
            m22 -= AbstractC3182eu.t(0L);
            o02 = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f35853f;
        int i = this.f35848a;
        if (z9 && Objects.equals(f2, this.f35849b) && o02 == this.f35850c && q22 == this.f35851d && m22 == this.f35852e) {
            if (elapsedRealtime - this.f35854g >= i) {
                Us us = new Us(2, i);
                HN hn = (HN) c4323b.f36419c;
                hn.getClass();
                hn.f26036n.W1(new DN(2, us, 1003));
                return;
            }
            return;
        }
        this.f35853f = true;
        this.f35854g = elapsedRealtime;
        this.f35849b = f2;
        this.f35850c = o02;
        this.f35851d = q22;
        this.f35852e = m22;
        c3235ft.d(2);
        c3235ft.f31231a.sendEmptyMessageDelayed(2, i);
    }
}
