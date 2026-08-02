package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.TextRange;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class TextClassificationResult {
    public final long selection;
    public final CharSequence text;
    public final TextClassification textClassification;

    public TextClassificationResult(CharSequence charSequence, long j, TextClassification textClassification) {
        this.text = charSequence;
        this.selection = j;
        this.textClassification = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextClassificationResult)) {
            return false;
        }
        TextClassificationResult textClassificationResult = (TextClassificationResult) obj;
        return Intrinsics.areEqual(this.text, textClassificationResult.text) && TextRange.m986equalsimpl0(this.selection, textClassificationResult.selection) && Intrinsics.areEqual(this.textClassification, textClassificationResult.textClassification);
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m452getSelectiond9O1mEE() {
        return this.selection;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextClassification getTextClassification() {
        return this.textClassification;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        int i = TextRange.$r8$clinit;
        return this.textClassification.hashCode() + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.selection);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.text) + ", selection=" + ((Object) TextRange.m992toStringimpl(this.selection)) + ", textClassification=" + this.textClassification + ')';
    }
}
