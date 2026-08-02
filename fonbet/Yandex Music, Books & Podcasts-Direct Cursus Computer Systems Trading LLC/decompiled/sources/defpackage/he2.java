package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;

/* loaded from: classes.dex */
public abstract class he2 {
    public static void a(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }
}
