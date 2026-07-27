package com.anythink.basead.exoplayer.c;

import com.anythink.basead.exoplayer.c.e;
import com.anythink.basead.exoplayer.c.f;
import java.lang.Exception;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f6747a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6748b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f6749c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f6750d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f6751e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f6752f;

    /* renamed from: g, reason: collision with root package name */
    private int f6753g;

    /* renamed from: h, reason: collision with root package name */
    private int f6754h;
    private I i;

    /* renamed from: j, reason: collision with root package name */
    private E f6755j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6756k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6757l;

    /* renamed from: m, reason: collision with root package name */
    private int f6758m;

    private g(I[] iArr, O[] oArr) {
        this.f6751e = iArr;
        this.f6753g = iArr.length;
        for (int i = 0; i < this.f6753g; i++) {
            this.f6751e[i] = h();
        }
        this.f6752f = oArr;
        this.f6754h = oArr.length;
        for (int i6 = 0; i6 < this.f6754h; i6++) {
            this.f6752f[i6] = i();
        }
        Thread thread = new Thread() { // from class: com.anythink.basead.exoplayer.c.g.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                g.a(g.this);
            }
        };
        this.f6747a = thread;
        thread.start();
    }

    private void l() {
        E e9 = this.f6755j;
        if (e9 != null) {
            throw e9;
        }
    }

    private void m() {
        if (p()) {
            this.f6748b.notify();
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
        synchronized (this.f6748b) {
            while (!this.f6757l && !p()) {
                try {
                    this.f6748b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f6757l) {
                return false;
            }
            I removeFirst = this.f6749c.removeFirst();
            O[] oArr = this.f6752f;
            int i = this.f6754h - 1;
            this.f6754h = i;
            O o6 = oArr[i];
            this.f6756k = false;
            if (removeFirst.c()) {
                o6.b(4);
            } else {
                if (removeFirst.b()) {
                    o6.b(Integer.MIN_VALUE);
                }
                try {
                    this.f6755j = k();
                } catch (OutOfMemoryError unused) {
                    this.f6755j = j();
                } catch (RuntimeException unused2) {
                    this.f6755j = j();
                }
                if (this.f6755j != null) {
                    synchronized (this.f6748b) {
                    }
                    return false;
                }
            }
            synchronized (this.f6748b) {
                try {
                    if (this.f6756k) {
                        b((g<I, O, E>) o6);
                    } else if (o6.b()) {
                        this.f6758m++;
                        b((g<I, O, E>) o6);
                    } else {
                        o6.f6746b = this.f6758m;
                        this.f6758m = 0;
                        this.f6750d.addLast(o6);
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
        return !this.f6749c.isEmpty() && this.f6754h > 0;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void d() {
        synchronized (this.f6748b) {
            try {
                this.f6756k = true;
                this.f6758m = 0;
                I i = this.i;
                if (i != null) {
                    b((g<I, O, E>) i);
                    this.i = null;
                }
                while (!this.f6749c.isEmpty()) {
                    b((g<I, O, E>) this.f6749c.removeFirst());
                }
                while (!this.f6750d.isEmpty()) {
                    b((g<I, O, E>) this.f6750d.removeFirst());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void e() {
        synchronized (this.f6748b) {
            this.f6757l = true;
            this.f6748b.notify();
        }
        try {
            this.f6747a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final I b() {
        I i;
        synchronized (this.f6748b) {
            l();
            com.anythink.basead.exoplayer.k.a.b(this.i == null);
            int i6 = this.f6753g;
            if (i6 == 0) {
                i = null;
            } else {
                I[] iArr = this.f6751e;
                int i9 = i6 - 1;
                this.f6753g = i9;
                i = iArr[i9];
            }
            this.i = i;
        }
        return i;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final O c() {
        synchronized (this.f6748b) {
            try {
                l();
                if (this.f6750d.isEmpty()) {
                    return null;
                }
                return this.f6750d.removeFirst();
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
        com.anythink.basead.exoplayer.k.a.b(this.f6753g == this.f6751e.length);
        for (I i6 : this.f6751e) {
            i6.d(i);
        }
    }

    private void b(I i) {
        i.a();
        I[] iArr = this.f6751e;
        int i6 = this.f6753g;
        this.f6753g = i6 + 1;
        iArr[i6] = i;
    }

    private void b(O o6) {
        o6.a();
        O[] oArr = this.f6752f;
        int i = this.f6754h;
        this.f6754h = i + 1;
        oArr[i] = o6;
    }

    @Override // com.anythink.basead.exoplayer.c.c
    public final void a(I i) {
        synchronized (this.f6748b) {
            l();
            com.anythink.basead.exoplayer.k.a.a(i == this.i);
            this.f6749c.addLast(i);
            m();
            this.i = null;
        }
    }

    public final void a(O o6) {
        synchronized (this.f6748b) {
            b((g<I, O, E>) o6);
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
