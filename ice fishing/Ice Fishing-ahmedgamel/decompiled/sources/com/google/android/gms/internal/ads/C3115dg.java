package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.HashMap;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.dg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3115dg {

    /* renamed from: h, reason: collision with root package name */
    public final String f30571h;
    public final C5140B i;

    /* renamed from: a, reason: collision with root package name */
    public long f30564a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f30565b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f30566c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f30567d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f30568e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f30569f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f30570g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public int f30572j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f30573k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f30574l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f30575m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f30576n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f30577o = new HashMap();

    public C3115dg(String str, C5140B c5140b) {
        this.f30571h = str;
        this.i = c5140b;
    }

    public final void a(s2.c1 c1Var, long j6) {
        long j9;
        long j10;
        Bundle bundle;
        int i;
        synchronized (this.f30569f) {
            try {
                C5140B c5140b = this.i;
                c5140b.i();
                synchronized (c5140b.f41599a) {
                    j9 = c5140b.f41612o;
                }
                C4906k.f40186C.f40198k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f30565b == -1) {
                    if (currentTimeMillis - j9 > ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32769C1)).longValue()) {
                        this.f30567d = -1;
                    } else {
                        c5140b.i();
                        synchronized (c5140b.f41599a) {
                            i = c5140b.f41614q;
                        }
                        this.f30567d = i;
                    }
                    this.f30565b = j6;
                    this.f30564a = j6;
                } else {
                    this.f30564a = j6;
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33181w4)).booleanValue() || (bundle = c1Var.f40419v) == null || bundle.getInt("gw", 2) != 1) {
                    this.f30566c++;
                    int i4 = this.f30567d + 1;
                    this.f30567d = i4;
                    if (i4 == 0) {
                        this.f30568e = 0L;
                        c5140b.o(currentTimeMillis);
                    } else {
                        c5140b.i();
                        synchronized (c5140b.f41599a) {
                            j10 = c5140b.f41613p;
                        }
                        this.f30568e = currentTimeMillis - j10;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) AbstractC2856Wa.f29154a.r()).booleanValue()) {
            synchronized (this.f30569f) {
                this.f30566c--;
                this.f30567d--;
            }
        }
    }
}
