package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z4v0 {
    public final Text.Constant a;
    public final String b;

    public z4v0(Text.Constant constant, String str) {
        this.a = constant;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4v0)) {
            return false;
        }
        z4v0 z4v0Var = (z4v0) obj;
        return this.a.equals(z4v0Var.a) && jl40.l(this.b, z4v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SuggestEntity(text=" + this.a + ", amount=" + this.b + Extension.C_BRAKE;
    }
}
