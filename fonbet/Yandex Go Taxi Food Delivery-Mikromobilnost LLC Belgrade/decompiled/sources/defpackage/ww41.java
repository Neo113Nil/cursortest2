package defpackage;

import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ww41 {
    public final WeekDayChooserView$State$WeekDay a;

    public ww41(WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay) {
        this.a = weekDayChooserView$State$WeekDay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww41) && this.a == ((ww41) obj).a;
    }

    public final int hashCode() {
        WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay = this.a;
        if (weekDayChooserView$State$WeekDay == null) {
            return 0;
        }
        return weekDayChooserView$State$WeekDay.hashCode();
    }

    public final String toString() {
        return "State(weekDay=" + this.a + Extension.C_BRAKE;
    }
}
