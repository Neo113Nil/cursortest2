package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sa3 extends ta3 {
    public final pa90 a;

    public sa3(pa90 pa90Var) {
        this.a = pa90Var;
    }

    @Override // defpackage.ta3
    public final pa90 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa3) && this.a.equals(((sa3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(painter=" + this.a + Extension.C_BRAKE;
    }
}
