package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y9m0 extends aam0 {
    public final Text b;
    public final Text c;
    public final Text d;
    public final rr51 e;
    public final Text f;
    public final MoneyEntity g;
    public final Text h;
    public final ColorModel i;
    public final ColorModel j;
    public final ColorModel k;
    public final ColorModel l;
    public final ColorModel m;
    public final ColorModel n;
    public final String o;
    public final CellType p;
    public final ThemedImageUrlEntity q;
    public final boolean r;
    public final ImageScaleTypeEntity s;
    public final ColorModel t;

    public y9m0(Text text, Text text2, Text text3, rr51 rr51Var, Text text4, MoneyEntity moneyEntity, Text text5, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, ColorModel colorModel6, String str, CellType cellType, ThemedImageUrlEntity themedImageUrlEntity, boolean z, ImageScaleTypeEntity imageScaleTypeEntity, ColorModel colorModel7) {
        super(cellType);
        this.b = text;
        this.c = text2;
        this.d = text3;
        this.e = rr51Var;
        this.f = text4;
        this.g = moneyEntity;
        this.h = text5;
        this.i = colorModel;
        this.j = colorModel2;
        this.k = colorModel3;
        this.l = colorModel4;
        this.m = colorModel5;
        this.n = colorModel6;
        this.o = str;
        this.p = cellType;
        this.q = themedImageUrlEntity;
        this.r = z;
        this.s = imageScaleTypeEntity;
        this.t = colorModel7;
    }

    @Override // defpackage.aam0
    public final String a() {
        return this.o;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof y9m0) {
                y9m0 y9m0Var = (y9m0) obj;
                if (jl40.l(this.b, y9m0Var.b) && jl40.l(this.c, y9m0Var.c) && jl40.l(this.d, y9m0Var.d) && jl40.l(this.e, y9m0Var.e) && jl40.l(this.f, y9m0Var.f) && jl40.l(this.g, y9m0Var.g) && jl40.l(this.h, y9m0Var.h) && this.i.equals(y9m0Var.i) && this.j.equals(y9m0Var.j) && this.k.equals(y9m0Var.k) && this.l.equals(y9m0Var.l) && this.m.equals(y9m0Var.m) && this.n.equals(y9m0Var.n)) {
                    String str = y9m0Var.o;
                    String str2 = this.o;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.p == y9m0Var.p && jl40.l(this.q, y9m0Var.q) && this.r == y9m0Var.r && this.s == y9m0Var.s && this.t.equals(y9m0Var.t)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = n.c(this.d, n.c(this.c, this.b.hashCode() * 31, 31), 31);
        rr51 rr51Var = this.e;
        int c2 = n.c(this.f, (c + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31, 31);
        MoneyEntity moneyEntity = this.g;
        int hashCode = (c2 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        Text text = this.h;
        int d = vfc.d(this.n, vfc.d(this.m, vfc.d(this.l, vfc.d(this.k, vfc.d(this.j, vfc.d(this.i, (hashCode + (text == null ? 0 : text.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.o;
        int hashCode2 = (this.p.hashCode() + ((d + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.q;
        return this.t.hashCode() + ((this.s.hashCode() + unr0.e((hashCode2 + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0)) * 31, 31, this.r)) * 31);
    }

    public final String toString() {
        String str = this.o;
        String a = str == null ? "null" : jr.a(str);
        StringBuilder p = n.p("BalanceState(balanceText=", this.b, ", interestText=", this.c, ", titleText=");
        p.append(this.d);
        p.append(", divSubtitle=");
        p.append(this.e);
        p.append(", subtitle=");
        p.append(this.f);
        p.append(", targetAmount=");
        p.append(this.g);
        p.append(", textUnderAmount=");
        p.append(this.h);
        p.append(", cardBackground=");
        p.append(this.i);
        p.append(", balanceColor=");
        smw0.z(p, this.j, ", interestTextColor=", this.k, ", interestBubbleColor=");
        smw0.z(p, this.l, ", titleTextColor=", this.m, ", subtitleTextColor=");
        p.append(this.n);
        p.append(", action=");
        p.append(a);
        p.append(", cellType=");
        p.append(this.p);
        p.append(", backgroundImageUrl=");
        p.append(this.q);
        p.append(", interestLocked=");
        p.append(this.r);
        p.append(", backgroundImageScaleType=");
        p.append(this.s);
        p.append(", descriptionTextColor=");
        return n.o(p, this.t, Extension.C_BRAKE);
    }
}
