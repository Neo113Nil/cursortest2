package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3879rs {

    /* renamed from: a, reason: collision with root package name */
    public final int f34531a;

    /* renamed from: b, reason: collision with root package name */
    public Object f34532b;

    /* renamed from: c, reason: collision with root package name */
    public int f34533c;

    /* renamed from: d, reason: collision with root package name */
    public int f34534d;

    /* renamed from: e, reason: collision with root package name */
    public long f34535e;

    /* renamed from: f, reason: collision with root package name */
    public long f34536f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34537g;

    /* renamed from: h, reason: collision with root package name */
    public long f34538h;
    public final /* synthetic */ C4323b i;

    public C3879rs(C4323b c4323b, int i) {
        Objects.requireNonNull(c4323b);
        this.i = c4323b;
        this.f34531a = i;
    }

    public final void a() {
        C4323b c4323b = this.i;
        int u12 = ((PN) c4323b.f36417a).u1();
        C3235ft c3235ft = (C3235ft) c4323b.f36421e;
        if (u12 == 2) {
            PN pn = (PN) c4323b.f36417a;
            if (pn.A1() && pn.w1() == 0) {
                AbstractC3627n8 F12 = pn.F1();
                Object f2 = F12.g() ? null : F12.f(pn.k2());
                int o02 = pn.o0();
                int q22 = pn.q2();
                long n22 = pn.n2();
                long max = Math.max(0L, pn.o2() - Math.max(0L, n22 - pn.m2()));
                if (f2 != null && o02 == -1) {
                    F12.o(f2, (K7) c4323b.f36420d);
                    n22 -= AbstractC3182eu.t(0L);
                    o02 = -1;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z6 = this.f34537g;
                int i = this.f34531a;
                if (z6 && Objects.equals(f2, this.f34532b) && o02 == this.f34533c && q22 == this.f34534d && n22 == this.f34535e && max == this.f34536f) {
                    if (elapsedRealtime - this.f34538h >= i) {
                        Us us = new Us(1, i);
                        HN hn = (HN) c4323b.f36419c;
                        hn.getClass();
                        hn.f26036n.W1(new DN(2, us, 1003));
                        return;
                    }
                    return;
                }
                this.f34537g = true;
                this.f34538h = elapsedRealtime;
                this.f34532b = f2;
                this.f34533c = o02;
                this.f34534d = q22;
                this.f34535e = n22;
                this.f34536f = max;
                c3235ft.d(1);
                c3235ft.f31231a.sendEmptyMessageDelayed(1, i);
                return;
            }
        }
        if (this.f34537g) {
            c3235ft.d(1);
        }
        this.f34537g = false;
    }
}
