package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import n2.C4750a;
import n2.C4752c;
import n2.C4753d;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3052cu {

    /* renamed from: a, reason: collision with root package name */
    public final q2.Z0 f29620a;

    /* renamed from: b, reason: collision with root package name */
    public final C2550Fc f29621b;

    /* renamed from: c, reason: collision with root package name */
    public final Dr f29622c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.c1 f29623d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f29624e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.f1 f29625f;

    /* renamed from: g, reason: collision with root package name */
    public final String f29626g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f29627h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C3462kb f29628j;

    /* renamed from: k, reason: collision with root package name */
    public final q2.i1 f29629k;

    /* renamed from: l, reason: collision with root package name */
    public final int f29630l;

    /* renamed from: m, reason: collision with root package name */
    public final C4750a f29631m;

    /* renamed from: n, reason: collision with root package name */
    public final C4753d f29632n;

    /* renamed from: o, reason: collision with root package name */
    public final q2.V f29633o;

    /* renamed from: p, reason: collision with root package name */
    public final N6.i f29634p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f29635q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f29636r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f29637s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f29638t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f29639u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f29640v;

    /* renamed from: w, reason: collision with root package name */
    public final JSONArray f29641w;

    /* renamed from: x, reason: collision with root package name */
    public final q2.Y f29642x;

    public C3052cu(C2999bu c2999bu) {
        this.f29625f = c2999bu.f29344b;
        this.f29626g = c2999bu.f29345c;
        this.f29642x = c2999bu.f29365x;
        q2.c1 c1Var = c2999bu.f29343a;
        this.f29624e = c1Var.f40114V;
        boolean z3 = true;
        if (!c1Var.f40094A && !c2999bu.f29347e) {
            z3 = false;
        }
        boolean z6 = z3;
        int u3 = u2.D.u(c1Var.f40108P);
        q2.c1 c1Var2 = c2999bu.f29343a;
        q2.c1 c1Var3 = new q2.c1(c1Var.f40115n, c1Var.f40116u, c1Var.f40117v, c1Var.f40118w, c1Var.f40119x, c1Var.f40120y, c1Var.f40121z, z6, c1Var.f40095B, c1Var.f40096C, c1Var.f40097D, c1Var.f40098E, c1Var.f40099F, c1Var.f40100G, c1Var.f40101H, c1Var.f40102I, c1Var.J, c1Var.f40103K, c1Var.f40104L, c1Var.f40105M, c1Var.f40106N, c1Var.f40107O, u3, c1Var2.f40109Q, c1Var2.f40110R, c1Var2.f40111S, c1Var2.f40112T, c1Var2.f40113U);
        this.f29623d = c1Var3;
        q2.Z0 z02 = c2999bu.f29346d;
        C3462kb c3462kb = null;
        if (z02 == null) {
            C3462kb c3462kb2 = c2999bu.f29350h;
            z02 = c3462kb2 != null ? c3462kb2.f31476y : null;
        }
        this.f29620a = z02;
        ArrayList arrayList = c2999bu.f29348f;
        this.f29627h = arrayList;
        this.i = c2999bu.f29349g;
        if (arrayList != null && (c3462kb = c2999bu.f29350h) == null) {
            c3462kb = new C3462kb(new C4752c(new C4752c()));
        }
        this.f29628j = c3462kb;
        this.f29629k = c2999bu.i;
        this.f29630l = c2999bu.f29354m;
        this.f29631m = c2999bu.f29351j;
        this.f29632n = c2999bu.f29352k;
        this.f29633o = c2999bu.f29353l;
        this.f29621b = c2999bu.f29355n;
        this.f29634p = new N6.i(c2999bu.f29356o);
        this.f29635q = c2999bu.f29357p;
        this.f29636r = c2999bu.f29358q;
        this.f29622c = c2999bu.f29359r;
        this.f29637s = c2999bu.f29360s;
        this.f29638t = c2999bu.f29361t;
        long j6 = c1Var3.f40112T;
        if (j6 != 0) {
            this.f29639u = new AtomicLong(j6);
        } else {
            this.f29639u = c2999bu.f29362u;
        }
        this.f29640v = c2999bu.f29363v;
        this.f29641w = c2999bu.f29364w;
    }

    public final boolean a() {
        return this.f29626g.matches((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32226d4));
    }
}
