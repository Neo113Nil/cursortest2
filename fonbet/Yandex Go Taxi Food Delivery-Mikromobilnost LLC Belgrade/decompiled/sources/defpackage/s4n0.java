package defpackage;

import com.yandex.go.scooters.domain.model.ScootersBookingException;
import com.yandex.go.scooters.domain.model.ScootersBookingFailedException;
import com.yandex.go.scooters.domain.model.ScootersInvalidPaymentMethodException;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.a;
import com.yandex.go.scooters.offers.v2.components.bottom.domain.booking.d;
import com.yandex.go.scooters.offers.v2.domain.model.ScooterIsBusyException;
import com.yandex.go.scooters.passes.exception.ScootersNoSelectedPaymentMethodException;
import com.yandex.go.scooters.passes.exception.ScootersPassActionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public final class s4n0 extends ad5 {
    public final d A;
    public final z2o0 B;
    public final a4o0 C;
    public final a D;
    public final hxo0 E;
    public final n6n0 x;
    public final b3n0 y;
    public final s6n0 z;

    public s4n0(n6n0 n6n0Var, b3n0 b3n0Var, s6n0 s6n0Var, d dVar, z2o0 z2o0Var, a4o0 a4o0Var, a aVar, hxo0 hxo0Var) {
        super(p4n0.class);
        this.x = n6n0Var;
        this.y = b3n0Var;
        this.z = s6n0Var;
        this.A = dVar;
        this.B = z2o0Var;
        this.C = a4o0Var;
        this.D = aVar;
        this.E = hxo0Var;
    }

    public final void Kg(Throwable th) {
        boolean z = th instanceof ScootersBookingException;
        n6n0 n6n0Var = this.x;
        boolean z2 = true;
        if (z) {
            ScootersBookingException scootersBookingException = (ScootersBookingException) th;
            qkn0 payload = scootersBookingException.getPayload();
            if (payload instanceof mkn0) {
                if (q4n0.a[((mkn0) payload).a.ordinal()] == 1) {
                    n6n0.a(n6n0Var, null, null, 3);
                } else {
                    Throwable throwable = scootersBookingException.getThrowable();
                    if ((throwable instanceof ScooterIsBusyException) || (throwable instanceof ScootersBookingFailedException)) {
                        Throwable throwable2 = scootersBookingException.getThrowable();
                        if ((throwable2 instanceof ScootersBookingFailedException) && ((ScootersBookingFailedException) throwable2).getErrorCode() != ScootersErrorCode.FRAUDER) {
                            z2 = false;
                        }
                        Lg(scootersBookingException, z2);
                        xby.l(jst.e, "Scooters.Book: standart", null, throwable2, "Error occurred when trying to book a scooter in the Standard (Per-minutes) Tariff", 2);
                    } else {
                        Lg(scootersBookingException, true);
                    }
                }
            }
        } else if ((th instanceof ScootersNoSelectedPaymentMethodException) || (th instanceof ScootersInvalidPaymentMethodException)) {
            n6n0.a(n6n0Var, null, null, 3);
        } else if ((th instanceof ScooterIsBusyException) || (th instanceof ScootersBookingFailedException)) {
            if ((th instanceof ScootersBookingFailedException) && ((ScootersBookingFailedException) th).getErrorCode() != ScootersErrorCode.FRAUDER) {
                z2 = false;
            }
            Lg(th, z2);
            xby.l(jst.e, "Scooters.Book: standart", null, th, "Error occurred when trying to book a scooter in the Standard (Per-minutes) Tariff", 2);
        } else if (th instanceof ScootersPassActionException) {
            zgz.a("Error while purchasing package", th);
            Lg(th, false);
        } else {
            zgz.a("Error while scooter booking", th);
            Lg(th, true);
        }
        this.y.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h7n0] */
    public final void Lg(Throwable th, boolean z) {
        y5n0 a = this.B.a();
        ?? r1 = 0;
        List c = a != null ? q1b1.c(a.j) : null;
        if (c != null) {
            List list = c;
            r1 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r1.add(((r7p0) it.next()).a);
            }
        }
        if (r1 == 0) {
            r1 = EmptyList.a;
        }
        ((h7n0) this.x).f(th, r1, z);
    }
}
