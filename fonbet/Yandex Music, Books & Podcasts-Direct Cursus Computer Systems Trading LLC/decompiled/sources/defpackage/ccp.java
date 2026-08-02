package defpackage;

import com.yandex.payment.divkit.api.DivKitApi;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes4.dex */
public final class ccp implements rzm {
    public final /* synthetic */ int a;
    public final szm b;
    public final Object c;

    public ccp(z6u z6uVar, rzm rzmVar) {
        this.a = 2;
        this.c = z6uVar;
        this.b = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                DivKitApi divKitApi = (DivKitApi) ((zo0) this.c).get();
                g0c g0cVar = (g0c) this.b.get();
                g0cVar.getClass();
                return new xiu(divKitApi, g0cVar);
            case 1:
                xiu xiuVar = (xiu) ((ccp) this.c).get();
                g0c g0cVar2 = (g0c) this.b.get();
                g0cVar2.getClass();
                return new sfg(xiuVar, g0cVar2);
            default:
                z6u z6uVar = (z6u) this.c;
                nzi nziVar = (nzi) ((rzm) this.b).get();
                nziVar.getClass();
                u7e u7eVar = null;
                try {
                    s7e s7eVar = new s7e();
                    s7eVar.h(null, "https://mail.yandex.ru");
                    u7eVar = s7eVar.e();
                } catch (IllegalArgumentException unused) {
                }
                if (u7eVar != null) {
                    s7e f = u7eVar.f();
                    f.c("api/mobile/", true);
                    try {
                        URL url = new URL(f.e().i);
                        return new xo7(new rs6(20, url), nziVar, new ozw(25, (byte) 0), new lh0(6, z6uVar), new w(3, z6uVar));
                    } catch (MalformedURLException e) {
                        b6e.q(e);
                    }
                } else {
                    xq0.x("Required value was null.");
                }
                return null;
        }
    }

    public /* synthetic */ ccp(rxk rxkVar, rzm rzmVar, toe toeVar, int i) {
        this.a = i;
        this.c = rzmVar;
        this.b = toeVar;
    }
}
