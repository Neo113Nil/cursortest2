package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class s3j {
    public final String a;
    public final String b;
    public final DriveState c;

    public s3j(String str, String str2, DriveState driveState) {
        this.a = str;
        this.b = str2;
        this.c = driveState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3j)) {
            return false;
        }
        s3j s3jVar = (s3j) obj;
        return jl40.l(this.a, s3jVar.a) && jl40.l(this.b, s3jVar.b) && this.c == s3jVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("DetailedPriceParams(orderId=", this.a, ", buttonTitle=", this.b, ", orderState=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
