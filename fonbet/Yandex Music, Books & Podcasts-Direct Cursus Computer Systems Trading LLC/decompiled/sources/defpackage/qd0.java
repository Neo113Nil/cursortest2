package defpackage;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class qd0 implements fe2 {
    public final AndroidComposeView a;
    public final me2 b;
    public final AutofillManager c;
    public final AutofillId d;

    public qd0(AndroidComposeView androidComposeView, me2 me2Var) {
        this.a = androidComposeView;
        this.b = me2Var;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            xq0.q("Autofill service could not be located.");
            throw null;
        }
        this.c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        ke2 p = hag.p(androidComposeView);
        AutofillId autofillId = p != null ? (AutofillId) p.a : null;
        if (autofillId == null) {
            throw ouj.f("Required value was null.");
        }
        this.d = autofillId;
    }
}
