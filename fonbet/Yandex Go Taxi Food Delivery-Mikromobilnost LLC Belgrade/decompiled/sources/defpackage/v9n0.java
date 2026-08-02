package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;

/* loaded from: classes6.dex */
public final class v9n0 {
    public final String a;
    public final long b;
    public final long c;
    public final ScootersVehicleDetectionOnPhotoExperiment.ResizeMode d;

    public v9n0(String str, long j, long j2, ScootersVehicleDetectionOnPhotoExperiment.ResizeMode resizeMode) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = resizeMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9n0)) {
            return false;
        }
        v9n0 v9n0Var = (v9n0) obj;
        return jl40.l(this.a, v9n0Var.a) && this.b == v9n0Var.b && this.c == v9n0Var.c && this.d == v9n0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + qv10.c(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ClassifierSessionKey(modelFilePath=", this.a, ", modelFileLength=", this.b);
        x4e.A(this.c, ", modelFileLastModified=", ", resizeMode=", l);
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
