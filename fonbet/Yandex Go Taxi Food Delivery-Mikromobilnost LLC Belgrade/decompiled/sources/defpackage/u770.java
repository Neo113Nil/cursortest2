package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u770 {
    public final String a;

    public /* synthetic */ u770(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u770) {
            return jl40.l(this.a, ((u770) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenReason(value=", this.a, Extension.C_BRAKE);
    }
}
