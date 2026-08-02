package m8;

import com.google.android.gms.internal.ads.C3451jv;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import y8.z;

/* loaded from: classes2.dex */
public final class b implements i8.o {

    /* renamed from: a, reason: collision with root package name */
    public static final b f39481a = new b();

    @Override // i8.o
    public final i8.v a(n8.h hVar) {
        n8.f gVar;
        p pVar = hVar.f39684a;
        pVar.getClass();
        synchronized (pVar) {
            try {
                if (!pVar.f39540F) {
                    throw new IllegalStateException("released");
                }
                if (pVar.f39539E) {
                    throw new IllegalStateException("Check failed.");
                }
                if (pVar.f39538D) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = pVar.f39550z;
        kotlin.jvm.internal.h.b(iVar);
        q a9 = iVar.a();
        i8.r client = pVar.f39544n;
        a9.getClass();
        kotlin.jvm.internal.h.e(client, "client");
        p8.r rVar = a9.f39559k;
        if (rVar != null) {
            gVar = new p8.s(client, a9, hVar, rVar);
        } else {
            Socket socket = a9.f39555f;
            int i = hVar.f39690g;
            socket.setSoTimeout(i);
            l4.g gVar2 = a9.i;
            z L2 = ((y8.r) gVar2.f38917v).f41955n.L();
            long j6 = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            L2.g(j6);
            ((y8.p) gVar2.f38918w).f41951n.L().g(hVar.f39691h);
            gVar = new o8.g(client, a9, gVar2);
        }
        C3451jv c3451jv = new C3451jv(pVar, iVar, gVar);
        pVar.f39537C = c3451jv;
        pVar.f39542H = c3451jv;
        synchronized (pVar) {
            pVar.f39538D = true;
            pVar.f39539E = true;
        }
        if (pVar.f39541G) {
            throw new IOException("Canceled");
        }
        return n8.h.a(hVar, 0, c3451jv, null, 61).b(hVar.f39688e);
    }
}
