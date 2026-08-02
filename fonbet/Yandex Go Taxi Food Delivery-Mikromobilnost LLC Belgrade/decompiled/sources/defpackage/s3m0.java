package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s3m0 {
    public final Text.Resource a;
    public final Text b;
    public final Text c;

    public s3m0(Text.Resource resource, Text text, Text.Constant constant) {
        this.a = resource;
        this.b = text;
        this.c = constant;
    }

    public final Text a() {
        return this.b;
    }

    public final Text b() {
        return this.c;
    }

    public final Text c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3m0)) {
            return false;
        }
        s3m0 s3m0Var = (s3m0) obj;
        return this.a.equals(s3m0Var.a) && jl40.l(this.b, s3m0Var.b) && jl40.l(this.c, s3m0Var.c);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        return c + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "ProfitBlock(label=" + this.a + ", amount=" + this.b + ", description=" + this.c + Extension.C_BRAKE;
    }
}
