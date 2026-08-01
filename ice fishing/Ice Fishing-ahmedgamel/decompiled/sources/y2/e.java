package y2;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import v7.AbstractC5128i;
import y1.C5213h;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import y1.x;
import y1.y;

/* loaded from: classes.dex */
public final class e implements InterfaceC5230b, InterfaceC5224s {
    public static final void a(y8.c node, long j6, boolean z3) {
        G1.a aVar = y8.c.f41940h;
        if (y8.c.i == null) {
            y8.c.i = new y8.c();
            X2.d dVar = new X2.d("Okio Watchdog");
            dVar.setDaemon(true);
            dVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j6 != 0 && z3) {
            node.f41947g = Math.min(j6, node.c() - nanoTime) + nanoTime;
        } else if (j6 != 0) {
            node.f41947g = nanoTime + j6;
        } else {
            if (!z3) {
                throw new AssertionError();
            }
            node.f41947g = node.c();
        }
        G1.a aVar2 = y8.c.f41940h;
        h.e(node, "node");
        int i = aVar2.f1050u + 1;
        aVar2.f1050u = i;
        y8.c[] cVarArr = (y8.c[]) aVar2.f1051v;
        if (i == cVarArr.length) {
            y8.c[] cVarArr2 = new y8.c[i * 2];
            AbstractC5128i.r(0, 0, cVarArr.length, cVarArr, cVarArr2);
            aVar2.f1051v = cVarArr2;
        }
        aVar2.i(i, node);
        if (node.f41946f == 1) {
            y8.c.f41942k.signal();
        }
    }

    public static y8.c b() {
        G1.a aVar = y8.c.f41940h;
        y8.c cVar = ((y8.c[]) aVar.f1051v)[1];
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            y8.c.f41942k.await(y8.c.f41943l, TimeUnit.MILLISECONDS);
            if (((y8.c[]) aVar.f1051v)[1] != null || System.nanoTime() - nanoTime < y8.c.f41944m) {
                return null;
            }
            return y8.c.i;
        }
        long nanoTime2 = cVar.f41947g - System.nanoTime();
        if (nanoTime2 > 0) {
            y8.c.f41942k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        aVar.o(cVar);
        cVar.f41945e = 2;
        return cVar;
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(x xVar) {
        return new y(xVar.b(C5213h.class, InputStream.class), 1);
    }
}
