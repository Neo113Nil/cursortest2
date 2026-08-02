package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uij0 {
    public final nvi0 a;
    public final Integer b;
    public final wp2 c;

    public uij0(nvi0 nvi0Var, Integer num, AppColor$Palette appColor$Palette) {
        this.a = nvi0Var;
        this.b = num;
        this.c = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uij0)) {
            return false;
        }
        uij0 uij0Var = (uij0) obj;
        return this.a.equals(uij0Var.a) && jl40.l(this.b, uij0Var.b) && jl40.l(this.c, uij0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        wp2 wp2Var = this.c;
        return hashCode2 + (wp2Var != null ? wp2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ImageUiState(image=" + this.a + ", fallbackImageRes=" + this.b + ", tintColor=" + this.c + Extension.C_BRAKE;
    }
}
