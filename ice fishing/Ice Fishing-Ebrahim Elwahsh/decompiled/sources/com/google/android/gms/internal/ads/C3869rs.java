package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.rs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3869rs implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f34123a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f34124b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public final S2.a f34125c;

    /* renamed from: d, reason: collision with root package name */
    public final SD f34126d;

    /* renamed from: e, reason: collision with root package name */
    public final Rs f34127e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34128f;

    /* renamed from: g, reason: collision with root package name */
    public final C3165eo f34129g;

    public C3869rs(Rs rs, long j9, S2.a aVar, SD sd, C3165eo c3165eo) {
        this.f34125c = aVar;
        this.f34127e = rs;
        this.f34128f = j9;
        this.f34126d = sd;
        this.f34129g = c3165eo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r1.f33525b < android.os.SystemClock.elapsedRealtime()) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.Rs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final J3.a a() {
        C3762ps c3762ps;
        C3151ea c3151ea = AbstractC3368ia.kd;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.jd)).booleanValue() && !((Boolean) this.f34124b.getAndSet(Boolean.TRUE)).booleanValue()) {
                C3103dg c3103dg = AbstractC3212fg.f30741d;
                RunnableC3816qs runnableC3816qs = new RunnableC3816qs(this, 1);
                long j9 = this.f34128f;
                c3103dg.scheduleWithFixedDelay(runnableC3816qs, j9, j9, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    AtomicReference atomicReference = this.f34123a;
                    C3762ps c3762ps2 = (C3762ps) atomicReference.get();
                    if (c3762ps2 == null) {
                        J3.a a9 = this.f34127e.a();
                        atomicReference.set(new C3762ps(a9, this.f34128f, this.f34125c));
                        return a9;
                    }
                    if (!((Boolean) this.f34124b.get()).booleanValue()) {
                        c3762ps2.f33526c.getClass();
                        if (c3762ps2.f33525b < SystemClock.elapsedRealtime()) {
                            J3.a aVar = c3762ps2.f33524a;
                            Rs rs = this.f34127e;
                            C3762ps c3762ps3 = new C3762ps(rs.a(), this.f34128f, this.f34125c);
                            this.f34123a.set(c3762ps3);
                            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.ld)).booleanValue()) {
                                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.md)).booleanValue()) {
                                    C2593Hm a10 = this.f34129g.a();
                                    a10.r(NativeAdvancedJsUtils.f18064p, "scs");
                                    a10.r("sid", String.valueOf(rs.d()));
                                    a10.s();
                                }
                                return aVar;
                            }
                            c3762ps = c3762ps3;
                        }
                    }
                    c3762ps = c3762ps2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            AtomicReference atomicReference2 = this.f34123a;
            c3762ps = (C3762ps) atomicReference2.get();
            if (c3762ps != null) {
                c3762ps.f33526c.getClass();
            }
            Rs rs2 = this.f34127e;
            C3762ps c3762ps4 = new C3762ps(rs2.a(), this.f34128f, this.f34125c);
            atomicReference2.set(c3762ps4);
            c3762ps = c3762ps4;
        }
        return c3762ps.f33524a;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        return this.f34127e.d();
    }
}
