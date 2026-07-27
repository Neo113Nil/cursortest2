package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import com.anythink.basead.exoplayer.j.d;
import com.anythink.basead.exoplayer.k.C0544a;

/* loaded from: classes.dex */
public final class m implements aa<Object>, d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8308a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8309b = 2000;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8310c = 2000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8311d = 524288;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f8312e;

    /* renamed from: f, reason: collision with root package name */
    private final d.a f8313f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.y f8314g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8315h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f8316j;

    /* renamed from: k, reason: collision with root package name */
    private long f8317k;

    /* renamed from: l, reason: collision with root package name */
    private long f8318l;

    /* renamed from: m, reason: collision with root package name */
    private long f8319m;

    /* renamed from: n, reason: collision with root package name */
    private long f8320n;

    /* renamed from: com.anythink.basead.exoplayer.j.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8321a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f8322b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8323c;

        public AnonymousClass1(int i, long j9, long j10) {
            this.f8321a = i;
            this.f8322b = j9;
            this.f8323c = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.this.f8313f.c();
        }
    }

    public /* synthetic */ m(Handler handler, d.a aVar, long j9, int i, com.anythink.basead.exoplayer.k.c cVar, byte b9) {
        this(handler, aVar, j9, i, cVar);
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void b() {
        try {
            if (this.i == 0) {
                this.f8316j = this.f8315h.a();
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
                C0544a.b(this.i > 0);
                long a9 = this.f8315h.a();
                int i = (int) (a9 - this.f8316j);
                this.f8318l += i;
                long j9 = this.f8319m;
                long j10 = this.f8317k;
                this.f8319m = j9 + j10;
                if (i > 0) {
                    this.f8314g.a((int) Math.sqrt(j10), (8000 * j10) / r6);
                    if (this.f8318l < com.anythink.basead.exoplayer.i.a.f8040f) {
                        if (this.f8319m >= 524288) {
                        }
                    }
                    this.f8320n = (long) this.f8314g.a();
                }
                long j11 = this.f8317k;
                long j12 = this.f8320n;
                Handler handler = this.f8312e;
                if (handler == null || this.f8313f == null) {
                    mVar = this;
                } else {
                    mVar = this;
                    handler.post(mVar.new AnonymousClass1(i, j11, j12));
                }
                int i4 = mVar.i - 1;
                mVar.i = i4;
                if (i4 > 0) {
                    mVar.f8316j = a9;
                }
                mVar.f8317k = 0L;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public m() {
        this(null, null, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f8522a);
    }

    @Override // com.anythink.basead.exoplayer.j.d
    public final synchronized long a() {
        return this.f8320n;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f8325a;

        /* renamed from: b, reason: collision with root package name */
        private d.a f8326b;

        /* renamed from: c, reason: collision with root package name */
        private long f8327c = 1000000;

        /* renamed from: d, reason: collision with root package name */
        private int f8328d = 2000;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.c f8329e = com.anythink.basead.exoplayer.k.c.f8522a;

        private a a(Handler handler, d.a aVar) {
            C0544a.a((handler == null || aVar == null) ? false : true);
            this.f8325a = handler;
            this.f8326b = aVar;
            return this;
        }

        private a a(int i) {
            this.f8328d = i;
            return this;
        }

        private a a(long j9) {
            this.f8327c = j9;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.c cVar) {
            this.f8329e = cVar;
            return this;
        }

        private m a() {
            return new m(this.f8325a, this.f8326b, this.f8327c, this.f8328d, this.f8329e, (byte) 0);
        }
    }

    @Deprecated
    private m(Handler handler, d.a aVar) {
        this(handler, aVar, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f8522a);
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void a(int i) {
        this.f8317k += i;
    }

    @Deprecated
    private m(Handler handler, d.a aVar, int i) {
        this(handler, aVar, 1000000L, i, com.anythink.basead.exoplayer.k.c.f8522a);
    }

    private m(Handler handler, d.a aVar, long j9, int i, com.anythink.basead.exoplayer.k.c cVar) {
        this.f8312e = handler;
        this.f8313f = aVar;
        this.f8314g = new com.anythink.basead.exoplayer.k.y(i);
        this.f8315h = cVar;
        this.f8320n = j9;
    }

    private void a(int i, long j9, long j10) {
        Handler handler = this.f8312e;
        if (handler == null || this.f8313f == null) {
            return;
        }
        handler.post(new AnonymousClass1(i, j9, j10));
    }
}
