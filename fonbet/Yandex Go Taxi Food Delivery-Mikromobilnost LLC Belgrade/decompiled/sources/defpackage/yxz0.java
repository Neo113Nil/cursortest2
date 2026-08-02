package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yxz0 {
    public final rbv a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final Text.Constant d;

    public yxz0(rbv rbvVar, Text.Constant constant, Text.Constant constant2, Text.Constant constant3) {
        this.a = rbvVar;
        this.b = constant;
        this.c = constant2;
        this.d = constant3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxz0)) {
            return false;
        }
        yxz0 yxz0Var = (yxz0) obj;
        return this.a.equals(yxz0Var.a) && this.b.equals(yxz0Var.b) && this.c.equals(yxz0Var.c) && this.d.equals(yxz0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TopupNoticeSuccessDeprecatedViewState(image=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttonText=" + this.d + Extension.C_BRAKE;
    }
}
