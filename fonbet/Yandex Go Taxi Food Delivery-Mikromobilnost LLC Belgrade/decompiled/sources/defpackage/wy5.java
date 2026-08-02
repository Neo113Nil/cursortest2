package defpackage;

import com.yandex.go.ble.connection.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wy5 implements xy5 {
    public final String a;
    public final a b;

    public wy5(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wy5) {
            wy5 wy5Var = (wy5) obj;
            return jl40.l(this.a, wy5Var.a) && this.b == wy5Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Established(serviceUuid=" + this.a + ", ble=" + this.b + Extension.C_BRAKE;
    }
}
