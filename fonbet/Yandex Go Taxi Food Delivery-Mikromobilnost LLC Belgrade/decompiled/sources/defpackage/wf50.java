package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wf50 implements xf50 {
    public final boolean a;
    public final Address b;

    public wf50(Address address, int i) {
        address = (i & 2) != 0 ? null : address;
        this.a = true;
        this.b = address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf50)) {
            return false;
        }
        wf50 wf50Var = (wf50) obj;
        return this.a == wf50Var.a && jl40.l(this.b, wf50Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Address address = this.b;
        return hashCode + (address == null ? 0 : address.hashCode());
    }

    public final String toString() {
        return "FullScreenDestinationMode(isFullscreen=" + this.a + ", initialAddress=" + this.b + Extension.C_BRAKE;
    }

    public wf50() {
        this(null, 3);
    }
}
