package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class L4 extends AbstractC0548pe {
    public final C0608rh a;

    public L4(@NonNull Context context) {
        this(new C0608rh(R4.l().c(context).b(context)));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0548pe
    public final void a(int i) {
        this.a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0548pe
    public final int b() {
        return (int) this.a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0548pe
    public final SparseArray<InterfaceC0519oe> c() {
        return new SparseArray<>();
    }

    public L4(C0608rh c0608rh) {
        this.a = c0608rh;
    }
}
