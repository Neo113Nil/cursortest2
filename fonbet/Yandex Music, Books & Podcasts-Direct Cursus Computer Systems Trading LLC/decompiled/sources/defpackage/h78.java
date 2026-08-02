package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class h78 extends f8s {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h78(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.f8s
    public final long a() {
        switch (this.e) {
            case 0:
                k78 k78Var = (k78) this.f;
                synchronized (k78Var) {
                    if (!k78Var.l || k78Var.m) {
                        return -1L;
                    }
                    try {
                        k78Var.S();
                    } catch (IOException unused) {
                        k78Var.n = true;
                    }
                    try {
                        if (k78Var.D()) {
                            k78Var.Q();
                            k78Var.i = 0;
                        }
                    } catch (IOException unused2) {
                        k78Var.o = true;
                        k78Var.g = new hkn(new y33());
                    }
                    return -1L;
                }
            case 1:
                o5e o5eVar = (o5e) this.f;
                o5eVar.getClass();
                try {
                    o5eVar.w.D(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    o5eVar.a(2, 2, e);
                    return -1L;
                }
            case 2:
                fpa fpaVar = (fpa) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) fpaVar.e).iterator();
                int i = 0;
                long j = Long.MIN_VALUE;
                okn oknVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    okn oknVar2 = (okn) it.next();
                    oknVar2.getClass();
                    synchronized (oknVar2) {
                        if (fpaVar.d(oknVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - oknVar2.q;
                            if (j2 > j) {
                                oknVar = oknVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = fpaVar.b;
                if (j < j3 && i <= fpaVar.a) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                oknVar.getClass();
                synchronized (oknVar) {
                    if (!oknVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (oknVar.q + j != nanoTime) {
                        return 0L;
                    }
                    oknVar.j = true;
                    ((ConcurrentLinkedQueue) fpaVar.e).remove(oknVar);
                    Socket socket = oknVar.d;
                    socket.getClass();
                    cvt.e(socket);
                    if (!((ConcurrentLinkedQueue) fpaVar.e).isEmpty()) {
                        return 0L;
                    }
                    ((l8s) fpaVar.c).a();
                    return 0L;
                }
            default:
                ((Function0) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h78(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }
}
