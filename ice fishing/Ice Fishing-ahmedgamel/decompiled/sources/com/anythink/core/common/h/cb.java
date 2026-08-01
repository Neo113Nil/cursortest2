package com.anythink.core.common.h;

import android.os.SystemClock;
import com.anythink.core.basead.adx.api.ATAdxSetting;

/* loaded from: classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    private final String f13884a = "cb";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.d.l f13885b;

    /* renamed from: c, reason: collision with root package name */
    private ar f13886c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13887d;

    /* renamed from: e, reason: collision with root package name */
    private long f13888e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13889f;

    /* renamed from: g, reason: collision with root package name */
    private int f13890g;

    /* renamed from: h, reason: collision with root package name */
    private int f13891h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f13892j;

    /* renamed from: k, reason: collision with root package name */
    private int f13893k;

    /* renamed from: l, reason: collision with root package name */
    private long f13894l;

    public cb(ar arVar, com.anythink.core.d.l lVar) {
        int i = arVar.f13547c;
        this.f13886c = arVar;
        this.f13885b = lVar;
        boolean z3 = false;
        this.f13887d = (ATAdxSetting.getInstance().isAdxNetworkMode(lVar.i()) || lVar.F() != 1 || i == 8 || i == 16) ? false : true;
        this.f13888e = lVar.r();
        if (lVar.p() != 1 && lVar.F() == 1) {
            z3 = true;
        }
        this.f13889f = z3;
        this.f13890g = i == 9 ? lVar.n() : lVar.G();
        this.f13891h = i == 9 ? lVar.o() : lVar.au();
        this.i = lVar.c();
        this.f13892j = lVar.a();
        this.f13893k = lVar.b();
        this.f13894l = -1L;
        toString();
    }

    private long q() {
        return this.f13885b.K();
    }

    private long r() {
        return this.f13892j;
    }

    private long s() {
        return this.f13893k;
    }

    public final com.anythink.core.d.l a() {
        return this.f13885b;
    }

    public final boolean b() {
        return this.f13887d;
    }

    public final long c() {
        return this.f13888e;
    }

    public final boolean d() {
        return this.f13889f;
    }

    public final int e() {
        return this.f13890g;
    }

    public final int f() {
        return this.f13891h;
    }

    public final int g() {
        return this.f13885b.aG();
    }

    public final long h() {
        return this.f13885b.al();
    }

    public final long i() {
        if (!this.f13886c.f13553j) {
            return this.f13885b.I();
        }
        long j6 = this.f13894l;
        if (j6 >= 0) {
            return j6;
        }
        long elapsedRealtime = (r0.f13552h - (SystemClock.elapsedRealtime() - this.f13886c.f13554k)) - 100;
        this.f13894l = elapsedRealtime;
        if (elapsedRealtime < 0) {
            this.f13894l = 0L;
        }
        return this.f13894l;
    }

    public final int j() {
        return this.f13885b.y();
    }

    public final long k() {
        return this.f13885b.ab();
    }

    public final long l() {
        return this.f13885b.V();
    }

    public final long m() {
        return this.f13885b.am();
    }

    public final long n() {
        return this.f13885b.P();
    }

    public final boolean o() {
        com.anythink.core.d.l lVar = this.f13885b;
        return lVar != null && lVar.aZ() == 1;
    }

    public final int p() {
        return this.i;
    }

    public final String toString() {
        return "WaterfallSetting{canLoadFailRetry=" + this.f13887d + ", loadFailRetryDelayTime=" + this.f13888e + ", cannBiddingFailRetry=" + this.f13889f + ", requestType=" + this.f13890g + ", requestNum=" + this.f13891h + ", cacheNum:" + this.f13885b.aG() + '}';
    }
}
