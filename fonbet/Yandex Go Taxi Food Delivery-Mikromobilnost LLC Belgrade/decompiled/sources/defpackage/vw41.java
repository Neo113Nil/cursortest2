package defpackage;

import com.ybsdk.widgets.common.bottomsheet.daychoosers.WeekDayChooserView$State$WeekDay;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vw41 {
    public final WeekDayChooserView$State$WeekDay a;

    public vw41(WeekDayChooserView$State$WeekDay weekDayChooserView$State$WeekDay) {
        this.a = weekDayChooserView$State$WeekDay;
    }

    public final WeekDayChooserView$State$WeekDay a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vw41) && this.a == ((vw41) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SaveResult(weekDay=" + this.a + Extension.C_BRAKE;
    }
}
