package com.anythink.basead.exoplayer.c;

import com.anythink.basead.exoplayer.c.e;
import com.anythink.basead.exoplayer.c.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f7533a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7534b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f7535c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f7536d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f7537e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f7538f;

    /* renamed from: g, reason: collision with root package name */
    private int f7539g;

    /* renamed from: h, reason: collision with root package name */
    private int f7540h;
    private I i;

    /* renamed from: j, reason: collision with root package name */
    private E f7541j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f7542k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7543l;

    /* renamed from: m, reason: collision with root package name */
    private int f7544m;

    private g(I[] iArr, O[] oArr) {
        this.f7537e = iArr;
        this.f7539g = iArr.length;
        for (int i = 0; i < this.f7539g; i++) {
            this.f7537e[i] = h();
        }
        this.f7538f = oArr;
        this.f7540h = oArr.length;
        for (int i4 = 0; i4 < this.f7540h; i4++) {
            this.f7538f[i4] = i();
        }
        Thread thread = new Thread() { // from class: com.anythink.basead.exoplayer.c.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        };
        this.f7533a = thread;
        thread.start();
    }

    private void l() {
        E e9 = this.f7541j;
        if (e9 != null) {
            throw e9;
        }
    }

    private void m() {
        if (p()) {
            this.f7534b.notify();
        }
    }

    private void n() {
        do {
            try {
            } catch (InterruptedException e9) {
                throw new IllegalStateException(e9);
            }
        } while (o());
    }

    private boolean o() {
        synchronized (this.f7534b) {
            while (!this.f7543l && !p()) {
                try {
                    this.f7534b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f7543l) {
                return false;
            }
            I removeFirst = this.f7535c.removeFirst();
            O[] oArr = this.f7538f;
            int i = this.f7540h - 1;
            this.f7540h = i;
            O o4 = oArr[i];
            this.f7542k = false;
            if (removeFirst.c()) {
                o4.b(4);
            } else {
                if (removeFirst.b()) {
                    o4.b(Integer.MIN_VALUE);
                }
                try {
                    this.f7541j = k();
                } catch (OutOfMemoryError unused) {
                    this.f7541j = j();
                } catch (RuntimeException unused2) {
                    this.f7541j = j();
                }
                if (this.f7541j != null) {
                    synchronized (this.f7534b) {
                    }
                    return false;
                }
            }
            synchronized (this.f7534b) {
                try {
                    if (this.f7542k) {
                        b((g<I, O, E>) o4);
                    } else if (o4.b()) {
                        this.f7544m++;
                        b((g<I, O, E>) o4);
                    } else {
                        o4.f7532b = this.f7544m;
                        this.f7544m = 0;
                        this.f7536d.addLast(o4);
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
        return !this.f7535c.isEmpty() && this.f7540h > 0;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void d() {
        synchronized (this.f7534b) {
            try {
                this.f7542k = true;
                this.f7544m = 0;
                I i = this.i;
                if (i != null) {
                    b((g<I, O, E>) i);
                    this.i = null;
                }
                while (!this.f7535c.isEmpty()) {
                    b((g<I, O, E>) this.f7535c.removeFirst());
                }
                while (!this.f7536d.isEmpty()) {
                    b((g<I, O, E>) this.f7536d.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void e() {
        synchronized (this.f7534b) {
            this.f7543l = true;
            this.f7534b.notify();
        }
        try {
            this.f7533a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final I b() {
        I i;
        synchronized (this.f7534b) {
            l();
            com.anythink.basead.exoplayer.k.a.b(this.i == null);
            int i4 = this.f7539g;
            if (i4 == 0) {
                i = null;
            } else {
                I[] iArr = this.f7537e;
                int i6 = i4 - 1;
                this.f7539g = i6;
                i = iArr[i6];
            }
            this.i = i;
        }
        return i;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final O c() {
        synchronized (this.f7534b) {
            try {
                l();
                if (this.f7536d.isEmpty()) {
                    return null;
                }
                return this.f7536d.removeFirst();
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
        com.anythink.basead.exoplayer.k.a.b(this.f7539g == this.f7537e.length);
        for (I i4 : this.f7537e) {
            i4.d(i);
        }
    }

    private void b(I i) {
        i.a();
        I[] iArr = this.f7537e;
        int i4 = this.f7539g;
        this.f7539g = i4 + 1;
        iArr[i4] = i;
    }

    private void b(O o4) {
        o4.a();
        O[] oArr = this.f7538f;
        int i = this.f7540h;
        this.f7540h = i + 1;
        oArr[i] = o4;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void a(I i) {
        synchronized (this.f7534b) {
            l();
            com.anythink.basead.exoplayer.k.a.a(i == this.i);
            this.f7535c.addLast(i);
            m();
            this.i = null;
        }
    }

    public final void a(O o4) {
        synchronized (this.f7534b) {
            b((g<I, O, E>) o4);
            m();
        }
    }

    public static /* synthetic */ void a(g gVar) {
        do {
            try {
            } catch (InterruptedException e9) {
                throw new IllegalStateException(e9);
            }
        } while (gVar.o());
    }
}
