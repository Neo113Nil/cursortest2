package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qau {
    public final pvi0 a;
    public final Integer b;

    public qau(pvi0 pvi0Var, Integer num) {
        this.a = pvi0Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qau)) {
            return false;
        }
        qau qauVar = (qau) obj;
        return this.a.equals(qauVar.a) && jl40.l(this.b, qauVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "HeaderLeadUiState(remoteImage=" + this.a + ", fallbackRes=" + this.b + Extension.C_BRAKE;
    }
}
