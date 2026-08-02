package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class usq {
    public final String a;
    public final String b;

    public usq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usq)) {
            return false;
        }
        usq usqVar = (usq) obj;
        return jl40.l(this.a, usqVar.a) && jl40.l(this.b, usqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FeedbackIconModel(activeIconUrl=", this.a, ", inactiveIconUrl=", this.b, Extension.C_BRAKE);
    }
}
