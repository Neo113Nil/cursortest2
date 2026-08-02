package defpackage;

import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;

/* loaded from: classes13.dex */
public final /* synthetic */ class ram0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SavingsDashboardFragmentV2 b;
    public final /* synthetic */ zbm0 c;

    public /* synthetic */ ram0(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, zbm0 zbm0Var, int i) {
        this.a = i;
        this.b = savingsDashboardFragmentV2;
        this.c = zbm0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 render$lambda$10$lambda$9;
        zy11 render$lambda$10;
        int i = this.a;
        zbm0 zbm0Var = this.c;
        SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.b;
        switch (i) {
            case 0:
                render$lambda$10$lambda$9 = SavingsDashboardFragmentV2.render$lambda$10$lambda$9(savingsDashboardFragmentV2, zbm0Var);
                return render$lambda$10$lambda$9;
            default:
                render$lambda$10 = SavingsDashboardFragmentV2.render$lambda$10(savingsDashboardFragmentV2, zbm0Var);
                return render$lambda$10;
        }
    }
}
