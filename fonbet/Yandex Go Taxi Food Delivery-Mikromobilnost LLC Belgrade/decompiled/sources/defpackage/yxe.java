package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yxe implements pre {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final hty0 d;
    public final o690 e;

    public yxe(String str, FormattedText formattedText, FormattedText formattedText2, hty0 hty0Var, o690 o690Var) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = hty0Var;
        this.e = o690Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxe)) {
            return false;
        }
        yxe yxeVar = (yxe) obj;
        return jl40.l(this.a, yxeVar.a) && this.b.equals(yxeVar.b) && this.c.equals(yxeVar.c) && this.d.equals(yxeVar.d) && jl40.l(this.e, yxeVar.e);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "cost-detail";
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a)) * 31;
        o690 o690Var = this.e;
        return hashCode + (o690Var == null ? 0 : o690Var.hashCode());
    }

    public final String toString() {
        return "CostDetailRemoteCoreWidget(id=" + this.a + ", leadText=" + this.b + ", trailText=" + this.c + ", dotStyle=" + this.d + ", paddings=" + this.e + Extension.C_BRAKE;
    }
}
