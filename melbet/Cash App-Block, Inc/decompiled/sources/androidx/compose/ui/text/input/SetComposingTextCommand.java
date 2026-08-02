package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class SetComposingTextCommand implements EditCommand {
    public final AnnotatedString annotatedString;
    public final int newCursorPosition;

    public SetComposingTextCommand(String str, int i) {
        this.annotatedString = new AnnotatedString(str);
        this.newCursorPosition = i;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        int i = longArrayQueue.size;
        AnnotatedString annotatedString = this.annotatedString;
        if (i != -1) {
            int i2 = longArrayQueue.wrapAroundMask;
            String str = annotatedString.text;
            String str2 = annotatedString.text;
            longArrayQueue.replace$ui_text(i, i2, str);
            if (str2.length() > 0) {
                longArrayQueue.setComposition$ui_text(i, str2.length() + i);
            }
        } else {
            int i3 = longArrayQueue.headIndex;
            int i4 = longArrayQueue.tailIndex;
            String str3 = annotatedString.text;
            String str4 = annotatedString.text;
            longArrayQueue.replace$ui_text(i3, i4, str3);
            if (str4.length() > 0) {
                longArrayQueue.setComposition$ui_text(i3, str4.length() + i3);
            }
        }
        int i5 = longArrayQueue.headIndex;
        int i6 = longArrayQueue.tailIndex;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.newCursorPosition;
        int coerceIn = RangesKt___RangesKt.coerceIn(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - annotatedString.text.length(), 0, ((TimedValueQueue) longArrayQueue.data).getLength());
        longArrayQueue.setSelection$ui_text(coerceIn, coerceIn);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) obj;
        return Intrinsics.areEqual(this.annotatedString.text, setComposingTextCommand.annotatedString.text) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    public final int hashCode() {
        return (this.annotatedString.text.hashCode() * 31) + this.newCursorPosition;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.annotatedString.text);
        sb.append("', newCursorPosition=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.newCursorPosition, ')');
    }
}
