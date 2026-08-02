package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rd3 implements sd3 {
    public final bdc a;
    public final wp2 b;

    public rd3(bdc bdcVar, AppColor$Palette appColor$Palette) {
        this.a = bdcVar;
        this.b = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd3)) {
            return false;
        }
        rd3 rd3Var = (rd3) obj;
        return this.a.equals(rd3Var.a) && jl40.l(this.b, rd3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Solid(color=" + this.a + ", appColor=" + this.b + Extension.C_BRAKE;
    }
}
