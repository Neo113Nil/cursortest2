package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w4j extends x4j {
    public final List a;
    public final boolean b;

    public w4j(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4j)) {
            return false;
        }
        w4j w4jVar = (w4j) obj;
        return jl40.l(this.a, w4jVar.a) && this.b == w4jVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "RectButtons(buttons=", ", appearAnimationEnabled=", Extension.C_BRAKE, this.b);
    }
}
