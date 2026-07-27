package com.anythink.core.common.h;

import android.os.SystemClock;
import com.anythink.core.basead.adx.api.ATAdxSetting;

/* loaded from: classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final String f14041a = "cb";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.d.l f14042b;

    /* renamed from: c, reason: collision with root package name */
    private ar f14043c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14044d;

    /* renamed from: e, reason: collision with root package name */
    private long f14045e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14046f;

    /* renamed from: g, reason: collision with root package name */
    private int f14047g;

    /* renamed from: h, reason: collision with root package name */
    private int f14048h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f14049j;

    /* renamed from: k, reason: collision with root package name */
    private int f14050k;

    /* renamed from: l, reason: collision with root package name */
    private long f14051l;

    public cb(ar arVar, com.anythink.core.d.l lVar) {
        int i = arVar.f13704c;
        this.f14043c = arVar;
        this.f14042b = lVar;
        boolean z8 = false;
        this.f14044d = (ATAdxSetting.getInstance().isAdxNetworkMode(lVar.i()) || lVar.F() != 1 || i == 8 || i == 16) ? false : true;
        this.f14045e = lVar.r();
        if (lVar.p() != 1 && lVar.F() == 1) {
            z8 = true;
        }
        this.f14046f = z8;
        this.f14047g = i == 9 ? lVar.n() : lVar.G();
        this.f14048h = i == 9 ? lVar.o() : lVar.au();
        this.i = lVar.c();
        this.f14049j = lVar.a();
        this.f14050k = lVar.b();
        this.f14051l = -1L;
        toString();
    }

    private long q() {
        return this.f14042b.K();
    }

    private long r() {
        return this.f14049j;
    }

    private long s() {
        return this.f14050k;
    }

    public final com.anythink.core.d.l a() {
        return this.f14042b;
    }

    public final boolean b() {
        return this.f14044d;
    }

    public final long c() {
        return this.f14045e;
    }

    public final boolean d() {
        return this.f14046f;
    }

    public final int e() {
        return this.f14047g;
    }

    public final int f() {
        return this.f14048h;
    }

    public final int g() {
        return this.f14042b.aG();
    }

    public final long h() {
        return this.f14042b.al();
    }

    public final long i() {
        if (!this.f14043c.f13710j) {
            return this.f14042b.I();
        }
        long j9 = this.f14051l;
        if (j9 >= 0) {
            return j9;
        }
        long elapsedRealtime = (r0.f13709h - (SystemClock.elapsedRealtime() - this.f14043c.f13711k)) - 100;
        this.f14051l = elapsedRealtime;
        if (elapsedRealtime < 0) {
            this.f14051l = 0L;
        }
        return this.f14051l;
    }

    public final int j() {
        return this.f14042b.y();
    }

    public final long k() {
        return this.f14042b.ab();
    }

    public final long l() {
        return this.f14042b.V();
    }

    public final long m() {
        return this.f14042b.am();
    }

    public final long n() {
        return this.f14042b.P();
    }

    public final boolean o() {
        com.anythink.core.d.l lVar = this.f14042b;
        return lVar != null && lVar.aZ() == 1;
    }

    public final int p() {
        return this.i;
    }

    public final String toString() {
        return "WaterfallSetting{canLoadFailRetry=" + this.f14044d + ", loadFailRetryDelayTime=" + this.f14045e + ", cannBiddingFailRetry=" + this.f14046f + ", requestType=" + this.f14047g + ", requestNum=" + this.f14048h + ", cacheNum:" + this.f14042b.aG() + '}';
    }
}
