package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3758q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3434k0 f33168a;

    /* renamed from: b, reason: collision with root package name */
    public final C3380j0 f33169b = new C3380j0();

    /* renamed from: c, reason: collision with root package name */
    public final H3.q f33170c = new H3.q();

    /* renamed from: d, reason: collision with root package name */
    public final H3.q f33171d = new H3.q();

    /* renamed from: e, reason: collision with root package name */
    public final C0 f33172e;

    /* renamed from: f, reason: collision with root package name */
    public final C3488l0 f33173f;

    /* renamed from: g, reason: collision with root package name */
    public final U f33174g;

    /* renamed from: h, reason: collision with root package name */
    public long f33175h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f33176j;

    /* renamed from: k, reason: collision with root package name */
    public C3035cd f33177k;

    /* renamed from: l, reason: collision with root package name */
    public long f33178l;

    /* renamed from: m, reason: collision with root package name */
    public final S0.c f33179m;

    public C3758q0(S0.c cVar, C3434k0 c3434k0, C3488l0 c3488l0, U u3) {
        this.f33179m = cVar;
        this.f33168a = c3434k0;
        this.f33173f = c3488l0;
        this.f33174g = u3;
        C0 c02 = new C0();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i = highestOneBit + highestOneBit;
        }
        c02.f24003u = 0;
        c02.f24004v = -1;
        c02.f24005w = 0;
        c02.f24007y = new long[i];
        c02.f24006x = i - 1;
        this.f33172e = c02;
        this.f33175h = com.anythink.basead.exoplayer.b.f6382b;
        this.f33177k = C3035cd.f29500d;
        this.i = com.anythink.basead.exoplayer.b.f6382b;
        this.f33176j = com.anythink.basead.exoplayer.b.f6382b;
    }

    public final void a(long j6, long j9) {
        while (true) {
            C0 c02 = this.f33172e;
            int i = c02.f24005w;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j10 = ((long[]) c02.f24007y)[c02.f24003u];
            Long l9 = (Long) this.f33171d.f(j10);
            if (l9 != null && l9.longValue() != this.f33178l) {
                this.f33178l = l9.longValue();
                this.f33168a.a(2);
            }
            U u3 = this.f33174g;
            u3.a(1000 * j10);
            long j11 = this.f33178l;
            long b9 = u3.b();
            long j12 = u3.f27843h;
            C3380j0 c3380j0 = this.f33169b;
            C3434k0 c3434k0 = this.f33168a;
            int e9 = c3434k0.e(j10, j6, j9, j11, false, false, b9, j12, c3380j0);
            if (e9 != 5 && e9 != 4) {
                this.f33173f.a(j10, c3380j0.f31153a);
            }
            S0.c cVar = this.f33179m;
            Q q8 = (Q) cVar.f2776v;
            if (e9 == 0 || e9 == 1) {
                this.i = j10;
                long g4 = c02.g();
                C3035cd c3035cd = (C3035cd) this.f33170c.f(g4);
                if (c3035cd != null && !c3035cd.equals(C3035cd.f29500d) && !c3035cd.equals(this.f33177k)) {
                    this.f33177k = c3035cd;
                    C3299hP c3299hP = new C3299hP();
                    c3299hP.f30799u = c3035cd.f29501a;
                    c3299hP.f30800v = c3035cd.f29502b;
                    c3299hP.e("video/raw");
                    cVar.f2775u = new DP(c3299hP);
                    q8.f26916j.execute(new P(cVar, c3035cd));
                }
                long nanoTime = e9 == 0 ? System.nanoTime() : c3380j0.f31154b;
                int i6 = c3434k0.f31362d;
                c3434k0.f31362d = 3;
                c3434k0.f31366h.getClass();
                c3434k0.f31364f = AbstractC3159eu.u(SystemClock.elapsedRealtime());
                if ((i6 != 3) && q8.f26913f != null) {
                    q8.f26916j.execute(new P(cVar, 0));
                }
                DP dp = (DP) cVar.f2775u;
                long j13 = nanoTime;
                q8.f26917k.a(g4, j13, dp == null ? new DP(new C3299hP()) : dp, null);
                X x9 = (X) q8.f26911d.remove();
                x9.f28464c.y0(x9.f28462a, x9.f28463b, j13);
            } else if (e9 == 2 || e9 == 3) {
                this.i = j10;
                c02.g();
                q8.f26916j.execute(new P(cVar, 1));
                ((X) q8.f26911d.remove()).a();
            } else if (e9 != 4) {
                return;
            } else {
                this.i = j10;
            }
        }
    }
}
