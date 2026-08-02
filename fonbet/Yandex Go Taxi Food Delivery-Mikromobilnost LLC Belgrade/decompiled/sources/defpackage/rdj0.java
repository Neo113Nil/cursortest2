package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class rdj0 {
    public final CharSequence a;
    public final wp2 b;

    public rdj0(CharSequence charSequence, AppColor$Palette appColor$Palette) {
        this.a = charSequence;
        this.b = appColor$Palette;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdj0)) {
            return false;
        }
        rdj0 rdj0Var = (rdj0) obj;
        return jl40.l(this.a, rdj0Var.a) && jl40.l(this.b, rdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequirementChipBodyUiState(title=" + ((Object) this.a) + ", titleColor=" + this.b + Extension.C_BRAKE;
    }
}
