package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class vj01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMainFragment b;

    public /* synthetic */ vj01(TransferMainFragment transferMainFragment, int i) {
        this.a = i;
        this.b = transferMainFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onCreate$lambda$23;
        zy11 onCreate$lambda$25;
        zy11 postHideKeyboard$lambda$89;
        zy11 onCreate$lambda$29;
        qa3 mainButtonsAdapter_delegate$lambda$5;
        zy11 showTooltip$lambda$71$lambda$70;
        zy11 viewBinding$lambda$21$lambda$15$lambda$13;
        zy11 viewBinding$lambda$21$lambda$15$lambda$14;
        zy11 viewBinding$lambda$21$lambda$18$lambda$17;
        int i = this.a;
        TransferMainFragment transferMainFragment = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$23 = TransferMainFragment.onCreate$lambda$23(transferMainFragment);
                return onCreate$lambda$23;
            case 1:
                onCreate$lambda$25 = TransferMainFragment.onCreate$lambda$25(transferMainFragment);
                return onCreate$lambda$25;
            case 2:
                postHideKeyboard$lambda$89 = TransferMainFragment.postHideKeyboard$lambda$89(transferMainFragment);
                return postHideKeyboard$lambda$89;
            case 3:
                onCreate$lambda$29 = TransferMainFragment.onCreate$lambda$29(transferMainFragment);
                return onCreate$lambda$29;
            case 4:
                mainButtonsAdapter_delegate$lambda$5 = TransferMainFragment.mainButtonsAdapter_delegate$lambda$5(transferMainFragment);
                return mainButtonsAdapter_delegate$lambda$5;
            case 5:
                showTooltip$lambda$71$lambda$70 = TransferMainFragment.showTooltip$lambda$71$lambda$70(transferMainFragment);
                return showTooltip$lambda$71$lambda$70;
            case 6:
                viewBinding$lambda$21$lambda$15$lambda$13 = TransferMainFragment.getViewBinding$lambda$21$lambda$15$lambda$13(transferMainFragment);
                return viewBinding$lambda$21$lambda$15$lambda$13;
            case 7:
                viewBinding$lambda$21$lambda$15$lambda$14 = TransferMainFragment.getViewBinding$lambda$21$lambda$15$lambda$14(transferMainFragment);
                return viewBinding$lambda$21$lambda$15$lambda$14;
            default:
                viewBinding$lambda$21$lambda$18$lambda$17 = TransferMainFragment.getViewBinding$lambda$21$lambda$18$lambda$17(transferMainFragment);
                return viewBinding$lambda$21$lambda$18$lambda$17;
        }
    }
}
