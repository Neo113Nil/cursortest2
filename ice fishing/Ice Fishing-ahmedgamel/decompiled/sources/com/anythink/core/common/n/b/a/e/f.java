package com.anythink.core.common.n.b.a.e;

import com.anythink.core.common.n.b.a.e.h;
import com.anythink.core.common.n.b.aa;
import com.google.android.gms.internal.ads.Wv;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    static final int f15970a = 16777216;

    /* renamed from: b, reason: collision with root package name */
    static final int f15971b = 1;

    /* renamed from: c, reason: collision with root package name */
    static final int f15972c = 2;

    /* renamed from: d, reason: collision with root package name */
    static final int f15973d = 3;

    /* renamed from: e, reason: collision with root package name */
    static final long f15974e = 1000000000;

    /* renamed from: u, reason: collision with root package name */
    static final /* synthetic */ boolean f15975u = true;

    /* renamed from: v, reason: collision with root package name */
    private static final ExecutorService f15976v = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.anythink.core.common.n.b.a.c.a(aa.f16249a + " Http2Connection", true));

    /* renamed from: f, reason: collision with root package name */
    final boolean f15983f;

    /* renamed from: g, reason: collision with root package name */
    final c f15984g;
    final String i;

    /* renamed from: j, reason: collision with root package name */
    int f15986j;

    /* renamed from: k, reason: collision with root package name */
    int f15987k;

    /* renamed from: l, reason: collision with root package name */
    final l f15988l;

    /* renamed from: n, reason: collision with root package name */
    long f15990n;

    /* renamed from: p, reason: collision with root package name */
    final m f15992p;

    /* renamed from: q, reason: collision with root package name */
    final Socket f15993q;

    /* renamed from: r, reason: collision with root package name */
    final j f15994r;

    /* renamed from: s, reason: collision with root package name */
    final e f15995s;

    /* renamed from: t, reason: collision with root package name */
    final Set<Integer> f15996t;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15997w;

    /* renamed from: x, reason: collision with root package name */
    private final ScheduledExecutorService f15998x;

    /* renamed from: y, reason: collision with root package name */
    private final ExecutorService f15999y;

    /* renamed from: h, reason: collision with root package name */
    final Map<Integer, i> f15985h = new LinkedHashMap();

    /* renamed from: z, reason: collision with root package name */
    private long f16000z = 0;

    /* renamed from: A, reason: collision with root package name */
    private long f15977A = 0;

    /* renamed from: B, reason: collision with root package name */
    private long f15978B = 0;

    /* renamed from: C, reason: collision with root package name */
    private long f15979C = 0;

    /* renamed from: D, reason: collision with root package name */
    private long f15980D = 0;

    /* renamed from: E, reason: collision with root package name */
    private long f15981E = 0;

    /* renamed from: F, reason: collision with root package name */
    private long f15982F = 0;

    /* renamed from: m, reason: collision with root package name */
    long f15989m = 0;

    /* renamed from: o, reason: collision with root package name */
    m f15991o = new m();

    public final class b extends com.anythink.core.common.n.b.a.b {
        public b() {
            super(Wv.i(new StringBuilder(), aa.f16249a, " %s ping"), f.this.i);
        }

        @Override // com.anythink.core.common.n.b.a.b
        public final void c() {
            boolean z6;
            synchronized (f.this) {
                if (f.this.f15977A < f.this.f16000z) {
                    z6 = true;
                } else {
                    f.c(f.this);
                    z6 = false;
                }
            }
            if (z6) {
                f.this.a((IOException) null);
            } else {
                f.this.a(false, 1, 0);
            }
        }
    }

    public static abstract class c {

        /* renamed from: h, reason: collision with root package name */
        public static final c f16032h = new c() { // from class: com.anythink.core.common.n.b.a.e.f.c.1
            @Override // com.anythink.core.common.n.b.a.e.f.c
            public final void a(i iVar) {
                iVar.a(com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM, (IOException) null);
            }
        };

        public void a(f fVar) {
        }

        public abstract void a(i iVar);
    }

    public final class d extends com.anythink.core.common.n.b.a.b {

        /* renamed from: a, reason: collision with root package name */
        final boolean f16033a;

        /* renamed from: b, reason: collision with root package name */
        final int f16034b;

        /* renamed from: d, reason: collision with root package name */
        final int f16035d;

        public d(int i, int i4) {
            super(Wv.i(new StringBuilder(), aa.f16249a, " %s ping %08x%08x"), f.this.i, Integer.valueOf(i), Integer.valueOf(i4));
            this.f16033a = true;
            this.f16034b = i;
            this.f16035d = i4;
        }

        @Override // com.anythink.core.common.n.b.a.b
        public final void c() {
            f.this.a(this.f16033a, this.f16034b, this.f16035d);
        }
    }

    public class e extends com.anythink.core.common.n.b.a.b implements h.b {

        /* renamed from: a, reason: collision with root package name */
        final h f16037a;

        /* renamed from: com.anythink.core.common.n.b.a.e.f$e$3, reason: invalid class name */
        public class AnonymousClass3 extends com.anythink.core.common.n.b.a.b {
            public AnonymousClass3(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.anythink.core.common.n.b.a.b
            public final void c() {
                f fVar = f.this;
                fVar.f15984g.a(fVar);
            }
        }

        public e(h hVar) {
            super(Wv.i(new StringBuilder(), aa.f16249a, " %s"), f.this.i);
            this.f16037a = hVar;
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a() {
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.anythink.core.common.n.b.a.e.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.anythink.core.common.n.b.a.e.h, java.io.Closeable] */
        @Override // com.anythink.core.common.n.b.a.b
        public final void c() {
            com.anythink.core.common.n.b.a.e.b bVar;
            com.anythink.core.common.n.b.a.e.b bVar2 = com.anythink.core.common.n.b.a.e.b.INTERNAL_ERROR;
            IOException e9 = null;
            try {
                try {
                    this.f16037a.a(this);
                    while (this.f16037a.a(false, (h.b) this)) {
                    }
                    com.anythink.core.common.n.b.a.e.b bVar3 = com.anythink.core.common.n.b.a.e.b.NO_ERROR;
                    try {
                        f.this.a(bVar3, com.anythink.core.common.n.b.a.e.b.CANCEL, (IOException) null);
                        bVar = bVar3;
                    } catch (IOException e10) {
                        e9 = e10;
                        com.anythink.core.common.n.b.a.e.b bVar4 = com.anythink.core.common.n.b.a.e.b.PROTOCOL_ERROR;
                        f fVar = f.this;
                        fVar.a(bVar4, bVar4, e9);
                        bVar = fVar;
                        bVar2 = this.f16037a;
                        com.anythink.core.common.n.b.a.c.a((Closeable) bVar2);
                    }
                } catch (Throwable th) {
                    th = th;
                    f.this.a(bVar, bVar2, e9);
                    com.anythink.core.common.n.b.a.c.a(this.f16037a);
                    throw th;
                }
            } catch (IOException e11) {
                e9 = e11;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                f.this.a(bVar, bVar2, e9);
                com.anythink.core.common.n.b.a.c.a(this.f16037a);
                throw th;
            }
            bVar2 = this.f16037a;
            com.anythink.core.common.n.b.a.c.a((Closeable) bVar2);
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void d() {
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(boolean z6, int i, com.anythink.core.common.n.c.e eVar, int i4) {
            if (f.c(i)) {
                f.this.a(i, eVar, i4, z6);
                return;
            }
            i a9 = f.this.a(i);
            if (a9 == null) {
                f.this.a(i, com.anythink.core.common.n.b.a.e.b.PROTOCOL_ERROR);
                long j6 = i4;
                f.this.a(j6);
                eVar.i(j6);
                return;
            }
            a9.a(eVar, i4);
            if (z6) {
                a9.a(com.anythink.core.common.n.b.a.c.f15825c, true);
            }
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(boolean z6, int i, List<com.anythink.core.common.n.b.a.e.c> list) {
            if (f.c(i)) {
                f.this.a(i, list, z6);
                return;
            }
            synchronized (f.this) {
                try {
                    i a9 = f.this.a(i);
                    if (a9 == null) {
                        if (f.this.f15997w) {
                            return;
                        }
                        f fVar = f.this;
                        if (i <= fVar.f15986j) {
                            return;
                        }
                        if (i % 2 == fVar.f15987k % 2) {
                            return;
                        }
                        final i iVar = new i(i, f.this, false, z6, com.anythink.core.common.n.b.a.c.b(list));
                        f fVar2 = f.this;
                        fVar2.f15986j = i;
                        fVar2.f15985h.put(Integer.valueOf(i), iVar);
                        f.f15976v.execute(new com.anythink.core.common.n.b.a.b(aa.f16249a + " %s stream %d", new Object[]{f.this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.e.1
                            @Override // com.anythink.core.common.n.b.a.b
                            public final void c() {
                                try {
                                    f.this.f15984g.a(iVar);
                                } catch (IOException e9) {
                                    com.anythink.core.common.n.b.a.g.c.e().a(4, "Http2Connection.Listener failure for " + f.this.i, e9);
                                    try {
                                        iVar.a(com.anythink.core.common.n.b.a.e.b.PROTOCOL_ERROR, e9);
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        });
                        return;
                    }
                    a9.a(com.anythink.core.common.n.b.a.c.b(list), z6);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(int i, com.anythink.core.common.n.b.a.e.b bVar) {
            if (f.c(i)) {
                f.this.c(i, bVar);
                return;
            }
            i b9 = f.this.b(i);
            if (b9 != null) {
                b9.b(bVar);
            }
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(final m mVar) {
            try {
                f.this.f15998x.execute(new com.anythink.core.common.n.b.a.b(aa.f16249a + " %s ACK Settings", new Object[]{f.this.i}) { // from class: com.anythink.core.common.n.b.a.e.f.e.2

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ boolean f16041a = false;

                    @Override // com.anythink.core.common.n.b.a.b
                    public final void c() {
                        i[] iVarArr;
                        long j6;
                        e eVar = e.this;
                        boolean z6 = this.f16041a;
                        m mVar2 = mVar;
                        synchronized (f.this.f15994r) {
                            synchronized (f.this) {
                                try {
                                    int e9 = f.this.f15992p.e();
                                    if (z6) {
                                        f.this.f15992p.a();
                                    }
                                    f.this.f15992p.a(mVar2);
                                    int e10 = f.this.f15992p.e();
                                    iVarArr = null;
                                    if (e10 == -1 || e10 == e9) {
                                        j6 = 0;
                                    } else {
                                        j6 = e10 - e9;
                                        if (!f.this.f15985h.isEmpty()) {
                                            iVarArr = (i[]) f.this.f15985h.values().toArray(new i[f.this.f15985h.size()]);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            try {
                                f fVar = f.this;
                                fVar.f15994r.a(fVar.f15992p);
                            } catch (IOException e11) {
                                f.this.a(e11);
                            }
                        }
                        if (iVarArr != null) {
                            for (i iVar : iVarArr) {
                                synchronized (iVar) {
                                    iVar.a(j6);
                                }
                            }
                        }
                        f.f15976v.execute(eVar.new AnonymousClass3(Wv.i(new StringBuilder(), aa.f16249a, " %s settings"), f.this.i));
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        private void a(boolean z6, m mVar) {
            i[] iVarArr;
            long j6;
            synchronized (f.this.f15994r) {
                synchronized (f.this) {
                    try {
                        int e9 = f.this.f15992p.e();
                        if (z6) {
                            f.this.f15992p.a();
                        }
                        f.this.f15992p.a(mVar);
                        int e10 = f.this.f15992p.e();
                        iVarArr = null;
                        if (e10 == -1 || e10 == e9) {
                            j6 = 0;
                        } else {
                            j6 = e10 - e9;
                            if (!f.this.f15985h.isEmpty()) {
                                iVarArr = (i[]) f.this.f15985h.values().toArray(new i[f.this.f15985h.size()]);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    f fVar = f.this;
                    fVar.f15994r.a(fVar.f15992p);
                } catch (IOException e11) {
                    f.this.a(e11);
                }
            }
            if (iVarArr != null) {
                for (i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j6);
                    }
                }
            }
            f.f15976v.execute(new AnonymousClass3(Wv.i(new StringBuilder(), aa.f16249a, " %s settings"), f.this.i));
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(boolean z6, int i, int i4) {
            if (!z6) {
                try {
                    f.this.f15998x.execute(f.this.new d(i, i4));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (f.this) {
                try {
                    if (i == 1) {
                        f.f(f.this);
                    } else if (i == 2) {
                        f.g(f.this);
                    } else if (i == 3) {
                        f.h(f.this);
                        f.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(int i, com.anythink.core.common.n.c.f fVar) {
            i[] iVarArr;
            fVar.j();
            synchronized (f.this) {
                iVarArr = (i[]) f.this.f15985h.values().toArray(new i[f.this.f15985h.size()]);
                f.i(f.this);
            }
            for (i iVar : iVarArr) {
                if (iVar.f16074c > i && iVar.b()) {
                    iVar.b(com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM);
                    f.this.b(iVar.f16074c);
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(int i, long j6) {
            if (i == 0) {
                synchronized (f.this) {
                    f fVar = f.this;
                    fVar.f15990n += j6;
                    fVar.notifyAll();
                }
                return;
            }
            i a9 = f.this.a(i);
            if (a9 != null) {
                synchronized (a9) {
                    a9.a(j6);
                }
            }
        }

        @Override // com.anythink.core.common.n.b.a.e.h.b
        public final void a(int i, List<com.anythink.core.common.n.b.a.e.c> list) {
            f.this.a(i, list);
        }
    }

    public f(a aVar) {
        m mVar = new m();
        this.f15992p = mVar;
        this.f15996t = new LinkedHashSet();
        this.f15988l = aVar.f16028f;
        boolean z6 = aVar.f16029g;
        this.f15983f = z6;
        this.f15984g = aVar.f16027e;
        int i = z6 ? 1 : 2;
        this.f15987k = i;
        if (z6) {
            this.f15987k = i + 2;
        }
        if (z6) {
            this.f15991o.a(7, 16777216);
        }
        String str = aVar.f16024b;
        this.i = str;
        String str2 = aa.f16249a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.a("%s %s Writer", str2, str), false));
        this.f15998x = scheduledThreadPoolExecutor;
        if (aVar.f16030h != 0) {
            b bVar = new b();
            int i4 = aVar.f16030h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(bVar, i4, i4, TimeUnit.MILLISECONDS);
        }
        this.f15999y = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.a("%s %s Push Observer", str2, str), true));
        mVar.a(7, 65535);
        mVar.a(5, 16384);
        this.f15990n = mVar.e();
        this.f15993q = aVar.f16023a;
        this.f15994r = new j(aVar.f16026d, z6);
        this.f15995s = new e(new h(aVar.f16025c, z6));
    }

    public static boolean c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public static /* synthetic */ long f(f fVar) {
        long j6 = fVar.f15977A;
        fVar.f15977A = 1 + j6;
        return j6;
    }

    public static /* synthetic */ long g(f fVar) {
        long j6 = fVar.f15979C;
        fVar.f15979C = 1 + j6;
        return j6;
    }

    public static /* synthetic */ long h(f fVar) {
        long j6 = fVar.f15981E;
        fVar.f15981E = 1 + j6;
        return j6;
    }

    public static /* synthetic */ boolean i(f fVar) {
        fVar.f15997w = true;
        return true;
    }

    private void j() {
        this.f15994r.a();
        this.f15994r.b(this.f15991o);
        if (this.f15991o.e() != 65535) {
            this.f15994r.a(0, r0 - 65535);
        }
        new Thread(this.f15995s).start();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(com.anythink.core.common.n.b.a.e.b.NO_ERROR, com.anythink.core.common.n.b.a.e.b.CANCEL, (IOException) null);
    }

    public static /* synthetic */ long c(f fVar) {
        long j6 = fVar.f16000z;
        fVar.f16000z = 1 + j6;
        return j6;
    }

    private synchronized int e() {
        return this.f15985h.size();
    }

    private void f() {
        synchronized (this) {
            this.f15980D++;
        }
        a(false, 3, 1330343787);
        h();
    }

    private void g() {
        synchronized (this) {
            this.f15980D++;
        }
        a(false, 3, 1330343787);
    }

    private synchronized void h() {
        while (this.f15981E < this.f15980D) {
            wait();
        }
    }

    private void i() {
        this.f15994r.b();
    }

    public final synchronized i b(int i) {
        i remove;
        remove = this.f15985h.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047 A[Catch: all -> 0x003d, TryCatch #4 {all -> 0x003d, blocks: (B:15:0x0027, B:17:0x002c, B:19:0x0034, B:23:0x0041, B:25:0x0047, B:26:0x0050, B:42:0x007a, B:43:0x007f), top: B:11:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #3 {all -> 0x0059, blocks: (B:28:0x0053, B:29:0x0065, B:34:0x005c, B:36:0x0060, B:37:0x006e, B:38:0x0075, B:46:0x0080, B:47:0x0081), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:28:0x0053, B:29:0x0065, B:34:0x005c, B:36:0x0060, B:37:0x006e, B:38:0x0075, B:46:0x0080, B:47:0x0081), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private i c(int i, List<com.anythink.core.common.n.b.a.e.c> list, boolean z6) {
        Throwable th;
        boolean z9;
        boolean z10 = !z6;
        synchronized (this.f15994r) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f15987k > 1073741823) {
                                try {
                                    a(com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            if (!this.f15997w) {
                                int i4 = this.f15987k;
                                this.f15987k = i4 + 2;
                                i iVar = new i(i4, this, z10, false, null);
                                if (z6 && this.f15990n != 0 && iVar.f16073b != 0) {
                                    z9 = false;
                                    if (iVar.a()) {
                                        this.f15985h.put(Integer.valueOf(i4), iVar);
                                    }
                                    if (i != 0) {
                                        this.f15994r.a(z10, i4, list);
                                    } else if (!this.f15983f) {
                                        this.f15994r.a(i, i4, list);
                                    } else {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    if (z9) {
                                        this.f15994r.b();
                                    }
                                    return iVar;
                                }
                                z9 = true;
                                if (iVar.a()) {
                                }
                                if (i != 0) {
                                }
                                if (z9) {
                                }
                                return iVar;
                            }
                            throw new com.anythink.core.common.n.b.a.e.a();
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final synchronized i a(int i) {
        return this.f15985h.get(Integer.valueOf(i));
    }

    public final synchronized int a() {
        return this.f15992p.d();
    }

    private i b(int i, List<com.anythink.core.common.n.b.a.e.c> list, boolean z6) {
        if (!this.f15983f) {
            return c(i, list, z6);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public final synchronized void a(long j6) {
        long j9 = this.f15989m + j6;
        this.f15989m = j9;
        if (j9 >= this.f15991o.e() / 2) {
            a(0, this.f15989m);
            this.f15989m = 0L;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Socket f16023a;

        /* renamed from: b, reason: collision with root package name */
        String f16024b;

        /* renamed from: c, reason: collision with root package name */
        com.anythink.core.common.n.c.e f16025c;

        /* renamed from: d, reason: collision with root package name */
        com.anythink.core.common.n.c.d f16026d;

        /* renamed from: e, reason: collision with root package name */
        c f16027e = c.f16032h;

        /* renamed from: f, reason: collision with root package name */
        l f16028f = l.f16113a;

        /* renamed from: g, reason: collision with root package name */
        boolean f16029g = true;

        /* renamed from: h, reason: collision with root package name */
        int f16030h;

        private a a(Socket socket) {
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            return a(socket, remoteSocketAddress instanceof InetSocketAddress ? ((InetSocketAddress) remoteSocketAddress).getHostName() : remoteSocketAddress.toString(), com.anythink.core.common.n.c.n.a(com.anythink.core.common.n.c.n.b(socket)), com.anythink.core.common.n.c.n.a(com.anythink.core.common.n.c.n.a(socket)));
        }

        public final a a(Socket socket, String str, com.anythink.core.common.n.c.e eVar, com.anythink.core.common.n.c.d dVar) {
            this.f16023a = socket;
            this.f16024b = str;
            this.f16025c = eVar;
            this.f16026d = dVar;
            return this;
        }

        public final a a(c cVar) {
            this.f16027e = cVar;
            return this;
        }

        private a a(l lVar) {
            this.f16028f = lVar;
            return this;
        }

        public final a a(int i) {
            this.f16030h = i;
            return this;
        }

        public final f a() {
            return new f(this);
        }
    }

    public final void b(int i, com.anythink.core.common.n.b.a.e.b bVar) {
        this.f15994r.a(i, bVar);
    }

    public final synchronized boolean b(long j6) {
        if (this.f15997w) {
            return false;
        }
        if (this.f15979C < this.f15978B) {
            if (j6 >= this.f15982F) {
                return false;
            }
        }
        return true;
    }

    public final i a(List<com.anythink.core.common.n.b.a.e.c> list, boolean z6) {
        return c(0, list, z6);
    }

    public final void a(int i, boolean z6, List<com.anythink.core.common.n.b.a.e.c> list) {
        this.f15994r.a(z6, i, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f15994r.c());
        r6 = r2;
        r8.f15990n -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, boolean z6, com.anythink.core.common.n.c.c cVar, long j6) {
        int min;
        long j9;
        if (j6 == 0) {
            this.f15994r.a(z6, i, cVar, 0);
            return;
        }
        while (j6 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j10 = this.f15990n;
                            if (j10 > 0) {
                                break;
                            } else if (this.f15985h.containsKey(Integer.valueOf(i))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j6 -= j9;
            this.f15994r.a(z6 && j6 == 0, i, cVar, min);
        }
    }

    public final void b() {
        this.f15994r.a();
        this.f15994r.b(this.f15991o);
        if (this.f15991o.e() != 65535) {
            this.f15994r.a(0, r0 - 65535);
        }
        new Thread(this.f15995s).start();
    }

    public final void c() {
        synchronized (this) {
            try {
                long j6 = this.f15979C;
                long j9 = this.f15978B;
                if (j6 < j9) {
                    return;
                }
                this.f15978B = j9 + 1;
                this.f15982F = System.nanoTime() + 1000000000;
                try {
                    this.f15998x.execute(new com.anythink.core.common.n.b.a.b(aa.f16249a + " %s ping", this.i) { // from class: com.anythink.core.common.n.b.a.e.f.3
                        @Override // com.anythink.core.common.n.b.a.b
                        public final void c() {
                            f.this.a(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(final int i, final com.anythink.core.common.n.b.a.e.b bVar) {
        try {
            this.f15998x.execute(new com.anythink.core.common.n.b.a.b("%s %s stream %d", new Object[]{aa.f16249a, this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.1
                @Override // com.anythink.core.common.n.b.a.b
                public final void c() {
                    try {
                        f.this.b(i, bVar);
                    } catch (IOException e9) {
                        f.this.a(e9);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void a(final int i, final long j6) {
        try {
            this.f15998x.execute(new com.anythink.core.common.n.b.a.b("%s Window Update %s stream %d", new Object[]{aa.f16249a, this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.2
                @Override // com.anythink.core.common.n.b.a.b
                public final void c() {
                    try {
                        f.this.f15994r.a(i, j6);
                    } catch (IOException e9) {
                        f.this.a(e9);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void a(boolean z6, int i, int i4) {
        try {
            this.f15994r.a(z6, i, i4);
        } catch (IOException e9) {
            a(e9);
        }
    }

    public final void c(final int i, final com.anythink.core.common.n.b.a.e.b bVar) {
        a(new com.anythink.core.common.n.b.a.b(Wv.i(new StringBuilder(), aa.f16249a, " %s Push Reset[%s]"), new Object[]{this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.7
            @Override // com.anythink.core.common.n.b.a.b
            public final void c() {
                synchronized (f.this) {
                    f.this.f15996t.remove(Integer.valueOf(i));
                }
            }
        });
    }

    private void a(com.anythink.core.common.n.b.a.e.b bVar) {
        synchronized (this.f15994r) {
            synchronized (this) {
                if (this.f15997w) {
                    return;
                }
                this.f15997w = true;
                this.f15994r.a(this.f15986j, bVar, com.anythink.core.common.n.b.a.c.f15823a);
            }
        }
    }

    public final void a(com.anythink.core.common.n.b.a.e.b bVar, com.anythink.core.common.n.b.a.e.b bVar2, IOException iOException) {
        i[] iVarArr;
        if (!f15975u && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        try {
            a(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f15985h.isEmpty()) {
                    iVarArr = null;
                } else {
                    iVarArr = (i[]) this.f15985h.values().toArray(new i[this.f15985h.size()]);
                    this.f15985h.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iVarArr != null) {
            for (i iVar : iVarArr) {
                try {
                    iVar.a(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f15994r.close();
        } catch (IOException unused3) {
        }
        try {
            this.f15993q.close();
        } catch (IOException unused4) {
        }
        this.f15998x.shutdown();
        this.f15999y.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IOException iOException) {
        com.anythink.core.common.n.b.a.e.b bVar = com.anythink.core.common.n.b.a.e.b.PROTOCOL_ERROR;
        a(bVar, bVar, iOException);
    }

    private void a(m mVar) {
        synchronized (this.f15994r) {
            synchronized (this) {
                if (!this.f15997w) {
                    this.f15991o.a(mVar);
                } else {
                    throw new com.anythink.core.common.n.b.a.e.a();
                }
            }
            this.f15994r.b(mVar);
        }
    }

    public final void a(final int i, final List<com.anythink.core.common.n.b.a.e.c> list) {
        Throwable th;
        synchronized (this) {
            try {
                if (this.f15996t.contains(Integer.valueOf(i))) {
                    try {
                        a(i, com.anythink.core.common.n.b.a.e.b.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f15996t.add(Integer.valueOf(i));
                try {
                    try {
                        a(new com.anythink.core.common.n.b.a.b(aa.f16249a + " %s Push Request[%s]", new Object[]{this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.4
                            @Override // com.anythink.core.common.n.b.a.b
                            public final void c() {
                                try {
                                    f.this.f15994r.a(i, com.anythink.core.common.n.b.a.e.b.CANCEL);
                                    synchronized (f.this) {
                                        f.this.f15996t.remove(Integer.valueOf(i));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        });
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (RejectedExecutionException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void a(final int i, final List<com.anythink.core.common.n.b.a.e.c> list, final boolean z6) {
        try {
            try {
                a(new com.anythink.core.common.n.b.a.b(aa.f16249a + " %s Push Headers[%s]", new Object[]{this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.5
                    @Override // com.anythink.core.common.n.b.a.b
                    public final void c() {
                        try {
                            f.this.f15994r.a(i, com.anythink.core.common.n.b.a.e.b.CANCEL);
                            synchronized (f.this) {
                                f.this.f15996t.remove(Integer.valueOf(i));
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    public final void a(final int i, com.anythink.core.common.n.c.e eVar, final int i4, final boolean z6) {
        final com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        long j6 = i4;
        eVar.a(j6);
        eVar.a_(cVar, j6);
        if (cVar.b() == j6) {
            a(new com.anythink.core.common.n.b.a.b(Wv.i(new StringBuilder(), aa.f16249a, " %s Push Data[%s]"), new Object[]{this.i, Integer.valueOf(i)}) { // from class: com.anythink.core.common.n.b.a.e.f.6
                @Override // com.anythink.core.common.n.b.a.b
                public final void c() {
                    try {
                        f.this.f15988l.a(cVar, i4);
                        f.this.f15994r.a(i, com.anythink.core.common.n.b.a.e.b.CANCEL);
                        synchronized (f.this) {
                            f.this.f15996t.remove(Integer.valueOf(i));
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(cVar.b() + " != " + i4);
    }

    private synchronized void a(com.anythink.core.common.n.b.a.b bVar) {
        if (!this.f15997w) {
            this.f15999y.execute(bVar);
        }
    }
}
