package defpackage;

import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.b;

/* loaded from: classes3.dex */
public final /* synthetic */ class uam0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsDashboardFragmentV4 b;

    public /* synthetic */ uam0(SavingsDashboardFragmentV4 savingsDashboardFragmentV4, int i) {
        this.a = i;
        this.b = savingsDashboardFragmentV4;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderEducationV2$lambda$9$lambda$8;
        zy11 renderContent$lambda$6$lambda$5;
        zy11 renderContent$lambda$6;
        zy11 contentRecyclerHelper_delegate$lambda$1$lambda$0;
        b contentRecyclerHelper_delegate$lambda$1;
        int i = this.a;
        SavingsDashboardFragmentV4 savingsDashboardFragmentV4 = this.b;
        switch (i) {
            case 0:
                renderEducationV2$lambda$9$lambda$8 = SavingsDashboardFragmentV4.renderEducationV2$lambda$9$lambda$8(savingsDashboardFragmentV4);
                return renderEducationV2$lambda$9$lambda$8;
            case 1:
                renderContent$lambda$6$lambda$5 = SavingsDashboardFragmentV4.renderContent$lambda$6$lambda$5(savingsDashboardFragmentV4);
                return renderContent$lambda$6$lambda$5;
            case 2:
                renderContent$lambda$6 = SavingsDashboardFragmentV4.renderContent$lambda$6(savingsDashboardFragmentV4);
                return renderContent$lambda$6;
            case 3:
                contentRecyclerHelper_delegate$lambda$1$lambda$0 = SavingsDashboardFragmentV4.contentRecyclerHelper_delegate$lambda$1$lambda$0(savingsDashboardFragmentV4);
                return contentRecyclerHelper_delegate$lambda$1$lambda$0;
            default:
                contentRecyclerHelper_delegate$lambda$1 = SavingsDashboardFragmentV4.contentRecyclerHelper_delegate$lambda$1(savingsDashboardFragmentV4);
                return contentRecyclerHelper_delegate$lambda$1;
        }
    }
}
