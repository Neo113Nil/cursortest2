package defpackage;

import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zgk0 {
    public final RideCardDriverState a;
    public final String b;

    public zgk0(RideCardDriverState rideCardDriverState, String str) {
        this.a = rideCardDriverState;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgk0)) {
            return false;
        }
        zgk0 zgk0Var = (zgk0) obj;
        return this.a == zgk0Var.a && jl40.l(this.b, zgk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "State(driverState=" + this.a + ", candidateId=" + this.b + Extension.C_BRAKE;
    }
}
