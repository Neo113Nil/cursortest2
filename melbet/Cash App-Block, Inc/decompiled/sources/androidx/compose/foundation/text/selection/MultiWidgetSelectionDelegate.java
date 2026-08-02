package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.modifiers.SelectionController$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class MultiWidgetSelectionDelegate {
    public TextLayoutResult _previousTextLayoutResult;
    public final SelectionController$$ExternalSyntheticLambda0 coordinatesCallback;
    public final SelectionController$$ExternalSyntheticLambda0 layoutResultCallback;
    public final long selectableId;
    public final MultiWidgetSelectionDelegate lock = this;
    public int _previousLastVisibleOffset = -1;

    public MultiWidgetSelectionDelegate(long j, SelectionController$$ExternalSyntheticLambda0 selectionController$$ExternalSyntheticLambda0, SelectionController$$ExternalSyntheticLambda0 selectionController$$ExternalSyntheticLambda02) {
        this.selectableId = j;
        this.coordinatesCallback = selectionController$$ExternalSyntheticLambda0;
        this.layoutResultCallback = selectionController$$ExternalSyntheticLambda02;
    }

    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public final long m436getHandlePositiondBAh8RU(Selection selection, boolean z) {
        TextLayoutResult textLayoutResult;
        Selection.AnchorInfo anchorInfo = selection.end;
        Selection.AnchorInfo anchorInfo2 = selection.start;
        long j = this.selectableId;
        if (z && anchorInfo2.selectableId != j) {
            return 9205357640488583168L;
        }
        if ((!z && anchorInfo.selectableId != j) || getLayoutCoordinates() == null || (textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke()) == null) {
            return 9205357640488583168L;
        }
        return SimpleLayoutKt.getSelectionHandleCoordinates(textLayoutResult, RangesKt___RangesKt.coerceIn(z ? anchorInfo2.offset : anchorInfo.offset, 0, getLastVisibleOffset(textLayoutResult)), z, selection.handlesCrossed);
    }

    public final int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i;
        int i2;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (textLayoutResult.getDidOverflowHeight()) {
                        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                        if (!multiParagraph.didExceedMaxLines) {
                            i2 = multiParagraph.getLineForVerticalPosition((int) (textLayoutResult.size & BodyPartID.bodyIdMax));
                            int i3 = textLayoutResult.multiParagraph.lineCount - 1;
                            if (i2 > i3) {
                                i2 = i3;
                            }
                            while (i2 >= 0 && textLayoutResult.multiParagraph.getLineTop(i2) >= ((int) (textLayoutResult.size & BodyPartID.bodyIdMax))) {
                                i2--;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            this._previousLastVisibleOffset = textLayoutResult.multiParagraph.getLineEnd(i2, true);
                            this._previousTextLayoutResult = textLayoutResult;
                        }
                    }
                    i2 = textLayoutResult.multiParagraph.lineCount - 1;
                    this._previousLastVisibleOffset = textLayoutResult.multiParagraph.getLineEnd(i2, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i = this._previousLastVisibleOffset;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.coordinatesCallback.invoke();
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final AnnotatedString getText() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        return textLayoutResult == null ? new AnnotatedString("") : textLayoutResult.layoutInput.text;
    }

    public final int getLastVisibleOffset() {
        TextLayoutResult textLayoutResult = (TextLayoutResult) this.layoutResultCallback.invoke();
        if (textLayoutResult == null) {
            return 0;
        }
        return getLastVisibleOffset(textLayoutResult);
    }
}
