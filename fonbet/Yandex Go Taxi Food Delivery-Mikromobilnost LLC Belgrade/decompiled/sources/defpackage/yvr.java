package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yvr {
    public final String a;
    public final Set b;
    public final Set c;

    public yvr(String str, Set set, Set set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvr)) {
            return false;
        }
        yvr yvrVar = (yvr) obj;
        return jl40.l(this.a, yvrVar.a) && this.b.equals(yvrVar.b) && this.c.equals(yvrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g8e.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderChatFilter(filterId=");
        sb.append(this.a);
        sb.append(", allowedChatTypes=");
        sb.append(this.b);
        sb.append(", allowedNamespaces=");
        return vfc.q(sb, this.c, Extension.C_BRAKE);
    }
}
