package defpackage;

import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class r8c {
    public final ClusterizedPlacemarkCollection a;
    public final LinkedHashMap b;
    public final z7c c;
    public final ep00 d;

    public r8c(ClusterizedPlacemarkCollection clusterizedPlacemarkCollection, LinkedHashMap linkedHashMap, z7c z7cVar, ep00 ep00Var) {
        this.a = clusterizedPlacemarkCollection;
        this.b = linkedHashMap;
        this.c = z7cVar;
        this.d = ep00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8c) {
            r8c r8cVar = (r8c) obj;
            return this.a.equals(r8cVar.a) && this.b.equals(r8cVar.b) && this.c == r8cVar.c && this.d == r8cVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClusterizedPlacemarkCollectionHolder(collection=" + this.a + ", clusterAppearances=" + this.b + ", listener=" + this.c + ", tapListener=" + this.d + Extension.C_BRAKE;
    }
}
