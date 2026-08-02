package defpackage;

import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;

/* loaded from: classes3.dex */
public final /* synthetic */ class w390 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PFMCalendarView b;

    public /* synthetic */ w390(PFMCalendarView pFMCalendarView, int i) {
        this.a = i;
        this.b = pFMCalendarView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        PFMCalendarView pFMCalendarView = this.b;
        switch (i) {
            case 0:
                zy11Var = PFMCalendarView.setupInputClickListeners$lambda$3(pFMCalendarView);
                return zy11Var;
            case 1:
                zy11Var2 = PFMCalendarView.setupInputClickListeners$lambda$4(pFMCalendarView);
                return zy11Var2;
            default:
                return pFMCalendarView;
        }
    }
}
