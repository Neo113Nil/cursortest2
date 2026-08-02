package defpackage;

import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class uj01 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMainFragment b;

    public /* synthetic */ uj01(TransferMainFragment transferMainFragment, int i) {
        this.a = i;
        this.b = transferMainFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onCreate$lambda$22;
        zy11 onCreate$lambda$27;
        zy11 onCreate$lambda$28;
        int i = this.a;
        TransferMainFragment transferMainFragment = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$22 = TransferMainFragment.onCreate$lambda$22(transferMainFragment, (SelectedPartner) obj, (PhoneInputSource) obj2);
                return onCreate$lambda$22;
            case 1:
                onCreate$lambda$27 = TransferMainFragment.onCreate$lambda$27(transferMainFragment, (PaymentProviderEntity) obj, (String) obj2);
                return onCreate$lambda$27;
            default:
                onCreate$lambda$28 = TransferMainFragment.onCreate$lambda$28(transferMainFragment, (PaymentProviderEntity) obj, (String) obj2);
                return onCreate$lambda$28;
        }
    }
}
