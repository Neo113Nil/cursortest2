package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class x930 implements z930 {
    public final String a;

    public x930(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x930) && jl40.l(this.a, ((x930) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OnInputOtpCompleted(value=", this.a, Extension.C_BRAKE);
    }
}
