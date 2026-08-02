package defpackage;

import android.content.Context;
import com.yandex.go.payments.data.BillingApi;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import kotlin.collections.a;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes6.dex */
public abstract class s6b1 {
    public static BillingApi a(on2 on2Var) {
        return (BillingApi) on2Var.a(GoApiName.Billing, BillingApi.class);
    }

    public static final CharSequence b(r440 r440Var, Context context) {
        b3v0 f = r440Var.f();
        bdc bdcVar = new bdc(xng0.everFront);
        TransportContour transportContour = f.g;
        if (transportContour != null) {
            return fh4.i(context, transportContour.getName(), r440Var.d, bdcVar);
        }
        return null;
    }

    public static final String c(fj40 fj40Var) {
        if (fj40Var instanceof jm30) {
            String str = ((jm30) fj40Var).f().e;
            if (str != null) {
                return str;
            }
            String d = d(fj40Var);
            return d == null ? "" : d;
        }
        if (fj40Var instanceof r440) {
            String str2 = ((r440) fj40Var).f().c;
            if (str2 != null) {
                return str2;
            }
            String d2 = d(fj40Var);
            return d2 == null ? "" : d2;
        }
        if ((fj40Var instanceof lj40) || (fj40Var instanceof l540)) {
            String d3 = d(fj40Var);
            return d3 == null ? "" : d3;
        }
        w511.b();
        return null;
    }

    public static final String d(fj40 fj40Var) {
        hj40 hj40Var = (hj40) a.R(fj40Var.e());
        if (hj40Var != null) {
            return hj40Var.c;
        }
        return null;
    }

    public static BillingApi e(on2 on2Var) {
        return (BillingApi) on2Var.a(GoApiName.BillingInternational, BillingApi.class);
    }

    public static final cdc f(int i) {
        return new cdc(lhc.f(i, 255 & Math.abs(255)));
    }
}
