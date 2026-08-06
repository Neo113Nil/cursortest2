package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0715rc extends C0321c5 {
    public C0715rc(Context context, Q4 q4, C0630o4 c0630o4, V4 v4, C0415fm c0415fm, InterfaceC0462hh interfaceC0462hh, ICommonExecutor iCommonExecutor, int i2, C0542kk c0542kk, Fb fb, InterfaceC0738s9 interfaceC0738s9) {
        super(context, q4, c0630o4, v4, c0415fm, interfaceC0462hh, iCommonExecutor, i2, fb, interfaceC0738s9);
    }

    public final C0668pg a(C0664pc c0664pc) {
        C0536ke c0536ke = new C0536ke(c0664pc);
        Objects.requireNonNull(c0664pc);
        return new C0668pg(c0536ke, new C0638oc(c0664pc), c0664pc);
    }

    @Override // io.appmetrica.analytics.impl.C0321c5
    public final InterfaceC0687q9 a(InterfaceC0816v9 interfaceC0816v9, L6 l6, Qg qg, C0630o4 c0630o4, Q4 q4, We we) {
        return this.f5720l.a(interfaceC0816v9, l6, qg, c0630o4, q4, we).a();
    }
}
