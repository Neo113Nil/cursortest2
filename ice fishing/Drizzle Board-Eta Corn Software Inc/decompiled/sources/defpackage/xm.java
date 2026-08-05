package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xm extends InputConnectionWrapper {
    public final /* synthetic */ wm qoPGr6Ce;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(InputConnection inputConnection, wm wmVar) {
        super(inputConnection, false);
        this.qoPGr6Ce = wmVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        tg0 tg0Var = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            tg0Var = new tg0(18, new zm(inputContentInfo));
        }
        if (this.qoPGr6Ce.qoPGr6Ce(tg0Var, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
