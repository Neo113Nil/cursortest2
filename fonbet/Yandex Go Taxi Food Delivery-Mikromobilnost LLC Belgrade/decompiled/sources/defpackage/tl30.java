package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.ble.MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tl30 extends zl30 {
    public static final tl30 d = new tl30(null, null, false);
    public static final tl30 e = new tl30(null, null, true);
    public final MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode a;
    public final String b;
    public final boolean c;

    public tl30(MtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode, String str, boolean z) {
        this.a = mtGeoPaymentVehiclesState$MtGeoPaymentVehiclesErrorState$MtGeoPaymentVehiclesErrorCode;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl30)) {
            return false;
        }
        tl30 tl30Var = (tl30) obj;
        return this.a == tl30Var.a && jl40.l(this.b, tl30Var.b) && this.c == tl30Var.c;
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
