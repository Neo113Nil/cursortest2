package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zqp0 extends crp0 {
    public final String c;
    public final String d;

    public zqp0(String str, String str2) {
        super("UntrustedUri");
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqp0)) {
            return false;
        }
        zqp0 zqp0Var = (zqp0) obj;
        return this.c.equals(zqp0Var.c) && jl40.l(this.d, zqp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (((this.c.hashCode() * 31) + 488164043) * 961);
    }

    public final String toString() {
        return unr0.p("UntrustedUri(url=", this.c, ", message=Untrusted uri in deeplink, payload=null, deeplinkSource=", this.d, Extension.C_BRAKE);
    }
}
