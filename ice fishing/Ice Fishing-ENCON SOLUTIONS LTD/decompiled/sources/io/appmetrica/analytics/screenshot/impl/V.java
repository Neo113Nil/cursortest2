package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final List f7614a;

    public V(InterfaceC0943i interfaceC0943i) {
        this.f7614a = interfaceC0943i.a();
    }

    public final void a(C0946l c0946l) {
        for (T t : this.f7614a) {
            C0947m c0947m = null;
            if (c0946l != null) {
                C0946l c0946l2 = c0946l.f7660a ? c0946l : null;
                if (c0946l2 != null) {
                    c0947m = c0946l2.f7661b;
                }
            }
            t.a(c0947m);
        }
    }
}
