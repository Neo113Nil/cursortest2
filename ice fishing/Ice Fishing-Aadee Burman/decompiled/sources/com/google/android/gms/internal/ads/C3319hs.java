package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3319hs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30955c;

    /* renamed from: d, reason: collision with root package name */
    public final long f30956d;

    /* renamed from: e, reason: collision with root package name */
    public final C2778Sj f30957e;

    /* renamed from: f, reason: collision with root package name */
    public final C3697ou f30958f;

    /* renamed from: g, reason: collision with root package name */
    public final C3052cu f30959g;

    /* renamed from: h, reason: collision with root package name */
    public final C5069B f30960h = C4835j.f39730C.f39740h.g();
    public final C2993bo i;

    /* renamed from: j, reason: collision with root package name */
    public final C2858Xj f30961j;

    public C3319hs(Context context, String str, String str2, C2778Sj c2778Sj, C3697ou c3697ou, C3052cu c3052cu, C2993bo c2993bo, C2858Xj c2858Xj, long j6) {
        this.f30953a = context;
        this.f30954b = str;
        this.f30955c = str2;
        this.f30957e = c2778Sj;
        this.f30958f = c3697ou;
        this.f30959g = c3052cu;
        this.i = c2993bo;
        this.f30961j = c2858Xj;
        this.f30956d = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        Bundle bundle = new Bundle();
        C2993bo c2993bo = this.i;
        ConcurrentHashMap concurrentHashMap = c2993bo.f29325a;
        String str = this.f30954b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.J2)).booleanValue()) {
            C4835j.f39730C.f39742k.getClass();
            c2993bo.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f30956d));
            c2993bo.b("foreground", true != u2.D.g(this.f30953a) ? "1" : "0");
        }
        C2778Sj c2778Sj = this.f30957e;
        C3052cu c3052cu = this.f30959g;
        q2.c1 c1Var = c3052cu.f29623d;
        C2870Yf c2870Yf = c2778Sj.f27540u;
        synchronized (c2870Yf.f28699d) {
            c2870Yf.f28696a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c2870Yf.f28704j = elapsedRealtime;
            C3199fg c3199fg = c2870Yf.f28697b;
            synchronized (c3199fg.f30280n) {
                c3199fg.f30283w.a(c1Var, elapsedRealtime);
            }
        }
        bundle.putAll(this.f30958f.b());
        return QC.c(new C3372is(this.f30953a, bundle, str, this.f30955c, this.f30960h, c3052cu.f29626g, this.f30961j));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 12;
    }
}
