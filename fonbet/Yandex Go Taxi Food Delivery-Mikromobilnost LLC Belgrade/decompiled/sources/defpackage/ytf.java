package defpackage;

import com.yandex.payment.divkit.sbp.DKSbpFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class ytf implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DKSbpFragment b;

    public /* synthetic */ ytf(DKSbpFragment dKSbpFragment, int i) {
        this.a = i;
        this.b = dKSbpFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        tc5 activityViewModel_delegate$lambda$0;
        grj0 resIdProvider_delegate$lambda$0;
        hs31 viewModelFactory;
        int i = this.a;
        DKSbpFragment dKSbpFragment = this.b;
        switch (i) {
            case 0:
                zy11Var = DKSbpFragment.setupContainersViews$lambda$0$1$0(dKSbpFragment);
                return zy11Var;
            case 1:
                activityViewModel_delegate$lambda$0 = DKSbpFragment.activityViewModel_delegate$lambda$0(dKSbpFragment);
                return activityViewModel_delegate$lambda$0;
            case 2:
                resIdProvider_delegate$lambda$0 = DKSbpFragment.resIdProvider_delegate$lambda$0(dKSbpFragment);
                return resIdProvider_delegate$lambda$0;
            default:
                viewModelFactory = dKSbpFragment.getViewModelFactory();
                return viewModelFactory;
        }
    }
}
