package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.state.RideCardState$ProcessingStep;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class qnk0 {
    public final List a;
    public final RideCardState$ProcessingStep b;
    public final RideCardPresentationType c;
    public final DriveState d;
    public final vfk0 e;

    public qnk0(List list, RideCardState$ProcessingStep rideCardState$ProcessingStep, RideCardPresentationType rideCardPresentationType, DriveState driveState, vfk0 vfk0Var) {
        this.a = list;
        this.b = rideCardState$ProcessingStep;
        this.c = rideCardPresentationType;
        this.d = driveState;
        this.e = vfk0Var;
    }

    public static qnk0 a(qnk0 qnk0Var, ArrayList arrayList, RideCardState$ProcessingStep rideCardState$ProcessingStep, int i) {
        if ((i & 2) != 0) {
            rideCardState$ProcessingStep = qnk0Var.b;
        }
        RideCardPresentationType rideCardPresentationType = qnk0Var.c;
        DriveState driveState = qnk0Var.d;
        vfk0 vfk0Var = qnk0Var.e;
        qnk0Var.getClass();
        return new qnk0(arrayList, rideCardState$ProcessingStep, rideCardPresentationType, driveState, vfk0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnk0)) {
            return false;
        }
        qnk0 qnk0Var = (qnk0) obj;
        return this.a.equals(qnk0Var.a) && this.b == qnk0Var.b && this.c == qnk0Var.c && this.d == qnk0Var.d && jl40.l(this.e, qnk0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RideCardState(items=" + this.a + ", processingStep=" + this.b + ", presentation=" + this.c + ", driveState=" + this.d + ", dataSourceType=" + this.e + Extension.C_BRAKE;
    }
}
