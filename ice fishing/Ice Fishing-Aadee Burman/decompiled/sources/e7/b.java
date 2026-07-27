package e7;

import b7.p;
import f6.C4512a;
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
    public static final Logger f37212H = Logger.getLogger(b.class.getName());

    /* renamed from: A, reason: collision with root package name */
    public long f37213A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayBlockingQueue f37214B;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f37219G;

    /* renamed from: n, reason: collision with root package name */
    public final l f37220n;

    /* renamed from: u, reason: collision with root package name */
    public final C4512a f37221u;

    /* renamed from: v, reason: collision with root package name */
    public final C4512a f37222v;

    /* renamed from: w, reason: collision with root package name */
    public final e f37223w;

    /* renamed from: x, reason: collision with root package name */
    public final long f37224x;

    /* renamed from: y, reason: collision with root package name */
    public final int f37225y;

    /* renamed from: z, reason: collision with root package name */
    public final long f37226z;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f37215C = new AtomicInteger(Integer.MAX_VALUE);

    /* renamed from: E, reason: collision with root package name */
    public final AtomicReference f37217E = new AtomicReference();

    /* renamed from: F, reason: collision with root package name */
    public volatile boolean f37218F = true;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayBlockingQueue f37216D = new ArrayBlockingQueue(1);

    public b(e eVar, s sVar, long j6, int i, long j9, ArrayBlockingQueue arrayBlockingQueue) {
        this.f37223w = eVar;
        this.f37224x = j6;
        this.f37225y = i;
        this.f37226z = j9;
        this.f37214B = arrayBlockingQueue;
        q mo5build = sVar.a("io.opentelemetry.sdk.logs").mo5build();
        mo5build.b("queueSize").a().a().c().i(new C4468a(arrayBlockingQueue));
        this.f37220n = mo5build.d("processedLogs").e("1").d("The number of logs processed by the BatchLogRecordProcessor. [dropped=true if they were dropped due to high throughput]").build();
        k6.e eVar2 = c.f37228w;
        String str = c.f37230y;
        k6.e eVar3 = c.f37229x;
        this.f37221u = f6.c.b(eVar2, str, eVar3, Boolean.TRUE);
        this.f37222v = f6.c.b(eVar2, str, eVar3, Boolean.FALSE);
        this.f37219G = new ArrayList(i);
    }

    public final void a() {
        Logger logger = f37212H;
        ArrayList arrayList = this.f37219G;
        try {
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                Y6.c f3 = this.f37223w.f(Collections.unmodifiableList(arrayList));
                f3.c(this.f37226z, TimeUnit.NANOSECONDS);
                if (f3.b()) {
                    this.f37220n.b(arrayList.size(), this.f37222v);
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
        AtomicReference atomicReference = this.f37217E;
        while (true) {
            if (atomicReference.compareAndSet(null, cVar)) {
                this.f37216D.offer(Boolean.TRUE);
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        Y6.c cVar2 = (Y6.c) atomicReference.get();
        return cVar2 == null ? Y6.c.f3975e : cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37213A = System.nanoTime() + this.f37224x;
        while (this.f37218F) {
            if (this.f37217E.get() != null) {
                ArrayBlockingQueue arrayBlockingQueue = this.f37214B;
                int size = arrayBlockingQueue.size();
                while (size > 0) {
                    p pVar = (p) arrayBlockingQueue.poll();
                    ArrayList arrayList = this.f37219G;
                    arrayList.add(pVar.b());
                    size--;
                    if (arrayList.size() >= this.f37225y) {
                        a();
                    }
                }
                a();
                AtomicReference atomicReference = this.f37217E;
                Y6.c cVar = (Y6.c) atomicReference.get();
                if (cVar != null) {
                    cVar.e();
                    atomicReference.set(null);
                }
            }
            while (!this.f37214B.isEmpty() && this.f37219G.size() < this.f37225y) {
                this.f37219G.add(((p) this.f37214B.poll()).b());
            }
            if (this.f37219G.size() >= this.f37225y || System.nanoTime() >= this.f37213A) {
                a();
                this.f37213A = System.nanoTime() + this.f37224x;
            }
            if (this.f37214B.isEmpty()) {
                try {
                    long nanoTime = this.f37213A - System.nanoTime();
                    if (nanoTime > 0) {
                        this.f37215C.set(this.f37225y - this.f37219G.size());
                        this.f37216D.poll(nanoTime, TimeUnit.NANOSECONDS);
                        this.f37215C.set(Integer.MAX_VALUE);
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}
