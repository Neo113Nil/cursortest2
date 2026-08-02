package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class q72 implements k94 {
    public final AndroidComposeView a;
    public final p94 b;
    public final AutofillManager c;
    public final AutofillId d;

    public q72(AndroidComposeView androidComposeView, p94 p94Var) {
        this.a = androidComposeView;
        this.b = p94Var;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            ny61.r("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw x4e.v("Required value was null.");
        }
        this.d = autofillId;
    }
}
