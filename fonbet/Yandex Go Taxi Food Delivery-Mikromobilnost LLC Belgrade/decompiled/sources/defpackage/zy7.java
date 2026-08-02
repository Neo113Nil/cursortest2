package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zy7 {
    public final String a;
    public final boolean b;
    public final ovi0 c;
    public final String d;
    public final wp2 e;
    public final wp2 f;
    public final ry7 g;

    public zy7(String str, boolean z, ovi0 ovi0Var, String str2, AppColor$Palette appColor$Palette, AppColor$Palette appColor$Palette2, ry7 ry7Var) {
        this.a = str;
        this.b = z;
        this.c = ovi0Var;
        this.d = str2;
        this.e = appColor$Palette;
        this.f = appColor$Palette2;
        this.g = ry7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy7)) {
            return false;
        }
        zy7 zy7Var = (zy7) obj;
        return jl40.l(this.a, zy7Var.a) && this.b == zy7Var.b && jl40.l(this.c, zy7Var.c) && jl40.l(this.d, zy7Var.d) && jl40.l(this.e, zy7Var.e) && jl40.l(this.f, zy7Var.f) && this.g.equals(zy7Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        ovi0 ovi0Var = this.c;
        int hashCode = (e + (ovi0Var == null ? 0 : ovi0Var.hashCode())) * 31;
        String str = this.d;
        return this.g.hashCode() + n.b(this.f, n.b(this.e, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CancelReason(id=", this.a, ", isSelected=", ", icon=", this.b);
        l.append(this.c);
        l.append(", title=");
        l.append(this.d);
        l.append(", titleColor=");
        l.append(this.e);
        l.append(", backgroundColor=");
        l.append(this.f);
        l.append(", action=");
        l.append(this.g);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
