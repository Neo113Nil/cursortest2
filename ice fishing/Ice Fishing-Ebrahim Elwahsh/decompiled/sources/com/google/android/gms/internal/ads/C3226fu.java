package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import n2.C4805a;
import n2.C4807c;
import n2.C4808d;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.fu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3226fu {

    /* renamed from: a, reason: collision with root package name */
    public final q2.a1 f30898a;

    /* renamed from: b, reason: collision with root package name */
    public final C2464Ac f30899b;

    /* renamed from: c, reason: collision with root package name */
    public final Fr f30900c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.d1 f30901d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f30902e;

    /* renamed from: f, reason: collision with root package name */
    public final q2.g1 f30903f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30904g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f30905h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C3261gb f30906j;

    /* renamed from: k, reason: collision with root package name */
    public final q2.j1 f30907k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30908l;

    /* renamed from: m, reason: collision with root package name */
    public final C4805a f30909m;

    /* renamed from: n, reason: collision with root package name */
    public final C4808d f30910n;

    /* renamed from: o, reason: collision with root package name */
    public final q2.V f30911o;

    /* renamed from: p, reason: collision with root package name */
    public final J6.i f30912p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f30913q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f30914r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30915s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f30916t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f30917u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30918v;

    /* renamed from: w, reason: collision with root package name */
    public final JSONArray f30919w;

    /* renamed from: x, reason: collision with root package name */
    public final q2.Y f30920x;

    public C3226fu(C3171eu c3171eu) {
        this.f30903f = c3171eu.f30531b;
        this.f30904g = c3171eu.f30532c;
        this.f30920x = c3171eu.f30552x;
        q2.d1 d1Var = c3171eu.f30530a;
        this.f30902e = d1Var.f40028V;
        boolean z8 = true;
        if (!d1Var.f40008A && !c3171eu.f30534e) {
            z8 = false;
        }
        boolean z9 = z8;
        int u7 = t2.G.u(d1Var.f40022P);
        q2.d1 d1Var2 = c3171eu.f30530a;
        q2.d1 d1Var3 = new q2.d1(d1Var.f40029n, d1Var.f40030u, d1Var.f40031v, d1Var.f40032w, d1Var.f40033x, d1Var.f40034y, d1Var.f40035z, z9, d1Var.f40009B, d1Var.f40010C, d1Var.f40011D, d1Var.f40012E, d1Var.f40013F, d1Var.f40014G, d1Var.f40015H, d1Var.f40016I, d1Var.J, d1Var.f40017K, d1Var.f40018L, d1Var.f40019M, d1Var.f40020N, d1Var.f40021O, u7, d1Var2.f40023Q, d1Var2.f40024R, d1Var2.f40025S, d1Var2.f40026T, d1Var2.f40027U);
        this.f30901d = d1Var3;
        q2.a1 a1Var = c3171eu.f30533d;
        C3261gb c3261gb = null;
        if (a1Var == null) {
            C3261gb c3261gb2 = c3171eu.f30537h;
            a1Var = c3261gb2 != null ? c3261gb2.f31028y : null;
        }
        this.f30898a = a1Var;
        ArrayList arrayList = c3171eu.f30535f;
        this.f30905h = arrayList;
        this.i = c3171eu.f30536g;
        if (arrayList != null && (c3261gb = c3171eu.f30537h) == null) {
            c3261gb = new C3261gb(new C4807c(new C4807c()));
        }
        this.f30906j = c3261gb;
        this.f30907k = c3171eu.i;
        this.f30908l = c3171eu.f30541m;
        this.f30909m = c3171eu.f30538j;
        this.f30910n = c3171eu.f30539k;
        this.f30911o = c3171eu.f30540l;
        this.f30899b = c3171eu.f30542n;
        this.f30912p = new J6.i(c3171eu.f30543o);
        this.f30913q = c3171eu.f30544p;
        this.f30914r = c3171eu.f30545q;
        this.f30900c = c3171eu.f30546r;
        this.f30915s = c3171eu.f30547s;
        this.f30916t = c3171eu.f30548t;
        long j9 = d1Var3.f40026T;
        if (j9 != 0) {
            this.f30917u = new AtomicLong(j9);
        } else {
            this.f30917u = c3171eu.f30549u;
        }
        this.f30918v = c3171eu.f30550v;
        this.f30919w = c3171eu.f30551w;
    }

    public final boolean a() {
        return this.f30904g.matches((String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31645d4));
    }
}
