package defpackage;

import io.flutter.plugins.sharedpreferences.StringListLookupResultType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class qtu0 {
    public final String a;
    public final StringListLookupResultType b;

    public qtu0(String str, StringListLookupResultType stringListLookupResultType) {
        this.a = str;
        this.b = stringListLookupResultType;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qtu0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        qtu0 qtu0Var = (qtu0) obj;
        return ykb1.a(scc.g(this.a, this.b), scc.g(qtu0Var.a, qtu0Var.b));
    }

    public final int hashCode() {
        return scc.g(this.a, this.b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
