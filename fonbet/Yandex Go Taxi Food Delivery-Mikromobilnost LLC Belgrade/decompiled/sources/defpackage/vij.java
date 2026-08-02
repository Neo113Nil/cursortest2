package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vij {
    public final ColorModel a;
    public final ColorModel b;
    public final Text c;
    public final Text d;
    public final boolean e;

    public vij(ColorModel colorModel, ColorModel colorModel2, Text.Constant constant, Text.Constant constant2, boolean z) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = constant;
        this.d = constant2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vij)) {
            return false;
        }
        vij vijVar = (vij) obj;
        return jl40.l(this.a, vijVar.a) && jl40.l(this.b, vijVar.b) && jl40.l(this.c, vijVar.c) && jl40.l(this.d, vijVar.d) && this.e == vijVar.e;
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
        ColorModel colorModel2 = this.b;
        int hashCode2 = (hashCode + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        Text text = this.c;
        int hashCode3 = (hashCode2 + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (text2 != null ? text2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiffRateDayStyleEntity(color=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", tooltipTitle=");
        ly3.C(sb, this.c, ", tooltipSubtitle=", this.d, ", diffRateStatus=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
