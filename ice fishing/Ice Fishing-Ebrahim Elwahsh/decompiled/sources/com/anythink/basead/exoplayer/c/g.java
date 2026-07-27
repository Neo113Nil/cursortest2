package com.anythink.basead.exoplayer.c;

import com.anythink.basead.exoplayer.c.e;
import com.anythink.basead.exoplayer.c.f;
import com.anythink.basead.exoplayer.k.C0544a;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f6904a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6905b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f6906c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f6907d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f6908e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f6909f;

    /* renamed from: g, reason: collision with root package name */
    private int f6910g;

    /* renamed from: h, reason: collision with root package name */
    private int f6911h;
    private I i;

    /* renamed from: j, reason: collision with root package name */
    private E f6912j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6913k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6914l;

    /* renamed from: m, reason: collision with root package name */
    private int f6915m;

    private g(I[] iArr, O[] oArr) {
        this.f6908e = iArr;
        this.f6910g = iArr.length;
        for (int i = 0; i < this.f6910g; i++) {
            this.f6908e[i] = h();
        }
        this.f6909f = oArr;
        this.f6911h = oArr.length;
        for (int i4 = 0; i4 < this.f6911h; i4++) {
            this.f6909f[i4] = i();
        }
        Thread thread = new Thread() { // from class: com.anythink.basead.exoplayer.c.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        };
        this.f6904a = thread;
        thread.start();
    }

    private void l() {
        E e6 = this.f6912j;
        if (e6 != null) {
            throw e6;
        }
    }

    private void m() {
        if (p()) {
            this.f6905b.notify();
        }
    }

    private void n() {
        do {
            try {
            } catch (InterruptedException e6) {
                throw new IllegalStateException(e6);
            }
        } while (o());
    }

    private boolean o() {
        synchronized (this.f6905b) {
            while (!this.f6914l && !p()) {
                try {
                    this.f6905b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f6914l) {
                return false;
            }
            I removeFirst = this.f6906c.removeFirst();
            O[] oArr = this.f6909f;
            int i = this.f6911h - 1;
            this.f6911h = i;
            O o9 = oArr[i];
            this.f6913k = false;
            if (removeFirst.c()) {
                o9.b(4);
            } else {
                if (removeFirst.b()) {
                    o9.b(Integer.MIN_VALUE);
                }
                try {
                    this.f6912j = k();
                } catch (OutOfMemoryError unused) {
                    this.f6912j = j();
                } catch (RuntimeException unused2) {
                    this.f6912j = j();
                }
                if (this.f6912j != null) {
                    synchronized (this.f6905b) {
                    }
                    return false;
                }
            }
            synchronized (this.f6905b) {
                try {
                    if (this.f6913k) {
                        b((g<I, O, E>) o9);
                    } else if (o9.b()) {
                        this.f6915m++;
                        b((g<I, O, E>) o9);
                    } else {
                        o9.f6903b = this.f6915m;
                        this.f6915m = 0;
                        this.f6907d.addLast(o9);
                    }
                    b((g<I, O, E>) removeFirst);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    private boolean p() {
        return !this.f6906c.isEmpty() && this.f6911h > 0;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void d() {
        synchronized (this.f6905b) {
            try {
                this.f6913k = true;
                this.f6915m = 0;
                I i = this.i;
                if (i != null) {
                    b((g<I, O, E>) i);
                    this.i = null;
                }
                while (!this.f6906c.isEmpty()) {
                    b((g<I, O, E>) this.f6906c.removeFirst());
                }
                while (!this.f6907d.isEmpty()) {
                    b((g<I, O, E>) this.f6907d.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void e() {
        synchronized (this.f6905b) {
            this.f6914l = true;
            this.f6905b.notify();
        }
        try {
            this.f6904a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final I b() {
        I i;
        synchronized (this.f6905b) {
            l();
            C0544a.b(this.i == null);
            int i4 = this.f6910g;
            if (i4 == 0) {
                i = null;
            } else {
                I[] iArr = this.f6908e;
                int i9 = i4 - 1;
                this.f6910g = i9;
                i = iArr[i9];
            }
            this.i = i;
        }
        return i;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final O c() {
        synchronized (this.f6905b) {
            try {
                l();
                if (this.f6907d.isEmpty()) {
                    return null;
                }
                return this.f6907d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract I h();

    public abstract O i();

    public abstract E j();

    public abstract E k();

    private void a(int i) {
        C0544a.b(this.f6910g == this.f6908e.length);
        for (I i4 : this.f6908e) {
            i4.d(i);
        }
    }

    private void b(I i) {
        i.a();
        I[] iArr = this.f6908e;
        int i4 = this.f6910g;
        this.f6910g = i4 + 1;
        iArr[i4] = i;
    }

    private void b(O o9) {
        o9.a();
        O[] oArr = this.f6909f;
        int i = this.f6911h;
        this.f6911h = i + 1;
        oArr[i] = o9;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void a(I i) {
        synchronized (this.f6905b) {
            l();
            C0544a.a(i == this.i);
            this.f6906c.addLast(i);
            m();
            this.i = null;
        }
    }

    public final void a(O o9) {
        synchronized (this.f6905b) {
            b((g<I, O, E>) o9);
            m();
        }
    }

    public static /* synthetic */ void a(g gVar) {
        do {
            try {
            } catch (InterruptedException e6) {
                throw new IllegalStateException(e6);
            }
        } while (gVar.o());
    }
}
