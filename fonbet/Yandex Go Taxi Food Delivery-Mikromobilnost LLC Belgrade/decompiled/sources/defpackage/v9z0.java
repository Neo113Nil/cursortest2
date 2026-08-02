package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v9z0 {
    public final String a;
    public final String b;
    public final r9z0 c;
    public final qfc d;

    public v9z0(String str, String str2, r9z0 r9z0Var, qfc qfcVar) {
        this.a = str;
        this.b = str2;
        this.c = r9z0Var;
        this.d = qfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9z0)) {
            return false;
        }
        v9z0 v9z0Var = (v9z0) obj;
        return jl40.l(this.a, v9z0Var.a) && jl40.l(this.b, v9z0Var.b) && jl40.l(this.c, v9z0Var.c) && jl40.l(this.d, v9z0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        r9z0 r9z0Var = this.c;
        int hashCode = (b + (r9z0Var == null ? 0 : r9z0Var.hashCode())) * 31;
        qfc qfcVar = this.d;
        return hashCode + (qfcVar != null ? qfcVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TimelineBubbleModel(leadIconTag=", this.a, ", title=", this.b, ", button=");
        v.append(this.c);
        v.append(", background=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
