package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.video.Recorder;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.SizeKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final class LegacyCursorAnchorInfoController {
    public Rect decorationBoxBounds;
    public boolean hasPendingImmediateRequest;
    public boolean includeCharacterBounds;
    public boolean includeEditorBounds;
    public boolean includeInsertionMarker;
    public boolean includeLineBounds;
    public Rect innerTextFieldBounds;
    public final Recorder.AnonymousClass1 inputMethodManager;
    public final AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 localToScreen;
    public boolean monitorEnabled;
    public OffsetMapping offsetMapping;
    public TextFieldValue textFieldValue;
    public TextLayoutResult textLayoutResult;
    public final Object lock = new Object();
    public final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    public final float[] matrix = Matrix.m699constructorimpl$default();
    public final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public LegacyCursorAnchorInfoController(AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 androidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1, Recorder.AnonymousClass1 anonymousClass1) {
        this.localToScreen = androidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1;
        this.inputMethodManager = anonymousClass1;
    }

    public final void updateCursorAnchorInfo() {
        boolean z;
        Recorder.AnonymousClass1 anonymousClass1 = this.inputMethodManager;
        InputMethodManager imm = anonymousClass1.getImm();
        View view = (View) anonymousClass1.val$videoEncoderSession;
        if (!imm.isActive(view) || this.textFieldValue == null || this.offsetMapping == null || this.textLayoutResult == null || this.innerTextFieldBounds == null || this.decorationBoxBounds == null) {
            return;
        }
        float[] fArr = this.matrix;
        Matrix.m702resetimpl(fArr);
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) this.localToScreen.$node.layoutCoordinates$delegate.getValue();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates != null) {
                layoutCoordinates.mo846transformToScreen58bKbWc(fArr);
            }
        }
        Rect rect = this.decorationBoxBounds;
        rect.getClass();
        float f = -rect.left;
        Rect rect2 = this.decorationBoxBounds;
        rect2.getClass();
        Matrix.m705translateimpl(fArr, f, -rect2.top);
        android.graphics.Matrix matrix = this.androidMatrix;
        ColorKt.m691setFromEL8BTi8(matrix, fArr);
        TextFieldValue textFieldValue = this.textFieldValue;
        textFieldValue.getClass();
        long j = textFieldValue.selection;
        OffsetMapping offsetMapping = this.offsetMapping;
        offsetMapping.getClass();
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        textLayoutResult.getClass();
        Rect rect3 = this.innerTextFieldBounds;
        rect3.getClass();
        Rect rect4 = this.decorationBoxBounds;
        rect4.getClass();
        boolean z2 = this.includeInsertionMarker;
        boolean z3 = this.includeCharacterBounds;
        boolean z4 = this.includeEditorBounds;
        boolean z5 = this.includeLineBounds;
        CursorAnchorInfo.Builder builder = this.builder;
        builder.reset();
        builder.setMatrix(matrix);
        TextRange textRange = textFieldValue.composition;
        int m990getMinimpl = TextRange.m990getMinimpl(j);
        builder.setSelectionRange(m990getMinimpl, TextRange.m989getMaximpl(j));
        if (!z2 || m990getMinimpl < 0) {
            z = z3;
        } else {
            int originalToTransformed = offsetMapping.originalToTransformed(m990getMinimpl);
            Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
            z = z3;
            float coerceIn = RangesKt___RangesKt.coerceIn(cursorRect.left, RecyclerView.DECELERATION_RATE, (int) (textLayoutResult.size >> 32));
            boolean containsInclusive = MathUtilsKt.containsInclusive(rect3, coerceIn, cursorRect.top);
            boolean containsInclusive2 = MathUtilsKt.containsInclusive(rect3, coerceIn, cursorRect.bottom);
            boolean z6 = textLayoutResult.getBidiRunDirection(originalToTransformed) == ResolvedTextDirection.Rtl;
            int i = (containsInclusive || containsInclusive2) ? 1 : 0;
            if (!containsInclusive || !containsInclusive2) {
                i |= 2;
            }
            if (z6) {
                i |= 4;
            }
            int i2 = i;
            float f2 = cursorRect.top;
            float f3 = cursorRect.bottom;
            builder.setInsertionMarkerLocation(coerceIn, f2, f3, f3, i2);
        }
        if (z) {
            int m990getMinimpl2 = textRange != null ? TextRange.m990getMinimpl(textRange.packedValue) : -1;
            int m989getMaximpl = textRange != null ? TextRange.m989getMaximpl(textRange.packedValue) : -1;
            if (m990getMinimpl2 >= 0 && m990getMinimpl2 < m989getMaximpl) {
                builder.setComposingText(m990getMinimpl2, textFieldValue.annotatedString.text.subSequence(m990getMinimpl2, m989getMaximpl));
                int originalToTransformed2 = offsetMapping.originalToTransformed(m990getMinimpl2);
                int originalToTransformed3 = offsetMapping.originalToTransformed(m989getMaximpl);
                float[] fArr2 = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                textLayoutResult.multiParagraph.m965fillBoundingBoxes8ffj60Q(SizeKt.TextRange(originalToTransformed2, originalToTransformed3), fArr2);
                int i3 = m990getMinimpl2;
                while (i3 < m989getMaximpl) {
                    int originalToTransformed4 = offsetMapping.originalToTransformed(i3);
                    int i4 = (originalToTransformed4 - originalToTransformed2) * 4;
                    float f4 = fArr2[i4];
                    int i5 = m989getMaximpl;
                    float f5 = fArr2[i4 + 1];
                    int i6 = originalToTransformed2;
                    float f6 = fArr2[i4 + 2];
                    float f7 = fArr2[i4 + 3];
                    int i7 = i3;
                    int i8 = (rect3.left < f6 ? 1 : 0) & (f4 < rect3.right ? 1 : 0) & (rect3.top < f7 ? 1 : 0) & (f5 < rect3.bottom ? 1 : 0);
                    if (!MathUtilsKt.containsInclusive(rect3, f4, f5) || !MathUtilsKt.containsInclusive(rect3, f6, f7)) {
                        i8 |= 2;
                    }
                    if (textLayoutResult.getBidiRunDirection(originalToTransformed4) == ResolvedTextDirection.Rtl) {
                        i8 |= 4;
                    }
                    builder.addCharacterBounds(i7, f4, f5, f6, f7, i8);
                    i3 = i7 + 1;
                    m989getMaximpl = i5;
                    originalToTransformed2 = i6;
                }
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 && z4) {
            Api34StartStylusHandwriting.setEditorBoundsInfo(builder, rect4);
        }
        if (i9 >= 34 && z5) {
            HandwritingGestureApi34.addVisibleLineBounds(builder, textLayoutResult, rect3);
        }
        anonymousClass1.getImm().updateCursorAnchorInfo(view, builder.build());
        this.hasPendingImmediateRequest = false;
    }
}
