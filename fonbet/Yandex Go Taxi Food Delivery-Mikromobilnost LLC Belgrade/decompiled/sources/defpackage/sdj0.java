package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sdj0 {
    public final au2 a;
    public final wp2 b;
    public final iej0 c;
    public final String d;
    public final String e;

    public sdj0(au2 au2Var, AppColor$Palette appColor$Palette, iej0 iej0Var, String str, String str2) {
        this.a = au2Var;
        this.b = appColor$Palette;
        this.c = iej0Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sdj0) {
            sdj0 sdj0Var = (sdj0) obj;
            if (this.a == sdj0Var.a && jl40.l(this.b, sdj0Var.b) && jl40.l(this.c, sdj0Var.c) && jl40.l(this.d, sdj0Var.d) && jl40.l(this.e, sdj0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int b = n.b(this.b, this.a.hashCode() * 31, 31);
        iej0 iej0Var = this.c;
        int b2 = unr0.b((b + (iej0Var == null ? 0 : iej0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return b2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequirementChipButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", appIconTintColor=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", contentDescription=");
        sb.append(this.d);
        sb.append(", clickActionLabel=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
