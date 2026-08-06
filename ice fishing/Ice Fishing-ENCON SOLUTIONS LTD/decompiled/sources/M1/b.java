package M1;

import N1.k;
import Q1.l;
import Q1.q;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i2) {
        super(str, true);
        this.f1088e = i2;
        this.f1089f = obj;
    }

    @Override // M1.a
    public final long a() {
        switch (this.f1088e) {
            case 0:
                ((l) this.f1089f).invoke();
                return -1L;
            case 1:
                N1.l lVar = (N1.l) this.f1089f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) lVar.f1220d).iterator();
                int i2 = 0;
                long j2 = Long.MIN_VALUE;
                k kVar = null;
                int i3 = 0;
                while (it.hasNext()) {
                    k connection = (k) it.next();
                    i.d(connection, "connection");
                    synchronized (connection) {
                        if (lVar.c(connection, nanoTime) > 0) {
                            i3++;
                        } else {
                            i2++;
                            long j3 = nanoTime - connection.f1214q;
                            if (j3 > j2) {
                                kVar = connection;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = lVar.f1217a;
                if (j2 < j4 && i2 <= 5) {
                    if (i2 > 0) {
                        return j4 - j2;
                    }
                    if (i3 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                i.b(kVar);
                synchronized (kVar) {
                    if (!kVar.f1213p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f1214q + j2 != nanoTime) {
                        return 0L;
                    }
                    kVar.f1207j = true;
                    ((ConcurrentLinkedQueue) lVar.f1220d).remove(kVar);
                    Socket socket = kVar.f1201d;
                    i.b(socket);
                    K1.b.e(socket);
                    if (!((ConcurrentLinkedQueue) lVar.f1220d).isEmpty()) {
                        return 0L;
                    }
                    ((c) lVar.f1218b).a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f1089f;
                qVar.getClass();
                try {
                    qVar.f1647w.l(2, 0, false);
                    return -1L;
                } catch (IOException e2) {
                    qVar.b(e2);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(N1.l lVar, String str) {
        super(str, true);
        this.f1088e = 1;
        this.f1089f = lVar;
    }
}
