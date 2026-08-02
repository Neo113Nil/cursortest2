package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class uq01 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferRequisiteFragment b;

    public /* synthetic */ uq01(int i, TransferRequisiteFragment transferRequisiteFragment) {
        this.a = i;
        this.b = transferRequisiteFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 requisiteFormAdapter_delegate$lambda$6$lambda$0;
        zy11 requisiteFormAdapter_delegate$lambda$6$lambda$1;
        mq01 mq01Var = (mq01) obj;
        switch (this.a) {
            case 0:
                requisiteFormAdapter_delegate$lambda$6$lambda$0 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6$lambda$0(this.b, mq01Var, (String) obj2);
                return requisiteFormAdapter_delegate$lambda$6$lambda$0;
            default:
                requisiteFormAdapter_delegate$lambda$6$lambda$1 = TransferRequisiteFragment.requisiteFormAdapter_delegate$lambda$6$lambda$1(this.b, mq01Var, ((Boolean) obj2).booleanValue());
                return requisiteFormAdapter_delegate$lambda$6$lambda$1;
        }
    }
}
