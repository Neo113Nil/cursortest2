package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.CellType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z9m0 extends aam0 {
    public final Text b;
    public final Text.Constant c;
    public final rbv d;
    public final ColorModel e;
    public final ColorModel f;
    public final ColorModel g;
    public final ColorModel h;
    public final String i;
    public final CellType j;
    public final ThemedImageUrlEntity k;

    public z9m0(Text text, Text.Constant constant, rbv rbvVar, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, String str, CellType cellType, ThemedImageUrlEntity themedImageUrlEntity) {
        super(cellType);
        this.b = text;
        this.c = constant;
        this.d = rbvVar;
        this.e = colorModel;
        this.f = colorModel2;
        this.g = colorModel3;
        this.h = colorModel4;
        this.i = str;
        this.j = cellType;
        this.k = themedImageUrlEntity;
    }

    @Override // defpackage.aam0
    public final String a() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof z9m0) {
                z9m0 z9m0Var = (z9m0) obj;
                if (jl40.l(this.b, z9m0Var.b) && this.c.equals(z9m0Var.c) && this.d.equals(z9m0Var.d) && this.e.equals(z9m0Var.e) && this.f.equals(z9m0Var.f) && this.g.equals(z9m0Var.g) && this.h.equals(z9m0Var.h)) {
                    String str = z9m0Var.i;
                    String str2 = this.i;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && this.j == z9m0Var.j && jl40.l(this.k, z9m0Var.k)) {
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
        int d = vfc.d(this.h, vfc.d(this.g, vfc.d(this.f, vfc.d(this.e, ly3.c(this.d, xvz.d(this.c, this.b.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        String str = this.i;
        int hashCode = (this.j.hashCode() + ((d + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.k;
        return hashCode + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
    }

    public final String toString() {
        String str = this.i;
        String a = str == null ? "null" : jr.a(str);
        StringBuilder sb = new StringBuilder("ImageState(titleText=");
        sb.append(this.b);
        sb.append(", imageText=");
        sb.append(this.c);
        sb.append(", cellImage=");
        sb.append(this.d);
        sb.append(", cardBackground=");
        sb.append(this.e);
        sb.append(", titleTextColor=");
        smw0.z(sb, this.f, ", subtitleTextColor=", this.g, ", imageTextColor=");
        sb.append(this.h);
        sb.append(", action=");
        sb.append(a);
        sb.append(", cellType=");
        sb.append(this.j);
        sb.append(", backgroundImageUrl=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
