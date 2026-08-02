package defpackage;

import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tgk0 implements ugk0 {
    public final RideCardDriverState a;
    public final String b;

    public tgk0(RideCardDriverState rideCardDriverState, String str) {
        this.a = rideCardDriverState;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgk0)) {
            return false;
        }
        tgk0 tgk0Var = (tgk0) obj;
        return this.a == tgk0Var.a && jl40.l(this.b, tgk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "State(state=" + this.a + ", newDriverId=" + this.b + Extension.C_BRAKE;
    }
}
