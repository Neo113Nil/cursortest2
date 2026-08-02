package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3297h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31465a;

    /* renamed from: b, reason: collision with root package name */
    public final C3189f0 f31466b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f31467c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31468d;

    /* renamed from: e, reason: collision with root package name */
    public final Q f31469e;

    /* renamed from: f, reason: collision with root package name */
    public final V2 f31470f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f31471g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31472h;
    public final C3511l0 i;

    /* renamed from: j, reason: collision with root package name */
    public J3.q f31473j = new J3.q();

    /* renamed from: k, reason: collision with root package name */
    public C3235ft f31474k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f31475l;

    /* renamed from: m, reason: collision with root package name */
    public int f31476m;

    /* renamed from: n, reason: collision with root package name */
    public int f31477n;

    /* renamed from: o, reason: collision with root package name */
    public long f31478o;

    /* renamed from: p, reason: collision with root package name */
    public int f31479p;

    public C3297h0(C3028c0 c3028c0) {
        this.f31465a = c3028c0.f30183a;
        C3189f0 c3189f0 = c3028c0.f30185c;
        c3189f0.getClass();
        this.f31466b = c3189f0;
        this.f31467c = new SparseArray();
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        this.f31468d = c3028c0.f30186d;
        V2 v22 = c3028c0.f30187e;
        this.f31470f = v22;
        this.f31472h = -c3028c0.f30189g;
        C3511l0 c3511l0 = c3028c0.f30190h;
        this.i = c3511l0;
        this.f31469e = new Q(c3028c0.f30184b, c3511l0, v22);
        this.f31471g = new CopyOnWriteArraySet();
        new DP(new C3322hP());
        this.f31478o = com.anythink.basead.exoplayer.b.f7168b;
        this.f31479p = -1;
        this.f31477n = 0;
    }
}
