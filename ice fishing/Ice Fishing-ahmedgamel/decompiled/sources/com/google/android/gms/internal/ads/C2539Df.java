package com.google.android.gms.internal.ads;

import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2539Df {

    /* renamed from: a, reason: collision with root package name */
    public final C5140B f25195a;

    public C2539Df(C5140B c5140b) {
        this.f25195a = c5140b;
    }

    public final void a(int i, long j6) {
        long j9;
        C3324ha c3324ha = AbstractC3592ma.f32973a1;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            return;
        }
        C5140B c5140b = this.f25195a;
        c5140b.i();
        synchronized (c5140b.f41599a) {
            j9 = c5140b.f41595D;
        }
        if (j6 - j9 < 0) {
            w2.z.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f32983b1)).booleanValue()) {
            c5140b.c(i);
            c5140b.d(j6);
        } else {
            c5140b.c(-1);
            c5140b.d(j6);
        }
    }
}
