package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ybm0 extends zbm0 {
    public final lur0 b;
    public final rbv c;
    public final Text d;
    public final Text e;
    public final MoneyEntity f;
    public final Text g;
    public final int h;
    public final Text i;
    public final ArrayList j;
    public final xbm0 k;
    public final int l;
    public final boolean m;
    public final rbv n;
    public final ColorModel o;
    public final boolean p;

    public ybm0(lur0 lur0Var, rbv rbvVar, Text text, Text text2, MoneyEntity moneyEntity, Text text3, int i, Text.Constant constant, ArrayList arrayList, xbm0 xbm0Var, int i2, boolean z, rbv rbvVar2, ColorModel colorModel, boolean z2) {
        super(lur0Var);
        this.b = lur0Var;
        this.c = rbvVar;
        this.d = text;
        this.e = text2;
        this.f = moneyEntity;
        this.g = text3;
        this.h = i;
        this.i = constant;
        this.j = arrayList;
        this.k = xbm0Var;
        this.l = i2;
        this.m = z;
        this.n = rbvVar2;
        this.o = colorModel;
        this.p = z2;
    }

    public final boolean b() {
        return this.m;
    }

    public final List c() {
        return this.j;
    }

    public final int d() {
        return this.l;
    }

    public final MoneyEntity e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybm0)) {
            return false;
        }
        ybm0 ybm0Var = (ybm0) obj;
        return this.b.equals(ybm0Var.b) && jl40.l(this.c, ybm0Var.c) && jl40.l(this.d, ybm0Var.d) && jl40.l(this.e, ybm0Var.e) && jl40.l(this.f, ybm0Var.f) && jl40.l(this.g, ybm0Var.g) && this.h == ybm0Var.h && jl40.l(this.i, ybm0Var.i) && this.j.equals(ybm0Var.j) && this.k.equals(ybm0Var.k) && this.l == ybm0Var.l && this.m == ybm0Var.m && jl40.l(this.n, ybm0Var.n) && jl40.l(this.o, ybm0Var.o) && this.p == ybm0Var.p;
    }

    public final Text f() {
        return this.g;
    }

    public final ColorModel g() {
        return this.o;
    }

    public final Text h() {
        return this.i;
    }

    public final int hashCode() {
        int c = n.c(this.d, ly3.c(this.c, this.b.hashCode() * 31, 31), 31);
        Text text = this.e;
        int hashCode = (c + (text == null ? 0 : text.hashCode())) * 31;
        MoneyEntity moneyEntity = this.f;
        int hashCode2 = (hashCode + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        Text text2 = this.g;
        int b = oyr.b(this.h, (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31, 31);
        Text text3 = this.i;
        int e = unr0.e(oyr.b(this.l, vfc.d(this.k.a, ly3.b((b + (text3 == null ? 0 : text3.hashCode())) * 31, 31, this.j), 31), 31), 31, this.m);
        rbv rbvVar = this.n;
        int hashCode3 = (e + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        ColorModel colorModel = this.o;
        return Boolean.hashCode(this.p) + ((hashCode3 + (colorModel != null ? colorModel.hashCode() : 0)) * 31);
    }

    public final int i() {
        return this.h;
    }

    public final rbv j() {
        return this.c;
    }

    public final Text k() {
        return this.e;
    }

    public final Text l() {
        return this.d;
    }

    public final boolean m() {
        return this.p;
    }

    public final rbv n() {
        return this.n;
    }

    public final xbm0 o() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(shimmerStatus=");
        sb.append(this.b);
        sb.append(", savingsLogo=");
        sb.append(this.c);
        sb.append(", savingsTitle=");
        ly3.C(sb, this.d, ", savingsNoAccountTitle=", this.e, ", savingsAmount=");
        sb.append(this.f);
        sb.append(", savingsDescription=");
        sb.append(this.g);
        sb.append(", savingsDescriptionStyle=");
        sb.append(this.h);
        sb.append(", savingsDescriptionBalance=");
        sb.append(this.i);
        sb.append(", items=");
        sb.append(this.j);
        sb.append(", theme=");
        sb.append(this.k);
        sb.append(", numberOfNonCellsItems=");
        tse0.z(sb, this.l, ", canShowBalanceAnimation=", this.m, ", supportImageModel=");
        sb.append(this.n);
        sb.append(", savingsDescriptionBackgroundColor=");
        sb.append(this.o);
        sb.append(", shouldShowDragAndDropOnboarding=");
        return x4e.i(sb, this.p, Extension.C_BRAKE);
    }
}
