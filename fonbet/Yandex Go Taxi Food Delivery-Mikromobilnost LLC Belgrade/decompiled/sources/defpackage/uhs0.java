package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class uhs0 implements nlm {
    public abstract void b(DrivingRoute drivingRoute);

    @Override // defpackage.nlm
    public void e(List list) {
        if (list.isEmpty()) {
            jst.e.k(new IOException("Empty driving routes"), "Exception during route querying");
        } else {
            b((DrivingRoute) list.get(0));
        }
    }
}
