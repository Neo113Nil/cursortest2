package defpackage;

import com.yandex.go.vault.domain.prize.ActionButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x231 {
    public final ActionButtonType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public x231(ActionButtonType actionButtonType, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = actionButtonType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x231)) {
            return false;
        }
        x231 x231Var = (x231) obj;
        return this.a == x231Var.a && jl40.l(this.b, x231Var.b) && jl40.l(this.c, x231Var.c) && jl40.l(this.d, x231Var.d) && jl40.l(this.e, x231Var.e) && jl40.l(this.f, x231Var.f) && this.g == x231Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return Boolean.hashCode(this.g) + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VaultActionButton(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", textToCopy=");
        g8e.D(sb, this.c, ", inactiveTitle=", this.d, ", subtitle=");
        g8e.D(sb, this.e, ", deeplink=", this.f, ", enabled=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
