package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3718os implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f33741a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f33742b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public final V2.a f33743c;

    /* renamed from: d, reason: collision with root package name */
    public final RD f33744d;

    /* renamed from: e, reason: collision with root package name */
    public final Ps f33745e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33746f;

    /* renamed from: g, reason: collision with root package name */
    public final C3230fo f33747g;

    public C3718os(Ps ps, long j6, V2.a aVar, RD rd, C3230fo c3230fo) {
        this.f33743c = aVar;
        this.f33745e = ps;
        this.f33746f = j6;
        this.f33744d = rd;
        this.f33747g = c3230fo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r1.f33398b < android.os.SystemClock.elapsedRealtime()) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.Ps
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P3.a c() {
        C3610ms c3610ms;
        C3324ha c3324ha = AbstractC3592ma.kd;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.jd)).booleanValue() && !((Boolean) this.f33742b.getAndSet(Boolean.TRUE)).booleanValue()) {
                B8.c cVar = AbstractC3436jg.f32058d;
                RunnableC3664ns runnableC3664ns = new RunnableC3664ns(this, 1);
                long j6 = this.f33746f;
                cVar.scheduleWithFixedDelay(runnableC3664ns, j6, j6, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f33741a;
                    C3610ms c3610ms2 = (C3610ms) atomicReference.get();
                    if (c3610ms2 == null) {
                        P3.a c9 = this.f33745e.c();
                        atomicReference.set(new C3610ms(c9, this.f33746f, this.f33743c));
                        return c9;
                    }
                    if (!((Boolean) this.f33742b.get()).booleanValue()) {
                        c3610ms2.f33399c.getClass();
                        if (c3610ms2.f33398b < SystemClock.elapsedRealtime()) {
                            P3.a aVar = c3610ms2.f33397a;
                            Ps ps = this.f33745e;
                            C3610ms c3610ms3 = new C3610ms(ps.c(), this.f33746f, this.f33743c);
                            this.f33741a.set(c3610ms3);
                            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.ld)).booleanValue()) {
                                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.md)).booleanValue()) {
                                    S0.e a9 = this.f33747g.a();
                                    a9.M(NativeAdvancedJsUtils.f18693p, "scs");
                                    a9.M("sid", String.valueOf(ps.f()));
                                    a9.N();
                                }
                                return aVar;
                            }
                            c3610ms = c3610ms3;
                        }
                    }
                    c3610ms = c3610ms2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f33741a;
            c3610ms = (C3610ms) atomicReference2.get();
            if (c3610ms != null) {
                c3610ms.f33399c.getClass();
            }
            Ps ps2 = this.f33745e;
            C3610ms c3610ms4 = new C3610ms(ps2.c(), this.f33746f, this.f33743c);
            atomicReference2.set(c3610ms4);
            c3610ms = c3610ms4;
        }
        return c3610ms.f33397a;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return this.f33745e.f();
    }
}
