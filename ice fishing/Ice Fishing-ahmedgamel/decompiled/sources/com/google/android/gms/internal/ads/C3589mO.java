package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3589mO {

    /* renamed from: t, reason: collision with root package name */
    public static final C3860rQ f32727t = new C3860rQ(-1, new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3627n8 f32728a;

    /* renamed from: b, reason: collision with root package name */
    public final C3860rQ f32729b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32730c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32731d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32732e;

    /* renamed from: f, reason: collision with root package name */
    public final DN f32733f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f32734g;

    /* renamed from: h, reason: collision with root package name */
    public final SQ f32735h;
    public final C3941t i;

    /* renamed from: j, reason: collision with root package name */
    public final List f32736j;

    /* renamed from: k, reason: collision with root package name */
    public final C3860rQ f32737k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f32738l;

    /* renamed from: m, reason: collision with root package name */
    public final int f32739m;

    /* renamed from: n, reason: collision with root package name */
    public final int f32740n;

    /* renamed from: o, reason: collision with root package name */
    public final C3947t5 f32741o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f32742p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f32743q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f32744r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f32745s;

    public C3589mO(AbstractC3627n8 abstractC3627n8, C3860rQ c3860rQ, long j6, long j9, int i, DN dn, boolean z6, SQ sq, C3941t c3941t, List list, C3860rQ c3860rQ2, boolean z9, int i4, int i6, C3947t5 c3947t5, long j10, long j11, long j12, long j13) {
        this.f32728a = abstractC3627n8;
        this.f32729b = c3860rQ;
        this.f32730c = j6;
        this.f32731d = j9;
        this.f32732e = i;
        this.f32733f = dn;
        this.f32734g = z6;
        this.f32735h = sq;
        this.i = c3941t;
        this.f32736j = list;
        this.f32737k = c3860rQ2;
        this.f32738l = z9;
        this.f32739m = i4;
        this.f32740n = i6;
        this.f32741o = c3947t5;
        this.f32742p = j10;
        this.f32743q = j11;
        this.f32744r = j12;
        this.f32745s = j13;
    }

    public static C3589mO a(C3941t c3941t) {
        C4003u7 c4003u7 = AbstractC3627n8.f33468a;
        C3860rQ c3860rQ = f32727t;
        return new C3589mO(c4003u7, c3860rQ, com.anythink.basead.exoplayer.b.f7168b, 0L, 1, null, false, SQ.f28273d, c3941t, C3523lC.f32525x, c3860rQ, false, 1, 0, C3947t5.f35001d, 0L, 0L, 0L, 0L);
    }

    public final C3589mO b(C3860rQ c3860rQ, long j6, long j9, long j10, long j11, SQ sq, C3941t c3941t, List list) {
        C3860rQ c3860rQ2 = this.f32737k;
        boolean z6 = this.f32738l;
        int i = this.f32739m;
        int i4 = this.f32740n;
        C3947t5 c3947t5 = this.f32741o;
        long j12 = this.f32742p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new C3589mO(this.f32728a, c3860rQ, j9, j10, this.f32732e, this.f32733f, this.f32734g, sq, c3941t, list, c3860rQ2, z6, i, i4, c3947t5, j12, j11, j6, elapsedRealtime);
    }

    public final C3589mO c(AbstractC3627n8 abstractC3627n8) {
        return new C3589mO(abstractC3627n8, this.f32729b, this.f32730c, this.f32731d, this.f32732e, this.f32733f, this.f32734g, this.f32735h, this.i, this.f32736j, this.f32737k, this.f32738l, this.f32739m, this.f32740n, this.f32741o, this.f32742p, this.f32743q, this.f32744r, this.f32745s);
    }

    public final C3589mO d(int i) {
        return new C3589mO(this.f32728a, this.f32729b, this.f32730c, this.f32731d, i, this.f32733f, this.f32734g, this.f32735h, this.i, this.f32736j, this.f32737k, this.f32738l, this.f32739m, this.f32740n, this.f32741o, this.f32742p, this.f32743q, this.f32744r, this.f32745s);
    }

    public final C3589mO e(DN dn) {
        return new C3589mO(this.f32728a, this.f32729b, this.f32730c, this.f32731d, this.f32732e, dn, this.f32734g, this.f32735h, this.i, this.f32736j, this.f32737k, this.f32738l, this.f32739m, this.f32740n, this.f32741o, this.f32742p, this.f32743q, this.f32744r, this.f32745s);
    }

    public final C3589mO f(boolean z6) {
        return new C3589mO(this.f32728a, this.f32729b, this.f32730c, this.f32731d, this.f32732e, this.f32733f, z6, this.f32735h, this.i, this.f32736j, this.f32737k, this.f32738l, this.f32739m, this.f32740n, this.f32741o, this.f32742p, this.f32743q, this.f32744r, this.f32745s);
    }

    public final C3589mO g(C3860rQ c3860rQ) {
        return new C3589mO(this.f32728a, this.f32729b, this.f32730c, this.f32731d, this.f32732e, this.f32733f, this.f32734g, this.f32735h, this.i, this.f32736j, c3860rQ, this.f32738l, this.f32739m, this.f32740n, this.f32741o, this.f32742p, this.f32743q, this.f32744r, this.f32745s);
    }

    public final C3589mO h(int i, int i4, boolean z6) {
        return new C3589mO(this.f32728a, this.f32729b, this.f32730c, this.f32731d, this.f32732e, this.f32733f, this.f32734g, this.f32735h, this.i, this.f32736j, this.f32737k, z6, i, i4, this.f32741o, this.f32742p, this.f32743q, this.f32744r, this.f32745s);
    }

    public final boolean i() {
        return this.f32732e == 3 && this.f32738l && this.f32740n == 0;
    }
}
