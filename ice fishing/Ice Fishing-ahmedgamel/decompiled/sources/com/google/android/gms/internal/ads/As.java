package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class As {

    /* renamed from: a, reason: collision with root package name */
    public final int f23757a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23758b;

    /* renamed from: c, reason: collision with root package name */
    public int f23759c;

    /* renamed from: d, reason: collision with root package name */
    public int f23760d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23761e;

    /* renamed from: f, reason: collision with root package name */
    public long f23762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4300b f23763g;

    public As(C4300b c4300b, int i) {
        Objects.requireNonNull(c4300b);
        this.f23763g = c4300b;
        this.f23757a = i;
    }

    public final void a() {
        long l22;
        C4300b c4300b = this.f23763g;
        AbstractC3604n8 F12 = ((PN) c4300b.f35648a).F1();
        boolean g4 = F12.g();
        PN pn = (PN) c4300b.f35648a;
        Object f3 = g4 ? null : F12.f(pn.k2());
        int p02 = pn.p0();
        int q22 = pn.q2();
        long m22 = pn.m2();
        if (f3 == null || p02 != -1) {
            l22 = p02 != -1 ? pn.l2() : com.anythink.basead.exoplayer.b.f6382b;
        } else {
            K7 k72 = (K7) c4300b.f35651d;
            F12.o(f3, k72);
            m22 -= AbstractC3159eu.t(0L);
            l22 = AbstractC3159eu.t(k72.f25868d);
            p02 = -1;
        }
        boolean z3 = pn.u1() == 3 && pn.A1() && pn.w1() == 0;
        C3212ft c3212ft = (C3212ft) c4300b.f35652e;
        if (!z3 || l22 == com.anythink.basead.exoplayer.b.f6382b || m22 < l22) {
            c3212ft.d(3);
            if (z3 && l22 != com.anythink.basead.exoplayer.b.f6382b) {
                pn.P0();
                c3212ft.f30468a.sendEmptyMessageDelayed(3, (int) Math.ceil((l22 - m22) / pn.f26771D0.f31961o.f34216a));
            }
            this.f23761e = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = this.f23761e;
        int i = this.f23757a;
        if (z6 && Objects.equals(f3, this.f23758b) && p02 == this.f23759c && q22 == this.f23760d) {
            if (elapsedRealtime - this.f23762f >= i) {
                Us us = new Us(3, i);
                HN hn = (HN) c4300b.f35650c;
                hn.getClass();
                hn.f25264n.W1(new DN(2, us, 1003));
                return;
            }
            return;
        }
        this.f23761e = true;
        this.f23762f = elapsedRealtime;
        this.f23758b = f3;
        this.f23759c = p02;
        this.f23760d = q22;
        c3212ft.d(3);
        c3212ft.f30468a.sendEmptyMessageDelayed(3, i);
    }
}
