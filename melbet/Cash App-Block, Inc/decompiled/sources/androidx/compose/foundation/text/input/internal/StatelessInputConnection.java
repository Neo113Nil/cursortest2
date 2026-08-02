package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.inputmethod.InputConnectionCompat$1;
import androidx.room.Room;
import androidx.work.impl.WorkLauncherImpl;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.mooncake.theming.RipplesKt;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.SharingConfig;
import retrofit2.RequestFactory;

/* loaded from: classes.dex */
public final class StatelessInputConnection implements InputConnection {
    public final InputConnectionCompat$1 commitContentDelegateInputConnection;
    public final MutableVector editCommands = new MutableVector(0, new Function1[16]);
    public final NodeChain session;

    public StatelessInputConnection(NodeChain nodeChain, EditorInfo editorInfo) {
        this.session = nodeChain;
        StatelessInputConnection$terminalInputConnection$1 statelessInputConnection$terminalInputConnection$1 = new StatelessInputConnection$terminalInputConnection$1(this, false);
        SingleLineCodepointTransformation singleLineCodepointTransformation = new SingleLineCodepointTransformation(this);
        Room.requireNonNull(editorInfo, "editorInfo must be non-null");
        this.commitContentDelegateInputConnection = new InputConnectionCompat$1(statelessInputConnection$terminalInputConnection$1, singleLineCodepointTransformation);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((SharingConfig) this.session.layoutNode).extraBufferCapacity++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.editCommands.clear();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return MathUtilsKt.commitContent(this.commitContentDelegateInputConnection, inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        MathUtilsKt.commitText(this.session, charSequence.toString(), i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        MathUtilsKt.deleteSurroundingText(this.session, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        MathUtilsKt.deleteSurroundingTextInCodePoints(this.session, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((SharingConfig) this.session.layoutNode).endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        MathUtilsKt.finishComposingText(this.session);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(getText(), TextRange.m990getMinimpl(getText().selection), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        return MathUtilsKt.access$toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (TextRange.m987getCollapsedimpl(getText().selection)) {
            return null;
        }
        return RipplesKt.getSelectedText(getText()).toString();
    }

    public final TextFieldCharSequence getText() {
        return ((TransformedTextFieldState) this.session.innerCoordinator).getVisualText();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return RipplesKt.getTextAfterSelection(getText(), i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return RipplesKt.getTextBeforeSelection(getText(), i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                MathUtilsKt.setSelection(this.session, 0, getText().text.length());
                break;
            case R.id.cut:
                sendSynthesizedKeyEvent(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
                break;
            case R.id.copy:
                sendSynthesizedKeyEvent(EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
                break;
            case R.id.paste:
                sendSynthesizedKeyEvent(EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
                break;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performEditorAction(int i) {
        int i2;
        Function1 function1;
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
            }
            function1 = (Function1) this.session.tail;
            if (function1 != null) {
                function1.invoke(new ImeAction(i2));
            }
            return true;
        }
        i2 = 1;
        function1 = (Function1) this.session.tail;
        if (function1 != null) {
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        MathUtilsKt.performHandwritingGesture(this.session, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.commitContentDelegateInputConnection.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return MathUtilsKt.previewHandwritingGesture(this.session, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        CursorAnchorInfo calculateCursorAnchorInfo;
        RequestFactory requestFactory = (RequestFactory) this.session.head;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
                requestFactory.hasBody = z2;
                requestFactory.isFormEncoded = z3;
                requestFactory.isMultipart = z4;
                requestFactory.isKotlinSuspendFunction = z;
                if (z5 && (calculateCursorAnchorInfo = requestFactory.calculateCursorAnchorInfo()) != null) {
                    WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) requestFactory.baseUrl;
                    workLauncherImpl.requireImm().updateCursorAnchorInfo((View) workLauncherImpl.processor, calculateCursorAnchorInfo);
                }
                StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) requestFactory.relativeUrl;
                Continuation continuation = null;
                if (z6) {
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    requestFactory.relativeUrl = null;
                    return true;
                }
                if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                    return true;
                }
                requestFactory.relativeUrl = JobKt.launch$default((CoroutineScope) requestFactory.httpMethod, null, CoroutineStart.UNDISPATCHED, new ThumbNode$onAttach$1(requestFactory, continuation, 22), 1);
                return true;
            }
            if (i2 >= 34) {
                z = true;
                z4 = true;
            } else {
                z = z4;
                z4 = true;
            }
            z2 = z4;
        } else {
            z = false;
            z2 = true;
        }
        z3 = z2;
        requestFactory.hasBody = z2;
        requestFactory.isFormEncoded = z3;
        requestFactory.isMultipart = z4;
        requestFactory.isKotlinSuspendFunction = z;
        if (z5) {
            WorkLauncherImpl workLauncherImpl2 = (WorkLauncherImpl) requestFactory.baseUrl;
            workLauncherImpl2.requireImm().updateCursorAnchorInfo((View) workLauncherImpl2.processor, calculateCursorAnchorInfo);
        }
        StandaloneCoroutine standaloneCoroutine2 = (StandaloneCoroutine) requestFactory.relativeUrl;
        Continuation continuation2 = null;
        if (z6) {
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) this.session.outerCoordinator;
        workLauncherImpl.requireImm().dispatchKeyEventFromInputMethod((View) workLauncherImpl.processor, keyEvent);
        return true;
    }

    public final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        MathUtilsKt.setComposingRegion(this.session, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String obj = charSequence.toString();
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        MathUtilsKt.setComposingText(this.session, obj, i, spanned != null ? MathUtilsKt.toAnnotationList(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        NodeChain nodeChain = this.session;
        MathUtilsKt.setSelection(nodeChain, i, i2);
        ((Function1) nodeChain.cachedDiffer).invoke(Boolean.FALSE);
        return true;
    }
}
