package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class r5x0 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public r5x0(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        List list3 = list2;
        if (list3.isEmpty()) {
            int size = list.size();
            list3 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list3.add("ASC");
            }
        }
        this.d = (List) list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r5x0) {
            r5x0 r5x0Var = (r5x0) obj;
            String str = r5x0Var.a;
            if (this.b == r5x0Var.b && jl40.l(this.c, r5x0Var.c) && jl40.l(this.d, r5x0Var.d)) {
                String str2 = this.a;
                return cvu0.x(str2, "index_", false) ? cvu0.x(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + unr0.c((((cvu0.x(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return vuu0.b(vuu0.d("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + ikb1.f(this.c) + "\n            |   orders = {" + ikb1.e(this.d) + "\n            |}\n        "), Extension.TAB_CHAR);
    }
}
