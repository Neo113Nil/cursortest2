package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class wf51 {
    public final String a;
    public final String b;
    public final vh51 c;
    public final String d;

    public wf51(String str, String str2, vh51 vh51Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = vh51Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf51)) {
            return false;
        }
        wf51 wf51Var = (wf51) obj;
        return jl40.l(this.a, wf51Var.a) && jl40.l(this.b, wf51Var.b) && this.c.equals(wf51Var.c) && jl40.l(this.d, wf51Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("YBPaymentMethodAction(title=", this.a, ", contentDescription=", this.b, ", screenIntent=");
        v.append(this.c);
        v.append(", deeplink=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
