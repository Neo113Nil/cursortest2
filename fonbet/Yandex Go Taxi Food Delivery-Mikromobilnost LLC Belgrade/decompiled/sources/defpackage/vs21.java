package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vs21 extends ws21 {
    public final List a;

    static {
        int i = us21.g;
    }

    public vs21(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vs21) && jl40.l(this.a, ((vs21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("UserRequirements(data=", Extension.C_BRAKE, this.a);
    }
}
