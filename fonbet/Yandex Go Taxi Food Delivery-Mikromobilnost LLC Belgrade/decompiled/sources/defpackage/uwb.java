package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uwb {
    public final ArrayList a;
    public final String b;

    public uwb(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwb)) {
            return false;
        }
        uwb uwbVar = (uwb) obj;
        return this.a.equals(uwbVar.a) && jl40.l(this.b, uwbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CityTourInfo(route=" + this.a + ", routeDescription=" + this.b + Extension.C_BRAKE;
    }
}
