package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class R4 {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f4982a = new CopyOnWriteArrayList();

    public final void a(InterfaceC0397f4 interfaceC0397f4) {
        this.f4982a.add(interfaceC0397f4);
    }

    public final void b(InterfaceC0397f4 interfaceC0397f4) {
        this.f4982a.remove(interfaceC0397f4);
    }

    public final List<InterfaceC0397f4> a() {
        return this.f4982a;
    }
}
