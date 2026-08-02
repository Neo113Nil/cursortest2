package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class spr0 {
    public final String a;
    public final boolean b;

    public spr0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final List a() {
        return scc.g(this.a, Boolean.valueOf(this.b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof spr0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return ykb1.a(a(), ((spr0) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return xvz.k("SharedPreferencesPigeonOptions(fileName=", this.a, ", useDataStore=", this.b, Extension.C_BRAKE);
    }
}
