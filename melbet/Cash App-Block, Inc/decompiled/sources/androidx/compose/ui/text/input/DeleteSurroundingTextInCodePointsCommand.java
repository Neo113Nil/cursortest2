package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public final int lengthAfterCursor;
    public final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.lengthBeforeCursor) {
                int i4 = i3 + 1;
                int i5 = longArrayQueue.headIndex;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(longArrayQueue.get$ui_text((i5 - i4) + (-1))) && Character.isLowSurrogate(longArrayQueue.get$ui_text(longArrayQueue.headIndex - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.lengthAfterCursor) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = longArrayQueue.tailIndex;
            TimedValueQueue timedValueQueue = (TimedValueQueue) longArrayQueue.data;
            if (i8 + i7 >= timedValueQueue.getLength()) {
                i6 = timedValueQueue.getLength() - longArrayQueue.tailIndex;
                break;
            } else {
                i6 = (Character.isHighSurrogate(longArrayQueue.get$ui_text((longArrayQueue.tailIndex + i7) + (-1))) && Character.isLowSurrogate(longArrayQueue.get$ui_text(longArrayQueue.tailIndex + i7))) ? i6 + 2 : i7;
                i++;
            }
        }
        int i9 = longArrayQueue.tailIndex;
        longArrayQueue.delete$ui_text(i9, i6 + i9);
        int i10 = longArrayQueue.headIndex;
        longArrayQueue.delete$ui_text(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public final int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.lengthAfterCursor, ')');
    }
}
