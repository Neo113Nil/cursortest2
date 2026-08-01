package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final b f8777a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8778b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f8779c;

    /* renamed from: d, reason: collision with root package name */
    private int f8780d;

    /* renamed from: e, reason: collision with root package name */
    private Object f8781e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f8782f;

    /* renamed from: g, reason: collision with root package name */
    private int f8783g;

    /* renamed from: h, reason: collision with root package name */
    private long f8784h = com.anythink.basead.exoplayer.b.f6382b;
    private boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8785j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8786k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8787l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8788m;

    public interface a {
        void a(x xVar);
    }

    public interface b {
        void a(int i, Object obj);
    }

    public x(a aVar, b bVar, ae aeVar, int i, Handler handler) {
        this.f8778b = aVar;
        this.f8777a = bVar;
        this.f8779c = aeVar;
        this.f8782f = handler;
        this.f8783g = i;
    }

    private synchronized x l() {
        com.anythink.basead.exoplayer.k.a.b(this.f8785j);
        this.f8788m = true;
        a(false);
        return this;
    }

    public final ae a() {
        return this.f8779c;
    }

    public final b b() {
        return this.f8777a;
    }

    public final int c() {
        return this.f8780d;
    }

    public final Object d() {
        return this.f8781e;
    }

    public final Handler e() {
        return this.f8782f;
    }

    public final long f() {
        return this.f8784h;
    }

    public final int g() {
        return this.f8783g;
    }

    public final boolean h() {
        return this.i;
    }

    public final x i() {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        if (this.f8784h == com.anythink.basead.exoplayer.b.f6382b) {
            com.anythink.basead.exoplayer.k.a.a(this.i);
        }
        this.f8785j = true;
        this.f8778b.a(this);
        return this;
    }

    public final synchronized boolean j() {
        return this.f8788m;
    }

    public final synchronized boolean k() {
        boolean z3;
        try {
            com.anythink.basead.exoplayer.k.a.b(this.f8785j);
            com.anythink.basead.exoplayer.k.a.b(this.f8782f.getLooper().getThread() != Thread.currentThread());
            long j6 = 500;
            long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
            while (true) {
                z3 = this.f8787l;
                if (z3 || j6 <= 0) {
                    break;
                }
                wait(j6);
                j6 = elapsedRealtime - SystemClock.elapsedRealtime();
            }
            if (!z3) {
                throw new TimeoutException("Message delivery time out");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8786k;
    }

    private x b(boolean z3) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        this.i = z3;
        return this;
    }

    public final x a(int i) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        this.f8780d = i;
        return this;
    }

    public final x a(Object obj) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        this.f8781e = obj;
        return this;
    }

    private x a(Handler handler) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        this.f8782f = handler;
        return this;
    }

    private x a(long j6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        this.f8784h = j6;
        return this;
    }

    private x a(int i, long j6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f8785j);
        com.anythink.basead.exoplayer.k.a.a(j6 != com.anythink.basead.exoplayer.b.f6382b);
        if (i >= 0 && (this.f8779c.a() || i < this.f8779c.b())) {
            this.f8783g = i;
            this.f8784h = j6;
            return this;
        }
        throw new o(this.f8779c, i, j6);
    }

    public final synchronized void a(boolean z3) {
        this.f8786k = z3 | this.f8786k;
        this.f8787l = true;
        notifyAll();
    }
}
