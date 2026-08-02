package e7;

import androidx.emoji2.text.k;
import b7.InterfaceC0535g;
import b7.o;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import m6.s;
import p6.C4840a;

/* loaded from: classes2.dex */
public final class c implements InterfaceC0535g {

    /* renamed from: v, reason: collision with root package name */
    public static final String f37303v = c.class.getSimpleName().concat("_WorkerThread");

    /* renamed from: w, reason: collision with root package name */
    public static final k6.e f37304w = k6.e.a(f6.b.f37478n, "processorType");

    /* renamed from: x, reason: collision with root package name */
    public static final k6.e f37305x = k6.e.a(f6.b.f37479u, "dropped");

    /* renamed from: y, reason: collision with root package name */
    public static final String f37306y = c.class.getSimpleName();

    /* renamed from: n, reason: collision with root package name */
    public final b f37307n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f37308u = new AtomicBoolean(false);

    public c(e eVar, s sVar, long j6, int i, int i4, long j9) {
        b bVar = new b(eVar, sVar, j6, i4, j9, new ArrayBlockingQueue(i));
        this.f37307n = bVar;
        new W2.b(f37303v).newThread(bVar).start();
    }

    @Override // b7.InterfaceC0535g
    public final Y6.c M() {
        Logger logger = b.f37288H;
        return this.f37307n.b();
    }

    @Override // b7.InterfaceC0535g
    public final void Q(C4840a c4840a, o oVar) {
        b bVar = this.f37307n;
        ArrayBlockingQueue arrayBlockingQueue = bVar.f37290B;
        if (!arrayBlockingQueue.offer(oVar)) {
            bVar.f37296n.b(1L, bVar.f37297u);
        } else if (arrayBlockingQueue.size() >= bVar.f37291C.get()) {
            bVar.f37292D.offer(Boolean.TRUE);
        }
    }

    @Override // b7.InterfaceC0535g
    public final Y6.c shutdown() {
        if (this.f37308u.getAndSet(true)) {
            return Y6.c.f3919e;
        }
        Logger logger = b.f37288H;
        b bVar = this.f37307n;
        bVar.getClass();
        Y6.c cVar = new Y6.c();
        Y6.c b9 = bVar.b();
        b9.f(new k(5, bVar, b9, cVar));
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchLogRecordProcessor{logRecordExporter=");
        b bVar = this.f37307n;
        sb.append(bVar.f37299w);
        sb.append(", scheduleDelayNanos=");
        sb.append(bVar.f37300x);
        sb.append(", maxExportBatchSize=");
        sb.append(bVar.f37301y);
        sb.append(", exporterTimeoutNanos=");
        sb.append(bVar.f37302z);
        sb.append('}');
        return sb.toString();
    }
}
