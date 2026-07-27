package com.google.android.gms.internal.ads;

import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Df, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2519Df {

    /* renamed from: a, reason: collision with root package name */
    public final C5069B f24448a;

    public C2519Df(C5069B c5069b) {
        this.f24448a = c5069b;
    }

    public final void a(int i, long j6) {
        long j9;
        C3301ha c3301ha = AbstractC3569ma.f32194a1;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            return;
        }
        C5069B c5069b = this.f24448a;
        c5069b.i();
        synchronized (c5069b.f41206a) {
            j9 = c5069b.f41202D;
        }
        if (j6 - j9 < 0) {
            u2.z.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.f32204b1)).booleanValue()) {
            c5069b.c(i);
            c5069b.d(j6);
        } else {
            c5069b.c(-1);
            c5069b.d(j6);
        }
    }
}
