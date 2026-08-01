package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class Vu implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public ScheduledFuture f28261A;

    /* renamed from: u, reason: collision with root package name */
    public final Wu f28264u;

    /* renamed from: v, reason: collision with root package name */
    public String f28265v;

    /* renamed from: x, reason: collision with root package name */
    public String f28267x;

    /* renamed from: y, reason: collision with root package name */
    public C2570Gf f28268y;

    /* renamed from: z, reason: collision with root package name */
    public C4920z0 f28269z;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f28263n = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public int f28262B = 2;

    /* renamed from: w, reason: collision with root package name */
    public int f28266w = 2;

    public Vu(Wu wu) {
        this.f28264u = wu;
    }

    public final synchronized void a(Su su) {
        try {
            if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
                ArrayList arrayList = this.f28263n;
                su.i();
                arrayList.add(su);
                ScheduledFuture scheduledFuture = this.f28261A;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f28261A = AbstractC3413jg.f31271d.schedule(this, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.W9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
                if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19123e) && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19122d) && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19119a) && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f28262B = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.f28262B = 6;
                                }
                            }
                            this.f28262B = 5;
                        }
                        this.f28262B = 8;
                    }
                    this.f28262B = 4;
                }
                this.f28262B = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean matches;
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) q2.r.f40207e.f40210c.a(AbstractC3569ma.X9), str);
            }
            if (matches) {
                this.f28265v = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            this.f28266w = com.bumptech.glide.d.o(bundle);
        }
    }

    public final synchronized void e(C2570Gf c2570Gf) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            this.f28268y = c2570Gf;
        }
    }

    public final synchronized void f(C4920z0 c4920z0) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            this.f28269z = c4920z0;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            this.f28267x = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f28261A;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f28263n;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Su su = (Su) it.next();
                    int i = this.f28262B;
                    if (i != 2) {
                        su.k(i);
                    }
                    if (!TextUtils.isEmpty(this.f28265v)) {
                        su.b(this.f28265v);
                    }
                    if (!TextUtils.isEmpty(this.f28267x) && !su.l()) {
                        su.m(this.f28267x);
                    }
                    C2570Gf c2570Gf = this.f28268y;
                    if (c2570Gf != null) {
                        su.j(c2570Gf);
                    } else {
                        C4920z0 c4920z0 = this.f28269z;
                        if (c4920z0 != null) {
                            su.h(c4920z0);
                        }
                    }
                    su.v(this.f28266w);
                    this.f28264u.b(su.q());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            this.f28262B = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
