package androidx.compose.ui.text.input;

import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class SetSelectionCommand implements EditCommand {
    public final int end;
    public final int start;

    public SetSelectionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        int coerceIn = RangesKt___RangesKt.coerceIn(this.start, 0, ((TimedValueQueue) longArrayQueue.data).getLength());
        int coerceIn2 = RangesKt___RangesKt.coerceIn(this.end, 0, ((TimedValueQueue) longArrayQueue.data).getLength());
        if (coerceIn < coerceIn2) {
            longArrayQueue.setSelection$ui_text(coerceIn, coerceIn2);
        } else {
            longArrayQueue.setSelection$ui_text(coerceIn2, coerceIn);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetSelectionCommand)) {
            return false;
        }
        SetSelectionCommand setSelectionCommand = (SetSelectionCommand) obj;
        return this.start == setSelectionCommand.start && this.end == setSelectionCommand.end;
    }

    public final int hashCode() {
        return (this.start * 31) + this.end;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.end, ')');
    }
}
