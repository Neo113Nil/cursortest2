package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0863x4 implements Ea, Ql, Ga {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7173a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final Am f7175c;

    /* renamed from: d, reason: collision with root package name */
    public final C0928zh f7176d;

    /* renamed from: e, reason: collision with root package name */
    public final E4 f7177e;

    /* renamed from: f, reason: collision with root package name */
    public final C0571ln f7178f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7179g;

    /* renamed from: h, reason: collision with root package name */
    public final R4 f7180h;

    /* renamed from: i, reason: collision with root package name */
    public final C0564lg f7181i;

    /* renamed from: j, reason: collision with root package name */
    public final T3 f7182j;

    /* renamed from: k, reason: collision with root package name */
    public final C0694qg f7183k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7184l;

    public C0863x4(Context context, Hl hl, Q4 q4, C0656p4 c0656p4, C0564lg c0564lg) {
        this(context, hl, q4, c0656p4, new C0928zh(c0656p4.f6721b), c0564lg, new R4(), new C0915z4(), new C0694qg());
    }

    public static void b(C0656p4 c0656p4) {
        C0610na.f6575I.c().b(!Boolean.FALSE.equals(c0656p4.f6721b.f6657n));
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final void a(C0630o4 c0630o4) {
        C0928zh c0928zh = this.f7176d;
        c0928zh.f7280a = c0928zh.f7280a.mergeFrom(c0630o4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final C0630o4 d() {
        return this.f7176d.f7280a;
    }

    public final C0564lg e() {
        return this.f7181i;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Context getContext() {
        return this.f7173a;
    }

    public C0863x4(Context context, Hl hl, Q4 q4, C0656p4 c0656p4, C0928zh c0928zh, C0564lg c0564lg, R4 r4, C0915z4 c0915z4, C0694qg c0694qg) {
        this.f7179g = new ArrayList();
        this.f7184l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f7173a = applicationContext;
        this.f7174b = q4;
        this.f7176d = c0928zh;
        this.f7180h = r4;
        this.f7177e = C0915z4.a(this);
        b(c0656p4);
        Am a2 = hl.a(applicationContext, q4, c0656p4.f6720a);
        this.f7175c = a2;
        this.f7182j = U3.a(a2, C0610na.k().c());
        this.f7178f = c0915z4.a(this, a2);
        this.f7181i = c0564lg;
        this.f7183k = c0694qg;
        hl.a(q4, this);
    }

    public final synchronized void a(C0785u4 c0785u4) {
        this.f7180h.f4982a.add(c0785u4);
        B6.a(c0785u4.f6968c, this.f7182j.a(Fm.a(this.f7175c.e().f6013l)));
    }

    public final synchronized void b(C0785u4 c0785u4) {
        this.f7180h.f4982a.remove(c0785u4);
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Q4 b() {
        return this.f7174b;
    }

    public final void a(P5 p5, C0785u4 c0785u4) {
        E4 e4 = this.f7177e;
        e4.getClass();
        e4.a(p5, new D4(c0785u4));
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl, C0415fm c0415fm) {
        synchronized (this.f7184l) {
            try {
                Iterator it = this.f7179g.iterator();
                while (it.hasNext()) {
                    Xa xa = (Xa) it.next();
                    B6.a(xa.f5386a, jl, this.f7182j.a(xa.f5388c));
                }
                this.f7179g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Ql
    public final void a(C0415fm c0415fm) {
        synchronized (this.f7184l) {
            try {
                Iterator it = this.f7180h.f4982a.iterator();
                while (it.hasNext()) {
                    C0785u4 c0785u4 = (C0785u4) it.next();
                    B6.a(c0785u4.f6968c, this.f7182j.a(Fm.a(c0415fm.f6013l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f7179g.iterator();
                while (it2.hasNext()) {
                    Xa xa = (Xa) it2.next();
                    if (AbstractC0338cm.a(c0415fm, xa.f5387b, xa.f5388c, new Va())) {
                        B6.a(xa.f5386a, this.f7182j.a(xa.f5388c));
                    } else {
                        arrayList.add(xa);
                    }
                }
                this.f7179g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f7178f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Xa xa) {
        ResultReceiver resultReceiver;
        HashMap hashMap;
        List<String> list;
        HashMap hashMap2 = new HashMap();
        if (xa != null) {
            list = xa.f5387b;
            resultReceiver = xa.f5386a;
            hashMap = xa.f5388c;
        } else {
            resultReceiver = null;
            hashMap = hashMap2;
            list = null;
        }
        boolean a2 = this.f7175c.a(list, hashMap);
        if (!a2) {
            B6.a(resultReceiver, this.f7182j.a(hashMap));
        }
        if (!this.f7175c.g()) {
            if (a2) {
                B6.a(resultReceiver, this.f7182j.a(hashMap));
                return;
            }
            return;
        }
        synchronized (this.f7184l) {
            if (a2 && xa != null) {
                try {
                    this.f7179g.add(xa);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f7178f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f7183k.a(new C0837w4(resultReceiver));
    }

    public final T3 a() {
        return this.f7182j;
    }

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(C0656p4 c0656p4) {
        this.f7175c.a(c0656p4.f6720a);
        a(c0656p4.f6721b);
    }
}
