package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.text.TextLayoutResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class SelectableInfo {
    public final int rawEndHandleOffset;
    public final int rawPreviousHandleOffset;
    public final int rawStartHandleOffset;
    public final long selectableId;
    public final int slot;
    public final TextLayoutResult textLayoutResult;

    public SelectableInfo(long j, int i, int i2, int i3, int i4, TextLayoutResult textLayoutResult) {
        this.selectableId = j;
        this.slot = i;
        this.rawStartHandleOffset = i2;
        this.rawEndHandleOffset = i3;
        this.rawPreviousHandleOffset = i4;
        this.textLayoutResult = textLayoutResult;
    }

    public final Selection.AnchorInfo anchorForOffset(int i) {
        return new Selection.AnchorInfo(SimpleLayoutKt.getTextDirectionForOffset(this.textLayoutResult, i), i, this.selectableId);
    }

    public final CrossStatus getRawCrossStatus() {
        int i = this.rawStartHandleOffset;
        int i2 = this.rawEndHandleOffset;
        return i < i2 ? CrossStatus.NOT_CROSSED : i > i2 ? CrossStatus.CROSSED : CrossStatus.COLLAPSED;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.selectableId);
        sb.append(", range=(");
        int i = this.rawStartHandleOffset;
        sb.append(i);
        sb.append('-');
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        sb.append(SimpleLayoutKt.getTextDirectionForOffset(textLayoutResult, i));
        sb.append(',');
        int i2 = this.rawEndHandleOffset;
        sb.append(i2);
        sb.append('-');
        sb.append(SimpleLayoutKt.getTextDirectionForOffset(textLayoutResult, i2));
        sb.append("), prevOffset=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.rawPreviousHandleOffset, ')');
    }
}
