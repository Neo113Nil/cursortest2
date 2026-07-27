package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import u2.C5069B;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Vs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final C5069B f28254a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f28255b;

    /* renamed from: c, reason: collision with root package name */
    public final C3360ig f28256c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f28257d;

    /* renamed from: e, reason: collision with root package name */
    public final C3429jw f28258e;

    /* renamed from: f, reason: collision with root package name */
    public final C3052cu f28259f;

    /* renamed from: g, reason: collision with root package name */
    public final C5110a f28260g;

    public Vs(C5069B c5069b, Context context, C3360ig c3360ig, ScheduledExecutorService scheduledExecutorService, C3429jw c3429jw, C3052cu c3052cu, C5110a c5110a) {
        this.f28254a = c5069b;
        this.f28255b = context;
        this.f28256c = c3360ig;
        this.f28257d = scheduledExecutorService;
        this.f28258e = c3429jw;
        this.f28259f = c3052cu;
        this.f28260g = c5110a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r9.f28255b.getPackageName()) == false) goto L48;
     */
    @Override // com.google.android.gms.internal.ads.Ps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final N3.a c() {
        boolean z3;
        N3.a k9;
        C3301ha c3301ha = AbstractC3569ma.Ob;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            C5069B c5069b = this.f28254a;
            c5069b.i();
            synchronized (c5069b.f41206a) {
                try {
                    SharedPreferences sharedPreferences = c5069b.f41211f;
                    if (sharedPreferences != null) {
                        if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) >= System.currentTimeMillis()) {
                            z3 = c5069b.f41211f.getBoolean("is_topics_ad_personalization_allowed", false) && !c5069b.f41215k;
                        }
                    }
                    z3 = false;
                } finally {
                }
            }
            if (z3) {
                if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.Sb)).booleanValue() || this.f28259f.f29623d.f40110R != 2) {
                    if (this.f28260g.f41390v >= ((Integer) rVar.f40207c.a(AbstractC3569ma.Mb)).intValue()) {
                        if (Build.VERSION.SDK_INT >= ((Integer) rVar.f40207c.a(AbstractC3569ma.Nb)).intValue()) {
                            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Kb)).booleanValue()) {
                                String str = (String) rVar.f40207c.a(AbstractC3569ma.Lb);
                                if (!TextUtils.isEmpty(str)) {
                                }
                            }
                            try {
                                k9 = QC.s(this.f28258e.a(false), ((Integer) rVar.f40207c.a(AbstractC3569ma.Qb)).intValue(), TimeUnit.MILLISECONDS, this.f28257d);
                            } catch (Exception e9) {
                                k9 = QC.k(e9);
                            }
                            C3360ig c3360ig = this.f28256c;
                            return QC.s(QC.r(QC.t(ID.s(k9), C2556Fi.f24828k, c3360ig), Throwable.class, new C4164xc(9, this), c3360ig), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Qb)).intValue(), TimeUnit.MILLISECONDS, this.f28257d);
                        }
                    }
                }
            }
        }
        return QC.c(new C3265gs("", -1, 1));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 56;
    }
}
