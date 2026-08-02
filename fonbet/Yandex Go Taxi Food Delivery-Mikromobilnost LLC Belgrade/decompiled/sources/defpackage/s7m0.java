package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s7m0 {
    public final String a;
    public final boolean b;
    public final ColorModel c;
    public final ThemedImageUrlEntity d;
    public final ColorModel e;
    public final ColorModel f;
    public final ColorModel g;
    public final ColorModel h;
    public final ColorModel i;
    public final ColorModel j;
    public final ColorModel k;
    public final ColorModel l;
    public final ColorModel m;
    public final ColorModel n;
    public final ColorModel o;
    public final ThemedImageUrlEntity p;

    public s7m0(String str, boolean z, ColorModel colorModel, ThemedImageUrlEntity themedImageUrlEntity, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, ColorModel colorModel6, ColorModel colorModel7, ColorModel colorModel8, ColorModel colorModel9, ColorModel colorModel10, ColorModel colorModel11, ColorModel colorModel12, ThemedImageUrlEntity themedImageUrlEntity2) {
        this.a = str;
        this.b = z;
        this.c = colorModel;
        this.d = themedImageUrlEntity;
        this.e = colorModel2;
        this.f = colorModel3;
        this.g = colorModel4;
        this.h = colorModel5;
        this.i = colorModel6;
        this.j = colorModel7;
        this.k = colorModel8;
        this.l = colorModel9;
        this.m = colorModel10;
        this.n = colorModel11;
        this.o = colorModel12;
        this.p = themedImageUrlEntity2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7m0)) {
            return false;
        }
        s7m0 s7m0Var = (s7m0) obj;
        return jl40.l(this.a, s7m0Var.a) && this.b == s7m0Var.b && this.c.equals(s7m0Var.c) && jl40.l(this.d, s7m0Var.d) && this.e.equals(s7m0Var.e) && jl40.l(this.f, s7m0Var.f) && this.g.equals(s7m0Var.g) && this.h.equals(s7m0Var.h) && jl40.l(this.i, s7m0Var.i) && this.j.equals(s7m0Var.j) && this.k.equals(s7m0Var.k) && this.l.equals(s7m0Var.l) && this.m.equals(s7m0Var.m) && this.n.equals(s7m0Var.n) && this.o.equals(s7m0Var.o) && jl40.l(this.p, s7m0Var.p);
    }

    public final int hashCode() {
        int d = vfc.d(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31);
        ThemedImageUrlEntity themedImageUrlEntity = this.d;
        int d2 = vfc.d(this.e, (d + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31, 31);
        ColorModel colorModel = this.f;
        int d3 = vfc.d(this.h, vfc.d(this.g, (d2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31), 31);
        ColorModel colorModel2 = this.i;
        int d4 = vfc.d(this.o, vfc.d(this.n, vfc.d(this.m, vfc.d(this.l, vfc.d(this.k, vfc.d(this.j, (d3 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        ThemedImageUrlEntity themedImageUrlEntity2 = this.p;
        return d4 + (themedImageUrlEntity2 != null ? themedImageUrlEntity2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("SavingsAccountThemeEntity(id=", this.a, ", selected=", ", backgroundColor=", this.b);
        l.append(this.c);
        l.append(", backgroundImage=");
        l.append(this.d);
        l.append(", firstButtonTextColor=");
        smw0.z(l, this.e, ", firstButtonSubtitleColor=", this.f, ", firstButtonBackgroundColor=");
        smw0.z(l, this.g, ", secondButtonTextColor=", this.h, ", secondButtonSubtitleColor=");
        smw0.z(l, this.i, ", secondButtonBackgroundColor=", this.j, ", balanceTextColor=");
        smw0.z(l, this.k, ", gainsTextColor=", this.l, ", gainsBackgroundColor=");
        smw0.z(l, this.m, ", gainsMonthBackgroundColor=", this.n, ", goalTextColor=");
        l.append(this.o);
        l.append(", themeSelectorBackgroundImage=");
        l.append(this.p);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
