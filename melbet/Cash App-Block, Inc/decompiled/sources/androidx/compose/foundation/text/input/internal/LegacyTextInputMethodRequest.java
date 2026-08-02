package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda14;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.emoji2.text.EmojiCompat;
import androidx.room.util.DBUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    public Rect focusedRect;
    public final Recorder.AnonymousClass1 inputMethodManager;
    public LegacyTextFieldState legacyTextFieldState;
    public TextFieldSelectionManager textFieldSelectionManager;
    public final View view;
    public ViewConfiguration viewConfiguration;
    public Function1 onEditCommand = new BasicTextKt$$ExternalSyntheticLambda14(29);
    public Function1 onImeActionPerformed = new ButtonKt$$ExternalSyntheticLambda2(1);
    public TextFieldValue state = new TextFieldValue("", TextRange.Zero, 4);
    public ImeOptions imeOptions = ImeOptions.Default;
    public final ArrayList ics = new ArrayList();
    public final Lazy baseInputConnection$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Threads$$ExternalSyntheticLambda1(this, 29));

    public LegacyTextInputMethodRequest(View view, AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 androidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1, Recorder.AnonymousClass1 anonymousClass1) {
        this.view = view;
        this.inputMethodManager = anonymousClass1;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(androidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1, anonymousClass1);
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        TextFieldValue textFieldValue = this.state;
        DBUtil.m1188updatepLxbY9I(editorInfo, textFieldValue.annotatedString.text, textFieldValue.selection, this.imeOptions);
        LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 legacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 = LegacyPlatformTextInputServiceAdapter_androidKt.inputMethodManagerFactory;
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new Toolbar.AnonymousClass1(this), this.imeOptions.autoCorrect, this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference(recordingInputConnection));
        return recordingInputConnection;
    }
}
