package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3781q0 {

    /* renamed from: a, reason: collision with root package name */
    public final C3457k0 f33952a;

    /* renamed from: b, reason: collision with root package name */
    public final C3403j0 f33953b = new C3403j0();

    /* renamed from: c, reason: collision with root package name */
    public final J3.q f33954c = new J3.q();

    /* renamed from: d, reason: collision with root package name */
    public final J3.q f33955d = new J3.q();

    /* renamed from: e, reason: collision with root package name */
    public final C0 f33956e;

    /* renamed from: f, reason: collision with root package name */
    public final C3511l0 f33957f;

    /* renamed from: g, reason: collision with root package name */
    public final U f33958g;

    /* renamed from: h, reason: collision with root package name */
    public long f33959h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f33960j;

    /* renamed from: k, reason: collision with root package name */
    public C3058cd f33961k;

    /* renamed from: l, reason: collision with root package name */
    public long f33962l;

    /* renamed from: m, reason: collision with root package name */
    public final S0.c f33963m;

    public C3781q0(S0.c cVar, C3457k0 c3457k0, C3511l0 c3511l0, U u6) {
        this.f33963m = cVar;
        this.f33952a = c3457k0;
        this.f33957f = c3511l0;
        this.f33958g = u6;
        C0 c02 = new C0();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i = highestOneBit + highestOneBit;
        }
        c02.f24766u = 0;
        c02.f24767v = -1;
        c02.f24768w = 0;
        c02.f24770y = new long[i];
        c02.f24769x = i - 1;
        this.f33956e = c02;
        this.f33959h = com.anythink.basead.exoplayer.b.f7168b;
        this.f33961k = C3058cd.f30285d;
        this.i = com.anythink.basead.exoplayer.b.f7168b;
        this.f33960j = com.anythink.basead.exoplayer.b.f7168b;
    }

    public final void a(long j6, long j9) {
        while (true) {
            C0 c02 = this.f33956e;
            int i = c02.f24768w;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j10 = ((long[]) c02.f24770y)[c02.f24766u];
            Long l9 = (Long) this.f33955d.f(j10);
            if (l9 != null && l9.longValue() != this.f33962l) {
                this.f33962l = l9.longValue();
                this.f33952a.a(2);
            }
            U u6 = this.f33958g;
            u6.a(1000 * j10);
            long j11 = this.f33962l;
            long b9 = u6.b();
            long j12 = u6.f28640h;
            C3403j0 c3403j0 = this.f33953b;
            C3457k0 c3457k0 = this.f33952a;
            int e9 = c3457k0.e(j10, j6, j9, j11, false, false, b9, j12, c3403j0);
            if (e9 != 5 && e9 != 4) {
                this.f33957f.a(j10, c3403j0.f31940a);
            }
            S0.c cVar = this.f33963m;
            Q q8 = (Q) cVar.f2903v;
            if (e9 == 0 || e9 == 1) {
                this.i = j10;
                long g9 = c02.g();
                C3058cd c3058cd = (C3058cd) this.f33954c.f(g9);
                if (c3058cd != null && !c3058cd.equals(C3058cd.f30285d) && !c3058cd.equals(this.f33961k)) {
                    this.f33961k = c3058cd;
                    C3322hP c3322hP = new C3322hP();
                    c3322hP.f31565u = c3058cd.f30286a;
                    c3322hP.f31566v = c3058cd.f30287b;
                    c3322hP.e("video/raw");
                    cVar.f2902u = new DP(c3322hP);
                    q8.f27703j.execute(new P(cVar, c3058cd));
                }
                long nanoTime = e9 == 0 ? System.nanoTime() : c3403j0.f31941b;
                int i4 = c3457k0.f32141d;
                c3457k0.f32141d = 3;
                c3457k0.f32145h.getClass();
                c3457k0.f32143f = AbstractC3182eu.u(SystemClock.elapsedRealtime());
                if ((i4 != 3) && q8.f27700f != null) {
                    q8.f27703j.execute(new P(cVar, 0));
                }
                DP dp = (DP) cVar.f2902u;
                long j13 = nanoTime;
                q8.f27704k.a(g9, j13, dp == null ? new DP(new C3322hP()) : dp, null);
                X x9 = (X) q8.f27698d.remove();
                x9.f29244c.y0(x9.f29242a, x9.f29243b, j13);
            } else if (e9 == 2 || e9 == 3) {
                this.i = j10;
                c02.g();
                q8.f27703j.execute(new P(cVar, 1));
                ((X) q8.f27698d.remove()).a();
            } else if (e9 != 4) {
                return;
            } else {
                this.i = j10;
            }
        }
    }
}
