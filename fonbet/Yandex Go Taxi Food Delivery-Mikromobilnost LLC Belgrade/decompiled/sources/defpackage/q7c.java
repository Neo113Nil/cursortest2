package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class q7c extends s7c {
    public final int a;
    public final ArrayList b;
    public final ArrayList c;

    public q7c(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7c)) {
            return false;
        }
        q7c q7cVar = (q7c) obj;
        return this.a == q7cVar.a && this.b.equals(q7cVar.b) && this.c.equals(q7cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperCluster(count=");
        sb.append(this.a);
        sb.append(", clusters=");
        sb.append(this.b);
        sb.append(", childPoints=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
