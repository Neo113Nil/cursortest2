package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.emoji2.text.EmojiCompat;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadl;
import com.squareup.cash.beacondetection.real.IBeaconParser;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SelectionMovementDeletionContext {
    public final TextFieldCharSequence initialValue;
    public final SelectionWedgeAffinity initialWedgeAffinity;
    public final boolean isFromSoftKeyboard;
    public long selection;
    public final TransformedTextFieldState state;
    public final String text;
    public final TextLayoutResult textLayoutResult;
    public final TextFieldPreparedSelectionState textPreparedSelectionState;
    public final float visibleTextLayoutHeight;
    public WedgeAffinity wedgeAffinity;

    public SelectionMovementDeletionContext(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z, float f, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z;
        this.visibleTextLayoutHeight = f;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            this.initialValue = visualText;
            this.initialWedgeAffinity = transformedTextFieldState.getSelectionWedgeAffinity();
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            this.selection = visualText.selection;
            this.text = visualText.text.toString();
        } catch (Throwable th) {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final void collapseLeftOr(ButtonKt$$ExternalSyntheticLambda2 buttonKt$$ExternalSyntheticLambda2) {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        if (this.text.length() > 0) {
            if (TextRange.m987getCollapsedimpl(this.selection)) {
                buttonKt$$ExternalSyntheticLambda2.invoke(this);
                return;
            }
            boolean isLtr = isLtr();
            long j = this.selection;
            if (isLtr) {
                int m990getMinimpl = TextRange.m990getMinimpl(j);
                this.selection = SizeKt.TextRange(m990getMinimpl, m990getMinimpl);
            } else {
                int m989getMaximpl = TextRange.m989getMaximpl(j);
                this.selection = SizeKt.TextRange(m989getMaximpl, m989getMaximpl);
            }
        }
    }

    public final void collapseRightOr(ButtonKt$$ExternalSyntheticLambda2 buttonKt$$ExternalSyntheticLambda2) {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        if (this.text.length() > 0) {
            if (TextRange.m987getCollapsedimpl(this.selection)) {
                buttonKt$$ExternalSyntheticLambda2.invoke(this);
                return;
            }
            boolean isLtr = isLtr();
            long j = this.selection;
            if (isLtr) {
                int m989getMaximpl = TextRange.m989getMaximpl(j);
                this.selection = SizeKt.TextRange(m989getMaximpl, m989getMaximpl);
            } else {
                int m990getMinimpl = TextRange.m990getMinimpl(j);
                this.selection = SizeKt.TextRange(m990getMinimpl, m990getMinimpl);
            }
        }
    }

    public final void deleteMovement() {
        if (this.text.length() > 0) {
            TextFieldCharSequence textFieldCharSequence = this.initialValue;
            boolean m987getCollapsedimpl = TextRange.m987getCollapsedimpl(textFieldCharSequence.selection);
            TransformedTextFieldState transformedTextFieldState = this.state;
            if (m987getCollapsedimpl) {
                TransformedTextFieldState.m412replaceTextM8tDOmk$default(transformedTextFieldState, "", SizeKt.TextRange((int) (textFieldCharSequence.selection >> 32), (int) (this.selection & BodyPartID.bodyIdMax)), !this.isFromSoftKeyboard, 4);
            } else {
                transformedTextFieldState.deleteSelectedText();
            }
            this.selection = this.state.getVisualText().selection;
            this.wedgeAffinity = WedgeAffinity.Start;
        }
    }

    public final void deselect() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        if (this.text.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            this.selection = SizeKt.TextRange(i2, i2);
        }
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    public final SelectionWedgeAffinity getInitialWedgeAffinity() {
        return this.initialWedgeAffinity;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m418getSelectiond9O1mEE() {
        return this.selection;
    }

    public final WedgeAffinity getWedgeAffinity() {
        return this.wedgeAffinity;
    }

    public final boolean isLtr() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult == null) {
            return true;
        }
        long j = this.selection;
        int i = TextRange.$r8$clinit;
        return textLayoutResult.multiParagraph.getParagraphDirection((int) (j & BodyPartID.bodyIdMax)) == ResolvedTextDirection.Ltr;
    }

    public final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        long j = this.selection;
        int i2 = TextRange.$r8$clinit;
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        TextFieldPreparedSelectionState textFieldPreparedSelectionState = this.textPreparedSelectionState;
        if (Float.isNaN(textFieldPreparedSelectionState.cachedX)) {
            textFieldPreparedSelectionState.cachedX = textLayoutResult.getCursorRect(i3).left;
        }
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        int lineForOffset = multiParagraph.getLineForOffset(i3) + i;
        if (lineForOffset < 0) {
            return PKIFailureInfo.systemUnavail;
        }
        if (lineForOffset >= multiParagraph.lineCount) {
            return Integer.MAX_VALUE;
        }
        float lineBottom = multiParagraph.getLineBottom(lineForOffset) - 1.0f;
        float f = textFieldPreparedSelectionState.cachedX;
        if ((isLtr() && f >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && f <= textLayoutResult.getLineLeft(lineForOffset))) {
            return multiParagraph.getLineEnd(lineForOffset, true);
        }
        return multiParagraph.m966getOffsetForPositionk4lQ0M((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(lineBottom) & BodyPartID.bodyIdMax));
    }

    public final int jumpByPagesOffset(int i) {
        long j = this.initialValue.selection;
        int i2 = TextRange.$r8$clinit;
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
            float f = this.visibleTextLayoutHeight;
            if (!Float.isNaN(f)) {
                Rect translate = textLayoutResult.getCursorRect(i3).translate(RecyclerView.DECELERATION_RATE, f * i);
                float f2 = translate.top;
                float lineBottom = multiParagraph.getLineBottom(multiParagraph.getLineForVerticalPosition(f2));
                return Math.abs(f2 - lineBottom) > Math.abs(translate.bottom - lineBottom) ? multiParagraph.m966getOffsetForPositionk4lQ0M(translate.m636getTopLeftF1C5BW0()) : multiParagraph.m966getOffsetForPositionk4lQ0M(translate.m631getBottomLeftF1C5BW0());
            }
        }
        return i3;
    }

    public final void moveCursorDownByLine() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        int jumpByLinesOffset = textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, 1) : Integer.MAX_VALUE;
        if (jumpByLinesOffset == Integer.MAX_VALUE) {
            this.textPreparedSelectionState.cachedX = Float.NaN;
        }
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            int length = str.length();
            if (jumpByLinesOffset > length) {
                jumpByLinesOffset = length;
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(jumpByLinesOffset, i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorDownByPage() {
        if (this.text.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(1), i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorLeftByChar() {
        if (isLtr()) {
            moveCursorPrevByChar();
        } else {
            moveCursorNextByChar();
        }
    }

    public final void moveCursorLeftByWord() {
        if (isLtr()) {
            moveCursorPrevByWord();
        } else {
            moveCursorNextByWord();
        }
    }

    public final void moveCursorNextByChar() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(KeyMappingKt.findFollowingBreak(i2, str), i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorNextByParagraph() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = (int) (BodyPartID.bodyIdMax & j);
            int findParagraphEnd = KeyMappingKt.findParagraphEnd(TextRange.m989getMaximpl(j), str);
            if (findParagraphEnd == TextRange.m989getMaximpl(this.selection) && findParagraphEnd != str.length()) {
                findParagraphEnd = KeyMappingKt.findParagraphEnd(findParagraphEnd + 1, str);
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(findParagraphEnd, i, this.state);
            int i2 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i2 != i || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i2, i2);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorNextByWord() {
        int length;
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                int i3 = i2;
                while (true) {
                    TextFieldCharSequence textFieldCharSequence = this.initialValue;
                    if (i3 < textFieldCharSequence.text.length()) {
                        int length2 = str.length() - 1;
                        if (i3 <= length2) {
                            length2 = i3;
                        }
                        long m978getWordBoundaryjx7JFs = textLayoutResult.m978getWordBoundaryjx7JFs(length2);
                        int i4 = TextRange.$r8$clinit;
                        int i5 = (int) (m978getWordBoundaryjx7JFs & BodyPartID.bodyIdMax);
                        if (i5 > i3) {
                            length = i5;
                            break;
                        }
                        i3++;
                    } else {
                        length = textFieldCharSequence.text.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(length, i2, this.state);
            int i6 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i6 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i6, i6);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorPrevByChar() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(KeyMappingKt.findPrecedingBreak(i2, str), i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorPrevByCodePointOrEmoji() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            int i3 = -1;
            if (i2 > 0) {
                EmojiCompat emojiCompatIfLoaded = KeyMappingKt.getEmojiCompatIfLoaded();
                if (emojiCompatIfLoaded != null) {
                    int emojiStart = emojiCompatIfLoaded.getEmojiStart(i2 - 1, str);
                    if (emojiStart >= 0) {
                        i3 = emojiStart;
                    } else if (i2 > 0) {
                        i3 = Character.offsetByCodePoints(str, i2, -1);
                    }
                } else if (i2 > 0) {
                    i3 = Character.offsetByCodePoints(str, i2, -1);
                }
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(i3, i2, this.state);
            int i4 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i4 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i4, i4);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = (int) (BodyPartID.bodyIdMax & j);
            int findParagraphStart = KeyMappingKt.findParagraphStart(TextRange.m990getMinimpl(j), str);
            if (findParagraphStart == TextRange.m990getMinimpl(this.selection) && findParagraphStart != 0) {
                findParagraphStart = KeyMappingKt.findParagraphStart(findParagraphStart - 1, str);
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(findParagraphStart, i, this.state);
            int i2 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i2 != i || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i2, i2);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorPrevByWord() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            int i3 = 0;
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                int i4 = i2;
                while (true) {
                    if (i4 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i4 <= length) {
                        length = i4;
                    }
                    long m978getWordBoundaryjx7JFs = textLayoutResult.m978getWordBoundaryjx7JFs(length);
                    int i5 = TextRange.$r8$clinit;
                    int i6 = (int) (m978getWordBoundaryjx7JFs >> 32);
                    if (i6 < i4) {
                        i3 = i6;
                        break;
                    }
                    i4--;
                }
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(i3, i2, this.state);
            int i7 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i7 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i7, i7);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorRightByChar() {
        if (isLtr()) {
            moveCursorNextByChar();
        } else {
            moveCursorPrevByChar();
        }
    }

    public final void moveCursorRightByWord() {
        if (isLtr()) {
            moveCursorNextByWord();
        } else {
            moveCursorPrevByWord();
        }
    }

    public final void moveCursorToEnd() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(str.length(), i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorToHome() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        if (this.text.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(0, i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorToLineEnd() {
        int length;
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (BodyPartID.bodyIdMax & j);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                length = multiParagraph.getLineEnd(multiParagraph.getLineForOffset(TextRange.m989getMaximpl(j)), true);
            } else {
                length = str.length();
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(length, i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorToLineLeftSide() {
        if (isLtr()) {
            moveCursorToLineStart();
        } else {
            moveCursorToLineEnd();
        }
    }

    public final void moveCursorToLineRightSide() {
        if (isLtr()) {
            moveCursorToLineEnd();
        } else {
            moveCursorToLineStart();
        }
    }

    public final void moveCursorToLineStart() {
        int i;
        this.textPreparedSelectionState.cachedX = Float.NaN;
        if (this.text.length() > 0) {
            long j = this.selection;
            int i2 = TextRange.$r8$clinit;
            int i3 = (int) (BodyPartID.bodyIdMax & j);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            if (textLayoutResult != null) {
                i = textLayoutResult.getLineStart(textLayoutResult.multiParagraph.getLineForOffset(TextRange.m990getMinimpl(j)));
            } else {
                i = 0;
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(i, i3, this.state);
            int i4 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i4 != i3 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i4, i4);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorUpByLine() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        int jumpByLinesOffset = textLayoutResult != null ? jumpByLinesOffset(textLayoutResult, -1) : Integer.MIN_VALUE;
        if (jumpByLinesOffset == Integer.MIN_VALUE) {
            this.textPreparedSelectionState.cachedX = Float.NaN;
        }
        if (this.text.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            if (jumpByLinesOffset < 0) {
                jumpByLinesOffset = 0;
            }
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(jumpByLinesOffset, i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void moveCursorUpByPage() {
        if (this.text.length() > 0) {
            long j = this.selection;
            int i = TextRange.$r8$clinit;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            long calculateNextCursorPositionAndWedgeAffinity = zzadl.calculateNextCursorPositionAndWedgeAffinity(jumpByPagesOffset(-1), i2, this.state);
            int i3 = (int) (calculateNextCursorPositionAndWedgeAffinity >> 32);
            WedgeAffinity m3411component2impl = IBeaconParser.m3411component2impl(calculateNextCursorPositionAndWedgeAffinity);
            if (i3 != i2 || !TextRange.m987getCollapsedimpl(this.selection)) {
                this.selection = SizeKt.TextRange(i3, i3);
            }
            if (m3411component2impl != null) {
                this.wedgeAffinity = m3411component2impl;
            }
        }
    }

    public final void selectAll() {
        this.textPreparedSelectionState.cachedX = Float.NaN;
        String str = this.text;
        if (str.length() > 0) {
            this.selection = SizeKt.TextRange(0, str.length());
        }
    }

    public final void selectMovement() {
        if (this.text.length() > 0) {
            long j = this.initialValue.selection;
            int i = TextRange.$r8$clinit;
            this.selection = SizeKt.TextRange((int) (j >> 32), (int) (this.selection & BodyPartID.bodyIdMax));
        }
    }
}
