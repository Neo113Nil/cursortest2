package androidx.compose.material3;

import androidx.biometric.BiometricPrompt;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class DateVisualTransformation implements VisualTransformation {
    public final int dateFormatLength;
    public final DateInputFormat dateInputFormat;
    public final BiometricPrompt dateOffsetTranslator;
    public final int firstDelimiterOffset;
    public final int secondDelimiterOffset;

    public DateVisualTransformation(DateInputFormat dateInputFormat) {
        this.dateInputFormat = dateInputFormat;
        String str = dateInputFormat.patternWithDelimiters;
        char c = dateInputFormat.delimiter;
        this.firstDelimiterOffset = StringsKt.indexOf$default((CharSequence) str, c, 0, false, 6);
        this.secondDelimiterOffset = StringsKt.lastIndexOf$default(c, 0, 6, str);
        this.dateFormatLength = dateInputFormat.patternWithoutDelimiters.length();
        this.dateOffsetTranslator = new BiometricPrompt(this, 19);
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText filter(AnnotatedString annotatedString) {
        int length = annotatedString.text.length();
        String str = annotatedString.text;
        int i = 0;
        int i2 = this.dateFormatLength;
        if (length > i2) {
            str = StringsKt.substring(str, RangesKt___RangesKt.until(0, i2));
        }
        String str2 = "";
        int i3 = 0;
        while (i < str.length()) {
            int i4 = i3 + 1;
            str2 = str2 + str.charAt(i);
            if (i4 == this.firstDelimiterOffset || i3 + 2 == this.secondDelimiterOffset) {
                StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str2);
                m.append(this.dateInputFormat.delimiter);
                str2 = m.toString();
            }
            i++;
            i3 = i4;
        }
        return new TransformedText(new AnnotatedString(str2), this.dateOffsetTranslator);
    }
}
