package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vlb implements zlb {
    public final nkb a;

    public vlb(nkb nkbVar) {
        this.a = nkbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlb) && jl40.l(this.a, ((vlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Init(parameter=" + this.a + Extension.C_BRAKE;
    }
}
