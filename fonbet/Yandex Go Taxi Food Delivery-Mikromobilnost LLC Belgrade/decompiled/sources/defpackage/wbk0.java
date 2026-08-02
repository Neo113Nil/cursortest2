package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wbk0 {
    public final String a;
    public final RideCardPresentationType b;

    public wbk0(RideCardPresentationType rideCardPresentationType, String str) {
        this.a = str;
        this.b = rideCardPresentationType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbk0)) {
            return false;
        }
        wbk0 wbk0Var = (wbk0) obj;
        return this.a.equals(wbk0Var.a) && this.b == wbk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReportRecord(analyticsId=" + this.a + ", presentation=" + this.b + Extension.C_BRAKE;
    }
}
