package defpackage;

import com.yandex.go.address.models.Address;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vy0 implements kz0 {
    public final Address a;

    public vy0(Address address) {
        this.a = address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy0) && jl40.l(this.a, ((vy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlertDismissedWithMoveTo(address=" + this.a + Extension.C_BRAKE;
    }
}
