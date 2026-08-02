package com.anythink.core.common.h;

import android.os.SystemClock;
import com.anythink.core.basead.adx.api.ATAdxSetting;

/* loaded from: classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final String f14670a = "cb";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.d.l f14671b;

    /* renamed from: c, reason: collision with root package name */
    private ar f14672c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14673d;

    /* renamed from: e, reason: collision with root package name */
    private long f14674e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14675f;

    /* renamed from: g, reason: collision with root package name */
    private int f14676g;

    /* renamed from: h, reason: collision with root package name */
    private int f14677h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f14678j;

    /* renamed from: k, reason: collision with root package name */
    private int f14679k;

    /* renamed from: l, reason: collision with root package name */
    private long f14680l;

    public cb(ar arVar, com.anythink.core.d.l lVar) {
        int i = arVar.f14333c;
        this.f14672c = arVar;
        this.f14671b = lVar;
        boolean z6 = false;
        this.f14673d = (ATAdxSetting.getInstance().isAdxNetworkMode(lVar.i()) || lVar.F() != 1 || i == 8 || i == 16) ? false : true;
        this.f14674e = lVar.r();
        if (lVar.p() != 1 && lVar.F() == 1) {
            z6 = true;
        }
        this.f14675f = z6;
        this.f14676g = i == 9 ? lVar.n() : lVar.G();
        this.f14677h = i == 9 ? lVar.o() : lVar.au();
        this.i = lVar.c();
        this.f14678j = lVar.a();
        this.f14679k = lVar.b();
        this.f14680l = -1L;
        toString();
    }

    private long q() {
        return this.f14671b.K();
    }

    private long r() {
        return this.f14678j;
    }

    private long s() {
        return this.f14679k;
    }

    public final com.anythink.core.d.l a() {
        return this.f14671b;
    }

    public final boolean b() {
        return this.f14673d;
    }

    public final long c() {
        return this.f14674e;
    }

    public final boolean d() {
        return this.f14675f;
    }

    public final int e() {
        return this.f14676g;
    }

    public final int f() {
        return this.f14677h;
    }

    public final int g() {
        return this.f14671b.aG();
    }

    public final long h() {
        return this.f14671b.al();
    }

    public final long i() {
        if (!this.f14672c.f14339j) {
            return this.f14671b.I();
        }
        long j6 = this.f14680l;
        if (j6 >= 0) {
            return j6;
        }
        long elapsedRealtime = (r0.f14338h - (SystemClock.elapsedRealtime() - this.f14672c.f14340k)) - 100;
        this.f14680l = elapsedRealtime;
        if (elapsedRealtime < 0) {
            this.f14680l = 0L;
        }
        return this.f14680l;
    }

    public final int j() {
        return this.f14671b.y();
    }

    public final long k() {
        return this.f14671b.ab();
    }

    public final long l() {
        return this.f14671b.V();
    }

    public final long m() {
        return this.f14671b.am();
    }

    public final long n() {
        return this.f14671b.P();
    }

    public final boolean o() {
        com.anythink.core.d.l lVar = this.f14671b;
        return lVar != null && lVar.aZ() == 1;
    }

    public final int p() {
        return this.i;
    }

    public final String toString() {
        return "WaterfallSetting{canLoadFailRetry=" + this.f14673d + ", loadFailRetryDelayTime=" + this.f14674e + ", cannBiddingFailRetry=" + this.f14675f + ", requestType=" + this.f14676g + ", requestNum=" + this.f14677h + ", cacheNum:" + this.f14671b.aG() + '}';
    }
}
