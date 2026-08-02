package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sbw {
    public final String a;
    public final ArrayList b;

    public sbw(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbw)) {
            return false;
        }
        sbw sbwVar = (sbw) obj;
        return jl40.l(this.a, sbwVar.a) && this.b.equals(sbwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("IntercityDashboardCommentSuggestsModalUiState(title=", this.a, ", suggests=", Extension.C_BRAKE, this.b);
    }
}
