package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.domain.ResponseLoadingState;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;

/* loaded from: classes6.dex */
public final class tj40 {
    public final MtVehiclesResponse a;
    public final ResponseLoadingState b;
    public final rj40 c;

    public tj40(MtVehiclesResponse mtVehiclesResponse, ResponseLoadingState responseLoadingState, rj40 rj40Var) {
        this.a = mtVehiclesResponse;
        this.b = responseLoadingState;
        this.c = rj40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj40)) {
            return false;
        }
        tj40 tj40Var = (tj40) obj;
        return jl40.l(this.a, tj40Var.a) && this.b == tj40Var.b && jl40.l(this.c, tj40Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        rj40 rj40Var = this.c;
        return hashCode + (rj40Var == null ? 0 : rj40Var.a.hashCode());
    }

    public final String toString() {
        return "MtVehiclesInfoDto(response=" + this.a + ", responseLoadingState=" + this.b + ", error=" + this.c + Extension.C_BRAKE;
    }
}
