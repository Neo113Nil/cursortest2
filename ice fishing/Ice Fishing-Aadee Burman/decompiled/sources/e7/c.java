package e7;

import androidx.emoji2.text.k;
import b7.InterfaceC0527g;
import b7.p;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m6.s;
import p6.C4840a;

/* loaded from: classes2.dex */
public final class c implements InterfaceC0527g {

    /* renamed from: v, reason: collision with root package name */
    public static final String f37227v = c.class.getSimpleName().concat("_WorkerThread");

    /* renamed from: w, reason: collision with root package name */
    public static final k6.e f37228w = k6.e.a(f6.b.f37516n, "processorType");

    /* renamed from: x, reason: collision with root package name */
    public static final k6.e f37229x = k6.e.a(f6.b.f37517u, "dropped");

    /* renamed from: y, reason: collision with root package name */
    public static final String f37230y = c.class.getSimpleName();

    /* renamed from: n, reason: collision with root package name */
    public final b f37231n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f37232u = new AtomicBoolean(false);

    public c(e eVar, s sVar, long j6, int i, int i6, long j9) {
        b bVar = new b(eVar, sVar, j6, i6, j9, new ArrayBlockingQueue(i));
        this.f37231n = bVar;
        new U2.b(f37227v).newThread(bVar).start();
    }

    @Override // b7.InterfaceC0527g
    public final Y6.c M() {
        Logger logger = b.f37212H;
        return this.f37231n.b();
    }

    @Override // b7.InterfaceC0527g
    public final void Q(C4840a c4840a, p pVar) {
        b bVar = this.f37231n;
        ArrayBlockingQueue arrayBlockingQueue = bVar.f37214B;
        if (!arrayBlockingQueue.offer(pVar)) {
            bVar.f37220n.b(1L, bVar.f37221u);
        } else if (arrayBlockingQueue.size() >= bVar.f37215C.get()) {
            bVar.f37216D.offer(Boolean.TRUE);
        }
    }

    @Override // b7.InterfaceC0527g
    public final Y6.c shutdown() {
        if (this.f37232u.getAndSet(true)) {
            return Y6.c.f3975e;
        }
        Logger logger = b.f37212H;
        b bVar = this.f37231n;
        bVar.getClass();
        Y6.c cVar = new Y6.c();
        Y6.c b9 = bVar.b();
        b9.f(new k(6, bVar, b9, cVar));
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        b bVar = this.f37231n;
        sb.append(bVar.f37223w);
        sb.append(", scheduleDelayNanos=");
        sb.append(bVar.f37224x);
        sb.append(", maxExportBatchSize=");
        sb.append(bVar.f37225y);
        sb.append(", exporterTimeoutNanos=");
        sb.append(bVar.f37226z);
        sb.append('}');
        return sb.toString();
    }
}
