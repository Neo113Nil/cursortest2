package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uos {
    public final int a;
    public final Text.Constant b;
    public final Text.Constant c;

    public uos(int i, Text.Constant constant, Text.Constant constant2) {
        this.a = i;
        this.b = constant;
        this.c = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uos)) {
            return false;
        }
        uos uosVar = (uos) obj;
        return this.a == uosVar.a && this.b.equals(uosVar.b) && this.c.equals(uosVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvz.d(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "FundOpenLimitsDataEntity(minLimit=" + this.a + ", minLimitText=" + this.b + ", notEnoughFundsText=" + this.c + Extension.C_BRAKE;
    }
}
