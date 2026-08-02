package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.scooters.domain.model.ScootersInsuranceVersion;

/* loaded from: classes13.dex */
public final class ysn0 {
    public static final ysn0 e = new ysn0(ScootersInsuranceType.NO_INSURANCE, 100, 0, ScootersInsuranceVersion.V2);
    public final ScootersInsuranceType a;
    public final long b;
    public final long c;
    public final ScootersInsuranceVersion d;

    public ysn0(ScootersInsuranceType scootersInsuranceType, long j, long j2, ScootersInsuranceVersion scootersInsuranceVersion) {
        this.a = scootersInsuranceType;
        this.b = j;
        this.c = j2;
        this.d = scootersInsuranceVersion;
    }

    public final ScootersInsuranceType a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysn0)) {
            return false;
        }
        ysn0 ysn0Var = (ysn0) obj;
        return this.a == ysn0Var.a && this.b == ysn0Var.b && this.c == ysn0Var.c && this.d == ysn0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersInsurance(currentInsuranceType=");
        sb.append(this.a);
        sb.append(", priceForFullInsurance=");
        sb.append(this.b);
        x4e.A(this.c, ", priceForFullInsuranceCoverage=", ", insuranceVersion=", sb);
        sb.append(this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
