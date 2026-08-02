package androidx.compose.foundation.text;

import androidx.camera.video.Recorder;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.util.LongArrayQueue;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LegacyTextFieldState {
    public LayoutCoordinates _layoutCoordinates;
    public final ParcelableSnapshotMutableState autofillHighlightOn$delegate;
    public final ParcelableSnapshotMutableState deletionPreviewHighlightRange$delegate;
    public final ParcelableSnapshotMutableState handleState$delegate;
    public final ParcelableSnapshotMutableState hasFocus$delegate;
    public final AndroidPaint highlightPaint;
    public TextInputSession inputSession;
    public final ParcelableSnapshotMutableState isInTouchMode$delegate;
    public boolean isLayoutResultStale;
    public final ParcelableSnapshotMutableState justAutofilled$delegate;
    public final KeyboardActionRunner keyboardActionRunner;
    public final DelegatingSoftwareKeyboardController keyboardController;
    public final ParcelableSnapshotMutableState layoutResultState;
    public final ParcelableSnapshotMutableState minHeightForSingleLineField$delegate;
    public final CoreTextFieldKt$$ExternalSyntheticLambda2 onImeActionPerformed;
    public final CoreTextFieldKt$$ExternalSyntheticLambda2 onImeActionPerformedWithResult;
    public final CoreTextFieldKt$$ExternalSyntheticLambda2 onValueChange;
    public Function1 onValueChangeOriginal;
    public final Recorder.AnonymousClass1 processor;
    public final RecomposeScopeImpl recomposeScope;
    public long selectionBackgroundColor;
    public final ParcelableSnapshotMutableState selectionPreviewHighlightRange$delegate;
    public final ParcelableSnapshotMutableState showCursorHandle$delegate;
    public final ParcelableSnapshotMutableState showFloatingToolbar$delegate;
    public final ParcelableSnapshotMutableState showSelectionHandleEnd$delegate;
    public final ParcelableSnapshotMutableState showSelectionHandleStart$delegate;
    public TextDelegate textDelegate;
    public AnnotatedString untransformedText;

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScopeImpl recomposeScopeImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScopeImpl;
        this.keyboardController = delegatingSoftwareKeyboardController;
        Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(22);
        AnnotatedString annotatedString = AnnotatedStringKt.EmptyAnnotatedString;
        long j = TextRange.Zero;
        TextFieldValue textFieldValue = new TextFieldValue(annotatedString, j, (TextRange) null);
        anonymousClass1.val$videoEncoderSession = textFieldValue;
        anonymousClass1.this$0 = new LongArrayQueue(annotatedString, textFieldValue.selection);
        this.processor = anonymousClass1;
        Boolean bool = Boolean.FALSE;
        this.hasFocus$delegate = Updater.mutableStateOf$default(bool);
        this.minHeightForSingleLineField$delegate = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
        this.layoutResultState = Updater.mutableStateOf$default(null);
        this.handleState$delegate = Updater.mutableStateOf$default(HandleState.None);
        this.showFloatingToolbar$delegate = Updater.mutableStateOf$default(bool);
        this.showSelectionHandleStart$delegate = Updater.mutableStateOf$default(bool);
        this.showSelectionHandleEnd$delegate = Updater.mutableStateOf$default(bool);
        this.showCursorHandle$delegate = Updater.mutableStateOf$default(bool);
        this.isLayoutResultStale = true;
        this.isInTouchMode$delegate = Updater.mutableStateOf$default(Boolean.TRUE);
        this.keyboardActionRunner = new KeyboardActionRunner(delegatingSoftwareKeyboardController);
        this.autofillHighlightOn$delegate = Updater.mutableStateOf$default(bool);
        this.justAutofilled$delegate = Updater.mutableStateOf$default(bool);
        this.onValueChangeOriginal = new BasicTextKt$$ExternalSyntheticLambda14(16);
        this.onValueChange = new CoreTextFieldKt$$ExternalSyntheticLambda2(this, 1);
        this.onImeActionPerformed = new CoreTextFieldKt$$ExternalSyntheticLambda2(this, 2);
        this.onImeActionPerformedWithResult = new CoreTextFieldKt$$ExternalSyntheticLambda2(this, 3);
        this.highlightPaint = ColorKt.Paint();
        this.selectionBackgroundColor = Color.Unspecified;
        this.selectionPreviewHighlightRange$delegate = Updater.mutableStateOf$default(new TextRange(j));
        this.deletionPreviewHighlightRange$delegate = Updater.mutableStateOf$default(new TextRange(j));
    }

    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return (TextLayoutResultProxy) this.layoutResultState.getValue();
    }

    /* renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m361setDeletionPreviewHighlightRange5zctL8(long j) {
        this.deletionPreviewHighlightRange$delegate.setValue(new TextRange(j));
    }

    /* renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m362setSelectionPreviewHighlightRange5zctL8(long j) {
        this.selectionPreviewHighlightRange$delegate.setValue(new TextRange(j));
    }
}
