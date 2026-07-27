package m8;

import com.google.android.gms.internal.ads.C3428jv;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import y8.z;

/* loaded from: classes2.dex */
public final class b implements i8.o {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39322a = new b();

    @Override // i8.o
    public final i8.v a(n8.h hVar) {
        n8.f gVar;
        q qVar = hVar.f39517a;
        qVar.getClass();
        synchronized (qVar) {
            try {
                if (!qVar.f39383F) {
                    throw new IllegalStateException("released");
                }
                if (qVar.f39382E) {
                    throw new IllegalStateException("Check failed.");
                }
                if (qVar.f39381D) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j jVar = qVar.f39393z;
        kotlin.jvm.internal.h.b(jVar);
        r b9 = jVar.b();
        i8.r client = qVar.f39387n;
        b9.getClass();
        kotlin.jvm.internal.h.e(client, "client");
        p8.r rVar = b9.f39402k;
        if (rVar != null) {
            gVar = new p8.s(client, b9, hVar, rVar);
        } else {
            Socket socket = b9.f39398f;
            int i = hVar.f39523g;
            socket.setSoTimeout(i);
            j4.g gVar2 = b9.i;
            z L6 = ((y8.r) gVar2.f38405v).f41981n.L();
            long j6 = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            L6.g(j6);
            ((y8.p) gVar2.f38406w).f41977n.L().g(hVar.f39524h);
            gVar = new o8.g(client, b9, gVar2);
        }
        C3428jv c3428jv = new C3428jv(qVar, jVar, gVar);
        qVar.f39380C = c3428jv;
        qVar.f39385H = c3428jv;
        synchronized (qVar) {
            qVar.f39381D = true;
            qVar.f39382E = true;
        }
        if (qVar.f39384G) {
            throw new IOException("Canceled");
        }
        return n8.h.a(hVar, 0, c3428jv, null, 61).b(hVar.f39521e);
    }
}
