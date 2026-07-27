package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.et, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3170et implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final C2892Zf f30525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30526b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f30527c;

    /* renamed from: d, reason: collision with root package name */
    public final C3157eg f30528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30529e;

    public C3170et(C2892Zf c2892Zf, boolean z8, C3157eg c3157eg, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f30525a = c2892Zf;
        this.f30526b = z8;
        this.f30528d = c3157eg;
        this.f30527c = scheduledExecutorService;
        this.f30529e = i;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        C3151ea c3151ea = AbstractC3368ia.U7;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && this.f30526b) {
            return C3686oN.c(new Vr(null, 6));
        }
        if (!Arrays.asList(((String) rVar.f40119c.a(AbstractC3368ia.f31586W7)).split(",")).contains(String.valueOf(this.f30529e))) {
            return C3686oN.c(new Vr(null, 6));
        }
        OD od = OD.f26665u;
        J2 j22 = J2.f25704p;
        C3157eg c3157eg = this.f30528d;
        return C3686oN.u(C3686oN.w(C3686oN.A(od, j22, c3157eg), ((Long) AbstractC2870Ya.f28832b.r()).longValue(), TimeUnit.MILLISECONDS, this.f30527c), Exception.class, new C2670Me(6, this), c3157eg);
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return 50;
    }
}
