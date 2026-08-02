package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ycb0 implements zcb0 {
    public final Text.Constant a;
    public final ColorModel b;

    public ycb0(Text.Constant constant, ColorModel colorModel) {
        this.a = constant;
        this.b = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycb0)) {
            return false;
        }
        ycb0 ycb0Var = (ycb0) obj;
        return this.a.equals(ycb0Var.a) && jl40.l(this.b, ycb0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
    }

    public final String toString() {
        return "Plain(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
