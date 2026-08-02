package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import p2.C4830a;
import p2.C4833d;

/* renamed from: com.google.android.gms.internal.ads.bu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3022bu {

    /* renamed from: a, reason: collision with root package name */
    public s2.c1 f30131a;

    /* renamed from: b, reason: collision with root package name */
    public s2.f1 f30132b;

    /* renamed from: c, reason: collision with root package name */
    public String f30133c;

    /* renamed from: d, reason: collision with root package name */
    public s2.Z0 f30134d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30135e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f30136f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f30137g;

    /* renamed from: h, reason: collision with root package name */
    public C3485kb f30138h;
    public s2.i1 i;

    /* renamed from: j, reason: collision with root package name */
    public C4830a f30139j;

    /* renamed from: k, reason: collision with root package name */
    public C4833d f30140k;

    /* renamed from: l, reason: collision with root package name */
    public s2.V f30141l;

    /* renamed from: m, reason: collision with root package name */
    public int f30142m = 1;

    /* renamed from: n, reason: collision with root package name */
    public C2570Fc f30143n;

    /* renamed from: o, reason: collision with root package name */
    public final N6.i f30144o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30145p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30146q;

    /* renamed from: r, reason: collision with root package name */
    public Dr f30147r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30148s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f30149t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f30150u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30151v;

    /* renamed from: w, reason: collision with root package name */
    public JSONArray f30152w;

    /* renamed from: x, reason: collision with root package name */
    public s2.Y f30153x;

    public C3022bu() {
        N6.i iVar = new N6.i(5);
        iVar.f2062u = 2;
        this.f30144o = iVar;
        this.f30145p = false;
        this.f30146q = false;
        this.f30148s = false;
        this.f30150u = new AtomicLong();
        this.f30151v = false;
    }

    public final C3075cu a() {
        R2.w.i(this.f30133c, "ad unit must not be null");
        R2.w.i(this.f30132b, "ad size must not be null");
        R2.w.i(this.f30131a, "ad request must not be null");
        return new C3075cu(this);
    }
}
