package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class wq01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferRequisiteFragment b;

    public /* synthetic */ wq01(int i, TransferRequisiteFragment transferRequisiteFragment) {
        this.a = i;
        this.b = transferRequisiteFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 requisiteFormAdapter_delegate$lambda$6$lambda$4;
        qa3 requisiteFormAdapter_delegate$lambda$6;
        zy11 viewBinding$lambda$9$lambda$7;
        int i = this.a;
        TransferRequisiteFragment transferRequisiteFragment = this.b;
        switch (i) {
            case 0:
                requisiteFormAdapter_delegate$lambda$6$lambda$4 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6$lambda$4(transferRequisiteFragment);
                return requisiteFormAdapter_delegate$lambda$6$lambda$4;
            case 1:
                requisiteFormAdapter_delegate$lambda$6 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6(transferRequisiteFragment);
                return requisiteFormAdapter_delegate$lambda$6;
            default:
                viewBinding$lambda$9$lambda$7 = TransferRequisiteFragment.getViewBinding$lambda$9$lambda$7(transferRequisiteFragment);
                return viewBinding$lambda$9$lambda$7;
        }
    }
}
