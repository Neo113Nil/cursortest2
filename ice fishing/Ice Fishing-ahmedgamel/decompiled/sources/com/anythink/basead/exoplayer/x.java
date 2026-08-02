package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final b f9563a;

    /* renamed from: b, reason: collision with root package name */
    private final a f9564b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f9565c;

    /* renamed from: d, reason: collision with root package name */
    private int f9566d;

    /* renamed from: e, reason: collision with root package name */
    private Object f9567e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f9568f;

    /* renamed from: g, reason: collision with root package name */
    private int f9569g;

    /* renamed from: h, reason: collision with root package name */
    private long f9570h = com.anythink.basead.exoplayer.b.f7168b;
    private boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9571j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9572k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9573l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9574m;

    public interface a {
        void a(x xVar);
    }

    public interface b {
        void a(int i, Object obj);
    }

    public x(a aVar, b bVar, ae aeVar, int i, Handler handler) {
        this.f9564b = aVar;
        this.f9563a = bVar;
        this.f9565c = aeVar;
        this.f9568f = handler;
        this.f9569g = i;
    }

    private synchronized x l() {
        com.anythink.basead.exoplayer.k.a.b(this.f9571j);
        this.f9574m = true;
        a(false);
        return this;
    }

    public final ae a() {
        return this.f9565c;
    }

    public final b b() {
        return this.f9563a;
    }

    public final int c() {
        return this.f9566d;
    }

    public final Object d() {
        return this.f9567e;
    }

    public final Handler e() {
        return this.f9568f;
    }

    public final long f() {
        return this.f9570h;
    }

    public final int g() {
        return this.f9569g;
    }

    public final boolean h() {
        return this.i;
    }

    public final x i() {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        if (this.f9570h == com.anythink.basead.exoplayer.b.f7168b) {
            com.anythink.basead.exoplayer.k.a.a(this.i);
        }
        this.f9571j = true;
        this.f9564b.a(this);
        return this;
    }

    public final synchronized boolean j() {
        return this.f9574m;
    }

    public final synchronized boolean k() {
        boolean z6;
        try {
            com.anythink.basead.exoplayer.k.a.b(this.f9571j);
            com.anythink.basead.exoplayer.k.a.b(this.f9568f.getLooper().getThread() != Thread.currentThread());
            long j6 = 500;
            long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
            while (true) {
                z6 = this.f9573l;
                if (z6 || j6 <= 0) {
                    break;
                }
                wait(j6);
                j6 = elapsedRealtime - SystemClock.elapsedRealtime();
            }
            if (!z6) {
                throw new TimeoutException("Message delivery time out");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9572k;
    }

    private x b(boolean z6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        this.i = z6;
        return this;
    }

    public final x a(int i) {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        this.f9566d = i;
        return this;
    }

    public final x a(Object obj) {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        this.f9567e = obj;
        return this;
    }

    private x a(Handler handler) {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        this.f9568f = handler;
        return this;
    }

    private x a(long j6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        this.f9570h = j6;
        return this;
    }

    private x a(int i, long j6) {
        com.anythink.basead.exoplayer.k.a.b(!this.f9571j);
        com.anythink.basead.exoplayer.k.a.a(j6 != com.anythink.basead.exoplayer.b.f7168b);
        if (i >= 0 && (this.f9565c.a() || i < this.f9565c.b())) {
            this.f9569g = i;
            this.f9570h = j6;
            return this;
        }
        throw new o(this.f9565c, i, j6);
    }

    public final synchronized void a(boolean z6) {
        this.f9572k = z6 | this.f9572k;
        this.f9573l = true;
        notifyAll();
    }
}
