package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tdj0 {
    public final pvi0 a;
    public final au2 b;
    public final wp2 c;

    public tdj0(pvi0 pvi0Var, au2 au2Var, AppColor$Palette appColor$Palette) {
        this.a = pvi0Var;
        this.b = au2Var;
        this.c = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdj0)) {
            return false;
        }
        tdj0 tdj0Var = (tdj0) obj;
        return this.a.equals(tdj0Var.a) && jl40.l(this.b, tdj0Var.b) && jl40.l(this.c, tdj0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        au2 au2Var = this.b;
        return this.c.hashCode() + ((hashCode + (au2Var == null ? 0 : au2Var.hashCode())) * 31);
    }

    public final String toString() {
        return "RequirementChipImageUiState(image=" + this.a + ", fallbackAppIcon=" + this.b + ", tintColor=" + this.c + Extension.C_BRAKE;
    }
}
