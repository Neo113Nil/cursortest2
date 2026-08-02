package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zsi {
    public final List a;

    public zsi(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zsi) && jl40.l(this.a, ((zsi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DeliverySupportedRequirements(supportedRequirements=", Extension.C_BRAKE, this.a);
    }

    public zsi() {
        this(EmptyList.a);
    }
}
