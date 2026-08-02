package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sbc0 {
    public final List a;

    public sbc0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbc0) && jl40.l(this.a, ((sbc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("PlacesMapTabScreenUiState(mapCategoryFilters=", Extension.C_BRAKE, this.a);
    }
}
