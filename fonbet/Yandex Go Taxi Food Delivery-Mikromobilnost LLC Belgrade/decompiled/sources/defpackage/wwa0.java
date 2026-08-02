package defpackage;

import com.yandex.go.taxi.order.models.api.objects.DriverPictures;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wwa0 {
    public final String a;
    public final DriverPictures b;

    public wwa0(DriverPictures driverPictures, String str) {
        this.a = str;
        this.b = driverPictures;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwa0)) {
            return false;
        }
        wwa0 wwa0Var = (wwa0) obj;
        return jl40.l(this.a, wwa0Var.a) && jl40.l(this.b, wwa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PerformerInfo(performerTag=" + this.a + ", pictures=" + this.b + Extension.C_BRAKE;
    }
}
