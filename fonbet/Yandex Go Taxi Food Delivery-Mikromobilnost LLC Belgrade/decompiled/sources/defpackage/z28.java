package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class z28 {
    public final String a;

    public /* synthetic */ z28(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return oyr.p("CapabilityId(rawValue=", str, Extension.C_BRAKE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z28) {
            return jl40.l(this.a, ((z28) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
