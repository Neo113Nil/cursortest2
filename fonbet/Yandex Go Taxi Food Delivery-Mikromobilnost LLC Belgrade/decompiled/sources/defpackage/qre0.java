package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qre0 implements rre0 {
    public final wpe0 a;

    public qre0(wpe0 wpe0Var) {
        this.a = wpe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qre0) && this.a.equals(((qre0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TaxiMainScreenWithSuggest(preorder=" + this.a + Extension.C_BRAKE;
    }
}
