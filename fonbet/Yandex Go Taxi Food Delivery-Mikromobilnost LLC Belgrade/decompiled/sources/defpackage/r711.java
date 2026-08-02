package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class r711 implements s711 {
    public final ge01 a;

    public r711(ge01 ge01Var) {
        this.a = ge01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r711) && jl40.l(this.a, ((r711) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenTickets(ticketsButton=" + this.a + Extension.C_BRAKE;
    }
}
