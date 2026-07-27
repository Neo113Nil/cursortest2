package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Es {

    /* renamed from: a, reason: collision with root package name */
    public final int f24833a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24834b;

    /* renamed from: c, reason: collision with root package name */
    public int f24835c;

    /* renamed from: d, reason: collision with root package name */
    public int f24836d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24837e;

    /* renamed from: f, reason: collision with root package name */
    public long f24838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4313b f24839g;

    public Es(C4313b c4313b, int i) {
        Objects.requireNonNull(c4313b);
        this.f24839g = c4313b;
        this.f24833a = i;
    }

    public final void a() {
        long P1;
        C4313b c4313b = this.f24839g;
        AbstractC3832r8 r12 = ((C3093dO) c4313b.f35811a).r1();
        boolean g9 = r12.g();
        C3093dO c3093dO = (C3093dO) c4313b.f35811a;
        Object f6 = g9 ? null : r12.f(c3093dO.O1());
        int m8 = c3093dO.m();
        int U12 = c3093dO.U1();
        long Q12 = c3093dO.Q1();
        if (f6 == null || m8 != -1) {
            P1 = m8 != -1 ? c3093dO.P1() : com.anythink.basead.exoplayer.b.f6539b;
        } else {
            L7 l72 = (L7) c4313b.f35814d;
            r12.o(f6, l72);
            Q12 -= AbstractC3548lu.t(0L);
            P1 = AbstractC3548lu.t(l72.f26109d);
            m8 = -1;
        }
        boolean z8 = c3093dO.m1() == 3 && c3093dO.p1() && c3093dO.n1() == 0;
        C3709ot c3709ot = (C3709ot) c4313b.f35815e;
        if (!z8 || P1 == com.anythink.basead.exoplayer.b.f6539b || Q12 < P1) {
            c3709ot.d(3);
            if (z8 && P1 != com.anythink.basead.exoplayer.b.f6539b) {
                c3093dO.P0();
                c3709ot.f33230a.sendEmptyMessageDelayed(3, (int) Math.ceil((P1 - Q12) / c3093dO.f30014G0.f35543o.f34712a));
            }
            this.f24837e = false;
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.f24837e;
        int i = this.f24833a;
        if (z9 && Objects.equals(f6, this.f24834b) && m8 == this.f24835c && U12 == this.f24836d) {
            if (elapsedRealtime - this.f24838f >= i) {
                Zs zs = new Zs(3, i);
                VN vn = (VN) c4313b.f35813c;
                vn.getClass();
                vn.f28243n.A1(new RN(2, zs, 1003));
                return;
            }
            return;
        }
        this.f24837e = true;
        this.f24838f = elapsedRealtime;
        this.f24834b = f6;
        this.f24835c = m8;
        this.f24836d = U12;
        c3709ot.d(3);
        c3709ot.f33230a.sendEmptyMessageDelayed(3, i);
    }
}
