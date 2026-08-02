package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class DeleteSurroundingTextCommand implements EditCommand {
    public final int lengthAfterCursor;
    public final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        int i = longArrayQueue.tailIndex;
        TimedValueQueue timedValueQueue = (TimedValueQueue) longArrayQueue.data;
        int i2 = this.lengthAfterCursor;
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) < 0) {
            i3 = timedValueQueue.getLength();
        }
        longArrayQueue.delete$ui_text(longArrayQueue.tailIndex, Math.min(i3, timedValueQueue.getLength()));
        int i4 = longArrayQueue.headIndex;
        int i5 = this.lengthBeforeCursor;
        int i6 = i4 - i5;
        if (((i5 ^ i4) & (i4 ^ i6)) < 0) {
            i6 = 0;
        }
        longArrayQueue.delete$ui_text(Math.max(0, i6), longArrayQueue.headIndex);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        DeleteSurroundingTextCommand deleteSurroundingTextCommand = (DeleteSurroundingTextCommand) obj;
        return this.lengthBeforeCursor == deleteSurroundingTextCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextCommand.lengthAfterCursor;
    }

    public final int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.lengthAfterCursor, ')');
    }
}
