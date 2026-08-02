package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wu70 extends pw21 {
    public final List f;

    public wu70(List list) {
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wu70) && this.f.equals(((wu70) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return tse0.k("LpOrderEditPayload(editOptions=", Extension.C_BRAKE, this.f);
    }
}
