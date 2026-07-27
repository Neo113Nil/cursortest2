package androidx.activity;

import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0511t {
    static {
        com.bumptech.glide.e.q(y.f4584n);
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        if (enumC0506n == EnumC0506n.ON_DESTROY) {
            throw null;
        }
    }
}
