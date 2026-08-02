package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import w2.C5140B;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Vs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final C5140B f29052a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29053b;

    /* renamed from: c, reason: collision with root package name */
    public final C3383ig f29054c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f29055d;

    /* renamed from: e, reason: collision with root package name */
    public final C3506kw f29056e;

    /* renamed from: f, reason: collision with root package name */
    public final C3075cu f29057f;

    /* renamed from: g, reason: collision with root package name */
    public final C5189a f29058g;

    public Vs(C5140B c5140b, Context context, C3383ig c3383ig, ScheduledExecutorService scheduledExecutorService, C3506kw c3506kw, C3075cu c3075cu, C5189a c5189a) {
        this.f29052a = c5140b;
        this.f29053b = context;
        this.f29054c = c3383ig;
        this.f29055d = scheduledExecutorService;
        this.f29056e = c3506kw;
        this.f29057f = c3075cu;
        this.f29058g = c5189a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.f29053b.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.Ps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P3.a c() {
        boolean z6;
        P3.a k9;
        C3324ha c3324ha = AbstractC3592ma.Ob;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C5140B c5140b = this.f29052a;
            c5140b.i();
            synchronized (c5140b.f41599a) {
                try {
                    SharedPreferences sharedPreferences = c5140b.f41604f;
                    if (sharedPreferences != null) {
                        if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) >= System.currentTimeMillis()) {
                            z6 = c5140b.f41604f.getBoolean("is_topics_ad_personalization_allowed", false) && !c5140b.f41608k;
                        }
                    }
                    z6 = false;
                } finally {
                }
            }
            if (z6) {
                if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.Sb)).booleanValue() || this.f29057f.f30393d.f40412R != 2) {
                    if (this.f29058g.f41847v >= ((Integer) rVar.f40509c.a(AbstractC3592ma.Mb)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) rVar.f40509c.a(AbstractC3592ma.Nb)).intValue()) {
                            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Kb)).booleanValue()) {
                                String str = (String) rVar.f40509c.a(AbstractC3592ma.Lb);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                k9 = QC.s(this.f29056e.a(false), ((Integer) rVar.f40509c.a(AbstractC3592ma.Qb)).intValue(), TimeUnit.MILLISECONDS, this.f29055d);
                            } catch (Exception e9) {
                                k9 = QC.k(e9);
                            }
                            C3383ig c3383ig = this.f29054c;
                            return QC.s(QC.r(QC.t(ID.s(k9), C2576Fi.f25617k, c3383ig), Throwable.class, new C4187xc(9, this), c3383ig), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qb)).intValue(), TimeUnit.MILLISECONDS, this.f29055d);
                        }
                    }
                }
            }
        }
        return QC.c(new C3288gs("", -1, 1));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 56;
    }
}
