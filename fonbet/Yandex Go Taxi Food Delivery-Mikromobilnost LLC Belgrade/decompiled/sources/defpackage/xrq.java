package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xrq {
    public final String a;
    public final String b;

    public xrq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrq)) {
            return false;
        }
        xrq xrqVar = (xrq) obj;
        return jl40.l(this.a, xrqVar.a) && jl40.l(this.b, xrqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FeedbackCancellationReason(reasonId=", this.a, ", title=", this.b, Extension.C_BRAKE);
    }
}
