package defpackage;

import com.yandex.go.scooters.api.ontheway.domain.model.ScootersOnTheWayStatus;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class y2b1 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final ScootersOnTheWayStatus b(zuo0 zuo0Var) {
        if (zuo0Var instanceof ea90) {
            return ScootersOnTheWayStatus.PAID_RESERVATION;
        }
        if (zuo0Var instanceof se90) {
            return ScootersOnTheWayStatus.PARKING;
        }
        if (zuo0Var instanceof lrj0) {
            return ScootersOnTheWayStatus.RESERVATION;
        }
        if (zuo0Var instanceof nrk0) {
            return ScootersOnTheWayStatus.RIDING;
        }
        w511.b();
        return null;
    }
}
