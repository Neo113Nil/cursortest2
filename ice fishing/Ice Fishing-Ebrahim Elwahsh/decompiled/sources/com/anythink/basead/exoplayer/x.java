package com.anythink.basead.exoplayer;

import android.os.Handler;
import android.os.SystemClock;
import com.anythink.basead.exoplayer.k.C0544a;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final b f8934a;

    /* renamed from: b, reason: collision with root package name */
    private final a f8935b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f8936c;

    /* renamed from: d, reason: collision with root package name */
    private int f8937d;

    /* renamed from: e, reason: collision with root package name */
    private Object f8938e;

    /* renamed from: f, reason: collision with root package name */
    private Handler f8939f;

    /* renamed from: g, reason: collision with root package name */
    private int f8940g;

    /* renamed from: h, reason: collision with root package name */
    private long f8941h = com.anythink.basead.exoplayer.b.f6539b;
    private boolean i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8942j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8943k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8944l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8945m;

    public interface a {
        void a(x xVar);
    }

    public interface b {
        void a(int i, Object obj);
    }

    public x(a aVar, b bVar, ae aeVar, int i, Handler handler) {
        this.f8935b = aVar;
        this.f8934a = bVar;
        this.f8936c = aeVar;
        this.f8939f = handler;
        this.f8940g = i;
    }

    private synchronized x l() {
        C0544a.b(this.f8942j);
        this.f8945m = true;
        a(false);
        return this;
    }

    public final ae a() {
        return this.f8936c;
    }

    public final b b() {
        return this.f8934a;
    }

    public final int c() {
        return this.f8937d;
    }

    public final Object d() {
        return this.f8938e;
    }

    public final Handler e() {
        return this.f8939f;
    }

    public final long f() {
        return this.f8941h;
    }

    public final int g() {
        return this.f8940g;
    }

    public final boolean h() {
        return this.i;
    }

    public final x i() {
        C0544a.b(!this.f8942j);
        if (this.f8941h == com.anythink.basead.exoplayer.b.f6539b) {
            C0544a.a(this.i);
        }
        this.f8942j = true;
        this.f8935b.a(this);
        return this;
    }

    public final synchronized boolean j() {
        return this.f8945m;
    }

    public final synchronized boolean k() {
        boolean z8;
        try {
            C0544a.b(this.f8942j);
            C0544a.b(this.f8939f.getLooper().getThread() != Thread.currentThread());
            long j9 = 500;
            long elapsedRealtime = SystemClock.elapsedRealtime() + 500;
            while (true) {
                z8 = this.f8944l;
                if (z8 || j9 <= 0) {
                    break;
                }
                wait(j9);
                j9 = elapsedRealtime - SystemClock.elapsedRealtime();
            }
            if (!z8) {
                throw new TimeoutException("Message delivery time out");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8943k;
    }

    private x b(boolean z8) {
        C0544a.b(!this.f8942j);
        this.i = z8;
        return this;
    }

    public final x a(int i) {
        C0544a.b(!this.f8942j);
        this.f8937d = i;
        return this;
    }

    public final x a(Object obj) {
        C0544a.b(!this.f8942j);
        this.f8938e = obj;
        return this;
    }

    private x a(Handler handler) {
        C0544a.b(!this.f8942j);
        this.f8939f = handler;
        return this;
    }

    private x a(long j9) {
        C0544a.b(!this.f8942j);
        this.f8941h = j9;
        return this;
    }

    private x a(int i, long j9) {
        C0544a.b(!this.f8942j);
        C0544a.a(j9 != com.anythink.basead.exoplayer.b.f6539b);
        if (i >= 0 && (this.f8936c.a() || i < this.f8936c.b())) {
            this.f8940g = i;
            this.f8941h = j9;
            return this;
        }
        throw new o(this.f8936c, i, j9);
    }

    public final synchronized void a(boolean z8) {
        this.f8943k = z8 | this.f8943k;
        this.f8944l = true;
        notifyAll();
    }
}
