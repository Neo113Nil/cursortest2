package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class hs0 implements android.view.inputmethod.InputConnection {
    public final defpackage.YjS0G3zEDWNX ZpBGe2uQfcn8;
    public defpackage.p31 giKS3J6vZuNy;

    public hs0(defpackage.p31 p31Var, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX) {
        this.ZpBGe2uQfcn8 = yjS0G3zEDWNX;
        this.giKS3J6vZuNy = p31Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            if (p31Var != null) {
                p31Var.closeConnection();
                this.giKS3J6vZuNy = null;
            }
            this.ZpBGe2uQfcn8.P05cfTpS5W5L(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(android.view.inputmethod.CompletionInfo completionInfo) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i, android.os.Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(android.view.inputmethod.CorrectionInfo correctionInfo) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(java.lang.CharSequence charSequence, int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.giKS3J6vZuNy();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest extractedTextRequest, int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final android.os.Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getSelectedText(int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextAfterCursor(int i, int i2) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final java.lang.CharSequence getTextBeforeCursor(int i, int i2) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(java.lang.CharSequence charSequence, int i) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        defpackage.p31 p31Var = this.giKS3J6vZuNy;
        if (p31Var != null) {
            return p31Var.setSelection(i, i2);
        }
        return false;
    }
}
