package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yv6 {
    public final List a;

    public yv6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv6) && jl40.l(this.a, ((yv6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("BusTariffUiState(title=null, items=", Extension.C_BRAKE, this.a);
    }

    public yv6() {
        this(EmptyList.a);
    }
}
