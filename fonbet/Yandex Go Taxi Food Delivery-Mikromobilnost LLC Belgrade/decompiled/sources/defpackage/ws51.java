package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ws51 {
    public final long a;
    public final Text.Constant b;
    public final Text c;
    public final Text d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public ws51(long j, Text.Constant constant, Text.Constant constant2, Text text, String str, boolean z, boolean z2, String str2) {
        this.a = j;
        this.b = constant;
        this.c = constant2;
        this.d = text;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws51)) {
            return false;
        }
        ws51 ws51Var = (ws51) obj;
        return this.a == ws51Var.a && this.b.equals(ws51Var.b) && jl40.l(this.c, ws51Var.c) && this.d.equals(ws51Var.d) && jl40.l(this.e, ws51Var.e) && this.f == ws51Var.f && this.g == ws51Var.g && jl40.l(this.h, ws51Var.h);
    }

    public final int hashCode() {
        int d = xvz.d(this.b, Long.hashCode(this.a) * 31, 31);
        Text text = this.c;
        int c = n.c(this.d, (d + (text == null ? 0 : text.hashCode())) * 31, 31);
        String str = this.e;
        int e = unr0.e(unr0.e((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YbPassportUserInfo(uid=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", shortName=");
        sb.append(this.c);
        sb.append(", secondaryName=");
        sb.append(this.d);
        uw51.x(", avatarUrl=", this.e, ", hasPlus=", sb, this.f);
        sb.append(", isAuthorized=");
        sb.append(this.g);
        sb.append(", email=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
