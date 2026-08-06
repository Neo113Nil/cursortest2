package N1;

import J1.p;
import J1.s;
import J1.y;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1149a = new a();

    @Override // J1.p
    public final y a(O1.g gVar) {
        i iVar = gVar.f1238a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f1194l) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f1193k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f1192j) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = iVar.f1189g;
        kotlin.jvm.internal.i.b(fVar);
        s client = iVar.f1183a;
        kotlin.jvm.internal.i.e(client, "client");
        try {
            e eVar = new e(iVar, fVar, fVar.a(gVar.f1243f, gVar.f1244g, gVar.f1245h, client.f944f, !kotlin.jvm.internal.i.a(gVar.f1242e.f978b, "GET")).j(client, gVar));
            iVar.f1191i = eVar;
            iVar.f1196n = eVar;
            synchronized (iVar) {
                iVar.f1192j = true;
                iVar.f1193k = true;
            }
            if (iVar.f1195m) {
                throw new IOException("Canceled");
            }
            return O1.g.a(gVar, 0, eVar, null, 61).b(gVar.f1242e);
        } catch (m e2) {
            fVar.c(e2.f1222b);
            throw e2;
        } catch (IOException e3) {
            fVar.c(e3);
            throw new m(e3);
        }
    }
}
