package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class e2s {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public e2s(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
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
        if (obj instanceof e2s) {
            e2s e2sVar = (e2s) obj;
            String str = e2sVar.a;
            if (this.b == e2sVar.b && Intrinsics.d(this.c, e2sVar.c) && Intrinsics.d(this.d, e2sVar.d)) {
                String str2 = this.a;
                return c.v(str2, "index_", false) ? c.v(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k5r.d((((c.v(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return hlr.c(hlr.e("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + gdg.H(this.c) + "\n            |   orders = {" + gdg.G(this.d) + "\n            |}\n        "), "    ");
    }
}
