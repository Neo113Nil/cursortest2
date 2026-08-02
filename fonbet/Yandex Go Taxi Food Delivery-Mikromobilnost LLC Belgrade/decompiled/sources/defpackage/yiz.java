package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yiz {
    public final Long a;
    public final Long b;
    public final ArrayList c;

    public yiz(Long l, Long l2, ArrayList arrayList) {
        this.a = l;
        this.b = l2;
        this.c = arrayList;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yiz)) {
            return false;
        }
        yiz yizVar = (yiz) obj;
        return jl40.l(this.a, yizVar.a) && jl40.l(this.b, yizVar.b) && this.c.equals(yizVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return this.c.hashCode() + ((hashCode + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformerSearch(startTime=");
        sb.append(this.a);
        sb.append(", estimateMs=");
        sb.append(this.b);
        sb.append(", statuses=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
