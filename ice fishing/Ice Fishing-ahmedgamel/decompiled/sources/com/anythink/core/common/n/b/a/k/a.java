package com.anythink.core.common.n.b.a.k;

import D.RunnableC0282a;
import D.y;
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
import u1.h;

/* loaded from: classes.dex */
public final class a implements c.a, aj {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f15378b = true;

    /* renamed from: c, reason: collision with root package name */
    private static final List<ab> f15379c = Collections.singletonList(ab.HTTP_1_1);

    /* renamed from: d, reason: collision with root package name */
    private static final long f15380d = 16777216;

    /* renamed from: e, reason: collision with root package name */
    private static final long f15381e = 60000;

    /* renamed from: A, reason: collision with root package name */
    private boolean f15382A;

    /* renamed from: a, reason: collision with root package name */
    final ak f15383a;

    /* renamed from: f, reason: collision with root package name */
    private final ad f15384f;

    /* renamed from: g, reason: collision with root package name */
    private final Random f15385g;

    /* renamed from: h, reason: collision with root package name */
    private final long f15386h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private com.anythink.core.common.n.b.e f15387j;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f15388k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.k.c f15389l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.k.d f15390m;

    /* renamed from: n, reason: collision with root package name */
    private ScheduledExecutorService f15391n;

    /* renamed from: o, reason: collision with root package name */
    private e f15392o;

    /* renamed from: r, reason: collision with root package name */
    private long f15395r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15396s;

    /* renamed from: t, reason: collision with root package name */
    private ScheduledFuture<?> f15397t;

    /* renamed from: v, reason: collision with root package name */
    private String f15399v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15400w;

    /* renamed from: x, reason: collision with root package name */
    private int f15401x;

    /* renamed from: y, reason: collision with root package name */
    private int f15402y;

    /* renamed from: z, reason: collision with root package name */
    private int f15403z;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayDeque<f> f15393p = new ArrayDeque<>();

    /* renamed from: q, reason: collision with root package name */
    private final ArrayDeque<Object> f15394q = new ArrayDeque<>();

    /* renamed from: u, reason: collision with root package name */
    private int f15398u = -1;

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
        final f f15408b;

        /* renamed from: a, reason: collision with root package name */
        final int f15407a = 1001;

        /* renamed from: c, reason: collision with root package name */
        final long f15409c = a.f15381e;

