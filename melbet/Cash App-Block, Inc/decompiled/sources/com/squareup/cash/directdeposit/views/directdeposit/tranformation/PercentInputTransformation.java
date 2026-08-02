package com.squareup.cash.directdeposit.views.directdeposit.tranformation;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class PercentInputTransformation implements InputTransformation {
    public static final PercentInputTransformation INSTANCE = new PercentInputTransformation();

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.getClass();
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.MaxTextLength;
        KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[29];
        semanticsPropertyReceiver.set(semanticsPropertyKey, 3);
    }

    public final String toString() {
        return "PercentInputTransformation";
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        if (partialGapBuffer.length() == 0) {
            return;
        }
        Integer intOrNull = StringsKt.toIntOrNull(partialGapBuffer.toString());
        if (intOrNull == null) {
            textFieldBuffer.revertAllChanges();
            return;
        }
        int intValue = intOrNull.intValue();
        if (intValue < 0 || intValue >= 101) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
