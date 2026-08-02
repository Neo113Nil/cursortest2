package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class InputState_androidKt {
    public static final String getPayLinkToken(PaymentConfigurationFlow paymentConfigurationFlow) {
        paymentConfigurationFlow.getClass();
        PaymentFlowData data = paymentConfigurationFlow.getData();
        PaymentFlowData.PayLinkFlowData payLinkFlowData = data instanceof PaymentFlowData.PayLinkFlowData ? (PaymentFlowData.PayLinkFlowData) data : null;
        if (payLinkFlowData != null) {
            return payLinkFlowData.token;
        }
        return null;
    }

    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.annotatedString.text;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldValue.selection;
        extractedText.selectionStart = TextRange.m990getMinimpl(j);
        extractedText.selectionEnd = TextRange.m989getMaximpl(j);
        extractedText.flags = !StringsKt.contains((CharSequence) textFieldValue.annotatedString.text, '\n', false) ? 1 : 0;
        return extractedText;
    }
}
