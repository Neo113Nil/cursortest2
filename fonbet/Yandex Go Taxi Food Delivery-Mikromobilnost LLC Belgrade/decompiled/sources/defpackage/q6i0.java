package defpackage;

import com.ybsdk.widgets.common.rangedatepicker.SelectionMode;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q6i0 {
    public static final q6i0 e;
    public final Calendar a;
    public final SelectionMode b;
    public final Calendar c;
    public final Calendar d;

    static {
        SelectionMode selectionMode = SelectionMode.START_DATE;
        Calendar e2 = kdb1.e();
        e2.add(2, -11);
        e2.set(5, 1);
        e = new q6i0(e2, selectionMode, null, null);
    }

    public q6i0(Calendar calendar, SelectionMode selectionMode, Calendar calendar2, Calendar calendar3) {
        this.a = calendar;
        this.b = selectionMode;
        this.c = calendar2;
        this.d = calendar3;
    }

    public static q6i0 a(q6i0 q6i0Var, Calendar calendar, SelectionMode selectionMode, Calendar calendar2, Calendar calendar3, int i) {
        if ((i & 1) != 0) {
            calendar = q6i0Var.a;
        }
        if ((i & 2) != 0) {
            selectionMode = q6i0Var.b;
        }
        if ((i & 4) != 0) {
            calendar2 = q6i0Var.c;
        }
        if ((i & 8) != 0) {
            calendar3 = q6i0Var.d;
        }
        q6i0Var.getClass();
        return new q6i0(calendar, selectionMode, calendar2, calendar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6i0)) {
            return false;
        }
        q6i0 q6i0Var = (q6i0) obj;
        return this.a.equals(q6i0Var.a) && this.b == q6i0Var.b && jl40.l(this.c, q6i0Var.c) && jl40.l(this.d, q6i0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Calendar calendar = this.c;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.d;
        return hashCode2 + (calendar2 != null ? calendar2.hashCode() : 0);
    }

    public final String toString() {
        return "State(firstAvailableDate=" + this.a + ", selectionMode=" + this.b + ", startDate=" + this.c + ", endDate=" + this.d + Extension.C_BRAKE;
    }
}
