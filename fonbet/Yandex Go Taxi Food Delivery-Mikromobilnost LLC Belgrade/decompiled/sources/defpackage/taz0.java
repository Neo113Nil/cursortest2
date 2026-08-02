package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class taz0 extends cqb1 {
    public final String a;
    public final String b;

    public taz0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taz0)) {
            return false;
        }
        taz0 taz0Var = (taz0) obj;
        return jl40.l(this.a, taz0Var.a) && jl40.l(this.b, taz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShareTimelineDetailsActionModel(title=", this.a, ", sharingUrl=", this.b, Extension.C_BRAKE);
    }
}
