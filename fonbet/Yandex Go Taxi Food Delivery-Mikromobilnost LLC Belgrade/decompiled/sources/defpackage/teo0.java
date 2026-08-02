package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class teo0 implements ueo0 {
    public final String a;

    public /* synthetic */ teo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof teo0) {
            return jl40.l(this.a, ((teo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("SuperPasses(selectedId=", this.a, Extension.C_BRAKE);
    }
}
