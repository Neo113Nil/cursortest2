package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ylu0 extends zlu0 {
    public final rr51 c;
    public final int d;
    public final ColorModel e;
    public final String f;

    public ylu0(rr51 rr51Var, int i, ColorModel colorModel, String str) {
        super(i, colorModel);
        this.c = rr51Var;
        this.d = i;
        this.e = colorModel;
        this.f = str;
    }

    @Override // defpackage.zlu0
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylu0)) {
            return false;
        }
        ylu0 ylu0Var = (ylu0) obj;
        return jl40.l(this.c, ylu0Var.c) && this.d == ylu0Var.d && jl40.l(this.e, ylu0Var.e) && jl40.l(this.f, ylu0Var.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, this.c.hashCode() * 31, 31);
        ColorModel colorModel = this.e;
        return this.f.hashCode() + ((b + (colorModel == null ? 0 : colorModel.hashCode())) * 31);
    }

    public final String toString() {
        return "DivKitStory(divData=" + this.c + ", maxProgressValueMs=" + this.d + ", backgroundColorModel=" + this.e + ", id=" + this.f + Extension.C_BRAKE;
    }
}
