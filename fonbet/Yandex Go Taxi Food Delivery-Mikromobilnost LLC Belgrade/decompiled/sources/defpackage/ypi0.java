package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ypi0 extends cqi0 {
    public final Text a;
    public final Text b;
    public final String c;
    public final YBProduct d;
    public final String e;
    public final Throwable f;

    public ypi0(Text text, Text text2, String str, YBProduct yBProduct, String str2, Throwable th) {
        this.a = text;
        this.b = text2;
        this.c = str;
        this.d = yBProduct;
        this.e = str2;
        this.f = th;
    }

    @Override // defpackage.eqi0
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypi0)) {
            return false;
        }
        ypi0 ypi0Var = (ypi0) obj;
        return jl40.l(this.a, ypi0Var.a) && jl40.l(this.b, ypi0Var.b) && jl40.l(this.c, ypi0Var.c) && this.d == ypi0Var.d && jl40.l(this.e, ypi0Var.e) && this.f.equals(ypi0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b((this.d.hashCode() + unr0.b(n.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder p = n.p("ProductOpening(title=", this.a, ", description=", this.b, ", applicationId=");
        p.append(this.c);
        p.append(", product=");
        p.append(this.d);
        p.append(", supportUrl=");
        p.append(this.e);
        p.append(", throwable=");
        p.append(this.f);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
