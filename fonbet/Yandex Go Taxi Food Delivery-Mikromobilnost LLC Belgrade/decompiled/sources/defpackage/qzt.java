package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qzt {
    public final List a;
    public final int b;

    public qzt(List list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzt)) {
            return false;
        }
        qzt qztVar = (qzt) obj;
        return this.a.equals(qztVar.a) && this.b == qztVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GradientViewState(colors=" + this.a + ", angle=" + this.b + Extension.C_BRAKE;
    }
}
