package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView$State$Mode;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yx3 implements qas0 {
    public final Integer a;
    public final MonthDayChooserView$State$Mode b;
    public final AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType c;
    public final List d;
    public final boolean e;

    public yx3(Integer num, MonthDayChooserView$State$Mode monthDayChooserView$State$Mode, AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType autoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType, List list, boolean z) {
        this.a = num;
        this.b = monthDayChooserView$State$Mode;
        this.c = autoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType;
        this.d = list;
        this.e = z;
    }

    public final AutoTopupRegularViewModel$AutoTopupRegularSideEffect$ShowDayOfMonthSelector$DateType a() {
        return this.c;
    }

    public final Integer b() {
        return this.a;
    }

    public final List c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final MonthDayChooserView$State$Mode e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx3)) {
            return false;
        }
        yx3 yx3Var = (yx3) obj;
        return jl40.l(this.a, yx3Var.a) && this.b == yx3Var.b && this.c == yx3Var.c && this.d.equals(yx3Var.d) && this.e == yx3Var.e;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.e) + unr0.c((this.c.hashCode() + ((this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowDayOfMonthSelector(day=");
        sb.append(this.a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", dateType=");
        sb.append(this.c);
        sb.append(", disabledDays=");
        sb.append(this.d);
        sb.append(", lastDayChecked=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
