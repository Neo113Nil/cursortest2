package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yqj0 {
    public final Text a;
    public final Text b;
    public final boolean c;

    public yqj0(Text text, Text text2, boolean z) {
        this.a = text;
        this.b = text2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqj0)) {
            return false;
        }
        yqj0 yqj0Var = (yqj0) obj;
        return this.a.equals(yqj0Var.a) && this.b.equals(yqj0Var.b) && this.c == yqj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + n.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return x4e.i(n.p("RequisiteViewState(value=", this.a, ", hint=", this.b, ", isLoading="), this.c, Extension.C_BRAKE);
    }
}
