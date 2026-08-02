package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class y871 implements zb71 {
    public final as71 a;
    public final List b;

    public y871(as71 as71Var, List list) {
        this.a = as71Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y871)) {
            return false;
        }
        y871 y871Var = (y871) obj;
        return jl40.l(this.a, y871Var.a) && jl40.l(this.b, y871Var.b);
    }

    public final int hashCode() {
        as71 as71Var = this.a;
        return this.b.hashCode() + ((as71Var == null ? 0 : as71Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.a + ", cpmFloors=" + this.b + Extension.C_BRAKE;
    }
}
