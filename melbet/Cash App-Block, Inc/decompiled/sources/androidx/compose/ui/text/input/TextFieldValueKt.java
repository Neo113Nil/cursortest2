package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.db.contacts.SendableUiCustomerFactory;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.screens.RedactedString;

/* loaded from: classes3.dex */
public abstract class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        AnnotatedString annotatedString = textFieldValue.annotatedString;
        long j = textFieldValue.selection;
        annotatedString.getClass();
        return annotatedString.subSequence(TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j));
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.annotatedString;
        AnnotatedString annotatedString2 = textFieldValue.annotatedString;
        long j = textFieldValue.selection;
        int m989getMaximpl = TextRange.m989getMaximpl(j);
        int m989getMaximpl2 = TextRange.m989getMaximpl(j);
        int i2 = m989getMaximpl2 + i;
        if (((i ^ i2) & (m989getMaximpl2 ^ i2)) < 0) {
            i2 = annotatedString2.text.length();
        }
        return annotatedString.subSequence(m989getMaximpl, Math.min(i2, annotatedString2.text.length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i) {
        AnnotatedString annotatedString = textFieldValue.annotatedString;
        long j = textFieldValue.selection;
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        int i2 = m990getMinimpl - i;
        if (((m990getMinimpl ^ i2) & (i ^ m990getMinimpl)) < 0) {
            i2 = 0;
        }
        return annotatedString.subSequence(Math.max(0, i2), TextRange.m990getMinimpl(j));
    }

    public static final PaymentRecipient toPaymentRecipient(Recipient recipient) {
        recipient.getClass();
        return new PaymentRecipient(SendableUiCustomerFactory.create(recipient.displayName, recipient.region, recipient.photo, recipient.email, recipient.sms, recipient.cashtag, recipient.customerId, recipient.investmentEntityToken, recipient.merchantData, Boolean.valueOf(recipient.isCashCustomer), null, null), new RedactedString(recipient.displayName), new RecipientPaymentInfo(recipient.creditCardFee, recipient.isBusiness), recipient.customerId != null ? RecipientType.CUSTOMER : recipient.sms != null ? RecipientType.PHONE : recipient.email != null ? RecipientType.EMAIL : RecipientType.UNKNOWN, recipient.invoice);
    }
}
