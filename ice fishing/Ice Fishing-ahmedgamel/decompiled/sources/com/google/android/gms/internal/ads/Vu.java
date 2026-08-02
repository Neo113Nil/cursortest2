package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class Vu implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public ScheduledFuture f29059A;

    /* renamed from: u, reason: collision with root package name */
    public final Wu f29062u;

    /* renamed from: v, reason: collision with root package name */
    public String f29063v;

    /* renamed from: x, reason: collision with root package name */
    public String f29065x;

    /* renamed from: y, reason: collision with root package name */
    public C2590Gf f29066y;

    /* renamed from: z, reason: collision with root package name */
    public C4969z0 f29067z;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f29061n = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public int f29060B = 2;

    /* renamed from: w, reason: collision with root package name */
    public int f29064w = 2;

    public Vu(Wu wu) {
        this.f29062u = wu;
    }

    public final synchronized void a(Su su) {
        try {
            if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
                ArrayList arrayList = this.f29061n;
                su.i();
                arrayList.add(su);
                ScheduledFuture scheduledFuture = this.f29059A;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f29059A = AbstractC3436jg.f32058d.schedule(this, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.W9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
                if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19910e) && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19909d) && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains(com.anythink.expressad.foundation.g.a.f.f19906a) && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.f29060B = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.f29060B = 6;
                                }
                            }
                            this.f29060B = 5;
                        }
                        this.f29060B = 8;
                    }
                    this.f29060B = 4;
                }
                this.f29060B = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean matches;
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.X9), str);
            }
            if (matches) {
                this.f29063v = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            this.f29064w = t8.g.w(bundle);
        }
    }

    public final synchronized void e(C2590Gf c2590Gf) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            this.f29066y = c2590Gf;
        }
    }

    public final synchronized void f(C4969z0 c4969z0) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            this.f29067z = c4969z0;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            this.f29065x = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.f29059A;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList arrayList = this.f29061n;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Su su = (Su) it.next();
                    int i = this.f29060B;
                    if (i != 2) {
                        su.k(i);
                    }
                    if (!TextUtils.isEmpty(this.f29063v)) {
                        su.b(this.f29063v);
                    }
                    if (!TextUtils.isEmpty(this.f29065x) && !su.l()) {
                        su.m(this.f29065x);
                    }
                    C2590Gf c2590Gf = this.f29066y;
                    if (c2590Gf != null) {
                        su.g(c2590Gf);
                    } else {
                        C4969z0 c4969z0 = this.f29067z;
                        if (c4969z0 != null) {
                            su.h(c4969z0);
                        }
                    }
                    su.v(this.f29064w);
                    this.f29062u.b(su.q());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            this.f29060B = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
