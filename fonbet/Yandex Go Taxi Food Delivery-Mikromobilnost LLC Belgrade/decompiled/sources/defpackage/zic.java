package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zic {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final boolean c;

    public zic(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zic)) {
            return false;
        }
        zic zicVar = (zic) obj;
        return this.a.equals(zicVar.a) && this.b.equals(zicVar.b) && this.c == zicVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CombinedInputState(inputs=");
        sb.append(this.a);
        sb.append(", references=");
        sb.append(this.b);
        sb.append(", referencesTimedOut=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
