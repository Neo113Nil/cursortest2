package com.anythink.core.common.n.b.a.k;

import A3.p;
import D.x;
import com.anythink.core.common.n.b.a.k.c;
import com.anythink.core.common.n.b.a.k.d;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.aj;
import com.anythink.core.common.n.b.ak;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.f;
import com.anythink.core.common.n.c.n;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class a implements c.a, aj {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f16165b = true;

    /* renamed from: c, reason: collision with root package name */
    private static final List<ab> f16166c = Collections.singletonList(ab.HTTP_1_1);

    /* renamed from: d, reason: collision with root package name */
    private static final long f16167d = 16777216;

    /* renamed from: e, reason: collision with root package name */
    private static final long f16168e = 60000;

    /* renamed from: A, reason: collision with root package name */
    private boolean f16169A;

    /* renamed from: a, reason: collision with root package name */
    final ak f16170a;

    /* renamed from: f, reason: collision with root package name */
    private final ad f16171f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f16172g;

    /* renamed from: h, reason: collision with root package name */
    private final long f16173h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.core.common.n.b.e f16174j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f16175k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.k.c f16176l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.k.d f16177m;

    /* renamed from: n, reason: collision with root package name */
    private ScheduledExecutorService f16178n;

    /* renamed from: o, reason: collision with root package name */
    private e f16179o;

    /* renamed from: r, reason: collision with root package name */
    private long f16182r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f16183s;

    /* renamed from: t, reason: collision with root package name */
    private ScheduledFuture<?> f16184t;

    /* renamed from: v, reason: collision with root package name */
    private String f16186v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f16187w;

    /* renamed from: x, reason: collision with root package name */
    private int f16188x;

    /* renamed from: y, reason: collision with root package name */
    private int f16189y;

    /* renamed from: z, reason: collision with root package name */
    private int f16190z;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<f> f16180p = new ArrayDeque<>();

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque<Object> f16181q = new ArrayDeque<>();

    /* renamed from: u, reason: collision with root package name */
    private int f16185u = -1;

    /* renamed from: com.anythink.core.common.n.b.a.k.a$a, reason: collision with other inner class name */
    public final class RunnableC0088a implements Runnable {
        public RunnableC0088a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.c();
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        final f f16195b;

        /* renamed from: a, reason: collision with root package name */
        final int f16194a = 1001;

        /* renamed from: c, reason: collision with root package name */
        final long f16196c = a.f16168e;

        public b(f fVar) {
            this.f16195b = fVar;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f16197a;

        /* renamed from: b, reason: collision with root package name */
        final f f16198b;

        public c(int i, f fVar) {
            this.f16197a = i;
            this.f16198b = fVar;
        }
    }

    public final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.h();
        }
    }

    public static abstract class e implements Closeable {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16200c = true;

        /* renamed from: d, reason: collision with root package name */
        public final com.anythink.core.common.n.c.e f16201d;

        /* renamed from: e, reason: collision with root package name */
        public final com.anythink.core.common.n.c.d f16202e;

        public e(com.anythink.core.common.n.c.e eVar, com.anythink.core.common.n.c.d dVar) {
            this.f16201d = eVar;
            this.f16202e = dVar;
        }
    }

    public a(ad adVar, ak akVar, Random random, long j6) {
        if (!"GET".equals(adVar.b())) {
            throw new IllegalArgumentException("Request must be GET: " + adVar.b());
        }
        this.f16171f = adVar;
        this.f16170a = akVar;
        this.f16172g = random;
        this.f16173h = j6;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.i = f.a(bArr).b();
        this.f16175k = new p(16, this);
    }

    private boolean j() {
        try {
            this.f16176l.a();
            return this.f16185u == -1;
        } catch (Exception unused) {
            i();
            return false;
        }
    }

    private void k() {
        ScheduledFuture<?> scheduledFuture = this.f16184t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f16178n.shutdown();
        this.f16178n.awaitTermination(10L, TimeUnit.SECONDS);
    }

    private synchronized int l() {
        return this.f16188x;
    }

    private synchronized int m() {
        return this.f16189y;
    }

    private synchronized int n() {
        return this.f16190z;
    }

    private void o() {
        if (!f16165b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ScheduledExecutorService scheduledExecutorService = this.f16178n;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f16175k);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v5 */
    private boolean p() {
        e eVar;
        synchronized (this) {
            try {
                if (this.f16187w) {
                    return false;
                }
                com.anythink.core.common.n.b.a.k.d dVar = this.f16177m;
                f poll = this.f16180p.poll();
                c cVar = 0;
                if (poll == null) {
                    Object poll2 = this.f16181q.poll();
                    if (poll2 instanceof b) {
                        if (this.f16185u != -1) {
                            eVar = this.f16179o;
                            this.f16179o = null;
                            this.f16178n.shutdown();
                            cVar = poll2;
                        } else {
                            this.f16184t = this.f16178n.schedule(new RunnableC0088a(), ((b) poll2).f16196c, TimeUnit.MILLISECONDS);
                        }
                    } else if (poll2 == null) {
                        return false;
                    }
                    eVar = null;
                    cVar = poll2;
                } else {
                    eVar = null;
                }
                try {
                    if (poll != null) {
                        dVar.b(poll);
                    } else if (cVar instanceof c) {
                        f fVar = cVar.f16198b;
                        int i = cVar.f16197a;
                        long j6 = fVar.j();
                        if (dVar.f16242h) {
                            throw new IllegalStateException("Another message writer is active. Did you call close()?");
                        }
                        dVar.f16242h = true;
                        d.a aVar = dVar.f16241g;
                        aVar.f16244a = i;
                        aVar.f16245b = j6;
                        aVar.f16246c = true;
                        aVar.f16247d = false;
                        com.anythink.core.common.n.c.d a9 = n.a(aVar);
                        a9.d(fVar);
                        a9.close();
                        synchronized (this) {
                            this.f16182r -= fVar.j();
                        }
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new AssertionError();
                        }
                        b bVar = (b) cVar;
                        dVar.a(bVar.f16194a, bVar.f16195b);
                    }
                    com.anythink.core.common.n.b.a.c.a(eVar);
                    return true;
                } catch (Throwable th) {
                    com.anythink.core.common.n.b.a.c.a(eVar);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        do {
            try {
            } catch (IOException unused) {
                i();
                return;
            }
        } while (p());
    }

    @Override // com.anythink.core.common.n.b.aj
    public final synchronized long b() {
        return this.f16182r;
    }

    @Override // com.anythink.core.common.n.b.aj
    public final void c() {
        this.f16174j.c();
    }

    public final void d() {
        while (this.f16185u == -1) {
            this.f16176l.a();
        }
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void e() {
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void f() {
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final synchronized void g() {
        this.f16190z++;
        this.f16169A = false;
    }

    public final void h() {
        synchronized (this) {
            try {
                if (this.f16187w) {
                    return;
                }
                com.anythink.core.common.n.b.a.k.d dVar = this.f16177m;
                int i = this.f16169A ? this.f16188x : -1;
                this.f16188x++;
                this.f16169A = true;
                if (i == -1) {
                    try {
                        dVar.a(f.f16645b);
                    } catch (IOException unused) {
                        i();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.f16173h);
                    sb.append("ms (after ");
                    new SocketTimeoutException(AbstractC5128c.e(i - 1, " successful ping/pongs)", sb));
                    i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f16187w) {
                    return;
                }
                this.f16187w = true;
                e eVar = this.f16179o;
                this.f16179o = null;
                ScheduledFuture<?> scheduledFuture = this.f16184t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f16178n;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                }
                com.anythink.core.common.n.b.a.c.a(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized boolean c(f fVar) {
        try {
            if (!this.f16187w && (!this.f16183s || !this.f16181q.isEmpty())) {
                this.f16180p.add(fVar);
                o();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.anythink.core.common.n.b.aj
    public final ad a() {
        return this.f16171f;
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final synchronized void b(f fVar) {
        try {
            if (!this.f16187w && (!this.f16183s || !this.f16181q.isEmpty())) {
                this.f16180p.add(fVar);
                o();
                this.f16189y++;
            }
        } finally {
        }
    }

    public final void a(z zVar) {
        z a9 = zVar.t().a(r.f16496a).a(f16166c).a();
        final ad b9 = this.f16171f.e().a("Upgrade", "websocket").a("Connection", "Upgrade").a("Sec-WebSocket-Key", this.i).a("Sec-WebSocket-Version", "13").b();
        com.anythink.core.common.n.b.e a10 = com.anythink.core.common.n.b.a.a.f15656a.a(a9, b9);
        this.f16174j = a10;
        a10.a(new com.anythink.core.common.n.b.f() { // from class: com.anythink.core.common.n.b.a.k.a.1
            @Override // com.anythink.core.common.n.b.f
            public final void a(af afVar) {
                com.anythink.core.common.n.b.a.b.c a11 = com.anythink.core.common.n.b.a.a.f15656a.a(afVar);
                try {
                    a.this.a(afVar, a11);
                    try {
                        a.this.a(aa.f16249a + " webSocket " + b9.a().l(), a11.f());
                        a.this.d();
                    } catch (Exception unused) {
                        a.this.i();
                    }
                } catch (IOException unused2) {
                    if (a11 != null) {
                        a11.g();
                    }
                    a.this.i();
                    com.anythink.core.common.n.b.a.c.a(afVar);
                }
            }

            @Override // com.anythink.core.common.n.b.f
            public final void a(IOException iOException) {
                a.this.i();
            }
        });
    }

    private synchronized boolean c(String str) {
        f fVar;
        try {
            com.anythink.core.common.n.b.a.k.b.b(1001);
            if (str != null) {
                fVar = f.a(str);
                if (fVar.j() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str));
                }
            } else {
                fVar = null;
            }
            if (!this.f16187w && !this.f16183s) {
                this.f16183s = true;
                this.f16181q.add(new b(fVar));
                o();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.anythink.core.common.n.b.aj
    public final boolean b(String str) {
        return c(str);
    }

    public final void a(af afVar, com.anythink.core.common.n.b.a.b.c cVar) {
        if (afVar.c() == 101) {
            String a9 = afVar.a("Connection");
            if ("Upgrade".equalsIgnoreCase(a9)) {
                String a10 = afVar.a("Upgrade");
                if ("websocket".equalsIgnoreCase(a10)) {
                    String a11 = afVar.a("Sec-WebSocket-Accept");
                    String b9 = f.a(this.i + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d().b();
                    if (!b9.equals(a11)) {
                        throw new ProtocolException(x.m("Expected 'Sec-WebSocket-Accept' header value '", b9, "' but was '", a11, "'"));
                    }
                    if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    return;
                }
                throw new ProtocolException(x.l("Expected 'Upgrade' header value 'websocket' but was '", a10, "'"));
            }
            throw new ProtocolException(x.l("Expected 'Connection' header value 'Upgrade' but was '", a9, "'"));
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + afVar.c() + " " + afVar.d() + "'");
    }

    public final void a(String str, e eVar) {
        synchronized (this) {
            try {
                this.f16179o = eVar;
                this.f16177m = new com.anythink.core.common.n.b.a.k.d(eVar.f16200c, eVar.f16202e, this.f16172g);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.anythink.core.common.n.b.a.c.a(str, false));
                this.f16178n = scheduledThreadPoolExecutor;
                if (this.f16173h != 0) {
                    d dVar = new d();
                    long j6 = this.f16173h;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j6, j6, TimeUnit.MILLISECONDS);
                }
                if (!this.f16181q.isEmpty()) {
                    o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f16176l = new com.anythink.core.common.n.b.a.k.c(eVar.f16200c, eVar.f16201d, this);
    }

    private void a(int i, TimeUnit timeUnit) {
        this.f16178n.awaitTermination(i, timeUnit);
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void a(int i, String str) {
        e eVar;
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.f16185u == -1) {
                        this.f16185u = i;
                        this.f16186v = str;
                        eVar = null;
                        if (this.f16183s && this.f16181q.isEmpty()) {
                            e eVar2 = this.f16179o;
                            this.f16179o = null;
                            ScheduledFuture<?> scheduledFuture = this.f16184t;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.f16178n.shutdown();
                            eVar = eVar2;
                        }
                    } else {
                        throw new IllegalStateException("already closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.anythink.core.common.n.b.a.c.a(eVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.anythink.core.common.n.b.aj
    public final boolean a(String str) {
        if (str != null) {
            return a(f.a(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    @Override // com.anythink.core.common.n.b.aj
    public final boolean a(f fVar) {
        if (fVar != null) {
            return a(fVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    private synchronized boolean a(f fVar, int i) {
        if (!this.f16187w && !this.f16183s) {
            if (this.f16182r + fVar.j() > f16167d) {
                c((String) null);
                return false;
            }
            this.f16182r += fVar.j();
            this.f16181q.add(new c(i, fVar));
            o();
            return true;
        }
        return false;
    }
}
