package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import com.anythink.basead.exoplayer.j.d;

/* loaded from: classes.dex */
public final class m implements aa<Object>, d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8937a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8938b = 2000;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8939c = 2000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8940d = 524288;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f8941e;

    /* renamed from: f, reason: collision with root package name */
    private final d.a f8942f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.y f8943g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8944h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f8945j;

    /* renamed from: k, reason: collision with root package name */
    private long f8946k;

    /* renamed from: l, reason: collision with root package name */
    private long f8947l;

    /* renamed from: m, reason: collision with root package name */
    private long f8948m;

    /* renamed from: n, reason: collision with root package name */
    private long f8949n;

    /* renamed from: com.anythink.basead.exoplayer.j.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8950a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f8951b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8952c;

        public AnonymousClass1(int i, long j6, long j9) {
            this.f8950a = i;
            this.f8951b = j6;
            this.f8952c = j9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.this.f8942f.c();
        }
    }

    public /* synthetic */ m(Handler handler, d.a aVar, long j6, int i, com.anythink.basead.exoplayer.k.c cVar, byte b9) {
        this(handler, aVar, j6, i, cVar);
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void b() {
        try {
            if (this.i == 0) {
                this.f8945j = this.f8944h.a();
            }
            this.i++;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void c() {
        m mVar;
        try {
            try {
                com.anythink.basead.exoplayer.k.a.b(this.i > 0);
                long a9 = this.f8944h.a();
                int i = (int) (a9 - this.f8945j);
                this.f8947l += i;
                long j6 = this.f8948m;
                long j9 = this.f8946k;
                this.f8948m = j6 + j9;
                if (i > 0) {
                    this.f8943g.a((int) Math.sqrt(j9), (8000 * j9) / r6);
                    if (this.f8947l < com.anythink.basead.exoplayer.i.a.f8669f) {
                        if (this.f8948m >= 524288) {
                        }
                    }
                    this.f8949n = (long) this.f8943g.a();
                }
                long j10 = this.f8946k;
                long j11 = this.f8949n;
                Handler handler = this.f8941e;
                if (handler == null || this.f8942f == null) {
                    mVar = this;
                } else {
                    mVar = this;
                    handler.post(mVar.new AnonymousClass1(i, j10, j11));
                }
                int i4 = mVar.i - 1;
                mVar.i = i4;
                if (i4 > 0) {
                    mVar.f8945j = a9;
                }
                mVar.f8946k = 0L;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public m() {
        this(null, null, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f9151a);
    }

    @Override // com.anythink.basead.exoplayer.j.d
    public final synchronized long a() {
        return this.f8949n;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f8954a;

        /* renamed from: b, reason: collision with root package name */
        private d.a f8955b;

        /* renamed from: c, reason: collision with root package name */
        private long f8956c = 1000000;

        /* renamed from: d, reason: collision with root package name */
        private int f8957d = 2000;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.c f8958e = com.anythink.basead.exoplayer.k.c.f9151a;

        private a a(Handler handler, d.a aVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || aVar == null) ? false : true);
            this.f8954a = handler;
            this.f8955b = aVar;
            return this;
        }

        private a a(int i) {
            this.f8957d = i;
            return this;
        }

        private a a(long j6) {
            this.f8956c = j6;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.c cVar) {
            this.f8958e = cVar;
            return this;
        }

        private m a() {
            return new m(this.f8954a, this.f8955b, this.f8956c, this.f8957d, this.f8958e, (byte) 0);
        }
    }

    @Deprecated
    private m(Handler handler, d.a aVar) {
        this(handler, aVar, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f9151a);
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void a(int i) {
        this.f8946k += i;
    }

    @Deprecated
    private m(Handler handler, d.a aVar, int i) {
        this(handler, aVar, 1000000L, i, com.anythink.basead.exoplayer.k.c.f9151a);
    }

    private m(Handler handler, d.a aVar, long j6, int i, com.anythink.basead.exoplayer.k.c cVar) {
        this.f8941e = handler;
        this.f8942f = aVar;
        this.f8943g = new com.anythink.basead.exoplayer.k.y(i);
        this.f8944h = cVar;
        this.f8949n = j6;
    }

    private void a(int i, long j6, long j9) {
        Handler handler = this.f8941e;
        if (handler == null || this.f8942f == null) {
            return;
        }
        handler.post(new AnonymousClass1(i, j6, j9));
    }
}
