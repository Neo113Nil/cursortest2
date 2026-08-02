package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vz6 {
    public final Text.Constant a;
    public final ColorModel b;
    public final String c;
    public final ColorModel d;

    public vz6(Text.Constant constant, ColorModel colorModel, String str, ColorModel colorModel2) {
        this.a = constant;
        this.b = colorModel;
        this.c = str;
        this.d = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz6)) {
            return false;
        }
        vz6 vz6Var = (vz6) obj;
        return this.a.equals(vz6Var.a) && jl40.l(this.b, vz6Var.b) && jl40.l(this.c, vz6Var.c) && jl40.l(this.d, vz6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        int b = unr0.b((hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31, this.c);
        ColorModel colorModel2 = this.d;
        return b + (colorModel2 != null ? colorModel2.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonEntity(text=" + this.a + ", textColor=" + this.b + ", action=" + this.c + ", backgroundColor=" + this.d + Extension.C_BRAKE;
    }
}
