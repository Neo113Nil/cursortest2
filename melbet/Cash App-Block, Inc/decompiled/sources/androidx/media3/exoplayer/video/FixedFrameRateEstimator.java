package androidx.media3.exoplayer.video;

import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import java.util.Arrays;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class FixedFrameRateEstimator implements MouseSelectionObserver {
    public Object candidateMatcher;
    public boolean candidateMatcherActive;
    public Object currentMatcher;
    public int framesWithoutSyncCount;
    public long lastFramePresentationTimeNs;

    public final class Matcher {
        public long firstFrameDurationNs;
        public long firstFramePresentationTimeNs;
        public long frameCount;
        public long lastFramePresentationTimeNs;
        public long matchingFrameCount;
        public long matchingFrameDurationSumNs;
        public int recentFrameOutlierCount;
        public final boolean[] recentFrameOutlierFlags = new boolean[15];

        public final boolean isSynced() {
            return this.frameCount > 15 && this.recentFrameOutlierCount == 0;
        }

        public final void onNextFrame(long j) {
            long j2 = this.frameCount;
            if (j2 == 0) {
                this.firstFramePresentationTimeNs = j;
            } else if (j2 == 1) {
                long j3 = j - this.firstFramePresentationTimeNs;
                this.firstFrameDurationNs = j3;
                this.matchingFrameDurationSumNs = j3;
                this.matchingFrameCount = 1L;
            } else {
                long j4 = j - this.lastFramePresentationTimeNs;
                int i = (int) (j2 % 15);
                long abs = Math.abs(j4 - this.firstFrameDurationNs);
                boolean[] zArr = this.recentFrameOutlierFlags;
                if (abs <= 1000000) {
                    this.matchingFrameCount++;
                    this.matchingFrameDurationSumNs += j4;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.recentFrameOutlierCount--;
                    }
                } else if (!zArr[i]) {
                    zArr[i] = true;
                    this.recentFrameOutlierCount++;
                }
            }
            this.frameCount++;
            this.lastFramePresentationTimeNs = j;
        }

        public final void reset() {
            this.frameCount = 0L;
            this.matchingFrameCount = 0L;
            this.matchingFrameDurationSumNs = 0L;
            this.recentFrameOutlierCount = 0;
            Arrays.fill(this.recentFrameOutlierFlags, false);
        }
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onDrag-3MmeM6k */
    public boolean mo119onDrag3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
        TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.candidateMatcher;
        TextLayoutState textLayoutState = textFieldSelectionState.textLayoutState;
        TransformedTextFieldState transformedTextFieldState = textFieldSelectionState.textFieldState;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (!textFieldSelectionState.enabled || layoutResult == null || transformedTextFieldState.getVisualText().text.length() == 0) {
            return false;
        }
        if (TextRange.m986equalsimpl0(transformedTextFieldState.getVisualText().selection, m1146updateSelection12glfjA(j, selectionAdjustment$Companion$$ExternalSyntheticLambda0, layoutResult, false))) {
            return true;
        }
        this.candidateMatcherActive = false;
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    public void onDragDone() {
        TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.candidateMatcher;
        textFieldSelectionState.directDragGestureInitiator$delegate.setValue(TextFieldSelectionState.InputType.None);
        if (this.candidateMatcherActive) {
            textFieldSelectionState.maybeSuggestSelectionRange();
        }
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onExtend-k-4lQ0M */
    public boolean mo120onExtendk4lQ0M(long j) {
        TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.candidateMatcher;
        TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
        if (!textFieldSelectionState.enabled || layoutResult == null || textFieldSelectionState.textFieldState.getVisualText().text.length() == 0) {
            return false;
        }
        this.candidateMatcherActive = false;
        ((DialogHostKt$$ExternalSyntheticLambda0) this.currentMatcher).invoke();
        m1146updateSelection12glfjA(j, SelectionAdjustment$Companion.None, layoutResult, false);
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onExtendDrag-k-4lQ0M */
    public boolean mo121onExtendDragk4lQ0M(long j) {
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
    /* renamed from: onStart-9KIMszo */
    public boolean mo122onStart9KIMszo(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, int i) {
        TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.candidateMatcher;
        TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
        if (!textFieldSelectionState.enabled || layoutResult == null || textFieldSelectionState.textFieldState.getVisualText().text.length() == 0) {
            return false;
        }
        this.candidateMatcherActive = i >= 2;
        textFieldSelectionState.directDragGestureInitiator$delegate.setValue(TextFieldSelectionState.InputType.Mouse);
        ((DialogHostKt$$ExternalSyntheticLambda0) this.currentMatcher).invoke();
        textFieldSelectionState.previousRawDragOffset = -1;
        this.framesWithoutSyncCount = -1;
        this.lastFramePresentationTimeNs = j;
        this.framesWithoutSyncCount = (int) (m1146updateSelection12glfjA(j, selectionAdjustment$Companion$$ExternalSyntheticLambda0, layoutResult, true) >> 32);
        return true;
    }

    /* renamed from: updateSelection-12glfjA, reason: not valid java name */
    public long m1146updateSelection12glfjA(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, TextLayoutResult textLayoutResult, boolean z) {
        TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) this.candidateMatcher;
        int length = textLayoutResult.layoutInput.text.text.length();
        int i = this.framesWithoutSyncCount;
        if (i < 0 || i > length) {
            i = textFieldSelectionState.textLayoutState.m410getOffsetForPosition3MmeM6k(this.lastFramePresentationTimeNs, false);
        }
        int i2 = i;
        long m423updateSelectionQkiN0lo$foundation = textFieldSelectionState.m423updateSelectionQkiN0lo$foundation(textFieldSelectionState.textFieldState.getVisualText(), i2, textFieldSelectionState.textLayoutState.m410getOffsetForPosition3MmeM6k(j, false), false, selectionAdjustment$Companion$$ExternalSyntheticLambda0, false, z, null);
        if (this.framesWithoutSyncCount == -1 && !TextRange.m987getCollapsedimpl(m423updateSelectionQkiN0lo$foundation)) {
            this.framesWithoutSyncCount = (int) (m423updateSelectionQkiN0lo$foundation >> 32);
        }
        if (TextRange.m991getReversedimpl(m423updateSelectionQkiN0lo$foundation)) {
            m423updateSelectionQkiN0lo$foundation = SizeKt.TextRange((int) (BodyPartID.bodyIdMax & m423updateSelectionQkiN0lo$foundation), (int) (m423updateSelectionQkiN0lo$foundation >> 32));
        }
        textFieldSelectionState.textFieldState.m416selectCharsIn5zctL8(m423updateSelectionQkiN0lo$foundation);
        textFieldSelectionState.setTextToolbarState(TextToolbarState.Selection);
        return m423updateSelectionQkiN0lo$foundation;
    }
}
