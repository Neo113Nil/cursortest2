package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.geopayment.ble.MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;

/* loaded from: classes6.dex */
public final class sl30 extends yl30 {
    public static final sl30 d = new sl30(null, null, false);
    public static final sl30 e = new sl30(null, null, true);
    public final MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode a;
    public final String b;
    public final boolean c;

    public sl30(MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode, String str, boolean z) {
        this.a = mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl30)) {
            return false;
        }
        sl30 sl30Var = (sl30) obj;
        return this.a == sl30Var.a && jl40.l(this.b, sl30Var.b) && this.c == sl30Var.c;
    }

    public final int hashCode() {
        MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode = this.a;
        int hashCode = (mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode == null ? 0 : mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtGeoPaymentVehiclesErrorState(errorCode=");
        sb.append(this.a);
        sb.append(", errorMessage=");
        sb.append(this.b);
        sb.append(", isConnectionError=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
