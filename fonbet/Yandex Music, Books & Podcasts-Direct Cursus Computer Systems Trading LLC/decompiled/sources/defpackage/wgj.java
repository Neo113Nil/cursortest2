package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class wgj implements InputConnection {
    public final kma a;
    public qnn b;

    public wgj(qnn qnnVar, kma kmaVar) {
        this.a = kmaVar;
        this.b = qnnVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            if (qnnVar != null) {
                qnnVar.closeConnection();
                this.b = null;
            }
            this.a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.setSelection(i, i2);
        }
        return false;
    }
}
