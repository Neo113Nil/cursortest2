package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3274h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30699a;

    /* renamed from: b, reason: collision with root package name */
    public final C3166f0 f30700b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f30701c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30702d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f30703e;

    /* renamed from: f, reason: collision with root package name */
    public final V2 f30704f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f30705g;

    /* renamed from: h, reason: collision with root package name */
    public final long f30706h;
    public final C3488l0 i;

    /* renamed from: j, reason: collision with root package name */
    public H3.q f30707j = new H3.q();

    /* renamed from: k, reason: collision with root package name */
    public C3212ft f30708k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f30709l;

    /* renamed from: m, reason: collision with root package name */
    public int f30710m;

    /* renamed from: n, reason: collision with root package name */
    public int f30711n;

    /* renamed from: o, reason: collision with root package name */
    public long f30712o;

    /* renamed from: p, reason: collision with root package name */
    public int f30713p;

    public C3274h0(C3005c0 c3005c0) {
        this.f30699a = c3005c0.f29400a;
        C3166f0 c3166f0 = c3005c0.f29402c;
        c3166f0.getClass();
        this.f30700b = c3166f0;
        this.f30701c = new SparseArray();
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        this.f30702d = c3005c0.f29403d;
        V2 v22 = c3005c0.f29404e;
        this.f30704f = v22;
        this.f30706h = -c3005c0.f29406g;
        C3488l0 c3488l0 = c3005c0.f29407h;
        this.i = c3488l0;
        this.f30703e = new Q(c3005c0.f29401b, c3488l0, v22);
        this.f30705g = new CopyOnWriteArraySet();
        new DP(new C3299hP());
        this.f30712o = com.anythink.basead.exoplayer.b.f6382b;
        this.f30713p = -1;
        this.f30711n = 0;
    }
}
