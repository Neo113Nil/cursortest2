package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qrq {
    public final String a;
    public final String b;

    public qrq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrq)) {
            return false;
        }
        qrq qrqVar = (qrq) obj;
        return jl40.l(this.a, qrqVar.a) && jl40.l(this.b, qrqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FeedbackAnswerUiState(id=", this.a, ", text=", this.b, Extension.C_BRAKE);
    }
}
