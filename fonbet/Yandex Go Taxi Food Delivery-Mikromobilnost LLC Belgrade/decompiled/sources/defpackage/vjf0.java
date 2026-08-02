package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vjf0 {
    public final ColorModel a;
    public final ColorModel b;

    public vjf0(ColorModel colorModel, ColorModel colorModel2) {
        this.a = colorModel;
        this.b = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjf0)) {
            return false;
        }
        vjf0 vjf0Var = (vjf0) obj;
        return jl40.l(this.a, vjf0Var.a) && jl40.l(this.b, vjf0Var.b);
    }

    public final int hashCode() {
        ColorModel colorModel = this.a;
        int hashCode = (colorModel == null ? 0 : colorModel.hashCode()) * 31;
        ColorModel colorModel2 = this.b;
        return hashCode + (colorModel2 != null ? colorModel2.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressStyleEntity(trackColor=" + this.a + ", indicatorColor=" + this.b + Extension.C_BRAKE;
    }
}
