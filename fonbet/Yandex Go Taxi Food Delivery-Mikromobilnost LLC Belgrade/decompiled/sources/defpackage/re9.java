package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class re9 implements se9 {
    public final Text a;
    public final Text b;

    public re9(Text text, Text text2) {
        this.a = text;
        this.b = text2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re9)) {
            return false;
        }
        re9 re9Var = (re9) obj;
        return jl40.l(this.a, re9Var.a) && jl40.l(this.b, re9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(title=" + this.a + ", description=" + this.b + Extension.C_BRAKE;
    }
}
