package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class rph implements vph {
    public final lsw a;

    public rph(lsw lswVar) {
        this.a = lswVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rph) && jl40.l(this.a, ((rph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenTypedDeeplinkOrigin(deeplink=" + this.a + Extension.C_BRAKE;
    }
}
