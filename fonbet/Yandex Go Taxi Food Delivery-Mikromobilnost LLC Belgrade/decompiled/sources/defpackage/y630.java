package defpackage;

import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView$State$Mode;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class y630 {
    public final MonthDayChooserView$State$Mode a;
    public final Integer b;
    public final boolean c;
    public final List d;

    public y630(MonthDayChooserView$State$Mode monthDayChooserView$State$Mode, Integer num, boolean z, List list) {
        this.a = monthDayChooserView$State$Mode;
        this.b = num;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y630)) {
            return false;
        }
        y630 y630Var = (y630) obj;
        return this.a == y630Var.a && jl40.l(this.b, y630Var.b) && this.c == y630Var.c && jl40.l(this.d, y630Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.d.hashCode() + unr0.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "State(mode=" + this.a + ", selectedDay=" + this.b + ", lastDayChecked=" + this.c + ", disabledDays=" + this.d + Extension.C_BRAKE;
    }
}
