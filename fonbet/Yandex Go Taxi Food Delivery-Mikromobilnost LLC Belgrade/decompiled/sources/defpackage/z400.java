package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class z400 {
    public final List a;
    public final boolean b;

    public z400(List list, boolean z) {
        this.a = list;
        this.b = z;
        list.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z400)) {
            return false;
        }
        z400 z400Var = (z400) obj;
        return this.a.equals(z400Var.a) && this.b == z400Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "Content(folders=", ", hasChanges=", Extension.C_BRAKE, this.b);
    }
}
