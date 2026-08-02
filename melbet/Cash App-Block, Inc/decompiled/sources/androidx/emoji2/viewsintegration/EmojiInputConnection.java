package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.camera.video.Recorder;
import androidx.emoji2.text.EmojiCompat;
import androidx.media3.extractor.text.CueEncoder;

/* loaded from: classes3.dex */
public final class EmojiInputConnection extends InputConnectionWrapper {
    public final CueEncoder mEmojiCompatDeleteHelper;
    public final TextView mTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiInputConnection(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        CueEncoder cueEncoder = new CueEncoder(10);
        this.mTextView = textView;
        this.mEmojiCompatDeleteHelper = cueEncoder;
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.mTextView.getEditableText();
        this.mEmojiCompatDeleteHelper.getClass();
        return Recorder.AnonymousClass3.handleDeleteSurroundingText(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.mTextView.getEditableText();
        this.mEmojiCompatDeleteHelper.getClass();
        return Recorder.AnonymousClass3.handleDeleteSurroundingText(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
