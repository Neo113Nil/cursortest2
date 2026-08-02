package defpackage;

import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zx3 implements qas0 {
    public final WeekDayChooserView$State$WeekDay a;

    public zx3(WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay) {
        this.a = weekDayChooserView$State$WeekDay;
    }

    public final WeekDayChooserView$State$WeekDay a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx3) && this.a == ((zx3) obj).a;
    }

    public final int hashCode() {
        WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay = this.a;
        if (weekDayChooserView$State$WeekDay == null) {
            return 0;
        }
        return weekDayChooserView$State$WeekDay.hashCode();
    }

    public final String toString() {
        return "ShowDayOfWeekSelector(day=" + this.a + Extension.C_BRAKE;
    }
}
