package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class x41 implements a51 {
    public final s9e a;

    public x41(s9e s9eVar) {
        this.a = s9eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x41) && jl40.l(this.a, ((x41) obj).a);
    }

    public final int hashCode() {
        s9e s9eVar = this.a;
        if (s9eVar == null) {
            return 0;
        }
        return s9eVar.hashCode();
    }

    public final String toString() {
        return "Contact(contact=" + this.a + Extension.C_BRAKE;
    }
}
