package defpackage;

import com.yandex.xplat.payment.sdk.AvailableMethods;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class twd implements y9a0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ twd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y9a0
    public final md51 a(AvailableMethods availableMethods) {
        int i = this.a;
        boolean z = false;
        Object obj = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                ArrayList a = lu91.a((ArrayList) obj, lu91.a(availableMethods.getPaymentMethods(), new ArrayList()));
                ra4 builder = availableMethods.builder();
                builder.a = a;
                return zmx.d(builder.a());
            case 1:
                ra4 builder2 = availableMethods.builder();
                if (availableMethods.getIsSpbQrAvailable()) {
                    builder2.d = true;
                }
                return availableMethods.getIsGooglePayAvailable() ? ymx.l(zmx.b(new ctq(i2, (yvt) obj)), new bhh(0, builder2), null, 5) : zmx.d(builder2.a());
            default:
                ra4 builder3 = availableMethods.builder();
                builder3.a = lu91.b(availableMethods.getPaymentMethods(), new s1r(2, this));
                laa0 laa0Var = (laa0) obj;
                builder3.b = false;
                builder3.c = laa0Var.b && availableMethods.getIsGooglePayAvailable();
                builder3.d = laa0Var.c && availableMethods.getIsSpbQrAvailable();
                if (laa0Var.d && availableMethods.getIsNewSbpTokenAvailable()) {
                    z = true;
                }
                builder3.e = z;
                return zmx.d(builder3.a());
        }
    }
}
