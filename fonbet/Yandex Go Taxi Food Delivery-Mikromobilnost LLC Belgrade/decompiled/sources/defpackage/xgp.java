package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes5.dex */
public final class xgp {
    public static final wgp Companion = new wgp();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ xgp(int i, String str, String str2, String str3) {
        if (4 != (i & 4)) {
            qje.Z(i, 4, vgp.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgp)) {
            return false;
        }
        xgp xgpVar = (xgp) obj;
        return jl40.l(this.a, xgpVar.a) && jl40.l(this.b, xgpVar.b) && jl40.l(this.c, xgpVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("FavoriteRideRequest(id=", this.a, ", typeId=", this.b, ", name="), this.c, Extension.C_BRAKE);
    }

    public xgp(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
