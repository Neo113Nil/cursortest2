package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rh4 {
    public final ArrayList a;
    public final o690 b;

    public rh4(ArrayList arrayList, o690 o690Var) {
        this.a = arrayList;
        this.b = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh4)) {
            return false;
        }
        rh4 rh4Var = (rh4) obj;
        return this.a.equals(rh4Var.a) && jl40.l(this.b, rh4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o690 o690Var = this.b;
        return hashCode + (o690Var == null ? 0 : o690Var.hashCode());
    }

    public final String toString() {
        return "BackgroundModel(content=" + this.a + ", paddingsModel=" + this.b + Extension.C_BRAKE;
    }
}
