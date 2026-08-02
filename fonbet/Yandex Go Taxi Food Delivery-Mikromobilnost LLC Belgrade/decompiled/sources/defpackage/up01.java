package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Transfer;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class up01 {
    public static final up01 e = new up01(null, null, null, null);
    public final Transfer a;
    public final Calendar b;
    public final String c;
    public final yo01 d;

    public up01(Transfer transfer, Calendar calendar, String str, yo01 yo01Var) {
        this.a = transfer;
        this.b = calendar;
        this.c = str;
        this.d = yo01Var;
    }

    public static up01 a(up01 up01Var, Transfer transfer, Calendar calendar, String str, yo01 yo01Var, int i) {
        if ((i & 1) != 0) {
            transfer = up01Var.a;
        }
        if ((i & 2) != 0) {
            calendar = up01Var.b;
        }
        up01Var.getClass();
        if ((i & 8) != 0) {
            str = up01Var.c;
        }
        if ((i & 16) != 0) {
            yo01Var = up01Var.d;
        }
        up01Var.getClass();
        return new up01(transfer, calendar, str, yo01Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up01)) {
            return false;
        }
        up01 up01Var = (up01) obj;
        return jl40.l(this.a, up01Var.a) && jl40.l(this.b, up01Var.b) && jl40.l(this.c, up01Var.c) && jl40.l(this.d, up01Var.d);
    }

    public final int hashCode() {
        Transfer transfer = this.a;
        int hashCode = (transfer == null ? 0 : transfer.hashCode()) * 31;
        Calendar calendar = this.b;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 961;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        yo01 yo01Var = this.d;
        return hashCode3 + (yo01Var != null ? yo01Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequirementData(preorderParamsState=" + this.a + ", expirationsTime=" + this.b + ", requirementTitle=null, requirementSubtitle=" + this.c + ", lastOptionCardState=" + this.d + Extension.C_BRAKE;
    }

    public up01() {
        this(null, null, null, null);
    }
}
