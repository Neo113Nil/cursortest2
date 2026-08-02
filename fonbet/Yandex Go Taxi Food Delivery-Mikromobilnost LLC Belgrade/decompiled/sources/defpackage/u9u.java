package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u9u {
    public final pzt a;
    public final pzt b;

    public u9u(pzt pztVar, pzt pztVar2) {
        this.a = pztVar;
        this.b = pztVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9u)) {
            return false;
        }
        u9u u9uVar = (u9u) obj;
        return jl40.l(this.a, u9uVar.a) && jl40.l(this.b, u9uVar.b);
    }

    public final int hashCode() {
        pzt pztVar = this.a;
        int hashCode = (pztVar == null ? 0 : pztVar.hashCode()) * 31;
        pzt pztVar2 = this.b;
        return hashCode + (pztVar2 != null ? pztVar2.hashCode() : 0);
    }

    public final String toString() {
        return "HeaderGradientUiState(topGradient=" + this.a + ", bottomGradient=" + this.b + Extension.C_BRAKE;
    }
}
