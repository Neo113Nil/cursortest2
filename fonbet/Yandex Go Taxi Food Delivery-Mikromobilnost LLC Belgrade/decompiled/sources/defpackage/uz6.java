package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uz6 {
    public final Text.Constant a;
    public final String b;

    public uz6(Text.Constant constant, String str) {
        this.a = constant;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz6)) {
            return false;
        }
        uz6 uz6Var = (uz6) obj;
        return this.a.equals(uz6Var.a) && jl40.l(this.b, uz6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonEntity(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
