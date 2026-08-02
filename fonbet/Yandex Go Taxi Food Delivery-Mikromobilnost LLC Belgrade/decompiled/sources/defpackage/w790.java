package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w790 {
    public final List a;
    public final boolean b;
    public final boolean c;

    public w790(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w790)) {
            return false;
        }
        w790 w790Var = (w790) obj;
        return this.a.equals(w790Var.a) && this.b == w790Var.b && this.c == w790Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(page=");
        sb.append(this.a);
        sb.append(", hasPrev=");
        sb.append(this.b);
        sb.append(", hasNext=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
