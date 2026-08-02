package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class MaxLengthFilter implements InputTransformation {
    public final int maxLength;

    public MaxLengthFilter(int i) {
        this.maxLength = i;
        if (i >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("maxLength must be at least zero");
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.MaxTextLength;
        KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[29];
        semanticsPropertyReceiver.set(semanticsPropertyKey, Integer.valueOf(this.maxLength));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxLengthFilter) && this.maxLength == ((MaxLengthFilter) obj).maxLength;
    }

    public final int hashCode() {
        return Integer.hashCode(this.maxLength);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("InputTransformation.maxLength("), this.maxLength, ')');
    }

    @Override // androidx.compose.foundation.text.input.InputTransformation
    public final void transformInput(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.buffer.length() > this.maxLength) {
            textFieldBuffer.revertAllChanges();
        }
    }
}
