package androidx.media3.common.util;

import android.view.View;
import androidx.camera.camera2.pipe.CameraPipe$ThreadConfig;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.GapBuffer;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.container.Mp4Box$LeafBox;
import androidx.media3.extractor.mp4.BoxParser;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.payments.presenters.UtilsKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class LongArrayQueue implements BoxParser.SampleSizeBox, OnApplyWindowInsetsListener {
    public final /* synthetic */ int $r8$classId = 0;
    public Object data;
    public int headIndex;
    public int size;
    public int tailIndex;
    public int wrapAroundMask;

    public LongArrayQueue(AnnotatedString annotatedString, long j) {
        String str = annotatedString.text;
        TimedValueQueue timedValueQueue = new TimedValueQueue((byte) 0, 3);
        timedValueQueue.timestamps = str;
        timedValueQueue.first = -1;
        timedValueQueue.size = -1;
        this.data = timedValueQueue;
        this.headIndex = TextRange.m990getMinimpl(j);
        this.tailIndex = TextRange.m989getMaximpl(j);
        this.size = -1;
        this.wrapAroundMask = -1;
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        int m989getMaximpl = TextRange.m989getMaximpl(j);
        if (m990getMinimpl < 0 || m990getMinimpl > str.length()) {
            Path$$ExternalSyntheticBUOutline0.m(str.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(m990getMinimpl, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (m989getMaximpl < 0 || m989getMaximpl > str.length()) {
            Path$$ExternalSyntheticBUOutline0.m(str.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(m989getMaximpl, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (m990getMinimpl <= m989getMaximpl) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Do not set reversed range: ", m990getMinimpl, m989getMaximpl, " > "));
        throw null;
    }

    public void delete$ui_text(int i, int i2) {
        long TextRange = SizeKt.TextRange(i, i2);
        ((TimedValueQueue) this.data).replace(i, i2, "");
        long m3702updateRangeAfterDeletepWDy79M = UtilsKt.m3702updateRangeAfterDeletepWDy79M(SizeKt.TextRange(this.headIndex, this.tailIndex), TextRange);
        setSelectionStart(TextRange.m990getMinimpl(m3702updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m989getMaximpl(m3702updateRangeAfterDeletepWDy79M));
        int i3 = this.size;
        if (i3 != -1) {
            long m3702updateRangeAfterDeletepWDy79M2 = UtilsKt.m3702updateRangeAfterDeletepWDy79M(SizeKt.TextRange(i3, this.wrapAroundMask), TextRange);
            if (TextRange.m987getCollapsedimpl(m3702updateRangeAfterDeletepWDy79M2)) {
                this.size = -1;
                this.wrapAroundMask = -1;
            } else {
                this.size = TextRange.m990getMinimpl(m3702updateRangeAfterDeletepWDy79M2);
                this.wrapAroundMask = TextRange.m989getMaximpl(m3702updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public char get$ui_text(int i) {
        TimedValueQueue timedValueQueue = (TimedValueQueue) this.data;
        GapBuffer gapBuffer = (GapBuffer) timedValueQueue.values;
        if (gapBuffer != null && i >= timedValueQueue.first) {
            int gapLength = gapBuffer.capacity - gapBuffer.gapLength();
            int i2 = timedValueQueue.first;
            if (i >= gapLength + i2) {
                return ((String) timedValueQueue.timestamps).charAt(i - ((gapLength - timedValueQueue.size) + i2));
            }
            int i3 = i - i2;
            int i4 = gapBuffer.gapStart;
            char[] cArr = gapBuffer.buffer;
            return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + gapBuffer.gapEnd];
        }
        return ((String) timedValueQueue.timestamps).charAt(i);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public TextRange m1141getCompositionMzsxiRA$ui_text() {
        int i = this.size;
        if (i != -1) {
            return new TextRange(SizeKt.TextRange(i, this.wrapAroundMask));
        }
        return null;
    }

    @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
    public int getFixedSampleSize() {
        return -1;
    }

    @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
    public int getSampleCount() {
        return this.headIndex;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        View view2 = (View) this.data;
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        int i = this.headIndex;
        if (i >= 0) {
            view2.getLayoutParams().height = i + insets.top;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.tailIndex + insets.left, this.size + insets.top, this.wrapAroundMask + insets.right, view2.getPaddingBottom());
        return windowInsetsCompat;
    }

    @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
    public int readNextSampleSize() {
        ParsableByteArray parsableByteArray = (ParsableByteArray) this.data;
        int i = this.tailIndex;
        if (i == 8) {
            return parsableByteArray.readUnsignedByte();
        }
        if (i == 16) {
            return parsableByteArray.readUnsignedShort();
        }
        int i2 = this.size;
        this.size = i2 + 1;
        if (i2 % 2 != 0) {
            return this.wrapAroundMask & 15;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        this.wrapAroundMask = readUnsignedByte;
        return (readUnsignedByte & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4;
    }

    public long remove() {
        int i = this.size;
        if (i == 0) {
            a$$ExternalSyntheticBUOutline0.m();
            return 0L;
        }
        long[] jArr = (long[]) this.data;
        int i2 = this.headIndex;
        long j = jArr[i2];
        this.headIndex = this.wrapAroundMask & (i2 + 1);
        this.size = i - 1;
        return j;
    }

    public void replace$ui_text(int i, int i2, String str) {
        TimedValueQueue timedValueQueue = (TimedValueQueue) this.data;
        if (i < 0 || i > timedValueQueue.getLength()) {
            Path$$ExternalSyntheticBUOutline0.m(timedValueQueue.getLength(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > timedValueQueue.getLength()) {
            Path$$ExternalSyntheticBUOutline0.m(timedValueQueue.getLength(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Do not set reversed range: ", i, i2, " > "));
                return;
            }
            timedValueQueue.replace(i, i2, str);
            setSelectionStart(str.length() + i);
            setSelectionEnd(str.length() + i);
            this.size = -1;
            this.wrapAroundMask = -1;
        }
    }

    public void setComposition$ui_text(int i, int i2) {
        TimedValueQueue timedValueQueue = (TimedValueQueue) this.data;
        if (i < 0 || i > timedValueQueue.getLength()) {
            Path$$ExternalSyntheticBUOutline0.m(timedValueQueue.getLength(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > timedValueQueue.getLength()) {
            Path$$ExternalSyntheticBUOutline0.m(timedValueQueue.getLength(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Do not set reversed or empty range: ", i, i2, " > "));
        } else {
            this.size = i;
            this.wrapAroundMask = i2;
        }
    }

    public void setSelection$ui_text(int i, int i2) {
        TimedValueQueue timedValueQueue = (TimedValueQueue) this.data;
        if (i < 0 || i > timedValueQueue.getLength()) {
            Path$$ExternalSyntheticBUOutline0.m(timedValueQueue.getLength(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > timedValueQueue.getLength()) {
            Path$$ExternalSyntheticBUOutline0.m(timedValueQueue.getLength(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Do not set reversed range: ", i, i2, " > "));
        } else {
            setSelectionStart(i);
            setSelectionEnd(i2);
        }
    }

    public void setSelectionEnd(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: " + i);
        }
        this.tailIndex = i;
    }

    public void setSelectionStart(int i) {
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: " + i);
        }
        this.headIndex = i;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 2:
                return ((TimedValueQueue) this.data).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ LongArrayQueue() {
    }

    public LongArrayQueue(CameraPipe$ThreadConfig cameraPipe$ThreadConfig) {
        cameraPipe$ThreadConfig.getClass();
        this.data = cameraPipe$ThreadConfig;
        this.headIndex = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
        this.tailIndex = 4;
        this.size = -3;
        this.wrapAroundMask = -1;
    }

    public LongArrayQueue(View view, int i, int i2, int i3, int i4) {
        this.headIndex = i;
        this.data = view;
        this.tailIndex = i2;
        this.size = i3;
        this.wrapAroundMask = i4;
    }

    public LongArrayQueue(Mp4Box$LeafBox mp4Box$LeafBox) {
        ParsableByteArray parsableByteArray = mp4Box$LeafBox.data;
        this.data = parsableByteArray;
        parsableByteArray.setPosition(12);
        this.tailIndex = parsableByteArray.readUnsignedIntToInt() & 255;
        this.headIndex = parsableByteArray.readUnsignedIntToInt();
    }
}
