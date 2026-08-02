package androidx.navigation.fragment;

import androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n;
import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;
import k0.AbstractC4638a;

/* loaded from: classes.dex */
public final class DialogFragmentNavigator$observer$1 implements InterfaceC0505t {
    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        int i = AbstractC4638a.f38562a[enumC0500n.ordinal()];
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            throw null;
        }
        if (i == 3) {
            if (!((DialogInterfaceOnCancelListenerC0475n) interfaceC0507v).D().isShowing()) {
                throw null;
            }
        } else {
            if (i != 4) {
                return;
            }
            throw null;
        }
    }
}
