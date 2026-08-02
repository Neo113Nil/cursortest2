package com.anythink.core.common.m.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    private static final long f15226k = 30000;

    /* renamed from: l, reason: collision with root package name */
    private static final long f15227l = 30000;

    /* renamed from: m, reason: collision with root package name */
    private static final long f15228m = 30000;

    /* renamed from: n, reason: collision with root package name */
    private static final TimeUnit f15229n = TimeUnit.MILLISECONDS;

    /* renamed from: a, reason: collision with root package name */
    public long f15230a;

    /* renamed from: b, reason: collision with root package name */
    public TimeUnit f15231b;

    /* renamed from: c, reason: collision with root package name */
    public long f15232c;

    /* renamed from: d, reason: collision with root package name */
    public TimeUnit f15233d;

    /* renamed from: e, reason: collision with root package name */
    public long f15234e;

    /* renamed from: f, reason: collision with root package name */
    public TimeUnit f15235f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorService f15236g;

    /* renamed from: h, reason: collision with root package name */
    public final List<e> f15237h;
    public d i;

    /* renamed from: j, reason: collision with root package name */
    public int f15238j;

    public static class a {

        /* renamed from: h, reason: collision with root package name */
        private ExecutorService f15246h;
        private d i;

        /* renamed from: j, reason: collision with root package name */
        private int f15247j;

        /* renamed from: b, reason: collision with root package name */
        private long f15240b = 30000;

        /* renamed from: c, reason: collision with root package name */
        private TimeUnit f15241c = f.f15229n;

        /* renamed from: d, reason: collision with root package name */
        private long f15242d = 30000;

        /* renamed from: e, reason: collision with root package name */
        private TimeUnit f15243e = f.f15229n;

        /* renamed from: f, reason: collision with root package name */
        private long f15244f = 30000;

        /* renamed from: g, reason: collision with root package name */
        private TimeUnit f15245g = f.f15229n;

        /* renamed from: a, reason: collision with root package name */
        final List<e> f15239a = new ArrayList();

        public final a a(ExecutorService executorService) {
            this.f15246h = executorService;
            return this;
        }

        public final a b(TimeUnit timeUnit) {
            this.f15242d = 60000L;
            this.f15243e = timeUnit;
            return this;
        }

        public final a c(TimeUnit timeUnit) {
            this.f15244f = 60000L;
            this.f15245g = timeUnit;
            return this;
        }

        public final a a(TimeUnit timeUnit) {
            this.f15240b = 60000L;
            this.f15241c = timeUnit;
            return this;
        }

        public final a a(d dVar) {
            this.i = dVar;
            return this;
        }

        public final a a(int i) {
            this.f15247j = i;
            return this;
        }

        public final f a() {
            f fVar = new f((byte) 0);
            fVar.f15234e = this.f15244f;
            fVar.f15235f = this.f15245g;
            fVar.f15232c = this.f15242d;
            fVar.f15233d = this.f15243e;
            fVar.f15230a = this.f15240b;
            fVar.f15231b = this.f15241c;
            fVar.f15236g = this.f15246h;
            fVar.i = this.i;
            fVar.f15238j = this.f15247j;
            if (!this.f15239a.isEmpty()) {
                fVar.f15237h.addAll(new ArrayList(this.f15239a));
            }
            return fVar;
        }
    }

    public /* synthetic */ f(byte b9) {
        this();
    }

    private f() {
        this.f15237h = new ArrayList();
    }
}
