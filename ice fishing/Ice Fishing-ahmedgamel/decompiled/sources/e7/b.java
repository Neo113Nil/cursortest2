package e7;

import b7.o;
import f6.C4522a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import m6.l;
import m6.q;
import m6.s;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: H, reason: collision with root package name */
    public static final Logger f37288H = Logger.getLogger(b.class.getName());

    /* renamed from: A, reason: collision with root package name */
    public long f37289A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayBlockingQueue f37290B;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f37295G;

    /* renamed from: n, reason: collision with root package name */
    public final l f37296n;

    /* renamed from: u, reason: collision with root package name */
    public final C4522a f37297u;

    /* renamed from: v, reason: collision with root package name */
    public final C4522a f37298v;

    /* renamed from: w, reason: collision with root package name */
    public final e f37299w;

    /* renamed from: x, reason: collision with root package name */
    public final long f37300x;

    /* renamed from: y, reason: collision with root package name */
    public final int f37301y;

    /* renamed from: z, reason: collision with root package name */
    public final long f37302z;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f37291C = new AtomicInteger(Integer.MAX_VALUE);

    /* renamed from: E, reason: collision with root package name */
    public final AtomicReference f37293E = new AtomicReference();

    /* renamed from: F, reason: collision with root package name */
    public volatile boolean f37294F = true;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f37292D = new ArrayBlockingQueue(1);

    public b(e eVar, s sVar, long j6, int i, long j9, ArrayBlockingQueue arrayBlockingQueue) {
        this.f37299w = eVar;
        this.f37300x = j6;
        this.f37301y = i;
        this.f37302z = j9;
        this.f37290B = arrayBlockingQueue;
        q mo56build = sVar.a("io.opentelemetry.sdk.logs").mo56build();
        mo56build.b("queueSize").a().a().c().m(new C4485a(arrayBlockingQueue));
        this.f37296n = mo56build.d("processedLogs").e("1").d("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").mo53build();
        k6.e eVar2 = c.f37304w;
        String str = c.f37306y;
        k6.e eVar3 = c.f37305x;
        this.f37297u = f6.c.b(eVar2, str, eVar3, Boolean.TRUE);
        this.f37298v = f6.c.b(eVar2, str, eVar3, Boolean.FALSE);
        this.f37295G = new ArrayList(i);
    }

    public final void a() {
        Logger logger = f37288H;
        ArrayList arrayList = this.f37295G;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                Y6.c f2 = this.f37299w.f(Collections.unmodifiableList(arrayList));
                f2.c(this.f37302z, TimeUnit.NANOSECONDS);
                if (f2.b()) {
                    this.f37296n.b(arrayList.size(), this.f37298v);
                } else {
                    logger.log(Level.FINE, "Exporter failed");
                }
                arrayList.clear();
            } catch (RuntimeException e9) {
                logger.log(Level.WARNING, "Exporter threw an Exception", (Throwable) e9);
                arrayList.clear();
            }
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
    }

    public final Y6.c b() {
        Y6.c cVar = new Y6.c();
        AtomicReference atomicReference = this.f37293E;
        while (true) {
            if (atomicReference.compareAndSet(null, cVar)) {
                this.f37292D.offer(Boolean.TRUE);
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        Y6.c cVar2 = (Y6.c) atomicReference.get();
        return cVar2 == null ? Y6.c.f3919e : cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37289A = System.nanoTime() + this.f37300x;
        while (this.f37294F) {
            if (this.f37293E.get() != null) {
                ArrayBlockingQueue arrayBlockingQueue = this.f37290B;
                int size = arrayBlockingQueue.size();
                while (size > 0) {
                    o oVar = (o) arrayBlockingQueue.poll();
                    ArrayList arrayList = this.f37295G;
                    arrayList.add(oVar.b());
                    size--;
                    if (arrayList.size() >= this.f37301y) {
                        a();
                    }
                }
                a();
                AtomicReference atomicReference = this.f37293E;
                Y6.c cVar = (Y6.c) atomicReference.get();
                if (cVar != null) {
                    cVar.e();
                    atomicReference.set(null);
                }
            }
            while (!this.f37290B.isEmpty() && this.f37295G.size() < this.f37301y) {
                this.f37295G.add(((o) this.f37290B.poll()).b());
            }
            if (this.f37295G.size() >= this.f37301y || System.nanoTime() >= this.f37289A) {
                a();
                this.f37289A = System.nanoTime() + this.f37300x;
            }
            if (this.f37290B.isEmpty()) {
                try {
                    long nanoTime = this.f37289A - System.nanoTime();
                    if (nanoTime > 0) {
                        this.f37291C.set(this.f37301y - this.f37295G.size());
                        this.f37292D.poll(nanoTime, TimeUnit.NANOSECONDS);
                        this.f37291C.set(Integer.MAX_VALUE);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
