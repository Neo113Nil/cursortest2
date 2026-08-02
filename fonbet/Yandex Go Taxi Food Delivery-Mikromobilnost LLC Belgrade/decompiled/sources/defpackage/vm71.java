package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vm71 implements o191 {
    public final d881 a;

    public vm71(d881 d881Var) {
        this.a = d881Var;
    }

    @Override // defpackage.o191
    public final boolean a(Context context) {
        return "divkit".equals(this.a.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm71) && jl40.l(this.a, ((vm71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.a + Extension.C_BRAKE;
    }
}
