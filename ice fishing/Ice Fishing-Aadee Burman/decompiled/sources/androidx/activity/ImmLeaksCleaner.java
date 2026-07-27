package androidx.activity;

import a.AbstractC0422a;
import androidx.lifecycle.EnumC0496n;
import androidx.lifecycle.InterfaceC0501t;
import androidx.lifecycle.InterfaceC0503v;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0501t {
    static {
        AbstractC0422a.q(y.f4469n);
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        if (enumC0496n == EnumC0496n.ON_DESTROY) {
            throw null;
        }
    }
}
