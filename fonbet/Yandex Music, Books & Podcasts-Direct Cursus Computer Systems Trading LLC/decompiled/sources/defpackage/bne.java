package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class bne extends InputConnectionWrapper {
    public final /* synthetic */ g3a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bne(InputConnection inputConnection, g3a g3aVar) {
        super(inputConnection, false);
        this.a = g3aVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        pv9 pv9Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            pv9Var = new pv9(12, new cne(inputContentInfo));
        }
        if (this.a.e(pv9Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
