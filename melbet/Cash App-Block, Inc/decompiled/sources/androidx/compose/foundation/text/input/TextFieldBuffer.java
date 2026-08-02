package androidx.compose.foundation.text.input;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.internal.ChangeTracker$Change;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Pair;
import kotlin.ranges.RangesKt___RangesKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class TextFieldBuffer implements Appendable {
    public WorkLauncherImpl backingChangeTracker;
    public final PartialGapBuffer buffer;
    public MutableVector composingAnnotations;
    public TextRange composition;
    public Pair highlight;
    public final IntStack offsetMappingCalculator;
    public final TextFieldCharSequence originalValue;
    public long selectionInChars;

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, WorkLauncherImpl workLauncherImpl, TextFieldCharSequence textFieldCharSequence2, IntStack intStack, int i) {
        MutableVector mutableVector = null;
        workLauncherImpl = (i & 2) != 0 ? null : workLauncherImpl;
        textFieldCharSequence2 = (i & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2;
        intStack = (i & 8) != 0 ? null : intStack;
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = intStack;
        PartialGapBuffer partialGapBuffer = new PartialGapBuffer();
        partialGapBuffer.text = textFieldCharSequence;
        partialGapBuffer.bufStart = -1;
        partialGapBuffer.bufEnd = -1;
        this.buffer = partialGapBuffer;
        this.backingChangeTracker = workLauncherImpl != null ? new WorkLauncherImpl(workLauncherImpl) : null;
        long j = textFieldCharSequence.selection;
        List list = textFieldCharSequence.composingAnnotations;
        this.selectionInChars = j;
        this.composition = textFieldCharSequence.composition;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            AnnotatedString.Range[] rangeArr = new AnnotatedString.Range[size];
            for (int i2 = 0; i2 < size; i2++) {
                rangeArr[i2] = (AnnotatedString.Range) list.get(i2);
            }
            mutableVector = new MutableVector(size, rangeArr);
        }
        this.composingAnnotations = mutableVector;
    }

    /* renamed from: toTextFieldCharSequence-wFTz33Y$foundation$default, reason: not valid java name */
    public static TextFieldCharSequence m377toTextFieldCharSequencewFTz33Y$foundation$default(TextFieldBuffer textFieldBuffer, long j, TextRange textRange, int i) {
        List list;
        if ((i & 1) != 0) {
            j = textFieldBuffer.selectionInChars;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            textRange = textFieldBuffer.composition;
        }
        TextRange textRange2 = textRange;
        MutableVector mutableVector = textFieldBuffer.composingAnnotations;
        if (mutableVector != null) {
            List asMutableList = mutableVector.asMutableList();
            if (!asMutableList.isEmpty()) {
                list = asMutableList;
                return new TextFieldCharSequence(textFieldBuffer.buffer.toString(), j2, textRange2, null, list, null, 8);
            }
        }
        list = null;
        return new TextFieldCharSequence(textFieldBuffer.buffer.toString(), j2, textRange2, null, list, null, 8);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.buffer;
            onTextWillChange(partialGapBuffer.length(), partialGapBuffer.length(), charSequence.length());
            partialGapBuffer.replace(partialGapBuffer.length(), partialGapBuffer.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    public final WorkLauncherImpl getChangeTracker$foundation() {
        WorkLauncherImpl workLauncherImpl = this.backingChangeTracker;
        if (workLauncherImpl != null) {
            return workLauncherImpl;
        }
        WorkLauncherImpl workLauncherImpl2 = new WorkLauncherImpl((WorkLauncherImpl) null);
        this.backingChangeTracker = workLauncherImpl2;
        return workLauncherImpl2;
    }

    public final void onTextWillChange(int i, int i2, int i3) {
        int i4;
        WorkLauncherImpl changeTracker$foundation = getChangeTracker$foundation();
        if (i != i2 || i3 != 0) {
            int min = Math.min(i, i2);
            int max = Math.max(i, i2);
            int i5 = i3 - (max - min);
            int i6 = 0;
            ChangeTracker$Change changeTracker$Change = null;
            boolean z = false;
            while (true) {
                MutableVector mutableVector = (MutableVector) changeTracker$foundation.processor;
                if (i6 >= mutableVector.size) {
                    break;
                }
                ChangeTracker$Change changeTracker$Change2 = (ChangeTracker$Change) mutableVector.content[i6];
                int i7 = changeTracker$Change2.preStart;
                if ((min > i7 || i7 > max) && ((min > (i4 = changeTracker$Change2.preEnd) || i4 > max) && ((min > i4 || i7 > min) && (max > i4 || i7 > max)))) {
                    if (i7 > max && !z) {
                        changeTracker$foundation.appendNewChange(changeTracker$Change, min, max, i5);
                        z = true;
                    }
                    if (z) {
                        changeTracker$Change2.preStart += i5;
                        changeTracker$Change2.preEnd += i5;
                    }
                    ((MutableVector) changeTracker$foundation.workTaskExecutor).add(changeTracker$Change2);
                } else if (changeTracker$Change == null) {
                    changeTracker$Change = changeTracker$Change2;
                } else {
                    changeTracker$Change.preEnd = changeTracker$Change2.preEnd;
                    changeTracker$Change.originalEnd = changeTracker$Change2.originalEnd;
                }
                i6++;
            }
            if (!z) {
                changeTracker$foundation.appendNewChange(changeTracker$Change, min, max, i5);
            }
            MutableVector mutableVector2 = (MutableVector) changeTracker$foundation.processor;
            changeTracker$foundation.processor = (MutableVector) changeTracker$foundation.workTaskExecutor;
            changeTracker$foundation.workTaskExecutor = mutableVector2;
            mutableVector2.clear();
        }
        IntStack intStack = this.offsetMappingCalculator;
        if (intStack != null) {
            intStack.recordEditOperation(i, i2, i3);
        }
        this.selectionInChars = ImageResourcesKt.m3660adjustTextRangevJH6DeI(i, i2, i3, this.selectionInChars);
    }

    public final void replace(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected start=" + i + " <= end=" + i2);
        }
        if (length < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected textStart=0 <= textEnd=" + length);
        }
        PartialGapBuffer partialGapBuffer = this.buffer;
        int coerceIn = RangesKt___RangesKt.coerceIn(i, 0, partialGapBuffer.length());
        int coerceIn2 = RangesKt___RangesKt.coerceIn(i2, 0, partialGapBuffer.length());
        int coerceIn3 = RangesKt___RangesKt.coerceIn(0, 0, charSequence.length());
        int coerceIn4 = RangesKt___RangesKt.coerceIn(length, 0, charSequence.length());
        onTextWillChange(coerceIn, coerceIn2, coerceIn4 - coerceIn3);
        partialGapBuffer.replace(coerceIn, coerceIn2, charSequence, coerceIn3, coerceIn4);
        m378setCompositionOEnZFl4(null);
        this.highlight = null;
    }

    public final void revertAllChanges() {
        int length = this.buffer.length();
        TextFieldCharSequence textFieldCharSequence = this.originalValue;
        replace(0, length, textFieldCharSequence.text.toString());
        m379setSelection5zctL8(textFieldCharSequence.selection);
        getChangeTracker$foundation().clearChanges();
    }

    public final void setComposition$foundation(int i, int i2, List list) {
        PartialGapBuffer partialGapBuffer = this.buffer;
        if (i < 0 || i > partialGapBuffer.length()) {
            Path$$ExternalSyntheticBUOutline0.m(partialGapBuffer.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > partialGapBuffer.length()) {
            Path$$ExternalSyntheticBUOutline0.m(partialGapBuffer.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "end (", ") offset is outside of text region "));
            return;
        }
        if (i >= i2) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Do not set reversed or empty range: ", i, i2, " > "));
            return;
        }
        m378setCompositionOEnZFl4(new TextRange(SizeKt.TextRange(i, i2)));
        MutableVector mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.composingAnnotations == null) {
            this.composingAnnotations = new MutableVector(0, new AnnotatedString.Range[16]);
        }
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
            MutableVector mutableVector2 = this.composingAnnotations;
            if (mutableVector2 != null) {
                mutableVector2.add(AnnotatedString.Range.copy$default(range, null, range.start + i, range.end + i, 9));
            }
        }
    }

    /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
    public final void m378setCompositionOEnZFl4(TextRange textRange) {
        if (textRange != null && !TextRange.m987getCollapsedimpl(textRange.packedValue)) {
            this.composition = textRange;
            return;
        }
        this.composition = null;
        MutableVector mutableVector = this.composingAnnotations;
        if (mutableVector != null) {
            mutableVector.clear();
        }
    }

    /* renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m379setSelection5zctL8(long j) {
        long TextRange = SizeKt.TextRange(0, this.buffer.length());
        if (!TextRange.m984contains5zctL8(TextRange, j)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected " + ((Object) TextRange.m992toStringimpl(j)) + " to be in " + ((Object) TextRange.m992toStringimpl(TextRange)));
        }
        this.selectionInChars = j;
        this.highlight = null;
    }

    public final String toString() {
        return this.buffer.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        PartialGapBuffer partialGapBuffer = this.buffer;
        onTextWillChange(partialGapBuffer.length(), partialGapBuffer.length(), 1);
        partialGapBuffer.replace(partialGapBuffer.length(), partialGapBuffer.length(), r5, 0, String.valueOf(c).length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            PartialGapBuffer partialGapBuffer = this.buffer;
            onTextWillChange(partialGapBuffer.length(), partialGapBuffer.length(), i2 - i);
            partialGapBuffer.replace(partialGapBuffer.length(), partialGapBuffer.length(), r5, 0, charSequence.subSequence(i, i2).length());
        }
        return this;
    }
}
