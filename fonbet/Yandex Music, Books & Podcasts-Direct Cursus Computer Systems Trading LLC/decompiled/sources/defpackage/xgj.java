package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class xgj extends wgj {
    @Override // defpackage.wgj, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        qnn qnnVar = this.b;
        if (qnnVar != null) {
            return qnnVar.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
