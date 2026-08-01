package com.anythink.basead.exoplayer.j;

import android.os.Handler;
import com.anythink.basead.exoplayer.j.d;

/* loaded from: classes.dex */
public final class m implements aa<Object>, d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8151a = 1000000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8152b = 2000;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8153c = 2000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8154d = 524288;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f8155e;

    /* renamed from: f, reason: collision with root package name */
    private final d.a f8156f;

    /* renamed from: g, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.y f8157g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.k.c f8158h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private long f8159j;

    /* renamed from: k, reason: collision with root package name */
    private long f8160k;

    /* renamed from: l, reason: collision with root package name */
    private long f8161l;

    /* renamed from: m, reason: collision with root package name */
    private long f8162m;

    /* renamed from: n, reason: collision with root package name */
    private long f8163n;

    /* renamed from: com.anythink.basead.exoplayer.j.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f8165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8166c;

        public AnonymousClass1(int i, long j6, long j9) {
            this.f8164a = i;
            this.f8165b = j6;
            this.f8166c = j9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.this.f8156f.c();
        }
    }

    public /* synthetic */ m(Handler handler, d.a aVar, long j6, int i, com.anythink.basead.exoplayer.k.c cVar, byte b9) {
        this(handler, aVar, j6, i, cVar);
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void b() {
        try {
            if (this.i == 0) {
                this.f8159j = this.f8158h.a();
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
                long a9 = this.f8158h.a();
                int i = (int) (a9 - this.f8159j);
                this.f8161l += i;
                long j6 = this.f8162m;
                long j9 = this.f8160k;
                this.f8162m = j6 + j9;
                if (i > 0) {
                    this.f8157g.a((int) Math.sqrt(j9), (8000 * j9) / r6);
                    if (this.f8161l < com.anythink.basead.exoplayer.i.a.f7883f) {
                        if (this.f8162m >= 524288) {
                        }
                    }
                    this.f8163n = (long) this.f8157g.a();
                }
                long j10 = this.f8160k;
                long j11 = this.f8163n;
                Handler handler = this.f8155e;
                if (handler == null || this.f8156f == null) {
                    mVar = this;
                } else {
                    mVar = this;
                    handler.post(mVar.new AnonymousClass1(i, j10, j11));
                }
                int i6 = mVar.i - 1;
                mVar.i = i6;
                if (i6 > 0) {
                    mVar.f8159j = a9;
                }
                mVar.f8160k = 0L;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public m() {
        this(null, null, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f8365a);
    }

    @Override // com.anythink.basead.exoplayer.j.d
    public final synchronized long a() {
        return this.f8163n;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f8168a;

        /* renamed from: b, reason: collision with root package name */
        private d.a f8169b;

        /* renamed from: c, reason: collision with root package name */
        private long f8170c = 1000000;

        /* renamed from: d, reason: collision with root package name */
        private int f8171d = 2000;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.basead.exoplayer.k.c f8172e = com.anythink.basead.exoplayer.k.c.f8365a;

        private a a(Handler handler, d.a aVar) {
            com.anythink.basead.exoplayer.k.a.a((handler == null || aVar == null) ? false : true);
            this.f8168a = handler;
            this.f8169b = aVar;
            return this;
        }

        private a a(int i) {
            this.f8171d = i;
            return this;
        }

        private a a(long j6) {
            this.f8170c = j6;
            return this;
        }

        private a a(com.anythink.basead.exoplayer.k.c cVar) {
            this.f8172e = cVar;
            return this;
        }

        private m a() {
            return new m(this.f8168a, this.f8169b, this.f8170c, this.f8171d, this.f8172e, (byte) 0);
        }
    }

    @Deprecated
    private m(Handler handler, d.a aVar) {
        this(handler, aVar, 1000000L, 2000, com.anythink.basead.exoplayer.k.c.f8365a);
    }

    @Override // com.anythink.basead.exoplayer.j.aa
    public final synchronized void a(int i) {
        this.f8160k += i;
    }

    @Deprecated
    private m(Handler handler, d.a aVar, int i) {
        this(handler, aVar, 1000000L, i, com.anythink.basead.exoplayer.k.c.f8365a);
    }

    private m(Handler handler, d.a aVar, long j6, int i, com.anythink.basead.exoplayer.k.c cVar) {
        this.f8155e = handler;
        this.f8156f = aVar;
        this.f8157g = new com.anythink.basead.exoplayer.k.y(i);
        this.f8158h = cVar;
        this.f8163n = j6;
    }

    private void a(int i, long j6, long j9) {
        Handler handler = this.f8155e;
        if (handler == null || this.f8156f == null) {
            return;
        }
        handler.post(new AnonymousClass1(i, j6, j9));
    }
}
