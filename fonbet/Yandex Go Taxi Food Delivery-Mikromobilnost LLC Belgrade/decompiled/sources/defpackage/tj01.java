package defpackage;

import android.net.Uri;
import android.text.Editable;
import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class tj01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferMainFragment b;

    public /* synthetic */ tj01(TransferMainFragment transferMainFragment, int i) {
        this.a = i;
        this.b = transferMainFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 renderInfoSubtitle$lambda$67;
        zy11 showCommentDialogView$lambda$81;
        boolean renderBottomSheet$lambda$57$lambda$49$lambda$48$lambda$47;
        zy11 onCreate$lambda$24;
        zy11 onCreate$lambda$26;
        zy11 mainButtonsAdapter_delegate$lambda$5$lambda$0;
        zy11 mainButtonsAdapter_delegate$lambda$5$lambda$1;
        zy11 mainButtonsAdapter_delegate$lambda$5$lambda$2;
        zy11 mainButtonsAdapter_delegate$lambda$5$lambda$3;
        zy11 mainButtonsAdapter_delegate$lambda$5$lambda$4;
        zy11 showTooltip$lambda$71$lambda$69;
        zy11 showCommentDialogView$lambda$80$lambda$79$lambda$76;
        zy11 viewBinding$lambda$21$lambda$8$lambda$7;
        zy11 showCommentDialogView$lambda$80$lambda$79$lambda$77;
        zy11 handleNoPaymentSelected$lambda$88;
        zy11 renderBottomSheet$lambda$57$lambda$56$lambda$55;
        zy11 showCommentDialog$lambda$87$lambda$85$lambda$82;
        zy11 showCommentDialog$lambda$87$lambda$85$lambda$83;
        zy11 showCommentDialog$lambda$87$lambda$85$lambda$84;
        boolean createYbDivView$lambda$59$lambda$58;
        int i = this.a;
        TransferMainFragment transferMainFragment = this.b;
        switch (i) {
            case 0:
                renderInfoSubtitle$lambda$67 = TransferMainFragment.renderInfoSubtitle$lambda$67(transferMainFragment, (String) obj);
                return renderInfoSubtitle$lambda$67;
            case 1:
                showCommentDialogView$lambda$81 = TransferMainFragment.showCommentDialogView$lambda$81(transferMainFragment, ((Boolean) obj).booleanValue());
                return showCommentDialogView$lambda$81;
            case 2:
                renderBottomSheet$lambda$57$lambda$49$lambda$48$lambda$47 = TransferMainFragment.renderBottomSheet$lambda$57$lambda$49$lambda$48$lambda$47(transferMainFragment, (Uri) obj);
                return Boolean.valueOf(renderBottomSheet$lambda$57$lambda$49$lambda$48$lambda$47);
            case 3:
                onCreate$lambda$24 = TransferMainFragment.onCreate$lambda$24(transferMainFragment, (TransferRequisiteResultEntity) obj);
                return onCreate$lambda$24;
            case 4:
                onCreate$lambda$26 = TransferMainFragment.onCreate$lambda$26(transferMainFragment, (SelectedPartner) obj);
                return onCreate$lambda$26;
            case 5:
                mainButtonsAdapter_delegate$lambda$5$lambda$0 = TransferMainFragment.mainButtonsAdapter_delegate$lambda$5$lambda$0(transferMainFragment, (StadiumButtonView.ClickedPart) obj);
                return mainButtonsAdapter_delegate$lambda$5$lambda$0;
            case 6:
                mainButtonsAdapter_delegate$lambda$5$lambda$1 = TransferMainFragment.mainButtonsAdapter_delegate$lambda$5$lambda$1(transferMainFragment, (px11) obj);
                return mainButtonsAdapter_delegate$lambda$5$lambda$1;
            case 7:
                mainButtonsAdapter_delegate$lambda$5$lambda$2 = TransferMainFragment.mainButtonsAdapter_delegate$lambda$5$lambda$2(transferMainFragment, (t451) obj);
                return mainButtonsAdapter_delegate$lambda$5$lambda$2;
            case 8:
                mainButtonsAdapter_delegate$lambda$5$lambda$3 = TransferMainFragment.mainButtonsAdapter_delegate$lambda$5$lambda$3(transferMainFragment, (o) obj);
                return mainButtonsAdapter_delegate$lambda$5$lambda$3;
            case 9:
                mainButtonsAdapter_delegate$lambda$5$lambda$4 = TransferMainFragment.mainButtonsAdapter_delegate$lambda$5$lambda$4(transferMainFragment, (String) obj);
                return mainButtonsAdapter_delegate$lambda$5$lambda$4;
            case 10:
                showTooltip$lambda$71$lambda$69 = TransferMainFragment.showTooltip$lambda$71$lambda$69(transferMainFragment, (Tooltip$DismissReason) obj);
                return showTooltip$lambda$71$lambda$69;
            case 11:
                showCommentDialogView$lambda$80$lambda$79$lambda$76 = TransferMainFragment.showCommentDialogView$lambda$80$lambda$79$lambda$76(transferMainFragment, (String) obj);
                return showCommentDialogView$lambda$80$lambda$79$lambda$76;
            case 12:
                viewBinding$lambda$21$lambda$8$lambda$7 = TransferMainFragment.getViewBinding$lambda$21$lambda$8$lambda$7(transferMainFragment, (Editable) obj);
                return viewBinding$lambda$21$lambda$8$lambda$7;
            case 13:
                showCommentDialogView$lambda$80$lambda$79$lambda$77 = TransferMainFragment.showCommentDialogView$lambda$80$lambda$79$lambda$77(transferMainFragment, (String) obj);
                return showCommentDialogView$lambda$80$lambda$79$lambda$77;
            case 14:
                handleNoPaymentSelected$lambda$88 = TransferMainFragment.handleNoPaymentSelected$lambda$88(transferMainFragment, (Tooltip$DismissReason) obj);
                return handleNoPaymentSelected$lambda$88;
            case 15:
                renderBottomSheet$lambda$57$lambda$56$lambda$55 = TransferMainFragment.renderBottomSheet$lambda$57$lambda$56$lambda$55(transferMainFragment, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$57$lambda$56$lambda$55;
            case 16:
                showCommentDialog$lambda$87$lambda$85$lambda$82 = TransferMainFragment.showCommentDialog$lambda$87$lambda$85$lambda$82(transferMainFragment, (String) obj);
                return showCommentDialog$lambda$87$lambda$85$lambda$82;
            case 17:
                showCommentDialog$lambda$87$lambda$85$lambda$83 = TransferMainFragment.showCommentDialog$lambda$87$lambda$85$lambda$83(transferMainFragment, (String) obj);
                return showCommentDialog$lambda$87$lambda$85$lambda$83;
            case 18:
                showCommentDialog$lambda$87$lambda$85$lambda$84 = TransferMainFragment.showCommentDialog$lambda$87$lambda$85$lambda$84(transferMainFragment, (pk31) obj);
                return showCommentDialog$lambda$87$lambda$85$lambda$84;
            default:
                createYbDivView$lambda$59$lambda$58 = TransferMainFragment.createYbDivView$lambda$59$lambda$58(transferMainFragment, (Uri) obj);
                return Boolean.valueOf(createYbDivView$lambda$59$lambda$58);
        }
    }
}
