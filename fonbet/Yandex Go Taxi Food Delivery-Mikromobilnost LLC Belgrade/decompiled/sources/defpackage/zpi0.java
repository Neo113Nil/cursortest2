package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zpi0 extends cqi0 {
    public final Text a;
    public final Text b;
    public final String c;
    public final YBProduct d;
    public final String e;
    public final Throwable f;
    public final Themes g;
    public final List h;

    public zpi0(Text text, Text text2, String str, YBProduct yBProduct, String str2, Throwable th, Themes themes, List list) {
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = yBProduct;
        this.e = str2;
        this.f = th;
        this.g = themes;
        this.h = list;
    }

    @Override // defpackage.eqi0
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpi0)) {
            return false;
        }
        zpi0 zpi0Var = (zpi0) obj;
        return jl40.l(this.a, zpi0Var.a) && jl40.l(this.b, zpi0Var.b) && jl40.l(this.c, zpi0Var.c) && this.d == zpi0Var.d && jl40.l(this.e, zpi0Var.e) && this.f.equals(zpi0Var.f) && jl40.l(this.g, zpi0Var.g) && jl40.l(this.h, zpi0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + unr0.b((this.d.hashCode() + unr0.b(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31, this.e)) * 31;
        Themes themes = this.g;
        int hashCode2 = (hashCode + (themes == null ? 0 : themes.hashCode())) * 31;
        List list = this.h;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("Registration(title=", this.a, ", description=", this.b, ", applicationId=");
        p.append(this.c);
        p.append(", product=");
        p.append(this.d);
        p.append(", supportUrl=");
        p.append(this.e);
        p.append(", throwable=");
        p.append(this.f);
        p.append(", image=");
        p.append(this.g);
        p.append(", buttons=");
        p.append(this.h);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
