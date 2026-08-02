package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextInclusionStrategy$Companion;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.core.view.inputmethod.InputConnectionCompat$1;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.SegmentedControlKt$$ExternalSyntheticLambda8;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class MathUtilsKt {
    /* renamed from: access$adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m389access$adjustHandwritingDeleteGestureRange72CqOWE(long j, CharSequence charSequence) {
        int i = TextRange.$r8$clinit;
        int i2 = (int) (j >> 32);
        int i3 = (int) (BodyPartID.bodyIdMax & j);
        int codePointBefore = i2 > 0 ? Character.codePointBefore(charSequence, i2) : 10;
        int codePointAt = i3 < charSequence.length() ? Character.codePointAt(charSequence, i3) : 10;
        if (isWhitespaceExceptNewline(codePointBefore) && (isWhitespace(codePointAt) || isPunctuation(codePointAt))) {
            do {
                i2 -= Character.charCount(codePointBefore);
                if (i2 == 0) {
                    break;
                }
                codePointBefore = Character.codePointBefore(charSequence, i2);
            } while (isWhitespaceExceptNewline(codePointBefore));
            return SizeKt.TextRange(i2, i3);
        }
        if (!isWhitespaceExceptNewline(codePointAt)) {
            return j;
        }
        if (!isWhitespace(codePointBefore) && !isPunctuation(codePointBefore)) {
            return j;
        }
        do {
            i3 += Character.charCount(codePointAt);
            if (i3 == charSequence.length()) {
                break;
            }
            codePointAt = Character.codePointAt(charSequence, i3);
        } while (isWhitespaceExceptNewline(codePointAt));
        return SizeKt.TextRange(i2, i3);
    }

    /* renamed from: access$getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m390access$getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult != null) {
            MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
            if (layoutCoordinates != null) {
                long mo844screenToLocalMKHz9U = layoutCoordinates.mo844screenToLocalMKHz9U(j);
                long mo844screenToLocalMKHz9U2 = layoutCoordinates.mo844screenToLocalMKHz9U(j2);
                int m400getLineForHandwritingGestured4ec7I = m400getLineForHandwritingGestured4ec7I(multiParagraph, mo844screenToLocalMKHz9U, viewConfiguration);
                int m400getLineForHandwritingGestured4ec7I2 = m400getLineForHandwritingGestured4ec7I(multiParagraph, mo844screenToLocalMKHz9U2, viewConfiguration);
                if (m400getLineForHandwritingGestured4ec7I != -1) {
                    if (m400getLineForHandwritingGestured4ec7I2 != -1) {
                        m400getLineForHandwritingGestured4ec7I = Math.min(m400getLineForHandwritingGestured4ec7I, m400getLineForHandwritingGestured4ec7I2);
                    }
                    m400getLineForHandwritingGestured4ec7I2 = m400getLineForHandwritingGestured4ec7I;
                } else if (m400getLineForHandwritingGestured4ec7I2 == -1) {
                    return TextRange.Zero;
                }
                float lineBottom = (multiParagraph.getLineBottom(m400getLineForHandwritingGestured4ec7I2) + multiParagraph.getLineTop(m400getLineForHandwritingGestured4ec7I2)) / 2.0f;
                int i = (int) (mo844screenToLocalMKHz9U >> 32);
                int i2 = (int) (mo844screenToLocalMKHz9U2 >> 32);
                return multiParagraph.m967getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineBottom + 0.1f), 0, TextInclusionStrategy$Companion.AnyOverlap);
            }
        }
        return TextRange.Zero;
    }

    /* renamed from: access$getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m392access$getRangeForScreenRectsO048IG0(TextLayoutState textLayoutState, Rect rect, Rect rect2, int i) {
        long m403getRangeForScreenRectOH9lIzo = m403getRangeForScreenRectOH9lIzo(textLayoutState, rect, i);
        if (TextRange.m987getCollapsedimpl(m403getRangeForScreenRectOH9lIzo)) {
            return TextRange.Zero;
        }
        long m403getRangeForScreenRectOH9lIzo2 = m403getRangeForScreenRectOH9lIzo(textLayoutState, rect2, i);
        if (TextRange.m987getCollapsedimpl(m403getRangeForScreenRectOH9lIzo2)) {
            return TextRange.Zero;
        }
        int i2 = (int) (m403getRangeForScreenRectOH9lIzo >> 32);
        int min = Math.min(i2, i2);
        int i3 = (int) (m403getRangeForScreenRectOH9lIzo2 & BodyPartID.bodyIdMax);
        return SizeKt.TextRange(min, Math.max(i3, i3));
    }

    public static final boolean access$isBiDiBoundary(TextLayoutResult textLayoutResult, int i) {
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        int lineForOffset = multiParagraph.getLineForOffset(i);
        return i == textLayoutResult.getLineStart(lineForOffset) || i == multiParagraph.getLineEnd(lineForOffset, false) ? multiParagraph.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i) : textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    public static final long access$rangeOfWhitespaces(int i, CharSequence charSequence) {
        int i2 = i;
        while (i2 > 0) {
            int codePointBefore = Character.codePointBefore(charSequence, i2);
            if (!isWhitespace(codePointBefore)) {
                break;
            }
            i2 -= Character.charCount(codePointBefore);
        }
        while (i < charSequence.length()) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (!isWhitespace(codePointAt)) {
                break;
            }
            i += Character.charCount(codePointAt);
        }
        return SizeKt.TextRange(i2, i);
    }

    public static final ExtractedText access$toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.annotatedString.text;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldValue.selection;
        extractedText.selectionStart = TextRange.m990getMinimpl(j);
        extractedText.selectionEnd = TextRange.m989getMaximpl(j);
        extractedText.flags = !StringsKt.contains((CharSequence) textFieldValue.annotatedString.text, '\n', false) ? 1 : 0;
        return extractedText;
    }

    public static final long access$toOffset(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
    }

    /* renamed from: build-vxqZcH0, reason: not valid java name */
    public static final CursorAnchorInfo m393buildvxqZcH0(CursorAnchorInfo.Builder builder, TextFieldCharSequence textFieldCharSequence, long j, TextRange textRange, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        builder.setSelectionRange(m990getMinimpl, TextRange.m989getMaximpl(j));
        if (z && m990getMinimpl >= 0) {
            Rect cursorRect = textLayoutResult.getCursorRect(m990getMinimpl);
            float coerceIn = RangesKt___RangesKt.coerceIn(cursorRect.left, RecyclerView.DECELERATION_RATE, (int) (textLayoutResult.size >> 32));
            boolean containsInclusive = containsInclusive(rect, coerceIn, cursorRect.top);
            boolean containsInclusive2 = containsInclusive(rect, coerceIn, cursorRect.bottom);
            boolean z5 = textLayoutResult.getBidiRunDirection(m990getMinimpl) == ResolvedTextDirection.Rtl;
            int i = (containsInclusive || containsInclusive2) ? 1 : 0;
            if (!containsInclusive || !containsInclusive2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f = cursorRect.top;
            float f2 = cursorRect.bottom;
            builder.setInsertionMarkerLocation(coerceIn, f, f2, f2, i);
        }
        if (z2) {
            int m990getMinimpl2 = textRange != null ? TextRange.m990getMinimpl(textRange.packedValue) : -1;
            int m989getMaximpl = textRange != null ? TextRange.m989getMaximpl(textRange.packedValue) : -1;
            if (m990getMinimpl2 >= 0 && m990getMinimpl2 < m989getMaximpl) {
                builder.setComposingText(m990getMinimpl2, textFieldCharSequence.text.subSequence(m990getMinimpl2, m989getMaximpl));
                float[] fArr = new float[(m989getMaximpl - m990getMinimpl2) * 4];
                textLayoutResult.multiParagraph.m965fillBoundingBoxes8ffj60Q(SizeKt.TextRange(m990getMinimpl2, m989getMaximpl), fArr);
                for (int i2 = m990getMinimpl2; i2 < m989getMaximpl; i2++) {
                    int i3 = (i2 - m990getMinimpl2) * 4;
                    float f3 = fArr[i3];
                    float f4 = fArr[i3 + 1];
                    float f5 = fArr[i3 + 2];
                    float f6 = fArr[i3 + 3];
                    int i4 = (rect.left < f5 ? 1 : 0) & (f3 < rect.right ? 1 : 0) & (rect.top < f6 ? 1 : 0) & (f4 < rect.bottom ? 1 : 0);
                    if (!containsInclusive(rect, f3, f4) || !containsInclusive(rect, f5, f6)) {
                        i4 |= 2;
                    }
                    if (textLayoutResult.getBidiRunDirection(i2) == ResolvedTextDirection.Rtl) {
                        i4 |= 4;
                    }
                    builder.addCharacterBounds(i2, f3, f4, f5, f6, i4);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 && z3) {
            Api34StartStylusHandwriting.setEditorBoundsInfo(builder, rect2);
        }
        if (i5 >= 34 && z4) {
            HandwritingGestureApi34.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m394coerceIn3MmeM6k(long j, Rect rect) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = rect.left;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = rect.right;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = rect.top;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = rect.bottom;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax);
    }

    public static boolean commitContent(InputConnectionCompat$1 inputConnectionCompat$1, InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return inputConnectionCompat$1.commitContent(inputContentInfo, i, bundle);
    }

    public static final void commitText(ImeEditCommandScope imeEditCommandScope, String str, int i) {
        imeEditCommandScope.edit(new LazyListState$$ExternalSyntheticLambda3(str, i, 2));
    }

    public static final boolean containsInclusive(Rect rect, float f, float f2) {
        float f3 = rect.left;
        if (f > rect.right || f3 > f) {
            return false;
        }
        return f2 <= rect.bottom && rect.top <= f2;
    }

    public static final void deleteSurroundingText(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new ImeEditCommand_androidKt$$ExternalSyntheticLambda1(i, i2, imeEditCommandScope, 1));
    }

    public static final void deleteSurroundingTextInCodePoints(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new SegmentedControlKt$$ExternalSyntheticLambda8(i, i2, 1));
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    public static final float m395distanceSquaredToClosestCornerFromOutside3MmeM6k(long j, Rect rect) {
        if (SimpleLayoutKt.m448containsInclusiveUv8p0NA(j, rect)) {
            return RecyclerView.DECELERATION_RATE;
        }
        float m624getDistanceSquaredimpl = Offset.m624getDistanceSquaredimpl(Offset.m625minusMKHz9U(rect.m636getTopLeftF1C5BW0(), j));
        if (m624getDistanceSquaredimpl >= Float.MAX_VALUE) {
            m624getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float f = rect.right;
        float m624getDistanceSquaredimpl2 = Offset.m624getDistanceSquaredimpl(Offset.m625minusMKHz9U((Float.floatToRawIntBits(rect.top) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32), j));
        if (m624getDistanceSquaredimpl2 < m624getDistanceSquaredimpl) {
            m624getDistanceSquaredimpl = m624getDistanceSquaredimpl2;
        }
        float m624getDistanceSquaredimpl3 = Offset.m624getDistanceSquaredimpl(Offset.m625minusMKHz9U(rect.m631getBottomLeftF1C5BW0(), j));
        if (m624getDistanceSquaredimpl3 < m624getDistanceSquaredimpl) {
            m624getDistanceSquaredimpl = m624getDistanceSquaredimpl3;
        }
        float m624getDistanceSquaredimpl4 = Offset.m624getDistanceSquaredimpl(Offset.m625minusMKHz9U(rect.m632getBottomRightF1C5BW0(), j));
        return m624getDistanceSquaredimpl4 < m624getDistanceSquaredimpl ? m624getDistanceSquaredimpl4 : m624getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m396findClosestRect9KIMszo(long j, Rect rect, Rect rect2) {
        float m395distanceSquaredToClosestCornerFromOutside3MmeM6k = m395distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect);
        float m395distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m395distanceSquaredToClosestCornerFromOutside3MmeM6k(j, rect2);
        if (m395distanceSquaredToClosestCornerFromOutside3MmeM6k == m395distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return m395distanceSquaredToClosestCornerFromOutside3MmeM6k < m395distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final void finishComposingText(ImeEditCommandScope imeEditCommandScope) {
        imeEditCommandScope.edit(new BasicTextKt$$ExternalSyntheticLambda14(28));
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m397fromDecorationToTextLayoutUv8p0NA(TextLayoutState textLayoutState, long j) {
        Offset offset;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offset = new Offset((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo839localPositionOfR5De75A(decoratorNodeCoordinates, j) : j);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.packedValue;
            }
        }
        return j;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m398fromTextLayoutToCoreUv8p0NA(TextLayoutState textLayoutState, long j) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offset = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) textLayoutState.coreNodeCoordinates$delegate.getValue();
                if (layoutCoordinates != null) {
                    if (!layoutCoordinates.isAttached()) {
                        layoutCoordinates = null;
                    }
                    if (layoutCoordinates != null) {
                        offset = new Offset(layoutCoordinates.mo839localPositionOfR5De75A(textLayoutNodeCoordinates, j));
                    }
                }
                if (offset != null) {
                    return offset.packedValue;
                }
            }
        }
        return j;
    }

    public static final Rect fromTextLayoutToDecoration(TextLayoutState textLayoutState, Rect rect) {
        LayoutCoordinates decoratorNodeCoordinates;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates()) != null) {
                LayoutCoordinates layoutCoordinates = decoratorNodeCoordinates.isAttached() ? decoratorNodeCoordinates : null;
                if (layoutCoordinates != null) {
                    return rect.m637translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(textLayoutNodeCoordinates, false).m636getTopLeftF1C5BW0());
                }
            }
        }
        return rect;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m399fromWindowToDecorationUv8p0NA(TextLayoutState textLayoutState, long j) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j : decoratorNodeCoordinates.mo847windowToLocalMKHz9U(j);
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m400getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : RecyclerView.DECELERATION_RATE;
        int i = (int) (BodyPartID.bodyIdMax & j);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin || Float.intBitsToFloat(i) > multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-handwritingGestureLineMargin) || Float.intBitsToFloat(i2) > multiParagraph.width + handwritingGestureLineMargin) {
            return -1;
        }
        return lineForVerticalPosition;
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    public static final int m401getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long mo844screenToLocalMKHz9U;
        int m400getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (m400getLineForHandwritingGestured4ec7I = m400getLineForHandwritingGestured4ec7I(multiParagraph, (mo844screenToLocalMKHz9U = layoutCoordinates.mo844screenToLocalMKHz9U(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m966getOffsetForPositionk4lQ0M(Offset.m620copydBAh8RU$default(RecyclerView.DECELERATION_RATE, (multiParagraph.getLineBottom(m400getLineForHandwritingGestured4ec7I) + multiParagraph.getLineTop(m400getLineForHandwritingGestured4ec7I)) / 2.0f, 1, mo844screenToLocalMKHz9U));
    }

    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m402getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i) {
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        MultiParagraph multiParagraph = layoutResult != null ? layoutResult.value.multiParagraph : null;
        LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
        return (multiParagraph == null || layoutCoordinates == null) ? TextRange.Zero : multiParagraph.m967getRangeForRect86BmAI(rect.m637translatek4lQ0M(layoutCoordinates.mo844screenToLocalMKHz9U(0L)), i, TextInclusionStrategy$Companion.ContainsCenter);
    }

    public static final void imeDelete(TextFieldBuffer textFieldBuffer, int i, int i2) {
        TextRange textRange = textFieldBuffer.composition;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        textFieldBuffer.replace(min, max, "");
        if (textRange != null) {
            long m3660adjustTextRangevJH6DeI = ImageResourcesKt.m3660adjustTextRangevJH6DeI(min, max, 0, textRange.packedValue);
            if (TextRange.m987getCollapsedimpl(m3660adjustTextRangevJH6DeI)) {
                textFieldBuffer.m378setCompositionOEnZFl4(null);
            } else {
                textFieldBuffer.setComposition$foundation(TextRange.m990getMinimpl(m3660adjustTextRangevJH6DeI), TextRange.m989getMaximpl(m3660adjustTextRangevJH6DeI), null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r8 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r6.m378setCompositionOEnZFl4(null);
        r6.highlight = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void imeReplace(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = 0;
        int i4 = min;
        while (i4 < max && i3 < charSequence.length() && charSequence.charAt(i3) == textFieldBuffer.buffer.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (max > i4 && length > i3 && charSequence.charAt(length - 1) == textFieldBuffer.buffer.charAt(max - 1)) {
            length--;
            max--;
        }
        textFieldBuffer.replace(i4, max, charSequence.subSequence(i3, length));
        int length2 = charSequence.length() + min;
        textFieldBuffer.m379setSelection5zctL8(SizeKt.TextRange(length2, length2));
    }

    public static final boolean isPunctuation(int i) {
        int type2 = Character.getType(i);
        return type2 == 23 || type2 == 20 || type2 == 22 || type2 == 30 || type2 == 29 || type2 == 24 || type2 == 21;
    }

    public static final boolean isWhitespace(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean isWhitespaceExceptNewline(int i) {
        int type2;
        return (!isWhitespace(i) || (type2 = Character.getType(i)) == 14 || type2 == 13 || i == 10) ? false : true;
    }

    public static final Modifier legacyTextInputAdapter(Modifier modifier, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return modifier.then(new LegacyAdaptingPlatformTextInputModifier(androidLegacyPlatformTextInputServiceAdapter, legacyTextFieldState, textFieldSelectionManager));
    }

    public static void performHandwritingGesture(NodeChain nodeChain, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int performHandwritingGesture$foundation = Build.VERSION.SDK_INT >= 34 ? HandwritingGestureApi34.performHandwritingGesture$foundation((TransformedTextFieldState) nodeChain.innerCoordinator, handwritingGesture, (TextLayoutState) nodeChain.current, (Function0) nodeChain.buffer, (ViewConfiguration) nodeChain.stack) : 2;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0(intConsumer, performHandwritingGesture$foundation, 0));
        } else {
            intConsumer.accept(performHandwritingGesture$foundation);
        }
    }

    public static boolean previewHandwritingGesture(NodeChain nodeChain, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return HandwritingGestureApi34.previewHandwritingGesture$foundation((TransformedTextFieldState) nodeChain.innerCoordinator, previewableHandwritingGesture, (TextLayoutState) nodeChain.current, cancellationSignal);
        }
        return false;
    }

    public static final void setComposingRegion(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new ImeEditCommand_androidKt$$ExternalSyntheticLambda1(i, i2, imeEditCommandScope, 2));
    }

    public static final void setComposingText(ImeEditCommandScope imeEditCommandScope, String str, int i, ArrayList arrayList) {
        imeEditCommandScope.edit(new PoolGoalMetKt$$ExternalSyntheticLambda6(str, arrayList, i, 2));
    }

    public static final void setSelection(ImeEditCommandScope imeEditCommandScope, int i, int i2) {
        imeEditCommandScope.edit(new ImeEditCommand_androidKt$$ExternalSyntheticLambda1(imeEditCommandScope, i, i2));
    }

    public static final ArrayList toAnnotationList(Spanned spanned) {
        SpanStyle spanStyle;
        FontFamily fontFamily;
        ArrayList arrayList = null;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            if (obj instanceof BackgroundColorSpan) {
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, ColorKt.Color(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, 63487);
            } else if (obj instanceof ForegroundColorSpan) {
                spanStyle = new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER);
            } else if (obj instanceof StrikethroughSpan) {
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.LineThrough, (Shadow) null, 61439);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    spanStyle = new SpanStyle(0L, 0L, FontWeight.Bold, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65531);
                } else if (style != 2) {
                    if (style == 3) {
                        spanStyle = new SpanStyle(0L, 0L, FontWeight.Bold, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65523);
                    }
                    spanStyle = null;
                } else {
                    spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65527);
                }
            } else if (obj instanceof TypefaceSpan) {
                TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                String family = typefaceSpan.getFamily();
                if (Intrinsics.areEqual(family, "cursive")) {
                    fontFamily = FontFamily.Cursive;
                } else if (Intrinsics.areEqual(family, "monospace")) {
                    fontFamily = FontFamily.Monospace;
                } else if (Intrinsics.areEqual(family, "sans-serif")) {
                    fontFamily = FontFamily.SansSerif;
                } else if (Intrinsics.areEqual(family, "serif")) {
                    fontFamily = FontFamily.Serif;
                } else {
                    String family2 = typefaceSpan.getFamily();
                    if (family2 != null && family2.length() != 0) {
                        Typeface create = Typeface.create(family2, 0);
                        Typeface typeface = Typeface.DEFAULT;
                        if (Intrinsics.areEqual(create, typeface) || Intrinsics.areEqual(create, Typeface.create(typeface, 0))) {
                            create = null;
                        }
                        if (create != null) {
                            fontFamily = new LoadedFontFamily(new Recorder.AnonymousClass6(create, 18));
                        }
                    }
                    fontFamily = null;
                }
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 65503);
            } else {
                if (obj instanceof UnderlineSpan) {
                    spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61439);
                }
                spanStyle = null;
            }
            if (spanStyle != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(new AnnotatedString.Range(spanStyle, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
            }
        }
        return arrayList;
    }

    public static final void toCharArray(CharSequence charSequence, char[] cArr, int i, int i2, int i3) {
        if (charSequence instanceof TextFieldCharSequence) {
            toCharArray(((TextFieldCharSequence) charSequence).text, cArr, i, i2, i3);
            return;
        }
        while (i2 < i3) {
            cArr[i] = charSequence.charAt(i2);
            i2++;
            i++;
        }
    }

    public static final void toTransferableContent(Toolbar.AnonymousClass1 anonymousClass1, Bundle bundle) {
        new ClipData(anonymousClass1.getDescription(), new ClipData.Item(anonymousClass1.getContentUri()));
        anonymousClass1.getDescription();
        anonymousClass1.getLinkUri();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
    }

    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m403getRangeForScreenRectOH9lIzo(TextLayoutState textLayoutState, Rect rect, int i) {
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        MultiParagraph multiParagraph = layoutResult != null ? layoutResult.multiParagraph : null;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (multiParagraph != null && textLayoutNodeCoordinates != null) {
            return multiParagraph.m967getRangeForRect86BmAI(rect.m637translatek4lQ0M(textLayoutNodeCoordinates.mo844screenToLocalMKHz9U(0L)), i, TextInclusionStrategy$Companion.ContainsCenter);
        }
        return TextRange.Zero;
    }

    /* renamed from: access$getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m391access$getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i) {
        long m402getRangeForScreenRectOH9lIzo = m402getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i);
        if (TextRange.m987getCollapsedimpl(m402getRangeForScreenRectOH9lIzo)) {
            return TextRange.Zero;
        }
        long m402getRangeForScreenRectOH9lIzo2 = m402getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i);
        if (TextRange.m987getCollapsedimpl(m402getRangeForScreenRectOH9lIzo2)) {
            return TextRange.Zero;
        }
        int i2 = (int) (m402getRangeForScreenRectOH9lIzo >> 32);
        int min = Math.min(i2, i2);
        int i3 = (int) (m402getRangeForScreenRectOH9lIzo2 & BodyPartID.bodyIdMax);
        return SizeKt.TextRange(min, Math.max(i3, i3));
    }

    public static final ExtractedText access$toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldCharSequence;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.text.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldCharSequence.selection;
        extractedText.selectionStart = TextRange.m990getMinimpl(j);
        extractedText.selectionEnd = TextRange.m989getMaximpl(j);
        extractedText.flags = !StringsKt.contains((CharSequence) textFieldCharSequence, '\n', false) ? 1 : 0;
        return extractedText;
    }
}
