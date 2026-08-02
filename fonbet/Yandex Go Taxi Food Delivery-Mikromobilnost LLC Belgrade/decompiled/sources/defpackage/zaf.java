package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.CreditDepositTransactionStatusEntity$Status;
import com.ybsdk.feature.credit.deposit.internal.network.dto.CreditDepositTransactionStatusResponse;
import com.ybsdk.feature.credit.limitdeposit.internal.network.dto.CreditLimitDepositTransactionStatusResponse;

/* loaded from: classes3.dex */
public abstract class zaf {
    public static final xaf a(CreditDepositTransactionStatusResponse creditDepositTransactionStatusResponse) {
        CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status;
        String transactionId = creditDepositTransactionStatusResponse.getTransactionId();
        String agreementId = creditDepositTransactionStatusResponse.getAgreementId();
        int i = yaf.a[creditDepositTransactionStatusResponse.getStatus().ordinal()];
        if (i == 1) {
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.PENDING;
        } else if (i == 2) {
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.REQUIRED_3DS;
        } else if (i == 3) {
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.FINISHED;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.FAILED;
        }
        Text.Constant i2 = g8e.i(Text.Companion, creditDepositTransactionStatusResponse.getTitle());
        String description = creditDepositTransactionStatusResponse.getDescription();
        Text.Constant e = description != null ? d.e(description) : null;
        String url3ds = creditDepositTransactionStatusResponse.getUrl3ds();
        String buttonText = creditDepositTransactionStatusResponse.getButtonText();
        Text.Constant e2 = buttonText != null ? d.e(buttonText) : null;
        String buttonAction = creditDepositTransactionStatusResponse.getButtonAction();
        String secondaryButtonText = creditDepositTransactionStatusResponse.getSecondaryButtonText();
        return new xaf(transactionId, agreementId, creditDepositTransactionStatusEntity$Status, i2, e, url3ds, e2, buttonAction, secondaryButtonText != null ? d.e(secondaryButtonText) : null, creditDepositTransactionStatusResponse.getSecondaryButtonAction(), creditDepositTransactionStatusResponse.getCloseAction());
    }

    public static final xaf b(CreditLimitDepositTransactionStatusResponse creditLimitDepositTransactionStatusResponse) {
        CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status;
        String transactionId = creditLimitDepositTransactionStatusResponse.getTransactionId();
        String agreementId = creditLimitDepositTransactionStatusResponse.getAgreementId();
        int i = yaf.b[creditLimitDepositTransactionStatusResponse.getStatus().ordinal()];
        if (i == 1) {
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.PENDING;
        } else if (i == 2) {
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.REQUIRED_3DS;
        } else if (i == 3) {
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.FINISHED;
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            creditDepositTransactionStatusEntity$Status = CreditDepositTransactionStatusEntity$Status.FAILED;
        }
        CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status2 = creditDepositTransactionStatusEntity$Status;
        Text.Constant i2 = g8e.i(Text.Companion, creditLimitDepositTransactionStatusResponse.getTitle());
        String description = creditLimitDepositTransactionStatusResponse.getDescription();
        Text.Constant e = description != null ? d.e(description) : null;
        String buttonText = creditLimitDepositTransactionStatusResponse.getButtonText();
        return new xaf(transactionId, agreementId, creditDepositTransactionStatusEntity$Status2, i2, e, creditLimitDepositTransactionStatusResponse.getUrl3ds(), buttonText != null ? d.e(buttonText) : null, null, null, null, creditLimitDepositTransactionStatusResponse.getCloseAction());
    }
}
