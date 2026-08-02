package defpackage;

import com.yandex.mob.d;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public final class qot implements gxf0 {
    public final h3y a;
    public final h3y b;
    public final mot c;

    public qot(h3y h3yVar, h3y h3yVar2, mot motVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = motVar;
    }

    public final OkHttpClient.a a(OkHttpClient.a aVar, GoApiName goApiName) {
        if (goApiName != null) {
            aVar.a(new lot(0, goApiName, (ju6) this.c.a.a.get()));
        }
        aVar.a((p8w) this.b.get());
        fl20 a = ((kl20) this.a.get()).a();
        if (a != null) {
            d dVar = a.a;
            tig0 a2 = ((rr20) dVar.A.getValue()).a();
            X509TrustManager x509TrustManager = (X509TrustManager) a2.b;
            if (x509TrustManager != null) {
                aVar.h((sr20) a2.a, x509TrustManager);
            }
            aVar.e((io20) dVar.z.getValue());
            d5e d5eVar = (d5e) dVar.u.getValue();
            if (d5eVar != null) {
                aVar.b = d5eVar;
            }
            aVar.a((ko20) dVar.E.getValue());
        }
        return aVar;
    }
}
