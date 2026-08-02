package defpackage;

import com.ybsdk.widgets.common.rangedatepicker.DayState;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ze7 {
    public final Calendar a;
    public final DayState b;
    public final lsg c;
    public final boolean d;
    public final Integer e;
    public final Integer f;
    public final boolean g;

    public ze7(Calendar calendar, DayState dayState, lsg lsgVar, boolean z, Integer num, Integer num2) {
        this.a = calendar;
        this.b = dayState;
        this.c = lsgVar;
        this.d = z;
        this.e = num;
        this.f = num2;
        int i = calendar.get(7);
        boolean z2 = true;
        if (i != 7 && i != 1) {
            z2 = false;
        }
        this.g = z2;
    }

    public static ze7 a(ze7 ze7Var, DayState dayState, Integer num, Integer num2, int i) {
        Calendar calendar = ze7Var.a;
        if ((i & 2) != 0) {
            dayState = ze7Var.b;
        }
        return new ze7(calendar, dayState, ze7Var.c, ze7Var.d, num, num2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ze7)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ze7 ze7Var = (ze7) obj;
        return kdb1.j(this.a, ze7Var.a) && this.b == ze7Var.b && this.c.equals(ze7Var.c) && this.d == ze7Var.d && jl40.l(this.e, ze7Var.e) && jl40.l(this.f, ze7Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + unr0.e(Boolean.hashCode(this.d) * 31, 31, this.g)) * 31)) * 31)) * 961;
        Integer num = this.e;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f;
        return intValue + (num2 != null ? num2.intValue() : 0);
    }

    public final String toString() {
        return "CalendarDay(date=" + this.a + ", state=" + this.b + ", position=" + this.c + ", isDisabled=" + this.d + ", cellTypeId=null, cellColor=" + this.e + ", cellTextColor=" + this.f + Extension.C_BRAKE;
    }
}
