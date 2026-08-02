package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class y681 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final us81 e;
    public final vh71 f;
    public final ArrayList g;

    public y681(String str, String str2, String str3, String str4, us81 us81Var, vh71 vh71Var, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = us81Var;
        this.f = vh71Var;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y681)) {
            return false;
        }
        y681 y681Var = (y681) obj;
        return jl40.l(this.a, y681Var.a) && jl40.l(this.b, y681Var.b) && jl40.l(this.c, y681Var.c) && jl40.l(this.d, y681Var.d) && jl40.l(this.e, y681Var.e) && jl40.l(this.f, y681Var.f) && jl40.l(this.g, y681Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        us81 us81Var = this.e;
        int hashCode5 = (hashCode4 + (us81Var == null ? 0 : us81Var.hashCode())) * 31;
        vh71 vh71Var = this.f;
        int hashCode6 = (hashCode5 + (vh71Var == null ? 0 : vh71Var.hashCode())) * 31;
        ArrayList arrayList = this.g;
        return hashCode6 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SmartCenterSettings(colorWizButton=", this.a, ", colorWizButtonText=", this.b, ", colorWizBack=");
        g8e.D(v, this.c, ", colorWizBackRight=", this.d, ", backgroundColors=");
        v.append(this.e);
        v.append(", smartCenter=");
        v.append(this.f);
        v.append(", smartCenters=");
        return b64.n(Extension.C_BRAKE, v, this.g);
    }
}