        public b(f fVar) {
            this.f15408b = fVar;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final int f15410a;

        /* renamed from: b, reason: collision with root package name */
        final f f15411b;

        public c(int i, f fVar) {
            this.f15410a = i;
            this.f15411b = fVar;
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
        public final boolean f15413c = true;

        /* renamed from: d, reason: collision with root package name */
        public final com.anythink.core.common.n.c.e f15414d;

        /* renamed from: e, reason: collision with root package name */
        public final com.anythink.core.common.n.c.d f15415e;

        public e(com.anythink.core.common.n.c.e eVar, com.anythink.core.common.n.c.d dVar) {
            this.f15414d = eVar;
            this.f15415e = dVar;
        }
    }

    public a(ad adVar, ak akVar, Random random, long j6) {
        if (!"GET".equals(adVar.b())) {
            throw new IllegalArgumentException("Request must be GET: " + adVar.b());
        }
        this.f15384f = adVar;
        this.f15383a = akVar;
        this.f15385g = random;
        this.f15386h = j6;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.i = f.a(bArr).b();
        this.f15388k = new RunnableC0282a(15, this);
    }

    private boolean j() {
        try {
            this.f15389l.a();
            return this.f15398u == -1;
        } catch (Exception unused) {
            i();
            return false;
        }
    }

    private void k() {
        ScheduledFuture<?> scheduledFuture = this.f15397t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f15391n.shutdown();
        this.f15391n.awaitTermination(10L, TimeUnit.SECONDS);
    }

    private synchronized int l() {
        return this.f15401x;
    }

    private synchronized int m() {
        return this.f15402y;
    }

    private synchronized int n() {
        return this.f15403z;
    }

    private void o() {
        if (!f15378b && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ScheduledExecutorService scheduledExecutorService = this.f15391n;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f15388k);
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
                if (this.f15400w) {
                    return false;
                }
                com.anythink.core.common.n.b.a.k.d dVar = this.f15390m;
                f poll = this.f15393p.poll();
                c cVar = 0;
                if (poll == null) {
                    Object poll2 = this.f15394q.poll();
                    if (poll2 instanceof b) {
                        if (this.f15398u != -1) {
                            eVar = this.f15392o;
                            this.f15392o = null;
                            this.f15391n.shutdown();
                            cVar = poll2;
                        } else {
                            this.f15397t = this.f15391n.schedule(new RunnableC0088a(), ((b) poll2).f15409c, TimeUnit.MILLISECONDS);
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
                        f fVar = cVar.f15411b;
                        int i = cVar.f15410a;
                        long j6 = fVar.j();
                        if (dVar.f15455h) {
                            throw new IllegalStateException("Another message writer is active. Did you call close()?");
                        }
                        dVar.f15455h = true;
                        d.a aVar = dVar.f15454g;
                        aVar.f15457a = i;
                        aVar.f15458b = j6;
                        aVar.f15459c = true;
                        aVar.f15460d = false;
                        com.anythink.core.common.n.c.d a9 = n.a(aVar);
                        a9.d(fVar);
                        a9.close();
                        synchronized (this) {
                            this.f15395r -= fVar.j();
                        }
                    } else {
                        if (!(cVar instanceof b)) {
                            throw new AssertionError();
                        }
                        b bVar = (b) cVar;
                        dVar.a(bVar.f15407a, bVar.f15408b);
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
        return this.f15395r;
    }

    @Override // com.anythink.core.common.n.b.aj
    public final void c() {
        this.f15387j.c();
    }

    public final void d() {
        while (this.f15398u == -1) {
            this.f15389l.a();
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
        this.f15403z++;
        this.f15382A = false;
    }

    public final void h() {
        synchronized (this) {
            try {
                if (this.f15400w) {
                    return;
                }
                com.anythink.core.common.n.b.a.k.d dVar = this.f15390m;
                int i = this.f15382A ? this.f15401x : -1;
                this.f15401x++;
                this.f15382A = true;
                if (i == -1) {
                    try {
                        dVar.a(f.f15858b);
                    } catch (IOException unused) {
                        i();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(this.f15386h);
                    sb.append("ms (after ");
                    new SocketTimeoutException(h.e(i - 1, " successful ping/pongs)", sb));
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
                if (this.f15400w) {
                    return;
                }
                this.f15400w = true;
                e eVar = this.f15392o;
                this.f15392o = null;
                ScheduledFuture<?> scheduledFuture = this.f15397t;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledExecutorService scheduledExecutorService = this.f15391n;
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
            if (!this.f15400w && (!this.f15396s || !this.f15394q.isEmpty())) {
                this.f15393p.add(fVar);
                o();
                return true;
            }
            return false;
        } finally {
        }
    }

    @Override // com.anythink.core.common.n.b.aj
    public final ad a() {
        return this.f15384f;
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final synchronized void b(f fVar) {
        try {
            if (!this.f15400w && (!this.f15396s || !this.f15394q.isEmpty())) {
                this.f15393p.add(fVar);
                o();
                this.f15402y++;
            }
        } finally {
        }
    }

    public final void a(z zVar) {
        z a9 = zVar.t().a(r.f15709a).a(f15379c).a();
        final ad b9 = this.f15384f.e().a("Upgrade", "websocket").a("Connection", "Upgrade").a("Sec-WebSocket-Key", this.i).a("Sec-WebSocket-Version", "13").b();
        com.anythink.core.common.n.b.e a10 = com.anythink.core.common.n.b.a.a.f14869a.a(a9, b9);
        this.f15387j = a10;
        a10.a(new com.anythink.core.common.n.b.f() { // from class: com.anythink.core.common.n.b.a.k.a.1
            @Override // com.anythink.core.common.n.b.f
            public final void a(af afVar) {
                com.anythink.core.common.n.b.a.b.c a11 = com.anythink.core.common.n.b.a.a.f14869a.a(afVar);
                try {
                    a.this.a(afVar, a11);
                    try {
                        a.this.a(aa.f15462a + " webSocket " + b9.a().l(), a11.f());
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
            if (!this.f15400w && !this.f15396s) {
                this.f15396s = true;
                this.f15394q.add(new b(fVar));
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
                        throw new ProtocolException(y.p("Expected 'Sec-WebSocket-Accept' header value '", b9, "' but was '", a11, "'"));
                    }
                    if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                    return;
                }
                throw new ProtocolException(y.o("Expected 'Upgrade' header value 'websocket' but was '", a10, "'"));
            }
            throw new ProtocolException(y.o("Expected 'Connection' header value 'Upgrade' but was '", a9, "'"));
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + afVar.c() + " " + afVar.d() + "'");
    }

    public final void a(String str, e eVar) {
        synchronized (this) {
            try {
                this.f15392o = eVar;
                this.f15390m = new com.anythink.core.common.n.b.a.k.d(eVar.f15413c, eVar.f15415e, this.f15385g);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.anythink.core.common.n.b.a.c.a(str, false));
                this.f15391n = scheduledThreadPoolExecutor;
                if (this.f15386h != 0) {
                    d dVar = new d();
                    long j6 = this.f15386h;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j6, j6, TimeUnit.MILLISECONDS);
                }
                if (!this.f15394q.isEmpty()) {
                    o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15389l = new com.anythink.core.common.n.b.a.k.c(eVar.f15413c, eVar.f15414d, this);
    }

    private void a(int i, TimeUnit timeUnit) {
        this.f15391n.awaitTermination(i, timeUnit);
    }

    @Override // com.anythink.core.common.n.b.a.k.c.a
    public final void a(int i, String str) {
        e eVar;
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.f15398u == -1) {
                        this.f15398u = i;
                        this.f15399v = str;
                        eVar = null;
                        if (this.f15396s && this.f15394q.isEmpty()) {
                            e eVar2 = this.f15392o;
                            this.f15392o = null;
                            ScheduledFuture<?> scheduledFuture = this.f15397t;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.f15391n.shutdown();
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
        if (!this.f15400w && !this.f15396s) {
            if (this.f15395r + fVar.j() > f15380d) {
                c((String) null);
                return false;
            }
            this.f15395r += fVar.j();
            this.f15394q.add(new c(i, fVar));
            o();
            return true;
        }
        return false;
    }
}
