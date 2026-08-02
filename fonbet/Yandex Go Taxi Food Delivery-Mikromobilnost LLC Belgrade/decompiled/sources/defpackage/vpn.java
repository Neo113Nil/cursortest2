package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vpn {
    public final String a;
    public final String b;

    public vpn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpn)) {
            return false;
        }
        vpn vpnVar = (vpn) obj;
        return jl40.l(this.a, vpnVar.a) && jl40.l(this.b, vpnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShowNotification(messageSource=", this.a, ", messageDestination=", this.b, Extension.C_BRAKE);
    }
}
