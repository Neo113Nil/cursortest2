package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0418g {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f6039a;

    /* renamed from: b, reason: collision with root package name */
    public final Qk f6040b;

    /* renamed from: c, reason: collision with root package name */
    public final Uk f6041c;

    /* renamed from: d, reason: collision with root package name */
    public final Pk f6042d;

    /* renamed from: e, reason: collision with root package name */
    public final Ra f6043e;

    /* renamed from: f, reason: collision with root package name */
    public final SystemTimeProvider f6044f;

    public AbstractC0418g(X4 x4, Qk qk, Uk uk, Pk pk, Ra ra, SystemTimeProvider systemTimeProvider) {
        this.f6039a = x4;
        this.f6040b = qk;
        this.f6041c = uk;
        this.f6042d = pk;
        this.f6043e = ra;
        this.f6044f = systemTimeProvider;
    }

    public final /* bridge */ Dk a(Object obj) {
        return a((Ek) obj);
    }

    public final Dk b() {
        if (this.f6041c.h()) {
            return new Dk(this.f6039a, this.f6041c, a(), this.f6044f);
        }
        return null;
    }

    public final Dk a(Ek ek) {
        if (this.f6041c.h()) {
            this.f6043e.reportEvent("create session with non-empty storage");
        }
        X4 x4 = this.f6039a;
        Uk uk = this.f6041c;
        long a2 = this.f6040b.a();
        Uk uk2 = this.f6041c;
        uk2.a(Uk.f5177f, Long.valueOf(a2));
        uk2.a(Uk.f5175d, Long.valueOf(ek.f4363a));
        uk2.a(Uk.f5179h, Long.valueOf(ek.f4363a));
        uk2.a(Uk.f5178g, 0L);
        uk2.a(Uk.f5180i, Boolean.TRUE);
        uk2.b();
        this.f6039a.f5350e.a(a2, this.f6042d.f4940a, TimeUnit.MILLISECONDS.toSeconds(ek.f4364b));
        return new Dk(x4, uk, a(), new SystemTimeProvider());
    }

    public final Gk a() {
        Fk fk = new Fk(this.f6042d);
        fk.f4395g = this.f6041c.i();
        fk.f4394f = this.f6041c.f5183c.a(Uk.f5178g);
        fk.f4392d = this.f6041c.f5183c.a(Uk.f5179h);
        fk.f4391c = this.f6041c.f5183c.a(Uk.f5177f);
        fk.f4396h = this.f6041c.f5183c.a(Uk.f5175d);
        fk.f4389a = this.f6041c.f5183c.a(Uk.f5176e);
        return new Gk(fk);
    }
}
