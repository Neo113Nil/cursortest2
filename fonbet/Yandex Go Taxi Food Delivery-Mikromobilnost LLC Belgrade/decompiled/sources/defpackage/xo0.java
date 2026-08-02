package defpackage;

import java.util.Collections;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xo0 implements yo0 {
    public final String a;
    public final Set b;

    public xo0(String str) {
        this.a = str;
        this.b = Collections.singleton(str);
    }

    @Override // defpackage.yo0
    public final Set a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo0) && jl40.l(this.a, ((xo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SingleTariffSelection(tariff=", this.a, Extension.C_BRAKE);
    }
}
