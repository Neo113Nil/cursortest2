package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class vq01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferRequisiteFragment b;

    public /* synthetic */ vq01(int i, TransferRequisiteFragment transferRequisiteFragment) {
        this.a = i;
        this.b = transferRequisiteFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 viewBinding$lambda$9$lambda$8;
        zy11 requisiteFormAdapter_delegate$lambda$6$lambda$2;
        zy11 requisiteFormAdapter_delegate$lambda$6$lambda$3;
        boolean requisiteFormAdapter_delegate$lambda$6$lambda$5;
        int i = this.a;
        TransferRequisiteFragment transferRequisiteFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$9$lambda$8 = TransferRequisiteFragment.getViewBinding$lambda$9$lambda$8(transferRequisiteFragment, (k5x0) obj);
                return viewBinding$lambda$9$lambda$8;
            case 1:
                requisiteFormAdapter_delegate$lambda$6$lambda$2 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6$lambda$2(transferRequisiteFragment, ((Boolean) obj).booleanValue());
                return requisiteFormAdapter_delegate$lambda$6$lambda$2;
            case 2:
                requisiteFormAdapter_delegate$lambda$6$lambda$3 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6$lambda$3(transferRequisiteFragment, ((Boolean) obj).booleanValue());
                return requisiteFormAdapter_delegate$lambda$6$lambda$3;
            default:
                requisiteFormAdapter_delegate$lambda$6$lambda$5 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6$lambda$5(transferRequisiteFragment, (String) obj);
                return Boolean.valueOf(requisiteFormAdapter_delegate$lambda$6$lambda$5);
        }
    }
}
