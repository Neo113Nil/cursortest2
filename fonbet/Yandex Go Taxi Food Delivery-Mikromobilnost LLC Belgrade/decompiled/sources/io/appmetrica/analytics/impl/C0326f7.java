package io.appmetrica.analytics.impl;

import defpackage.ycc;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0326f7 implements InterfaceC0331fc {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC0331fc
    public final void a(Throwable th, C0204b0 c0204b0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0331fc) it.next()).a(th, c0204b0);
        }
    }

    public final void a(InterfaceC0331fc... interfaceC0331fcArr) {
        ycc.t(this.a, interfaceC0331fcArr);
    }

    public final void a(List<? extends InterfaceC0331fc> list) {
        this.a.addAll(list);
    }

    public final void a() {
        this.a.clear();
    }
}
