package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ehe {
    public final rab a;
    public final lt b;
    public final List c;

    public ehe(rab rabVar, lt ltVar, ArrayList arrayList) {
        this.a = rabVar;
        this.b = ltVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehe)) {
            return false;
        }
        ehe eheVar = (ehe) obj;
        return Intrinsics.d(this.a, eheVar.a) && Intrinsics.d(this.b, eheVar.b) && Intrinsics.d(this.c, eheVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InStyleBlockItemUiData(uiData=");
        sb.append(this.a);
        sb.append(", albumDomainItem=");
        sb.append(this.b);
        sb.append(", artists=");
        return vz1.u(sb, this.c, ")");
    }
}
