package com.squareup.cash.scrubbing;

import android.telephony.PhoneNumberUtils;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import com.google.i18n.phonenumbers.AsYouTypeFormatter;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;

/* loaded from: classes.dex */
public final class InternationalPhoneNumberOutputTransformation implements OutputTransformation {
    public final AsYouTypeFormatter phoneNumberFormatter;

    public InternationalPhoneNumberOutputTransformation(String str) {
        str.getClass();
        PhoneNumberUtil.getInstance().getClass();
        this.phoneNumberFormatter = new AsYouTypeFormatter(str);
    }

    @Override // androidx.compose.foundation.text.input.OutputTransformation
    public final void transformOutput(TextFieldBuffer textFieldBuffer) {
        AsYouTypeFormatter asYouTypeFormatter = this.phoneNumberFormatter;
        asYouTypeFormatter.clear();
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        String str = "";
        int i = 0;
        for (int i2 = 0; i2 < partialGapBuffer.length(); i2++) {
            char charAt = partialGapBuffer.charAt(i2);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                str = asYouTypeFormatter.inputDigit(charAt);
            }
        }
        int i3 = 0;
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            int i4 = i3 + 1;
            if (!PhoneNumberUtils.isNonSeparator(charAt2) && i3 <= partialGapBuffer.length()) {
                ImageResourcesKt.insert(textFieldBuffer, i3, String.valueOf(charAt2));
            }
            i++;
            i3 = i4;
        }
    }
}
