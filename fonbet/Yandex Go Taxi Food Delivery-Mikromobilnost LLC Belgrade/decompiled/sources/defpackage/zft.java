package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class zft implements ig5 {
    public static final yft Companion = new yft();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ zft(String str, String str2, String str3, String str4, int i, String str5) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, xft.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zft)) {
            return false;
        }
        zft zftVar = (zft) obj;
        return jl40.l(this.a, zftVar.a) && jl40.l(this.b, zftVar.b) && jl40.l(this.c, zftVar.c) && jl40.l(this.d, zftVar.d) && jl40.l(this.e, zftVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("GetViewCoordinatesBduiAction(viewId=", this.a, ", heightVariable=", this.b, ", widthVariable=");
        g8e.D(v, this.c, ", xVariable=", this.d, ", yVariable=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
