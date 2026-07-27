package androidx.navigation.fragment;

import androidx.fragment.app.DialogInterfaceOnCancelListenerC0481n;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;
import k0.AbstractC4627a;

/* loaded from: classes.dex */
public final class DialogFragmentNavigator$observer$1 implements InterfaceC0511t {
    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        int i = AbstractC4627a.f38670a[enumC0506n.ordinal()];
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            throw null;
        }
        if (i == 3) {
            if (!((DialogInterfaceOnCancelListenerC0481n) interfaceC0513v).D().isShowing()) {
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
