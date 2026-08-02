package defpackage;

import com.yandex.go.due.data.api.dto.RideInfo;
import java.util.Calendar;

/* loaded from: classes12.dex */
public final class z1n implements a2n {
    public final Calendar a;
    public final RideInfo b;

    public z1n(Calendar calendar, RideInfo rideInfo) {
        this.a = calendar;
        this.b = rideInfo;
    }

    @Override // defpackage.a2n
    public final Calendar a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1n)) {
            return false;
        }
        z1n z1nVar = (z1n) obj;
        return jl40.l(this.a, z1nVar.a) && jl40.l(this.b, z1nVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        RideInfo rideInfo = this.b;
        return hashCode + (rideInfo == null ? 0 : rideInfo.hashCode());
    }
}
