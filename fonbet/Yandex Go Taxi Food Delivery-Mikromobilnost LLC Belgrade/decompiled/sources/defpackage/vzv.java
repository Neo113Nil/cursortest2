package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vzv implements wzv {
    public final v2u a;
    public final k7z b;
    public final boolean c;
    public final Map d;

    public vzv(v2u v2uVar, k7z k7zVar, boolean z, Map map) {
        this.a = v2uVar;
        this.b = k7zVar;
        this.c = z;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzv)) {
            return false;
        }
        vzv vzvVar = (vzv) obj;
        return jl40.l(this.a, vzvVar.a) && jl40.l(this.b, vzvVar.b) && this.c == vzvVar.c && this.d.equals(vzvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Select(key=" + this.a + ", location=" + this.b + ", isGroupReferenceChecked=" + this.c + ", skipped=" + this.d + Extension.C_BRAKE;
    }
}
