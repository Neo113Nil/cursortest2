package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r4b0 extends t4b0 {
    public final String a;

    public r4b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4b0) && jl40.l(this.a, ((r4b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PersonalGoalTapped(id=", this.a, Extension.C_BRAKE);
    }
}
