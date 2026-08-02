package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xa11 implements ya11 {
    public final String a;

    public xa11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xa11) && jl40.l(this.a, ((xa11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OnTransportTypeOptionClick(optionId=", this.a, Extension.C_BRAKE);
    }
}
