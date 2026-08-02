package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.hs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3342hs implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31728b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31729c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31730d;

    /* renamed from: e, reason: collision with root package name */
    public final C2798Sj f31731e;

    /* renamed from: f, reason: collision with root package name */
    public final C3720ou f31732f;

    /* renamed from: g, reason: collision with root package name */
    public final C3075cu f31733g;

    /* renamed from: h, reason: collision with root package name */
    public final C5140B f31734h = C4906k.f40186C.f40196h.g();
    public final C3069co i;

    /* renamed from: j, reason: collision with root package name */
    public final C2881Xj f31735j;

    public C3342hs(Context context, String str, String str2, C2798Sj c2798Sj, C3720ou c3720ou, C3075cu c3075cu, C3069co c3069co, C2881Xj c2881Xj, long j6) {
        this.f31727a = context;
        this.f31728b = str;
        this.f31729c = str2;
        this.f31731e = c2798Sj;
        this.f31732f = c3720ou;
        this.f31733g = c3075cu;
        this.i = c3069co;
        this.f31735j = c2881Xj;
        this.f31730d = j6;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        Bundle bundle = new Bundle();
        C3069co c3069co = this.i;
        ConcurrentHashMap concurrentHashMap = c3069co.f30367a;
        String str = this.f31728b;
        concurrentHashMap.put("seq_num", str);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue()) {
            C4906k.f40186C.f40198k.getClass();
            c3069co.b("tsacc", String.valueOf(System.currentTimeMillis() - this.f31730d));
            c3069co.b("foreground", true != w2.D.g(this.f31727a) ? "1" : "0");
        }
        C2798Sj c2798Sj = this.f31731e;
        C3075cu c3075cu = this.f31733g;
        s2.c1 c1Var = c3075cu.f30393d;
        C2893Yf c2893Yf = c2798Sj.f28332u;
        synchronized (c2893Yf.f29474d) {
            c2893Yf.f29471a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c2893Yf.f29479j = elapsedRealtime;
            C3222fg c3222fg = c2893Yf.f29472b;
            synchronized (c3222fg.f31068n) {
                c3222fg.f31071w.a(c1Var, elapsedRealtime);
            }
        }
        bundle.putAll(this.f31732f.b());
        return QC.c(new C3395is(this.f31727a, bundle, str, this.f31729c, this.f31734h, c3075cu.f30396g, this.f31735j));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 12;
    }
}
