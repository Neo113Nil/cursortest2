package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r6q0 {
    public final rr51 a;
    public final rr51 b;
    public final List c;

    public r6q0(rr51 rr51Var, rr51 rr51Var2, List list) {
        this.a = rr51Var;
        this.b = rr51Var2;
        this.c = list;
    }

    public static r6q0 a(r6q0 r6q0Var, List list) {
        rr51 rr51Var = r6q0Var.a;
        rr51 rr51Var2 = r6q0Var.b;
        r6q0Var.getClass();
        return new r6q0(rr51Var, rr51Var2, list);
    }

    public final ArrayList b() {
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ycc.r(((jg6) it.next()).c, arrayList);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6q0)) {
            return false;
        }
        r6q0 r6q0Var = (r6q0) obj;
        return jl40.l(this.a, r6q0Var.a) && jl40.l(this.b, r6q0Var.b) && this.c.equals(r6q0Var.c);
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int hashCode = (rr51Var == null ? 0 : rr51Var.hashCode()) * 31;
        rr51 rr51Var2 = this.b;
        return this.c.hashCode() + ((hashCode + (rr51Var2 != null ? rr51Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionsSheetPayloadEntity(emptyStateDiv=");
        sb.append(this.a);
        sb.append(", headerWidgetDiv=");
        sb.append(this.b);
        sb.append(", sections=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
