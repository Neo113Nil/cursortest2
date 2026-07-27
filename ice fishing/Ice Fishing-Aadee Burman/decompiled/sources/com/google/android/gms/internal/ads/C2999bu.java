package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import n2.C4750a;
import n2.C4753d;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.bu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2999bu {

    /* renamed from: a, reason: collision with root package name */
    public q2.c1 f29343a;

    /* renamed from: b, reason: collision with root package name */
    public q2.f1 f29344b;

    /* renamed from: c, reason: collision with root package name */
    public String f29345c;

    /* renamed from: d, reason: collision with root package name */
    public q2.Z0 f29346d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29347e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f29348f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f29349g;

    /* renamed from: h, reason: collision with root package name */
    public C3462kb f29350h;
    public q2.i1 i;

    /* renamed from: j, reason: collision with root package name */
    public C4750a f29351j;

    /* renamed from: k, reason: collision with root package name */
    public C4753d f29352k;

    /* renamed from: l, reason: collision with root package name */
    public q2.V f29353l;

    /* renamed from: m, reason: collision with root package name */
    public int f29354m = 1;

    /* renamed from: n, reason: collision with root package name */
    public C2550Fc f29355n;

    /* renamed from: o, reason: collision with root package name */
    public final N6.i f29356o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29357p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29358q;

    /* renamed from: r, reason: collision with root package name */
    public Dr f29359r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f29360s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f29361t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f29362u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29363v;

    /* renamed from: w, reason: collision with root package name */
    public JSONArray f29364w;

    /* renamed from: x, reason: collision with root package name */
    public q2.Y f29365x;

    public C2999bu() {
        N6.i iVar = new N6.i(5);
        iVar.f1974u = 2;
        this.f29356o = iVar;
        this.f29357p = false;
        this.f29358q = false;
        this.f29360s = false;
        this.f29362u = new AtomicLong();
        this.f29363v = false;
    }

    public final C3052cu a() {
        P2.w.i(this.f29345c, "ad unit must not be null");
        P2.w.i(this.f29344b, "ad size must not be null");
        P2.w.i(this.f29343a, "ad request must not be null");
        return new C3052cu(this);
    }
}
