package androidx.compose.ui.text.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import androidx.compose.ui.text.TextRange;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import coil3.size.SizeKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final WorkLauncherImpl Saver = new WorkLauncherImpl(8, new SaversKt$$ExternalSyntheticLambda5(6), new TransactorKt$$ExternalSyntheticLambda0(16));
    public final AnnotatedString annotatedString;
    public final TextRange composition;
    public final long selection;

    public TextFieldValue(AnnotatedString annotatedString, long j, TextRange textRange) {
        TextRange textRange2;
        this.annotatedString = annotatedString;
        this.selection = SizeKt.m1469coerceIn8ffj60Q(annotatedString.text.length(), j);
        if (textRange != null) {
            textRange2 = new TextRange(SizeKt.m1469coerceIn8ffj60Q(annotatedString.text.length(), textRange.packedValue));
        } else {
            textRange2 = null;
        }
        this.composition = textRange2;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static TextFieldValue m1001copy3r_uNRQ$default(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j, int i) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        TextRange textRange = (i & 4) != 0 ? textFieldValue.composition : null;
        textFieldValue.getClass();
        return new TextFieldValue(annotatedString, j, textRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return TextRange.m986equalsimpl0(this.selection, textFieldValue.selection) && Intrinsics.areEqual(this.composition, textFieldValue.composition) && Intrinsics.areEqual(this.annotatedString, textFieldValue.annotatedString);
    }

    public final int hashCode() {
        int hashCode = this.annotatedString.hashCode() * 31;
        int i = TextRange.$r8$clinit;
        int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.selection);
        TextRange textRange = this.composition;
        return m + (textRange != null ? Long.hashCode(textRange.packedValue) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) TextRange.m992toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static TextFieldValue m1002copy3r_uNRQ$default(TextFieldValue textFieldValue, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        TextRange textRange = textFieldValue.composition;
        textFieldValue.getClass();
        return new TextFieldValue(new AnnotatedString(str), j, textRange);
    }

    public TextFieldValue(String str, long j, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.Zero : j, (TextRange) null);
    }

    public TextFieldValue(String str, long j, TextRange textRange) {
        this(new AnnotatedString(str), j, textRange);
    }
}
