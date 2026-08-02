package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zqj0 {
    public final String a;
    public final String b;
    public final Integer c;
    public final wls d;

    public zqj0(String str, String str2, Integer num, wls wlsVar) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = wlsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqj0)) {
            return false;
        }
        zqj0 zqj0Var = (zqj0) obj;
        return jl40.l(this.a, zqj0Var.a) && jl40.l(this.b, zqj0Var.b) && jl40.l(this.c, zqj0Var.c) && jl40.l(this.d, zqj0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return this.d.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("Requisites2faData(operationId=", this.a, ", cardId=", this.b, ", errorMessage=");
        v.append(this.c);
        v.append(", successCallback=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
