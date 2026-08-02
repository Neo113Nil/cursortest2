package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xq implements fr {
    public final String a;
    public final String b;
    public final String c;
    public final k7v d;

    public xq(String str, String str2, String str3, k7v k7vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        return jl40.l(this.a, xqVar.a) && jl40.l(this.b, xqVar.b) && jl40.l(this.c, xqVar.c) && jl40.l(this.d, xqVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        k7v k7vVar = this.d;
        return b + (k7vVar != null ? k7vVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ShareAction(title=", this.a, ", subtitle=", this.b, ", content=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
