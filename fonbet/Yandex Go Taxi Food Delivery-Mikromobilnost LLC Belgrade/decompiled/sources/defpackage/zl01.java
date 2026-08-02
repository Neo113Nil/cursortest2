package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.TransferMe2MeConfirmFragment;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;

/* loaded from: classes3.dex */
public final /* synthetic */ class zl01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMe2MeConfirmFragment b;

    public /* synthetic */ zl01(TransferMe2MeConfirmFragment transferMe2MeConfirmFragment, int i) {
        this.a = i;
        this.b = transferMe2MeConfirmFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 viewBinding$lambda$7$lambda$3;
        zy11 showTooltip$lambda$13;
        zy11 renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$19;
        zy11 zy11Var;
        int i = this.a;
        TransferMe2MeConfirmFragment transferMe2MeConfirmFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$7$lambda$3 = TransferMe2MeConfirmFragment.getViewBinding$lambda$7$lambda$3(transferMe2MeConfirmFragment, (StadiumButtonView.ClickedPart) obj);
                return viewBinding$lambda$7$lambda$3;
            case 1:
                showTooltip$lambda$13 = TransferMe2MeConfirmFragment.showTooltip$lambda$13(transferMe2MeConfirmFragment, (Tooltip$DismissReason) obj);
                return showTooltip$lambda$13;
            case 2:
                renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$19 = TransferMe2MeConfirmFragment.renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$19(transferMe2MeConfirmFragment, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$25$lambda$22$lambda$21$lambda$20$lambda$19;
            default:
                zy11Var = TransferMe2MeConfirmFragment.setupWidget$lambda$14(transferMe2MeConfirmFragment, (px11) obj);
                return zy11Var;
        }
    }
}
