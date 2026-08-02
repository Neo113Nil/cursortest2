package defpackage;

import com.yandex.go.scooters.photocontrol.api.ScootersExamStatus;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rkn0 {
    public final ScootersExamType a;
    public final ScootersExamStatus b;

    public rkn0(ScootersExamType scootersExamType, ScootersExamStatus scootersExamStatus) {
        this.a = scootersExamType;
        this.b = scootersExamStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkn0)) {
            return false;
        }
        rkn0 rkn0Var = (rkn0) obj;
        return this.a == rkn0Var.a && this.b == rkn0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ScootersExam(type=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
