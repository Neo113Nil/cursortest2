package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v7l {
    public final String a;
    public final String b;
    public final rr51 c;

    public v7l(rr51 rr51Var, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7l)) {
            return false;
        }
        v7l v7lVar = (v7l) obj;
        return jl40.l(this.a, v7lVar.a) && jl40.l(this.b, v7lVar.b) && jl40.l(this.c, v7lVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DivScreenEntity(title=", this.a, ", subtitle=", this.b, ", divData=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
