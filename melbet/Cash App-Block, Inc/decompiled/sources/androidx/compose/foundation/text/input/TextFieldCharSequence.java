package androidx.compose.foundation.text.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.TextRange;
import coil3.size.SizeKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public final class TextFieldCharSequence implements CharSequence {
    public final List composingAnnotations;
    public final TextRange composition;
    public final Pair highlight;
    public final List outputAnnotations;
    public final long selection;
    public final CharSequence text;

    public TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, Pair pair, List list, List list2, int i) {
        textRange = (i & 4) != 0 ? null : textRange;
        pair = (i & 8) != 0 ? null : pair;
        list = (i & 16) != 0 ? null : list;
        list2 = (i & 32) != 0 ? null : list2;
        this.composingAnnotations = list;
        this.outputAnnotations = list2;
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = SizeKt.m1469coerceIn8ffj60Q(charSequence.length(), j);
        this.composition = textRange != null ? new TextRange(SizeKt.m1469coerceIn8ffj60Q(charSequence.length(), textRange.packedValue)) : null;
        this.highlight = pair != null ? new Pair(pair.first, new TextRange(SizeKt.m1469coerceIn8ffj60Q(charSequence.length(), ((TextRange) pair.second).packedValue))) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.text.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldCharSequence.class != obj.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) obj;
        if (TextRange.m986equalsimpl0(this.selection, textFieldCharSequence.selection) && Intrinsics.areEqual(this.composition, textFieldCharSequence.composition) && Intrinsics.areEqual(this.highlight, textFieldCharSequence.highlight) && Intrinsics.areEqual(this.composingAnnotations, textFieldCharSequence.composingAnnotations)) {
            return StringsKt__StringsJVMKt.contentEquals(this.text, textFieldCharSequence.text);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        int i = TextRange.$r8$clinit;
        int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.selection);
        TextRange textRange = this.composition;
        int hashCode2 = (m + (textRange != null ? Long.hashCode(textRange.packedValue) : 0)) * 31;
        Pair pair = this.highlight;
        int hashCode3 = (hashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        List list = this.composingAnnotations;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.text.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.text.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.text.toString();
    }
}
