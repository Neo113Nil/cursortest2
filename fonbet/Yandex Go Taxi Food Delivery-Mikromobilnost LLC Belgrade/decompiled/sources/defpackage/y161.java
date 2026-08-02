package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;

/* loaded from: classes3.dex */
public final class y161 implements zo31 {
    public final CalendarDayView a;

    public y161(CalendarDayView calendarDayView) {
        this.a = calendarDayView;
    }

    public static y161 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(poh0.ybsdk_item_calendar_day, viewGroup, false);
        if (inflate != null) {
            return new y161((CalendarDayView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
