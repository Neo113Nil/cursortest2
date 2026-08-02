package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import p2.C4830a;
import p2.C4832c;
import p2.C4833d;

/* renamed from: com.google.android.gms.internal.ads.cu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3075cu {

    /* renamed from: a, reason: collision with root package name */
    public final s2.Z0 f30390a;

    /* renamed from: b, reason: collision with root package name */
    public final C2570Fc f30391b;

    /* renamed from: c, reason: collision with root package name */
    public final Dr f30392c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.c1 f30393d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f30394e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.f1 f30395f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30396g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f30397h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C3485kb f30398j;

    /* renamed from: k, reason: collision with root package name */
    public final s2.i1 f30399k;

    /* renamed from: l, reason: collision with root package name */
    public final int f30400l;

    /* renamed from: m, reason: collision with root package name */
    public final C4830a f30401m;

    /* renamed from: n, reason: collision with root package name */
    public final C4833d f30402n;

    /* renamed from: o, reason: collision with root package name */
    public final s2.V f30403o;

    /* renamed from: p, reason: collision with root package name */
    public final N6.i f30404p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f30405q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f30406r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f30407s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f30408t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f30409u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f30410v;

    /* renamed from: w, reason: collision with root package name */
    public final JSONArray f30411w;

    /* renamed from: x, reason: collision with root package name */
    public final s2.Y f30412x;

    public C3075cu(C3022bu c3022bu) {
        this.f30395f = c3022bu.f30132b;
        this.f30396g = c3022bu.f30133c;
        this.f30412x = c3022bu.f30153x;
        s2.c1 c1Var = c3022bu.f30131a;
        this.f30394e = c1Var.f40416V;
        boolean z6 = true;
        if (!c1Var.f40396A && !c3022bu.f30135e) {
            z6 = false;
        }
        boolean z9 = z6;
        int u6 = w2.D.u(c1Var.f40410P);
        s2.c1 c1Var2 = c3022bu.f30131a;
        s2.c1 c1Var3 = new s2.c1(c1Var.f40417n, c1Var.f40418u, c1Var.f40419v, c1Var.f40420w, c1Var.f40421x, c1Var.f40422y, c1Var.f40423z, z9, c1Var.f40397B, c1Var.f40398C, c1Var.f40399D, c1Var.f40400E, c1Var.f40401F, c1Var.f40402G, c1Var.f40403H, c1Var.f40404I, c1Var.J, c1Var.f40405K, c1Var.f40406L, c1Var.f40407M, c1Var.f40408N, c1Var.f40409O, u6, c1Var2.f40411Q, c1Var2.f40412R, c1Var2.f40413S, c1Var2.f40414T, c1Var2.f40415U);
        this.f30393d = c1Var3;
        s2.Z0 z02 = c3022bu.f30134d;
        C3485kb c3485kb = null;
        if (z02 == null) {
            C3485kb c3485kb2 = c3022bu.f30138h;
            z02 = c3485kb2 != null ? c3485kb2.f32253y : null;
        }
        this.f30390a = z02;
        ArrayList arrayList = c3022bu.f30136f;
        this.f30397h = arrayList;
        this.i = c3022bu.f30137g;
        if (arrayList != null && (c3485kb = c3022bu.f30138h) == null) {
            c3485kb = new C3485kb(new C4832c(new C4832c()));
        }
        this.f30398j = c3485kb;
        this.f30399k = c3022bu.i;
        this.f30400l = c3022bu.f30142m;
        this.f30401m = c3022bu.f30139j;
        this.f30402n = c3022bu.f30140k;
        this.f30403o = c3022bu.f30141l;
        this.f30391b = c3022bu.f30143n;
        this.f30404p = new N6.i(c3022bu.f30144o);
        this.f30405q = c3022bu.f30145p;
        this.f30406r = c3022bu.f30146q;
        this.f30392c = c3022bu.f30147r;
        this.f30407s = c3022bu.f30148s;
        this.f30408t = c3022bu.f30149t;
        long j6 = c1Var3.f40414T;
        if (j6 != 0) {
            this.f30409u = new AtomicLong(j6);
        } else {
            this.f30409u = c3022bu.f30150u;
        }
        this.f30410v = c3022bu.f30151v;
        this.f30411w = c3022bu.f30152w;
    }

    public final boolean a() {
        return this.f30396g.matches((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33006d4));
    }
}
