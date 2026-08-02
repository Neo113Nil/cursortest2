package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class FormTextOutputTransformation implements OutputTransformation {
    public final boolean isObfuscated;
    public final ArrayList templateConfigs;
    public final List validations;

    public FormTextOutputTransformation(boolean z, List list) {
        list.getClass();
        this.isObfuscated = z;
        this.validations = list;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new TemplateConfig((FormBlocker.Element.TextInputElement.Validation) list.get(i)));
        }
        this.templateConfigs = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormTextOutputTransformation)) {
            return false;
        }
        FormTextOutputTransformation formTextOutputTransformation = (FormTextOutputTransformation) obj;
        return this.isObfuscated == formTextOutputTransformation.isObfuscated && Intrinsics.areEqual(this.validations, formTextOutputTransformation.validations);
    }

    public final int hashCode() {
        return this.validations.hashCode() + (Boolean.hashCode(this.isObfuscated) * 31);
    }

    public final String toString() {
        return "FormTextOutputTransformation(isObfuscated=" + this.isObfuscated + ", validations=" + this.validations + ")";
    }

    @Override // androidx.compose.foundation.text.input.OutputTransformation
    public final void transformOutput(TextFieldBuffer textFieldBuffer) {
        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
        if (this.isObfuscated) {
            ArrayList arrayList = this.templateConfigs;
            TemplateConfig findConfigFor = !arrayList.isEmpty() ? ArcadeFormEmojiPickerKt.findConfigFor(partialGapBuffer.toString(), arrayList) : null;
            IntProgressionIterator it = RangesKt___RangesKt.until(0, partialGapBuffer.length()).iterator();
            while (it.hasNext) {
                int nextInt = it.nextInt();
                if (findConfigFor == null || !StringsKt.contains((CharSequence) findConfigFor.formattingChars, partialGapBuffer.charAt(nextInt), false)) {
                    textFieldBuffer.replace(nextInt, nextInt + 1, "•");
                }
            }
        }
    }
}
