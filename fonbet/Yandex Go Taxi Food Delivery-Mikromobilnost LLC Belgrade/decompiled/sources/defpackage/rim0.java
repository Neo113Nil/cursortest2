package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rim0 {
    public final String a;

    public rim0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rim0) && jl40.l(this.a, ((rim0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SbpResendSmsTimeStamp(denyUntilTS=", this.a, Extension.C_BRAKE);
    }
}
