package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class CommitTextCommand implements EditCommand {
    public final AnnotatedString annotatedString;
    public final int newCursorPosition;

    public CommitTextCommand(String str, int i) {
        this(new AnnotatedString(str), i);
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        int i = longArrayQueue.size;
        AnnotatedString annotatedString = this.annotatedString;
        if (i != -1) {
            longArrayQueue.replace$ui_text(i, longArrayQueue.wrapAroundMask, annotatedString.text);
        } else {
            longArrayQueue.replace$ui_text(longArrayQueue.headIndex, longArrayQueue.tailIndex, annotatedString.text);
        }
        int i2 = longArrayQueue.headIndex;
        int i3 = longArrayQueue.tailIndex;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.newCursorPosition;
        int coerceIn = RangesKt___RangesKt.coerceIn(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - annotatedString.text.length(), 0, ((TimedValueQueue) longArrayQueue.data).getLength());
        longArrayQueue.setSelection$ui_text(coerceIn, coerceIn);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        return Intrinsics.areEqual(this.annotatedString.text, commitTextCommand.annotatedString.text) && this.newCursorPosition == commitTextCommand.newCursorPosition;
    }

    public final int hashCode() {
        return (this.annotatedString.text.hashCode() * 31) + this.newCursorPosition;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.annotatedString.text);
        sb.append("', newCursorPosition=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.newCursorPosition, ')');
    }

    public CommitTextCommand(AnnotatedString annotatedString, int i) {
        this.annotatedString = annotatedString;
        this.newCursorPosition = i;
    }
}
