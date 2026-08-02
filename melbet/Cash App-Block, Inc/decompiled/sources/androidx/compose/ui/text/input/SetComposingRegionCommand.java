package androidx.compose.ui.text.input;

import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class SetComposingRegionCommand implements EditCommand {
    public final int end;
    public final int start;

    public SetComposingRegionCommand(int i, int i2) {
        this.start = i;
        this.end = i2;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(LongArrayQueue longArrayQueue) {
        boolean z = longArrayQueue.size != -1;
        TimedValueQueue timedValueQueue = (TimedValueQueue) longArrayQueue.data;
        if (z) {
            longArrayQueue.size = -1;
            longArrayQueue.wrapAroundMask = -1;
        }
        int coerceIn = RangesKt___RangesKt.coerceIn(this.start, 0, timedValueQueue.getLength());
        int coerceIn2 = RangesKt___RangesKt.coerceIn(this.end, 0, timedValueQueue.getLength());
        if (coerceIn != coerceIn2) {
            if (coerceIn < coerceIn2) {
                longArrayQueue.setComposition$ui_text(coerceIn, coerceIn2);
            } else {
                longArrayQueue.setComposition$ui_text(coerceIn2, coerceIn);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetComposingRegionCommand)) {
            return false;
        }
        SetComposingRegionCommand setComposingRegionCommand = (SetComposingRegionCommand) obj;
        return this.start == setComposingRegionCommand.start && this.end == setComposingRegionCommand.end;
    }

    public final int hashCode() {
        return (this.start * 31) + this.end;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.start);
        sb.append(", end=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.end, ')');
    }
}
