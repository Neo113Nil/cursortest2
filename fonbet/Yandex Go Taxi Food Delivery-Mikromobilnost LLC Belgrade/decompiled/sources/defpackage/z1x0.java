package defpackage;

import com.ybsdk.core.common.utils.theme.ThemedBooleanParams;
import com.ybsdk.core.design.theme.ThemedParams;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class z1x0 {
    public static final ColorModel.Attr c = new ColorModel.Attr(ung0.ybColor_background_primary);
    public static final ColorModel.Attr d = new ColorModel.Attr(ung0.ybColor_background_primary);
    public static final ColorModel.Attr e = new ColorModel.Attr(ung0.ybColor_internal_transparent);
    public final ColorModel a;
    public final ThemedParams b;

    public z1x0(ColorModel colorModel, ThemedParams themedParams) {
        this.a = colorModel;
        this.b = themedParams;
    }

    public static z1x0 a(z1x0 z1x0Var, ThemedBooleanParams themedBooleanParams) {
        ColorModel colorModel = z1x0Var.a;
        z1x0Var.getClass();
        return new z1x0(colorModel, themedBooleanParams);
    }

    public final ColorModel b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1x0)) {
            return false;
        }
        z1x0 z1x0Var = (z1x0) obj;
        return jl40.l(this.a, z1x0Var.a) && jl40.l(this.b, z1x0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ThemedParams themedParams = this.b;
        return hashCode + (themedParams == null ? 0 : themedParams.hashCode());
    }

    public final String toString() {
        return "SystemBarColors(backgroundColor=" + this.a + ", areIconsLight=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ z1x0(ColorModel colorModel) {
        this(colorModel, null);
    }
}
