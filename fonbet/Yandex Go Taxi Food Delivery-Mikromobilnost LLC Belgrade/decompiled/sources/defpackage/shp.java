package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class shp {
    public final nhp a;
    public final List b;

    public shp(nhp nhpVar, List list) {
        this.a = nhpVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shp)) {
            return false;
        }
        shp shpVar = (shp) obj;
        return jl40.l(this.a, shpVar.a) && jl40.l(this.b, shpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoriteRidesUiState(header=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
