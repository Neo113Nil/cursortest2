package com.squareup.cash.scrubbing;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.scrubbing.FakeTextFieldBuffer$BufferEntry;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class MaskVisualTransformation implements VisualTransformation {
    public final String mask;
    public final char maskPlaceholderChar;
    public final OffsetMappingStrategy offsetMappingStrategy;

    public MaskVisualTransformation(String str, OffsetMappingStrategy offsetMappingStrategy) {
        str.getClass();
        this.mask = str;
        this.maskPlaceholderChar = 'X';
        this.offsetMappingStrategy = offsetMappingStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskVisualTransformation)) {
            return false;
        }
        MaskVisualTransformation maskVisualTransformation = (MaskVisualTransformation) obj;
        return Intrinsics.areEqual(this.mask, maskVisualTransformation.mask) && this.maskPlaceholderChar == maskVisualTransformation.maskPlaceholderChar && Intrinsics.areEqual(this.offsetMappingStrategy, maskVisualTransformation.offsetMappingStrategy);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        annotatedString.getClass();
        String str = annotatedString.text;
        str.getClass();
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            arrayList.add(new FakeTextFieldBuffer$BufferEntry.Original(i3, str.charAt(i2)));
            i2++;
            i3++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        String str2 = this.mask;
        int length = str2.length();
        while (i < length) {
            char charAt = str2.charAt(i);
            if (charAt != this.maskPlaceholderChar) {
                Character valueOf = i < arrayList2.size() ? Character.valueOf(((FakeTextFieldBuffer$BufferEntry) arrayList2.get(i)).getChar()) : null;
                if (valueOf == null || valueOf.charValue() != charAt) {
                    arrayList2.add(i, new FakeTextFieldBuffer$BufferEntry.Inserted(charAt));
                }
            } else if (i == arrayList2.size()) {
                break;
            }
            i++;
        }
        OffsetMappingStrategy offsetMappingStrategy = this.offsetMappingStrategy;
        offsetMappingStrategy.getClass();
        return new TransformedText(new AnnotatedString(CollectionsKt.joinToString$default(arrayList2, "", null, null, 0, null, new CalloutKt$$ExternalSyntheticLambda1(11), 30)), offsetMappingStrategy.createOffsetMapping(str, arrayList2));
    }

    public final int hashCode() {
        return this.offsetMappingStrategy.hashCode() + ((Character.hashCode(this.maskPlaceholderChar) + (this.mask.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MaskVisualTransformation(mask=" + this.mask + ", maskPlaceholderChar=" + this.maskPlaceholderChar + ", offsetMappingStrategy=" + this.offsetMappingStrategy + ")";
    }
}
