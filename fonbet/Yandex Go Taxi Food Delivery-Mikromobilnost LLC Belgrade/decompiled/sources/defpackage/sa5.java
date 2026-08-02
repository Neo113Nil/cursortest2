package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sa5 extends vb5 {
    public final boolean a;

    public sa5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa5) && this.a == ((sa5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ViewState(textIsCollapsed=", Extension.C_BRAKE, this.a);
    }

    public sa5() {
        this(true);
    }
}
