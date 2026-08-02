package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class tpv {
    public static final spv Companion = new spv();
    public final String a;
    public final String b;

    public /* synthetic */ tpv(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, rpv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpv)) {
            return false;
        }
        tpv tpvVar = (tpv) obj;
        return jl40.l(this.a, tpvVar.a) && jl40.l(this.b, tpvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("IncomingCallNotification(title=", this.a, ", body=", this.b, Extension.C_BRAKE);
    }
}
