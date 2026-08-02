package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vge {
    public final String a;
    public final String b;
    public final v4v c;
    public final v4v d;

    public vge(String str, String str2, ra90 ra90Var, ra90 ra90Var2) {
        this.a = str;
        this.b = str2;
        this.c = ra90Var;
        this.d = ra90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vge)) {
            return false;
        }
        vge vgeVar = (vge) obj;
        return jl40.l(this.a, vgeVar.a) && jl40.l(this.b, vgeVar.b) && jl40.l(this.c, vgeVar.c) && jl40.l(this.d, vgeVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v4v v4vVar = this.c;
        int hashCode3 = (hashCode2 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        v4v v4vVar2 = this.d;
        return hashCode3 + (v4vVar2 != null ? v4vVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ContentItemState(title=", this.a, ", subtitle=", this.b, ", leadIcon=");
        v.append(this.c);
        v.append(", trailIcon=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
