package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.text.CoreTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0;
import coil3.memory.MemoryCacheService;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.wire.GrpcMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.reflect.full.KClasses$$Lambda$2;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public final Lazy baseInputConnection$delegate;
    public final CursorAnchorInfoController cursorAnchorInfoController;
    public boolean editorHasFocus;
    public Rect focusedRect;
    public AFLogger$$ExternalSyntheticLambda0 frameCallback;
    public final ArrayList ics;
    public ImeOptions imeOptions;
    public final ConcurrencyHelpers$$ExternalSyntheticLambda0 inputCommandProcessorExecutor;
    public final GrpcMethod inputMethodManager;
    public Function1 onEditCommand;
    public Function1 onImeActionPerformed;
    public TextFieldValue state;
    public final MutableVector textInputCommandQueue;
    public final AndroidComposeView view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TextInputCommand {
        public static final /* synthetic */ TextInputCommand[] $VALUES;
        public static final TextInputCommand HideKeyboard;
        public static final TextInputCommand ShowKeyboard;
        public static final TextInputCommand StartInput;
        public static final TextInputCommand StopInput;

        static {
            TextInputCommand textInputCommand = new TextInputCommand("StartInput", 0);
            StartInput = textInputCommand;
            TextInputCommand textInputCommand2 = new TextInputCommand("StopInput", 1);
            StopInput = textInputCommand2;
            TextInputCommand textInputCommand3 = new TextInputCommand("ShowKeyboard", 2);
            ShowKeyboard = textInputCommand3;
            TextInputCommand textInputCommand4 = new TextInputCommand("HideKeyboard", 3);
            HideKeyboard = textInputCommand4;
            $VALUES = new TextInputCommand[]{textInputCommand, textInputCommand2, textInputCommand3, textInputCommand4};
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }
    }

    public TextInputServiceAndroid(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        GrpcMethod grpcMethod = new GrpcMethod();
        grpcMethod.path = androidComposeView;
        grpcMethod.requestAdapter = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ContourLayout$geometry$1(grpcMethod, 10));
        grpcMethod.responseAdapter = new MemoryCacheService(androidComposeView);
        ConcurrencyHelpers$$ExternalSyntheticLambda0 concurrencyHelpers$$ExternalSyntheticLambda0 = new ConcurrencyHelpers$$ExternalSyntheticLambda0(Choreographer.getInstance(), 1);
        this.view = androidComposeView;
        this.inputMethodManager = grpcMethod;
        this.inputCommandProcessorExecutor = concurrencyHelpers$$ExternalSyntheticLambda0;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onEditCommand$1.INSTANCE$2;
        this.state = new TextFieldValue("", TextRange.Zero, 4);
        this.imeOptions = ImeOptions.Default;
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ContourLayout$geometry$1(this, 11));
        this.cursorAnchorInfoController = new CursorAnchorInfoController(androidComposeView2, grpcMethod);
        this.textInputCommandQueue = new MutableVector(0, new TextInputCommand[16]);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(MathKt__MathJVMKt.roundToInt(rect.left), MathKt__MathJVMKt.roundToInt(rect.top), MathKt__MathJVMKt.roundToInt(rect.right), MathKt__MathJVMKt.roundToInt(rect.bottom));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            AFLogger$$ExternalSyntheticLambda0 aFLogger$$ExternalSyntheticLambda0 = new AFLogger$$ExternalSyntheticLambda0(this, 6);
            this.inputCommandProcessorExecutor.execute(aFLogger$$ExternalSyntheticLambda0);
            this.frameCallback = aFLogger$$ExternalSyntheticLambda0;
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0, CoreTextFieldKt$$ExternalSyntheticLambda2 coreTextFieldKt$$ExternalSyntheticLambda2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = menuKt$$ExternalSyntheticLambda0;
        this.onImeActionPerformed = coreTextFieldKt$$ExternalSyntheticLambda2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$stopInput$1.INSTANCE$2;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = (TextRange.m986equalsimpl0(this.state.selection, textFieldValue2.selection) && Intrinsics.areEqual(this.state.composition, textFieldValue2.composition)) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.ics.get(i)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui(textFieldValue2);
            }
        }
        CursorAnchorInfoController cursorAnchorInfoController = this.cursorAnchorInfoController;
        synchronized (cursorAnchorInfoController.lock) {
            cursorAnchorInfoController.textFieldValue = null;
            cursorAnchorInfoController.offsetMapping = null;
            cursorAnchorInfoController.textLayoutResult = null;
            cursorAnchorInfoController.textFieldToRootTransform = TextInputServiceAndroid$stopInput$1.INSTANCE$1;
            cursorAnchorInfoController.innerTextFieldBounds = null;
            cursorAnchorInfoController.decorationBoxBounds = null;
        }
        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
            if (z) {
                GrpcMethod grpcMethod = this.inputMethodManager;
                int m990getMinimpl = TextRange.m990getMinimpl(textFieldValue2.selection);
                int m989getMaximpl = TextRange.m989getMaximpl(textFieldValue2.selection);
                TextRange textRange = this.state.composition;
                int m990getMinimpl2 = textRange != null ? TextRange.m990getMinimpl(textRange.packedValue) : -1;
                TextRange textRange2 = this.state.composition;
                ((InputMethodManager) ((Lazy) grpcMethod.requestAdapter).getValue()).updateSelection((AndroidComposeView) grpcMethod.path, m990getMinimpl, m989getMaximpl, m990getMinimpl2, textRange2 != null ? TextRange.m989getMaximpl(textRange2.packedValue) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!Intrinsics.areEqual(textFieldValue.annotatedString.text, textFieldValue2.annotatedString.text) || (TextRange.m986equalsimpl0(textFieldValue.selection, textFieldValue2.selection) && !Intrinsics.areEqual(textFieldValue.composition, textFieldValue2.composition)))) {
            GrpcMethod grpcMethod2 = this.inputMethodManager;
            ((InputMethodManager) ((Lazy) grpcMethod2.requestAdapter).getValue()).restartInput((AndroidComposeView) grpcMethod2.path);
            return;
        }
        int size2 = this.ics.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.ics.get(i2)).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, KClasses$$Lambda$2 kClasses$$Lambda$2, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        CursorAnchorInfoController cursorAnchorInfoController = this.cursorAnchorInfoController;
        synchronized (cursorAnchorInfoController.lock) {
            try {
                cursorAnchorInfoController.textFieldValue = textFieldValue;
                cursorAnchorInfoController.offsetMapping = offsetMapping;
                cursorAnchorInfoController.textLayoutResult = textLayoutResult;
                cursorAnchorInfoController.textFieldToRootTransform = kClasses$$Lambda$2;
                cursorAnchorInfoController.innerTextFieldBounds = rect;
                cursorAnchorInfoController.decorationBoxBounds = rect2;
                if (!cursorAnchorInfoController.hasPendingImmediateRequest) {
                    if (cursorAnchorInfoController.monitorEnabled) {
                    }
                }
                cursorAnchorInfoController.updateCursorAnchorInfo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }
}
