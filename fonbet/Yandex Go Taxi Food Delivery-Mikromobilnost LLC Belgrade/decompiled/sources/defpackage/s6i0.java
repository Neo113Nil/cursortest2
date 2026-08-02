package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import com.ybsdk.widgets.common.rangedatepicker.RangeDatePickerCalendarView;

/* loaded from: classes3.dex */
public final class s6i0 extends GridLayoutManager.b {
    public final /* synthetic */ RangeDatePickerCalendarView d;

    public s6i0(RangeDatePickerCalendarView rangeDatePickerCalendarView) {
        this.d = rangeDatePickerCalendarView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.b
    public final int c(int i) {
        qa3 qa3Var;
        qa3Var = this.d.calendarAdapter;
        kf7 kf7Var = (kf7) qa3Var.b.f.get(i);
        if (kf7Var instanceof jf7) {
            return 7;
        }
        if (kf7Var instanceof if7) {
            return 1;
        }
        w511.b();
        return 0;
    }
}
