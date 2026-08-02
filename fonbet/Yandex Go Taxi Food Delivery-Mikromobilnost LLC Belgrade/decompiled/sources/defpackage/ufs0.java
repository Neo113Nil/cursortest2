package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ufs0 {
    public final ColorModel a;
    public final ColorModel b;
    public final ColorModel c;
    public final ColorModel d;
    public final ColorModel e;
    public final ColorModel f;

    public ufs0(ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, ColorModel colorModel6) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = colorModel3;
        this.d = colorModel4;
        this.e = colorModel5;
        this.f = colorModel6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufs0)) {
            return false;
        }
        ufs0 ufs0Var = (ufs0) obj;
        return this.a.equals(ufs0Var.a) && this.b.equals(ufs0Var.b) && jl40.l(this.c, ufs0Var.c) && jl40.l(this.d, ufs0Var.d) && jl40.l(this.e, ufs0Var.e) && jl40.l(this.f, ufs0Var.f);
    }

    public final int hashCode() {
        int d = vfc.d(this.b, this.a.hashCode() * 31, 31);
        ColorModel colorModel = this.c;
        int hashCode = (d + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.d;
        int hashCode2 = (hashCode + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.e;
        int hashCode3 = (hashCode2 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        ColorModel colorModel4 = this.f;
        return hashCode3 + (colorModel4 != null ? colorModel4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Theme(backgroundColor=");
        sb.append(this.a);
        sb.append(", titleTextColor=");
        sb.append(this.b);
        sb.append(", descriptionTextColor=");
        smw0.z(sb, this.c, ", delimiterColor=", this.d, ", buttonBackgroundColor=");
        sb.append(this.e);
        sb.append(", buttonTextColor=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
