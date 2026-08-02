package androidx.activity;

import androidx.lifecycle.EnumC0500n;
import androidx.lifecycle.InterfaceC0505t;
import androidx.lifecycle.InterfaceC0507v;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0505t {
    static {
        N3.C.O(y.f4437n);
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        if (enumC0500n == EnumC0500n.ON_DESTROY) {
            throw null;
        }
    }
}
