package defpackage;

import com.yandex.go.scooters.offers.v2.data.model.ScootersBookState$Booking$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r2n0 implements a3n0 {
    public final ScootersBookState$Booking$Type a;

    public r2n0(ScootersBookState$Booking$Type scootersBookState$Booking$Type) {
        this.a = scootersBookState$Booking$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2n0) && this.a == ((r2n0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Booking(type=" + this.a + Extension.C_BRAKE;
    }
}
