package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.bottomsheet.daychoosers.MonthDayChooserView;

/* loaded from: classes4.dex */
public final /* synthetic */ class w630 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MonthDayChooserView b;

    public /* synthetic */ w630(MonthDayChooserView monthDayChooserView, int i) {
        this.a = i;
        this.b = monthDayChooserView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MonthDayChooserView monthDayChooserView = this.b;
        switch (i) {
            case 0:
                monthDayChooserView.onSaveClick();
                break;
            case 1:
                MonthDayChooserView.onLastClick$default(monthDayChooserView, false, 1, null);
                break;
            default:
                MonthDayChooserView.onLastClick$default(monthDayChooserView, false, 1, null);
                break;
        }
    }
}
