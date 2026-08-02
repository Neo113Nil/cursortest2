package defpackage;

import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class xi90 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PartnersFragment b;

    public /* synthetic */ xi90(PartnersFragment partnersFragment, int i) {
        this.a = i;
        this.b = partnersFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$11$lambda$10$lambda$9;
        zy11 scrollToTop$lambda$20;
        zy11 viewBinding$lambda$11$lambda$3;
        zy11 viewBinding$lambda$11$lambda$5;
        zy11 viewBinding$lambda$11$lambda$6;
        zy11 viewBinding$lambda$11$lambda$7;
        zy11 viewBinding$lambda$11$lambda$10$lambda$8;
        int i = this.a;
        PartnersFragment partnersFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$11$lambda$10$lambda$9 = PartnersFragment.getViewBinding$lambda$11$lambda$10$lambda$9(partnersFragment);
                return viewBinding$lambda$11$lambda$10$lambda$9;
            case 1:
                scrollToTop$lambda$20 = PartnersFragment.scrollToTop$lambda$20(partnersFragment);
                return scrollToTop$lambda$20;
            case 2:
                viewBinding$lambda$11$lambda$3 = PartnersFragment.getViewBinding$lambda$11$lambda$3(partnersFragment);
                return viewBinding$lambda$11$lambda$3;
            case 3:
                viewBinding$lambda$11$lambda$5 = PartnersFragment.getViewBinding$lambda$11$lambda$5(partnersFragment);
                return viewBinding$lambda$11$lambda$5;
            case 4:
                viewBinding$lambda$11$lambda$6 = PartnersFragment.getViewBinding$lambda$11$lambda$6(partnersFragment);
                return viewBinding$lambda$11$lambda$6;
            case 5:
                viewBinding$lambda$11$lambda$7 = PartnersFragment.getViewBinding$lambda$11$lambda$7(partnersFragment);
                return viewBinding$lambda$11$lambda$7;
            default:
                viewBinding$lambda$11$lambda$10$lambda$8 = PartnersFragment.getViewBinding$lambda$11$lambda$10$lambda$8(partnersFragment);
                return viewBinding$lambda$11$lambda$10$lambda$8;
        }
    }
}
