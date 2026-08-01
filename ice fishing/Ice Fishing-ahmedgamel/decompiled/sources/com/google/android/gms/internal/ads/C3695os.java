package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3695os implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f32955a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f32956b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public final T2.a f32957c;

    /* renamed from: d, reason: collision with root package name */
    public final RD f32958d;

    /* renamed from: e, reason: collision with root package name */
    public final Ps f32959e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32960f;

    /* renamed from: g, reason: collision with root package name */
    public final C3153eo f32961g;

    public C3695os(Ps ps, long j6, T2.a aVar, RD rd, C3153eo c3153eo) {
        this.f32957c = aVar;
        this.f32959e = ps;
        this.f32960f = j6;
        this.f32958d = rd;
        this.f32961g = c3153eo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r1.f32620b < android.os.SystemClock.elapsedRealtime()) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.Ps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final N3.a c() {
        C3587ms c3587ms;
        C3301ha c3301ha = AbstractC3569ma.kd;
        q2.r rVar = q2.r.f40207e;
        if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.jd)).booleanValue() && !((Boolean) this.f32956b.getAndSet(Boolean.TRUE)).booleanValue()) {
                B8.c cVar = AbstractC3413jg.f31271d;
                RunnableC3641ns runnableC3641ns = new RunnableC3641ns(this, 1);
                long j6 = this.f32960f;
                cVar.scheduleWithFixedDelay(runnableC3641ns, j6, j6, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f32955a;
                    C3587ms c3587ms2 = (C3587ms) atomicReference.get();
                    if (c3587ms2 == null) {
                        N3.a c9 = this.f32959e.c();
                        atomicReference.set(new C3587ms(c9, this.f32960f, this.f32957c));
                        return c9;
                    }
                    if (!((Boolean) this.f32956b.get()).booleanValue()) {
                        c3587ms2.f32621c.getClass();
                        if (c3587ms2.f32620b < SystemClock.elapsedRealtime()) {
                            N3.a aVar = c3587ms2.f32619a;
                            Ps ps = this.f32959e;
                            C3587ms c3587ms3 = new C3587ms(ps.c(), this.f32960f, this.f32957c);
                            this.f32955a.set(c3587ms3);
                            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.ld)).booleanValue()) {
                                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.md)).booleanValue()) {
                                    S0.e a9 = this.f32961g.a();
                                    a9.v(NativeAdvancedJsUtils.f17906p, "scs");
                                    a9.v("sid", String.valueOf(ps.f()));
                                    a9.y();
                                }
                                return aVar;
                            }
                            c3587ms = c3587ms3;
                        }
                    }
                    c3587ms = c3587ms2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f32955a;
            c3587ms = (C3587ms) atomicReference2.get();
            if (c3587ms != null) {
                c3587ms.f32621c.getClass();
            }
            Ps ps2 = this.f32959e;
            C3587ms c3587ms4 = new C3587ms(ps2.c(), this.f32960f, this.f32957c);
            atomicReference2.set(c3587ms4);
            c3587ms = c3587ms4;
        }
        return c3587ms.f32619a;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return this.f32959e.f();
    }
}
