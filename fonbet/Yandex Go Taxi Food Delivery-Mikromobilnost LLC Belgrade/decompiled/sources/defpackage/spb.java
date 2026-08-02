package defpackage;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.state.ToggleableState;

/* loaded from: classes10.dex */
public final /* synthetic */ class spb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mnq0 b;

    public /* synthetic */ spb(mnq0 mnq0Var, int i) {
        this.a = i;
        this.b = mnq0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean valueOf;
        int i = this.a;
        boolean z = false;
        mnq0 mnq0Var = this.b;
        switch (i) {
            case 0:
                ce90 ce90Var = (ce90) ((dd11) obj);
                ce90Var.b = true;
                ce90Var.a.invoke(mnq0Var);
                qje.P(ce90Var).D();
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((k92) ((v3r) obj)).a;
                valueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (valueOf != null) {
                    f.u(mnq0Var, valueOf.booleanValue() ? ToggleableState.On : ToggleableState.Off);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((k92) ((v3r) obj)).a;
                valueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (valueOf != null) {
                    f.u(mnq0Var, valueOf.booleanValue() ? ToggleableState.On : ToggleableState.Off);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
