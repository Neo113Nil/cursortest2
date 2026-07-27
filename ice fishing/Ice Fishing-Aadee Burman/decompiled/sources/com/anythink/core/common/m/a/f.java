package com.anythink.core.common.m.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    private static final long f14440k = 30000;

    /* renamed from: l, reason: collision with root package name */
    private static final long f14441l = 30000;

    /* renamed from: m, reason: collision with root package name */
    private static final long f14442m = 30000;

    /* renamed from: n, reason: collision with root package name */
    private static final TimeUnit f14443n = TimeUnit.MILLISECONDS;

    /* renamed from: a, reason: collision with root package name */
    public long f14444a;

    /* renamed from: b, reason: collision with root package name */
    public TimeUnit f14445b;

    /* renamed from: c, reason: collision with root package name */
    public long f14446c;

    /* renamed from: d, reason: collision with root package name */
    public TimeUnit f14447d;

    /* renamed from: e, reason: collision with root package name */
    public long f14448e;

    /* renamed from: f, reason: collision with root package name */
    public TimeUnit f14449f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f14450g;

    /* renamed from: h, reason: collision with root package name */
    public final List<e> f14451h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public int f14452j;

    public static class a {

        /* renamed from: h, reason: collision with root package name */
        private ExecutorService f14460h;
        private d i;

        /* renamed from: j, reason: collision with root package name */
        private int f14461j;

        /* renamed from: b, reason: collision with root package name */
        private long f14454b = 30000;

        /* renamed from: c, reason: collision with root package name */
        private TimeUnit f14455c = f.f14443n;

        /* renamed from: d, reason: collision with root package name */
        private long f14456d = 30000;

        /* renamed from: e, reason: collision with root package name */
        private TimeUnit f14457e = f.f14443n;

        /* renamed from: f, reason: collision with root package name */
        private long f14458f = 30000;

        /* renamed from: g, reason: collision with root package name */
        private TimeUnit f14459g = f.f14443n;

        /* renamed from: a, reason: collision with root package name */
        final List<e> f14453a = new ArrayList();

        public final a a(ExecutorService executorService) {
            this.f14460h = executorService;
            return this;
        }

        public final a b(TimeUnit timeUnit) {
            this.f14456d = 60000L;
            this.f14457e = timeUnit;
            return this;
        }

        public final a c(TimeUnit timeUnit) {
            this.f14458f = 60000L;
            this.f14459g = timeUnit;
            return this;
        }

        public final a a(TimeUnit timeUnit) {
            this.f14454b = 60000L;
            this.f14455c = timeUnit;
            return this;
        }

        public final a a(d dVar) {
            this.i = dVar;
            return this;
        }

        public final a a(int i) {
            this.f14461j = i;
            return this;
        }

        public final f a() {
            f fVar = new f((byte) 0);
            fVar.f14448e = this.f14458f;
            fVar.f14449f = this.f14459g;
            fVar.f14446c = this.f14456d;
            fVar.f14447d = this.f14457e;
            fVar.f14444a = this.f14454b;
            fVar.f14445b = this.f14455c;
            fVar.f14450g = this.f14460h;
            fVar.i = this.i;
            fVar.f14452j = this.f14461j;
            if (!this.f14453a.isEmpty()) {
                fVar.f14451h.addAll(new ArrayList(this.f14453a));
            }
            return fVar;
        }
    }

    public /* synthetic */ f(byte b9) {
        this();
    }

    private f() {
        this.f14451h = new ArrayList();
    }
}
