package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class w8m0 {
    public final double a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final Text.Constant d;

    public w8m0(double d, Text.Constant constant, Text.Constant constant2, Text.Constant constant3) {
        this.a = d;
        this.b = constant;
        this.c = constant2;
        this.d = constant3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8m0)) {
            return false;
        }
        w8m0 w8m0Var = (w8m0) obj;
        return Double.compare(this.a, w8m0Var.a) == 0 && this.b.equals(w8m0Var.b) && this.c.equals(w8m0Var.c) && this.d.equals(w8m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xvz.d(this.c, xvz.d(this.b, Double.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Point(amount=" + this.a + ", incomeText=" + this.b + ", description=" + this.c + ", dailyIncome=" + this.d + Extension.C_BRAKE;
    }
}
