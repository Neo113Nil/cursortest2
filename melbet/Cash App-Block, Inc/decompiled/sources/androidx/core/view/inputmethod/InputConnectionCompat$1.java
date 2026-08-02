package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class InputConnectionCompat$1 extends InputConnectionWrapper {
    public final /* synthetic */ InputConnectionCompat$OnCommitContentListener val$listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputConnectionCompat$1(InputConnection inputConnection, InputConnectionCompat$OnCommitContentListener inputConnectionCompat$OnCommitContentListener) {
        super(inputConnection, false);
        this.val$listener = inputConnectionCompat$OnCommitContentListener;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.val$listener.onCommitContent(Toolbar.AnonymousClass1.wrap(inputContentInfo), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
