package ru.yandex.taxi.experiments.storage;

import defpackage.bvf0;
import defpackage.cvw;
import defpackage.f89;
import defpackage.ike;
import defpackage.jl40;
import defpackage.lc0;
import defpackage.m1k;
import defpackage.mdh;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.pzt0;
import defpackage.qgg;
import defpackage.sb2;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xkh;
import defpackage.ykh;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class a {
    public final kotlinx.coroutines.channels.a a;
    public final AtomicReference b;
    public final Object c;
    public long d;
    public qgg e;
    public long f;
    public Throwable g;
    public final pzt0 h;

    public a(tt2 tt2Var) {
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = sb2.a(Integer.MAX_VALUE, null, null, 6);
        ike a = bvf0.a(cvw.U(jl40.a(), mdhVar));
        this.b = new AtomicReference();
        this.c = new Object();
        this.f = -1L;
        this.h = tje.N(a, null, null, new DefaultStoredExperimentsPersistenceQueue$workerJob$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Throwable a(a aVar, long j) {
        Exception exc;
        long j2 = aVar.f;
        if (j == j2) {
            return aVar.g;
        }
        if (j <= j2) {
            ny61.r("Check failed.");
            return null;
        }
        qgg qggVar = aVar.e;
        if (qggVar != null) {
            if (qggVar.b > j) {
                qggVar = null;
            }
            if (qggVar != null) {
                exc = (Exception) qggVar.c;
                if (exc != null) {
                    aVar.e = null;
                }
                aVar.f = j;
                aVar.g = exc;
                return exc;
            }
        }
        exc = null;
        if (exc != null) {
        }
        aVar.f = j;
        aVar.g = exc;
        return exc;
    }

    public final void b() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        m1k w = this.h.w(new lc0(atomicBoolean, atomicReference2, this, countDownLatch, 15));
        try {
            Throwable th = (Throwable) atomicReference2.get();
            if (th != null) {
                throw d(th);
            }
            synchronized (this.c) {
                Object d = this.a.d(new xkh(this.d, new f89(18, atomicReference, atomicBoolean, countDownLatch)));
                ni9 ni9Var = oi9.b;
                if (d instanceof ni9) {
                    throw d(oi9.a(d));
                }
            }
            if (!countDownLatch.await(30L, TimeUnit.SECONDS)) {
                throw new IllegalStateException("Timed out waiting for stored experiments persistence");
            }
            if (!atomicBoolean.get()) {
                throw d((Throwable) atomicReference2.get());
            }
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 != null) {
                throw new IllegalStateException("Stored experiments persistence task failed", th2);
            }
            w.dispose();
        } catch (Throwable th3) {
            w.dispose();
            throw th3;
        }
    }

    public final void c(sls slsVar) {
        synchronized (this.c) {
            long j = this.d + 1;
            Object d = this.a.d(new ykh(j, slsVar));
            ni9 ni9Var = oi9.b;
            if (d instanceof ni9) {
                throw d(oi9.a(d));
            }
            this.d = j;
        }
    }

    public final IllegalStateException d(Throwable th) {
        Throwable th2 = (Throwable) this.b.get();
        if (th2 != null) {
            th = th2;
        }
        return new IllegalStateException("Stored experiments persistence worker is not running", th);
    }
}
