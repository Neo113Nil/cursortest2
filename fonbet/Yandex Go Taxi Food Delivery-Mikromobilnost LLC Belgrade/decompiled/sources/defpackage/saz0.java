package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class saz0 {
    public final String a;

    public saz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof saz0) && jl40.l(this.a, ((saz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TimelineDetailsDoneButtonState(text=", this.a, Extension.C_BRAKE);
    }
}
