package defpackage;

import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class thm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpPartnersFragment b;

    public /* synthetic */ thm0(SbpPartnersFragment sbpPartnersFragment, int i) {
        this.a = i;
        this.b = sbpPartnersFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 viewBinding$lambda$7$lambda$6$lambda$4;
        zy11 viewBinding$lambda$7$lambda$6$lambda$5;
        zy11 renderAccordingToViewState$lambda$15$lambda$14$lambda$13;
        zy11 viewBinding$lambda$7$lambda$3;
        int i = this.a;
        SbpPartnersFragment sbpPartnersFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$7$lambda$6$lambda$4 = SbpPartnersFragment.getViewBinding$lambda$7$lambda$6$lambda$4(sbpPartnersFragment);
                return viewBinding$lambda$7$lambda$6$lambda$4;
            case 1:
                viewBinding$lambda$7$lambda$6$lambda$5 = SbpPartnersFragment.getViewBinding$lambda$7$lambda$6$lambda$5(sbpPartnersFragment);
                return viewBinding$lambda$7$lambda$6$lambda$5;
            case 2:
                renderAccordingToViewState$lambda$15$lambda$14$lambda$13 = SbpPartnersFragment.renderAccordingToViewState$lambda$15$lambda$14$lambda$13(sbpPartnersFragment);
                return renderAccordingToViewState$lambda$15$lambda$14$lambda$13;
            default:
                viewBinding$lambda$7$lambda$3 = SbpPartnersFragment.getViewBinding$lambda$7$lambda$3(sbpPartnersFragment);
                return viewBinding$lambda$7$lambda$3;
        }
    }
}
