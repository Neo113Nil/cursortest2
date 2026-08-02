package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ty7 implements wy7 {
    public final LinkedHashMap a;
    public final boolean b;

    public ty7(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty7)) {
            return false;
        }
        ty7 ty7Var = (ty7) obj;
        return this.a.equals(ty7Var.a) && this.b == ty7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentShown(groupsMap=" + this.a + ", commentFieldShown=" + this.b + Extension.C_BRAKE;
    }
}
