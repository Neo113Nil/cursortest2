package androidx.navigation.fragment;

import androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;
import k0.AbstractC4628a;

/* loaded from: classes.dex */
public final class DialogFragmentNavigator$observer$1 implements InterfaceC0501t {
    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        int i = AbstractC4628a.f38550a[enumC0496n.ordinal()];
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            throw null;
        }
        if (i == 3) {
            if (!((DialogInterfaceOnCancelListenerC0471n) interfaceC0503v).D().isShowing()) {
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
