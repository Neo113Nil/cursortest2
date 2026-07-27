package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3856rs {

    /* renamed from: a, reason: collision with root package name */
    public final int f33763a;

    /* renamed from: b, reason: collision with root package name */
    public Object f33764b;

    /* renamed from: c, reason: collision with root package name */
    public int f33765c;

    /* renamed from: d, reason: collision with root package name */
    public int f33766d;

    /* renamed from: e, reason: collision with root package name */
    public long f33767e;

    /* renamed from: f, reason: collision with root package name */
    public long f33768f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33769g;

    /* renamed from: h, reason: collision with root package name */
    public long f33770h;
    public final /* synthetic */ C4300b i;

    public C3856rs(C4300b c4300b, int i) {
        Objects.requireNonNull(c4300b);
        this.i = c4300b;
        this.f33763a = i;
    }

    public final void a() {
        C4300b c4300b = this.i;
        int u12 = ((PN) c4300b.f35648a).u1();
        C3212ft c3212ft = (C3212ft) c4300b.f35652e;
        if (u12 == 2) {
            PN pn = (PN) c4300b.f35648a;
            if (pn.A1() && pn.w1() == 0) {
                AbstractC3604n8 F12 = pn.F1();
                Object f3 = F12.g() ? null : F12.f(pn.k2());
                int p02 = pn.p0();
                int q22 = pn.q2();
                long n22 = pn.n2();
                long max = Math.max(0L, pn.o2() - Math.max(0L, n22 - pn.m2()));
                if (f3 != null && p02 == -1) {
                    F12.o(f3, (K7) c4300b.f35651d);
                    n22 -= AbstractC3159eu.t(0L);
                    p02 = -1;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                boolean z3 = this.f33769g;
                int i = this.f33763a;
                if (z3 && Objects.equals(f3, this.f33764b) && p02 == this.f33765c && q22 == this.f33766d && n22 == this.f33767e && max == this.f33768f) {
                    if (elapsedRealtime - this.f33770h >= i) {
                        Us us = new Us(1, i);
                        HN hn = (HN) c4300b.f35650c;
                        hn.getClass();
                        hn.f25264n.W1(new DN(2, us, 1003));
                        return;
                    }
                    return;
                }
                this.f33769g = true;
                this.f33770h = elapsedRealtime;
                this.f33764b = f3;
                this.f33765c = p02;
                this.f33766d = q22;
                this.f33767e = n22;
                this.f33768f = max;
                c3212ft.d(1);
                c3212ft.f30468a.sendEmptyMessageDelayed(1, i);
                return;
            }
        }
        if (this.f33769g) {
            c3212ft.d(1);
        }
        this.f33769g = false;
    }
}
