package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class q5x0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public q5x0(String str, List list, String str2, List list2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5x0)) {
            return false;
        }
        q5x0 q5x0Var = (q5x0) obj;
        if (jl40.l(this.a, q5x0Var.a) && jl40.l(this.b, q5x0Var.b) && jl40.l(this.c, q5x0Var.c) && this.d.equals(q5x0Var.d)) {
            return this.e.equals(q5x0Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return vuu0.b(vuu0.d("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + ikb1.f(a.w0(this.d)) + "\n            |   referenceColumnNames = {" + ikb1.e(a.w0(this.e)) + "\n            |}\n        "), Extension.TAB_CHAR);
    }
}
