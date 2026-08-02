package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uo10 {
    public final rr51 a;
    public final String b;
    public final ColorModel c;
    public final rbv d;
    public final String e;
    public final rbv f;
    public final String g;
    public final String h;
    public final int i;

    public uo10(rr51 rr51Var, String str, ColorModel colorModel, rbv rbvVar, String str2, rbv rbvVar2, String str3, String str4, int i) {
        this.a = rr51Var;
        this.b = str;
        this.c = colorModel;
        this.d = rbvVar;
        this.e = str2;
        this.f = rbvVar2;
        this.g = str3;
        this.h = str4;
        this.i = i;
    }

    public final ColorModel a() {
        return this.c;
    }

    public final int b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo10)) {
            return false;
        }
        uo10 uo10Var = (uo10) obj;
        return jl40.l(this.a, uo10Var.a) && jl40.l(this.b, uo10Var.b) && jl40.l(this.c, uo10Var.c) && jl40.l(this.d, uo10Var.d) && jl40.l(this.e, uo10Var.e) && jl40.l(this.f, uo10Var.f) && jl40.l(this.g, uo10Var.g) && jl40.l(this.h, uo10Var.h) && this.i == uo10Var.i;
    }

    public final int hashCode() {
        rr51 rr51Var = this.a;
        int b = unr0.b((rr51Var == null ? 0 : rr51Var.hashCode()) * 31, 31, this.b);
        ColorModel colorModel = this.c;
        int hashCode = (b + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        rbv rbvVar = this.d;
        int b2 = unr0.b((hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31, 31, this.e);
        rbv rbvVar2 = this.f;
        int b3 = unr0.b((b2 + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31, 31, this.g);
        String str = this.h;
        return Integer.hashCode(this.i) + ((b3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(notifyDivData=");
        sb.append(this.a);
        sb.append(", bannerId=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", bannerImage=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", logo=");
        sb.append(this.f);
        sb.append(", title=");
        g8e.D(sb, this.g, ", subtitle=", this.h, ", duration=");
        return oyr.m(this.i, Extension.C_BRAKE, sb);
    }
}
