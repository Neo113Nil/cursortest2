package ru.yandex.mt.antirobot;

import defpackage.r8o;
import defpackage.sls;

/* loaded from: classes9.dex */
public final class a implements r8o {
    public final long a;
    public final long b;
    public final sls c;
    public final long d;
    public final long e;
    public int f;
    public long g;
    public Exception h;

    public a(int i) {
        DefaultErrorPolicy$1 defaultErrorPolicy$1 = DefaultErrorPolicy$1.b;
        this.a = 600000L;
        this.b = 10000L;
        this.c = defaultErrorPolicy$1;
        this.d = 600000L;
        this.e = 600000L;
    }

    @Override // defpackage.r8o
    public final synchronized void a(Exception exc) {
        this.h = exc;
        this.f++;
        this.g = ((Number) this.c.invoke()).longValue() + (exc instanceof VendorUnavailableException ? this.d : exc instanceof ServerNonFunctionalException ? this.e : Math.min((1 << this.f) * this.b, this.a));
    }

    @Override // defpackage.r8o
    public final synchronized boolean b() {
        boolean z;
        if (this.h != null) {
            z = this.g > ((Number) this.c.invoke()).longValue();
        }
        return z;
    }

    @Override // defpackage.r8o
    public final synchronized Throwable c() {
        return this.h;
    }

    @Override // defpackage.r8o
    public final synchronized void reset() {
        this.f = 0;
        this.g = 0L;
        this.h = null;
    }

    public a() {
        this(0);
    }
}
