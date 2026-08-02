package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rd31 implements ge31 {
    public final String a;

    public rd31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd31) && jl40.l(this.a, ((rd31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OnOnboardingShown(onboardingId=", this.a, Extension.C_BRAKE);
    }
}
