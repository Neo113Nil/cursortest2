package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.paging.FlowExtKt$simpleScan$1;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {
    public SharedFlowImpl backingStylusHandwritingTrigger;
    public LegacyTextInputMethodRequest currentRequest;
    public StandaloneCoroutine job;
    public LegacyAdaptingPlatformTextInputModifierNode textInputModifierNode;

    public final MutableSharedFlow getStylusHandwritingTrigger() {
        SharedFlowImpl sharedFlowImpl = this.backingStylusHandwritingTrigger;
        if (sharedFlowImpl != null) {
            return sharedFlowImpl;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported) {
            return null;
        }
        SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_LATEST, 2);
        this.backingStylusHandwritingTrigger = MutableSharedFlow$default;
        return MutableSharedFlow$default;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.textInputModifierNode;
        if (legacyAdaptingPlatformTextInputModifierNode == null || (delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) DepthSortedSetKt.currentValueOf(legacyAdaptingPlatformTextInputModifierNode, CompositionLocalsKt.LocalSoftwareKeyboardController)) == null) {
            return;
        }
        delegatingSoftwareKeyboardController.hide();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void notifyFocusedRect(Rect rect) {
        android.graphics.Rect rect2;
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.focusedRect = new android.graphics.Rect(MathKt__MathJVMKt.roundToInt(rect.left), MathKt__MathJVMKt.roundToInt(rect.top), MathKt__MathJVMKt.roundToInt(rect.right), MathKt__MathJVMKt.roundToInt(rect.bottom));
            if (!legacyTextInputMethodRequest.ics.isEmpty() || (rect2 = legacyTextInputMethodRequest.focusedRect) == null) {
                return;
            }
            legacyTextInputMethodRequest.view.requestRectangleOnScreen(new android.graphics.Rect(rect2));
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.textInputModifierNode;
        if (legacyAdaptingPlatformTextInputModifierNode == null || (delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) DepthSortedSetKt.currentValueOf(legacyAdaptingPlatformTextInputModifierNode, CompositionLocalsKt.LocalSoftwareKeyboardController)) == null) {
            return;
        }
        delegatingSoftwareKeyboardController.show();
    }

    public final void startInput(OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3) {
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.textInputModifierNode;
        if (legacyAdaptingPlatformTextInputModifierNode == null) {
            return;
        }
        this.job = legacyAdaptingPlatformTextInputModifierNode.isAttached() ? JobKt.launch$default(legacyAdaptingPlatformTextInputModifierNode.getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new VirtualCameraState$connect$2$1(legacyAdaptingPlatformTextInputModifierNode, new FlowExtKt$simpleScan$1(overlayKt$$ExternalSyntheticLambda3, this, legacyAdaptingPlatformTextInputModifierNode, r4, 11), r4, 28), 1) : null;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void stopInput() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.job = null;
        MutableSharedFlow stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            ((SharedFlowImpl) stylusHandwritingTrigger).resetReplayCache();
        }
    }

    public final void unregisterModifier(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        if (!(this.textInputModifierNode == legacyAdaptingPlatformTextInputModifierNode)) {
            InlineClassHelperKt.throwIllegalStateException("Expected textInputModifierNode to be " + legacyAdaptingPlatformTextInputModifierNode + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            boolean z = (TextRange.m986equalsimpl0(legacyTextInputMethodRequest.state.selection, textFieldValue2.selection) && Intrinsics.areEqual(legacyTextInputMethodRequest.state.composition, textFieldValue2.composition)) ? false : true;
            legacyTextInputMethodRequest.state = textFieldValue2;
            int size = legacyTextInputMethodRequest.ics.size();
            for (int i = 0; i < size; i++) {
                RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) legacyTextInputMethodRequest.ics.get(i)).get();
                if (recordingInputConnection != null) {
                    recordingInputConnection.textFieldValue = textFieldValue2;
                }
            }
            LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = legacyTextInputMethodRequest.cursorAnchorInfoController;
            synchronized (legacyCursorAnchorInfoController.lock) {
                legacyCursorAnchorInfoController.textFieldValue = null;
                legacyCursorAnchorInfoController.offsetMapping = null;
                legacyCursorAnchorInfoController.textLayoutResult = null;
                legacyCursorAnchorInfoController.innerTextFieldBounds = null;
                legacyCursorAnchorInfoController.decorationBoxBounds = null;
            }
            if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                if (z) {
                    Recorder.AnonymousClass1 anonymousClass1 = legacyTextInputMethodRequest.inputMethodManager;
                    int m990getMinimpl = TextRange.m990getMinimpl(textFieldValue2.selection);
                    int m989getMaximpl = TextRange.m989getMaximpl(textFieldValue2.selection);
                    TextRange textRange = legacyTextInputMethodRequest.state.composition;
                    int m990getMinimpl2 = textRange != null ? TextRange.m990getMinimpl(textRange.packedValue) : -1;
                    TextRange textRange2 = legacyTextInputMethodRequest.state.composition;
                    anonymousClass1.getImm().updateSelection((View) anonymousClass1.val$videoEncoderSession, m990getMinimpl, m989getMaximpl, m990getMinimpl2, textRange2 != null ? TextRange.m989getMaximpl(textRange2.packedValue) : -1);
                    return;
                }
                return;
            }
            if (textFieldValue != null && (!Intrinsics.areEqual(textFieldValue.annotatedString.text, textFieldValue2.annotatedString.text) || (TextRange.m986equalsimpl0(textFieldValue.selection, textFieldValue2.selection) && !Intrinsics.areEqual(textFieldValue.composition, textFieldValue2.composition)))) {
                Recorder.AnonymousClass1 anonymousClass12 = legacyTextInputMethodRequest.inputMethodManager;
                anonymousClass12.getImm().restartInput((View) anonymousClass12.val$videoEncoderSession);
                return;
            }
            int size2 = legacyTextInputMethodRequest.ics.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) legacyTextInputMethodRequest.ics.get(i2)).get();
                if (recordingInputConnection2 != null) {
                    TextFieldValue textFieldValue3 = legacyTextInputMethodRequest.state;
                    Recorder.AnonymousClass1 anonymousClass13 = legacyTextInputMethodRequest.inputMethodManager;
                    if (recordingInputConnection2.isActive) {
                        recordingInputConnection2.textFieldValue = textFieldValue3;
                        if (recordingInputConnection2.extractedTextMonitorMode) {
                            anonymousClass13.getImm().updateExtractedText((View) anonymousClass13.val$videoEncoderSession, recordingInputConnection2.currentExtractedTextRequestToken, MathUtilsKt.access$toExtractedText(textFieldValue3));
                        }
                        TextRange textRange3 = textFieldValue3.composition;
                        long j = textFieldValue3.selection;
                        int m990getMinimpl3 = textRange3 != null ? TextRange.m990getMinimpl(textRange3.packedValue) : -1;
                        TextRange textRange4 = textFieldValue3.composition;
                        anonymousClass13.getImm().updateSelection((View) anonymousClass13.val$videoEncoderSession, TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j), m990getMinimpl3, textRange4 != null ? TextRange.m989getMaximpl(textRange4.packedValue) : -1);
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, KClasses$$Lambda$2 kClasses$$Lambda$2, Rect rect, Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            LegacyCursorAnchorInfoController legacyCursorAnchorInfoController = legacyTextInputMethodRequest.cursorAnchorInfoController;
            synchronized (legacyCursorAnchorInfoController.lock) {
                try {
                    legacyCursorAnchorInfoController.textFieldValue = textFieldValue;
                    legacyCursorAnchorInfoController.offsetMapping = offsetMapping;
                    legacyCursorAnchorInfoController.textLayoutResult = textLayoutResult;
                    legacyCursorAnchorInfoController.innerTextFieldBounds = rect;
                    legacyCursorAnchorInfoController.decorationBoxBounds = rect2;
                    if (!legacyCursorAnchorInfoController.hasPendingImmediateRequest) {
                        if (legacyCursorAnchorInfoController.monitorEnabled) {
                        }
                    }
                    legacyCursorAnchorInfoController.updateCursorAnchorInfo();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0, CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2) {
        startInput(new OverlayKt$$ExternalSyntheticLambda3(textFieldValue, this, imeOptions, menuKt$$ExternalSyntheticLambda0, coreTextFieldKt$$ExternalSyntheticLambda2, 4));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput() {
        startInput(null);
    }
}
