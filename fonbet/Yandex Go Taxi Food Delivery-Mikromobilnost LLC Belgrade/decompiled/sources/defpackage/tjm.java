package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tjm {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof tjm) {
            return jl40.l(this.a, ((tjm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DrivingBubbleState(text=", this.a, Extension.C_BRAKE);
    }
}
