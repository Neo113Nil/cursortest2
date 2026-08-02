package x1;

import java.util.concurrent.TimeUnit;
import v7.AbstractC5118i;

/* loaded from: classes.dex */
public final class g {
    public static final void a(y8.c node, long j6, boolean z6) {
        I1.a aVar = y8.c.f41911h;
        if (y8.c.i == null) {
            y8.c.i = new y8.c();
            Z2.c cVar = new Z2.c("Okio Watchdog");
            cVar.setDaemon(true);
            cVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j6 != 0 && z6) {
            node.f41918g = Math.min(j6, node.c() - nanoTime) + nanoTime;
        } else if (j6 != 0) {
            node.f41918g = nanoTime + j6;
        } else {
            if (!z6) {
                throw new AssertionError();
            }
            node.f41918g = node.c();
        }
        I1.a aVar2 = y8.c.f41911h;
        kotlin.jvm.internal.h.e(node, "node");
        int i = aVar2.f1303u + 1;
        aVar2.f1303u = i;
        y8.c[] cVarArr = (y8.c[]) aVar2.f1304v;
        if (i == cVarArr.length) {
            y8.c[] cVarArr2 = new y8.c[i * 2];
            AbstractC5118i.u(0, 0, cVarArr.length, cVarArr, cVarArr2);
            aVar2.f1304v = cVarArr2;
        }
        aVar2.h(i, node);
        if (node.f41917f == 1) {
            y8.c.f41913k.signal();
        }
    }

    public static y8.c b() {
        I1.a aVar = y8.c.f41911h;
        y8.c cVar = ((y8.c[]) aVar.f1304v)[1];
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            y8.c.f41913k.await(y8.c.f41914l, TimeUnit.MILLISECONDS);
            if (((y8.c[]) aVar.f1304v)[1] != null || System.nanoTime() - nanoTime < y8.c.f41915m) {
                return null;
            }
            return y8.c.i;
        }
        long nanoTime2 = cVar.f41918g - System.nanoTime();
        if (nanoTime2 > 0) {
            y8.c.f41913k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        aVar.o(cVar);
        cVar.f41916e = 2;
        return cVar;
    }
}
