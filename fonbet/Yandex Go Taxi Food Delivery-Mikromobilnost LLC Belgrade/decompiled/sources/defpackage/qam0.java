package defpackage;

import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;

/* loaded from: classes3.dex */
public final /* synthetic */ class qam0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsDashboardFragmentV2 b;

    public /* synthetic */ qam0(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, int i) {
        this.a = i;
        this.b = savingsDashboardFragmentV2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$10$lambda$9$lambda$8;
        zy11 render$lambda$13$lambda$11;
        zy11 render$lambda$13$lambda$12;
        int i = this.a;
        SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.b;
        switch (i) {
            case 0:
                render$lambda$10$lambda$9$lambda$8 = SavingsDashboardFragmentV2.render$lambda$10$lambda$9$lambda$8(savingsDashboardFragmentV2);
                return render$lambda$10$lambda$9$lambda$8;
            case 1:
                render$lambda$13$lambda$11 = SavingsDashboardFragmentV2.render$lambda$13$lambda$11(savingsDashboardFragmentV2);
                return render$lambda$13$lambda$11;
            default:
                render$lambda$13$lambda$12 = SavingsDashboardFragmentV2.render$lambda$13$lambda$12(savingsDashboardFragmentV2);
                return render$lambda$13$lambda$12;
        }
    }
}
